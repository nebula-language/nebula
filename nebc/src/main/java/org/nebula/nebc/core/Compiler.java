package org.nebula.nebc.core;

import org.nebula.nebc.ast.ASTBuilder;
import org.nebula.nebc.ast.CompilationUnit;
import org.nebula.nebc.codegen.CodegenException;
import org.nebula.nebc.codegen.LLVMCodeGenerator;
import org.nebula.nebc.codegen.NativeCompiler;
import org.nebula.nebc.frontend.diagnostic.Diagnostic;
import org.nebula.nebc.frontend.parser.Parser;
import org.nebula.nebc.io.SourceFile;
import org.nebula.nebc.semantic.SemanticAnalyzer;
import org.nebula.nebc.semantic.SymbolExporter;
import org.nebula.nebc.semantic.SymbolImporter;
import org.nebula.nebc.semantic.SymbolTable;
import org.nebula.nebc.semantic.symbol.MethodSymbol;
import org.nebula.nebc.semantic.symbol.NamespaceSymbol;
import org.nebula.nebc.semantic.symbol.Symbol;
import org.nebula.nebc.semantic.types.Type;
import org.nebula.nebc.util.Log;
import org.nebula.util.ExitCode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Compiler
{
	private final CompilerConfig config;
	private List<CompilationUnit> compilationUnits;

	/** Library search directories auto-detected alongside loaded .nebsym files. */
	private final List<java.io.File> autoLibraryDirs = new ArrayList<>();

	/** Library names (e.g. "neb") auto-detected alongside loaded .nebsym files. */
	private final List<SourceFile> autoLibNames = new ArrayList<>();

	/**
	 * The resolved {@code $NEBULA_HOME/lib/std-<version>} directory, populated by
	 * resolveStdPaths() before compilation begins. Null if --nostdlib was passed.
	 */
	private Path resolvedStdDir = null;

	/** Resolved path to neb.nebsym inside resolvedStdDir. */
	private Path resolvedStdSym = null;

	/** Resolved path to libneb.so (preferred) or libneb.a inside resolvedStdDir. */
	private Path resolvedStdLib = null;

	public Compiler(CompilerConfig config)
	{
		this.config = config;
	}

	public ExitCode run()
	{
		// 0. Resolve standard library paths eagerly, before any compilation work.
		//    This lets us fail fast with a clear message if the installation is
		//    incomplete, rather than discovering missing files mid-compilation.
		if (config.useStdLib())
		{
			if (!resolveStdPaths())
				return ExitCode.IO_ERROR;
		}

		// 1. Frontend: Lexing & Parsing
		// We start by parsing user sources. Std lib will be loaded on demand.
		Parser parser = new Parser(config, new ArrayList<>());
		int frontendExitCode = parser.parse();
		if (frontendExitCode != 0)
			return ExitCode.SYNTAX_ERROR;

		// 2. Build the AST for user sources
		this.compilationUnits = ASTBuilder.buildAST(parser.getParsingResultList());

		// 3. Semantic Analysis (Type checking, symbol resolution)
		SemanticAnalyzer analyzer = new SemanticAnalyzer(config);

		// 3.1 Load external symbols (.nebsym files) into the symbol table.
		if (!loadExternalSymbols(analyzer))
			return ExitCode.IO_ERROR;

		for (var cu : compilationUnits)
		{
			Log.debug(cu.toString());
		}

		// 3. Desugaring (Lowering pseudo-while, syntactical sugar loops, traits)
		org.nebula.nebc.pass.Desugarer desugarer = new org.nebula.nebc.pass.Desugarer();
		for (var cu : compilationUnits)
		{
			List<Diagnostic> desugarErrors = desugarer.process(cu);
			if (!desugarErrors.isEmpty())
			{
				for (var e : desugarErrors)
					Log.err(e.toString());
				return ExitCode.SEMANTIC_ERROR;
			}
		}

		// 4. Semantic Analysis (Type checking, symbol resolution)
		// Forward-declare all top-level types across all units

		// Phase 1: Forward-declare all top-level types across all units
		for (var cu : compilationUnits)
		{
			analyzer.declareTypes(cu);
		}

		// Phase 1.5: Pre-declare all method signatures across all units
		for (var cu : compilationUnits)
		{
			analyzer.declareMethods(cu);
		}

		// 3.1.5 Export prelude symbols (make commonly-used std symbols globally available).
		// Runs after declareMethods so that source-loaded symbols from synthetic CUs have
		// their declaration nodes populated (enabling monomorphization).
		exportPreludeSymbols(analyzer);

		// Phase 1.75: Process all trait bodies so their member scopes are populated
		// This allows generic method bodies to resolve trait-bound member access
		for (var cu : compilationUnits)
		{
			analyzer.declareTraitBodies(cu);
		}

		// Phase 1.8: Resolve all tag expressions and build tag member scopes.
		// Must run after declareTraitBodies so that traits referenced inside tags
		// (e.g. tag { str, Stringable }) already have their member scopes populated.
		for (var cu : compilationUnits)
		{
			analyzer.declareTagBodies(cu);
		}

		// Phase 1.9: Resolve class inheritance hierarchies and import inherited members
		// into child class member scopes. Must run after declareMethods (1.5) so that
		// all class member scopes already hold their own method stubs, and after
		// declareTraitBodies (1.75) / declareTagBodies (1.8) so all types are fully
		// known. Runs before Phase 2 so that method bodies can resolve inherited names.
		for (var cu : compilationUnits)
		{
			analyzer.declareInheritance(cu);
		}
			// Phase 1.95: Pre-populate all class member scopes with their own method
			// signatures across every compilation unit — without visiting bodies.
			// This ensures parent class member scopes are ready before Phase 2 analyses
			// child classes, so inherited-symbol resolution is order-independent.
			for (var cu : compilationUnits)
			{
				analyzer.declareClassBodies(cu);
			}

		// Phase 1.97: Pre-register all impl method signatures on target types.
		// This ensures trait methods (e.g. toStr from impl Stringable) are visible
		// to the type checker in Phase 2 regardless of source declaration order.
		for (var cu : compilationUnits)
		{
			analyzer.declareImplBodies(cu);
		}

		// Phase 2: Full visitation — solve bodies, check types.
		for (var cu : compilationUnits)
		{
			List<Diagnostic> errors = analyzer.analyze(cu);
			if (!errors.isEmpty())
			{
				for (var e : errors)
					Log.err(e.toString());
				return ExitCode.SEMANTIC_ERROR;
			}
		}

		// Skip codegen if --check-only was specified
		if (config.checkOnly())
		{
			if (config.compileAsLibrary())
			{
				exportSymbols(analyzer);
			}
			Log.info("Check-only mode: skipping code generation.");
			return ExitCode.SUCCESS;
		}

		// 4. Validate entry point (unless compiling as a library)
		if (!config.compileAsLibrary() && analyzer.getMainMethod() == null)
		{
			Diagnostic d = Diagnostic.of(org.nebula.nebc.frontend.diagnostic.DiagnosticCode.MISSING_MAIN_METHOD, org.nebula.nebc.frontend.diagnostic.SourceSpan.unknown());
			Log.err(d.toString());
			return ExitCode.CODEGEN_ERROR;
		}

		// 5. Code Generation (LLVM IR)
		LLVMCodeGenerator codegen = new LLVMCodeGenerator();
		try
		{
			List<CompilationUnit> unitsToCompile = compilationUnits;
			if (!config.compileAsLibrary())
			{
				// Exclude units originating from the standard library directory.
				unitsToCompile = compilationUnits.stream()
					.filter(cu -> !cu.getSpan().file().startsWith("std/")
						&& !cu.getSpan().file().contains("/std/")
						&& !cu.getSpan().file().contains("\\std\\"))
					.toList();
			}
			codegen.generate(unitsToCompile, analyzer, config.compileAsLibrary());

			// Print LLVM IR in verbose mode
			if (config.verbose())
			{
				Log.info("=== LLVM IR ===");
				Log.debug(codegen.dumpIR());
				Log.info("=== END IR ===");
			}

			// Save IR to file for debugging
			/* 
			try (java.io.PrintWriter out = new java.io.PrintWriter("generated.ll"))
			{
				out.println(codegen.dumpIR());
			}
			catch (java.io.IOException e)
			{
				Log.err("Could not write IR to file: " + e.getMessage());
			}
			*/

			// 6. Verify the module only after dumping it
			codegen.verifyModule();

			// 6a. For library builds: generate erased LLVM bitcode for all generic
			// methods so consumers can compile without the original source files.
			// Must run before NativeCompiler (module still valid) and before
			// exportSymbols (SymbolExporter reads the bitcode bytes from each MethodSymbol).
			if (config.compileAsLibrary())
			{
				generateErasedBitcodes(codegen, analyzer);
			}

			// 6. Emit native binary
			String outputPath = config.outputFile() != null ? config.outputFile() : "a.out";
			List<Path> extraObjects = new ArrayList<>();

			// 6. Native Compilation Phase: Compile all C/C++ sources provided
			List<Path> nativeObjects = compileNativeSources();
			if (nativeObjects != null)
			{
				extraObjects.addAll(nativeObjects);
			}

			// Merge auto-detected library dirs and names with config-provided ones.
			List<java.io.File> allLibDirs = new ArrayList<>(config.librarySearchPaths());
			allLibDirs.addAll(autoLibraryDirs);
			List<SourceFile> allLibNames = new ArrayList<>(config.nebLibraries());
			allLibNames.addAll(autoLibNames);

			NativeCompiler.compile(codegen.getModule(), outputPath, config.targetPlatform(), config.isStatic(), config.compileAsLibrary(), extraObjects, allLibDirs, allLibNames);

			// Cleanup extra objects
			for (Path p : extraObjects)
			{
				try
				{
					Files.deleteIfExists(p);
				}
				catch (IOException ignored)
				{
				}
			}

			if (config.compileAsLibrary())
			{
				exportSymbols(analyzer);
			}

			Log.info("Compiled successfully: " + outputPath);
			return ExitCode.SUCCESS;
		}
		catch (CodegenException e)
		{
			Log.err("Code generation failed: " + e.getMessage());
			return ExitCode.CODEGEN_ERROR;
		}
		finally
		{
			codegen.dispose();
		}
	}

	private List<Path> compileNativeSources()
	{
		List<Path> objects = new ArrayList<>();
		List<org.nebula.nebc.io.SourceFile> nativeSources = new ArrayList<>(config.nativeSources());

		// 1. Automatically include runtime C sources for library builds.
		//    For regular executable builds, pre-compiled shared/static libs are linked
		//    instead. Library builds must embed runtime symbols so produced .so files
		//    are self-contained (especially when building std itself with --nostdlib).
		if (config.compileAsLibrary())
		{
			java.util.Set<Path> runtimeDirs = discoverRuntimeDirs();
			java.util.Set<Path> runtimeSources = new java.util.LinkedHashSet<>();

			for (Path runtimeDir : runtimeDirs)
			{
				if (!Files.exists(runtimeDir))
				{
					continue;
				}

				try (java.util.stream.Stream<Path> stream = Files.walk(runtimeDir))
				{
					List<Path> stdCFiles = stream
							.filter(p -> p.toString().endsWith(".c") || p.toString().endsWith(".cpp"))
							.toList();
					for (Path cFile : stdCFiles)
					{
						String fileName = cFile.getFileName().toString();
						// start.c is the binary entry-point wrapper — skip for libraries.
						if (fileName.equals("start.c"))
							continue;
						// syscalls.c is superseded by runtime.c and linux_syscalls.c.
						if (fileName.equals("syscalls.c"))
							continue;
						runtimeSources.add(cFile.toAbsolutePath());
					}
				}
				catch (IOException e)
				{
					Log.warn("Failed to scan runtime sources at " + runtimeDir + ": " + e.getMessage());
				}
			}

			if (runtimeSources.isEmpty())
			{
				Log.warn("Runtime sources were not found for this library build.");
				Log.warn("The compiled library may be missing runtime functions (e.g. neb_* and __nebula_rt_*).");
			}
			else
			{
				for (Path cFile : runtimeSources)
				{
					nativeSources.add(new org.nebula.nebc.io.SourceFile(cFile.toString()));
				}
			}
		}

		// 2. Compile each native source to a temporary object file
		for (org.nebula.nebc.io.SourceFile sf : nativeSources)
		{
			if (sf.type() == org.nebula.nebc.io.FileType.NATIVE_HEADER || sf.type() == org.nebula.nebc.io.FileType.NATIVE_CPP_HEADER)
				continue;

			try
			{
				Path cFile = Path.of(sf.path());
				Path objFile = Files.createTempFile("neb_native_" + cFile.getFileName().toString(), ".o");

				List<String> cmd = new ArrayList<>(List.of("clang", "-c", cFile.toAbsolutePath().toString(), "-o", objFile.toAbsolutePath().toString(), "-O3", "-fno-stack-protector", "-ffreestanding"));

				if (config.compileAsLibrary())
				{
					cmd.add("-fPIC");
				}

				// If it's a C++ file, use clang++ or add flags
				if (sf.type() == org.nebula.nebc.io.FileType.NATIVE_CPP_SOURCE)
				{
					cmd.set(0, "clang++");
				}

				ProcessBuilder pb = new ProcessBuilder(cmd);
				int exitCode = pb.start().waitFor();
				if (exitCode != 0)
				{
					Log.err("Failed to compile native source: " + cFile);
					return null;
				}
				objects.add(objFile);
			}
			catch ( IOException |
					InterruptedException e)
			{
				Log.err("Error compiling native source: " + sf.path() + " - " + e.getMessage());
				return null;
			}
		}

		return objects;
	}

	/**
	 * Discovers candidate runtime directories for library builds.
	 *
	 * <p>Order of preference:</p>
	 * <ol>
	 *   <li>{@code $NEBULA_HOME/lib/std-<version>/runtime} when std is resolved.</li>
	 *   <li>Any {@code runtime/} directory found by walking up from Nebula source
	 *       files (supports building std with {@code --nostdlib}).</li>
	 * </ol>
	 */
	private java.util.Set<Path> discoverRuntimeDirs()
	{
		java.util.Set<Path> dirs = new java.util.LinkedHashSet<>();

		if (resolvedStdDir != null)
		{
			dirs.add(resolvedStdDir.resolve("runtime").toAbsolutePath().normalize());
		}

		for (SourceFile sf : config.nebSources())
		{
			Path sourcePath = Path.of(sf.path()).toAbsolutePath().normalize();
			Path dir = Files.isDirectory(sourcePath) ? sourcePath : sourcePath.getParent();

			while (dir != null)
			{
				Path candidate = dir.resolve("runtime");
				if (Files.isDirectory(candidate))
				{
					dirs.add(candidate.toAbsolutePath().normalize());
				}
				dir = dir.getParent();
			}
		}

		return dirs;
	}

	// ==========================================================================
	// $NEBULA_HOME resolution helpers
	// ==========================================================================

	/**
	 * Returns the Nebula home directory.
	 * <ul>
	 *   <li>Uses {@code $NEBULA_HOME} if the environment variable is set and non-blank.</li>
	 *   <li>Falls back to {@code $HOME/.nebula} otherwise.</li>
	 * </ul>
	 */
	private static Path resolveNebulaHome()
	{
		String envHome = System.getenv("NEBULA_HOME");
		if (envHome != null && !envHome.isBlank())
			return Path.of(envHome);

		return Path.of(System.getProperty("user.home"), ".nebula");
	}

	/**
	 * Searches {@code $NEBULA_HOME/lib/} for a directory whose name starts with
	 * {@code "std-"} and returns the first match, or empty if not found.
	 */
	private static java.util.Optional<Path> findStdLibDir(Path nebulaHome)
	{
		Path libDir = nebulaHome.resolve("lib");
		if (!Files.exists(libDir))
			return java.util.Optional.empty();

		try (java.util.stream.Stream<Path> stream = Files.list(libDir))
		{
			return stream
					.filter(Files::isDirectory)
					.filter(p -> p.getFileName().toString().startsWith("std-"))
					.findFirst();
		}
		catch (IOException e)
		{
			return java.util.Optional.empty();
		}
	}

	/**
	 * Resolves and validates the standard library paths from {@code $NEBULA_HOME}.
	 * Populates {@link #resolvedStdDir}, {@link #resolvedStdSym}, and
	 * {@link #resolvedStdLib}.
	 *
	 * <p>Returns {@code true} on success. On failure it prints a clear error message
	 * and returns {@code false} so the caller can abort immediately.</p>
	 */
	private boolean resolveStdPaths()
	{
		Path nebulaHome = resolveNebulaHome();
		java.util.Optional<Path> stdDirOpt = findStdLibDir(nebulaHome);

		if (stdDirOpt.isEmpty())
		{
			Log.err("Standard library not found.");
			Log.err("Expected a 'std-*' directory under: " + nebulaHome.resolve("lib"));
			Log.err("Install Nebula or set the NEBULA_HOME environment variable.");
			return false;
		}

		Path stdDir = stdDirOpt.get();

		// Validate symbols file
		Path stdSym = stdDir.resolve("neb.nebsym");
		if (!Files.exists(stdSym))
		{
			Log.err("Standard library symbols not found: " + stdSym);
			Log.err("The Nebula installation may be incomplete.");
			return false;
		}

		// Validate compiled library (prefer .so, fall back to .a)
		Path sharedLib = stdDir.resolve("libneb.so");
		Path staticLib = stdDir.resolve("libneb.a");
		if (!Files.exists(sharedLib) && !Files.exists(staticLib))
		{
			Log.err("Standard library binary not found in: " + stdDir);
			Log.err("Expected libneb.so or libneb.a — the Nebula installation may be incomplete.");
			return false;
		}

		this.resolvedStdDir = stdDir;
		this.resolvedStdSym = stdSym;
		this.resolvedStdLib = Files.exists(sharedLib) ? sharedLib : staticLib;

		Log.info("Using standard library: " + stdDir);
		return true;
	}

	private boolean loadExternalSymbols(SemanticAnalyzer analyzer)
	{

		SymbolImporter importer  = new SymbolImporter();
		java.util.Map<Type, SymbolTable> primImpls = analyzer.getPrimitiveImplScopes();

		// Track canonical paths of all symbol files already loaded to prevent
		// double-loading when both -s <path> and -l/-L auto-loading would resolve
		// to the same file.
		java.util.Set<String> loadedSymPaths = new java.util.LinkedHashSet<>();

		// Load default std if not disabled
		if (config.useStdLib())
		{
			try
			{
				// resolvedStdSym was validated in resolveStdPaths() — it is guaranteed to exist.
				Log.info("Loading standard library symbols: " + resolvedStdSym);
				importer.importSymbols(resolvedStdSym.toString(), analyzer.getGlobalScope(), primImpls);
				loadedSymPaths.add(resolvedStdSym.toAbsolutePath().toString());

				// Link against the pre-compiled std binary (only needed for executable builds;
				// library builds embed the runtime C sources directly via compileNativeSources).
				if (!config.compileAsLibrary())
				{
					String libFileName = resolvedStdLib.getFileName().toString();
					String baseName    = libFileName
							.replaceFirst("^lib", "")
							.replaceFirst("\\.(so|a)$", "");
					autoLibraryDirs.add(resolvedStdLib.getParent().toFile());
					autoLibNames.add(new SourceFile(baseName));
					Log.info("Auto-linking std library: " + resolvedStdLib);
				}
			}
			catch (IOException e)
			{
				Log.err("Failed to load standard library symbols: " + e.getMessage());
				return false;
			}
		}

		// Load user-specified symbol files (e.g. -s path/to/lib.nebsym)
		for (SourceFile sf : config.symbolFiles())
		{
			try
			{
				String canonical = new java.io.File(sf.path()).getCanonicalPath();
				Log.info("Loading symbols: " + sf.path());
				importer.importSymbols(sf.path(), analyzer.getGlobalScope(), primImpls);
				loadedSymPaths.add(canonical);
			}
			catch (IOException e)
			{
				Log.err("Failed to load symbols from '" + sf.path() + "': " + e.getMessage());
				return false; // Fatal: user explicitly requested this file
			}
		}

		// Auto-load .nebsym companion files for every -l library found in -L search paths.
		// e.g. `-l test -L .` will look for ./test.nebsym and load it for analysis.
		// Skips files already loaded via an explicit -s flag.
		for (SourceFile lib : config.nebLibraries())
		{
			String libName = lib.path();
			boolean found = false;

			for (java.io.File libDir : config.librarySearchPaths())
			{
				Path nebsym = libDir.toPath().resolve(libName + ".nebsym");
				if (Files.exists(nebsym))
				{
					try
					{
						String canonical = nebsym.toFile().getCanonicalPath();
						if (loadedSymPaths.contains(canonical))
						{
							Log.debug("Skipping already-loaded symbols for library '" + libName + "': " + nebsym);
						}
						else
						{
							Log.info("Auto-loading symbols for library '" + libName + "': " + nebsym);
							importer.importSymbols(nebsym.toString(), analyzer.getGlobalScope(), primImpls);
							loadedSymPaths.add(canonical);
						}
					}
					catch (IOException e)
					{
						Log.warn("Failed to auto-load symbols from " + nebsym + ": " + e.getMessage());
					}
					found = true;
					break; // First match wins; don't load the same library twice.
				}
			}

			if (!found)
			{
				Log.debug("No .nebsym found for library '" + libName + "' in library search paths.");
			}
		}
		return true;
	}

	/**
	 * Walks the global symbol table (and all namespace sub-tables) to find every
	 * generic {@link MethodSymbol} that was compiled in this run (i.e. has a non-null
	 * {@link MethodDeclaration} node), and asks the code generator to produce the
	 * type-erased LLVM bitcode for it.  The bytes are stored on the symbol so that
	 * {@link SymbolExporter} can embed them as Base64 in the {@code .nebsym} file.
	 */
	private void generateErasedBitcodes(LLVMCodeGenerator codegen, SemanticAnalyzer analyzer)
	{
		generateErasedBitcodesInScope(codegen, analyzer.getGlobalScope());
	}

	private void generateErasedBitcodesInScope(LLVMCodeGenerator codegen, SymbolTable scope)
	{
		for (Symbol sym : scope.getSymbols().values())
		{
			if (sym instanceof MethodSymbol ms
					&& !ms.getTypeParameters().isEmpty()
					&& ms.getDeclarationNode() instanceof org.nebula.nebc.ast.declarations.MethodDeclaration decl)
			{
				Log.debug("Generating erased bitcode for generic method: " + ms.getName());
				byte[] bitcode = codegen.emitErasedFunctionBitcode(decl, ms);
				if (bitcode != null)
					ms.setGenericBitcode(bitcode);
				else
					Log.warn("Could not generate erased bitcode for: " + ms.getName());
			}
			else if (sym instanceof NamespaceSymbol ns)
			{
				generateErasedBitcodesInScope(codegen, ns.getMemberTable());
			}
		}
	}

	private void exportPreludeSymbols(SemanticAnalyzer analyzer)	{
		// Export prelude symbols: make commonly-used std::io symbols available globally
		// without requiring explicit 'use' statements.
		if (!config.useStdLib())
			return;

		Symbol stdIoSymbol = analyzer.getGlobalScope().resolve("std");
		if (stdIoSymbol == null || !(stdIoSymbol instanceof NamespaceSymbol stdNs))
		{
			Log.debug("Couldn't resolve the std namespace");
			return;
		}

		Symbol ioSymbol = stdNs.getMemberTable().resolve("io");
		if (ioSymbol == null || !(ioSymbol instanceof NamespaceSymbol ioNs))
		{
			Log.debug("Couldn't resolve the std::io namespace");
			return;
		}

		String[] preludeSymbols = { "print", "println", "Stringable" };

		for (String symbolName : preludeSymbols)
		{
			Symbol symbol = ioNs.getMemberTable().resolve(symbolName);
			if (symbol != null)
			{
				// Use alias() so that the symbol's definedIn is NOT overwritten —
				// getMangledName() must still return std__io__println, not plain println,
				// otherwise erased generic bitcode linking breaks.
				analyzer.getGlobalScope().alias(symbolName, symbol);
				if (config.verbose())
				{
					Log.debug("Prelude: exporting std::io::" + symbolName + " to global scope");
				}
			}
		}
	}

	private void exportSymbols(SemanticAnalyzer analyzer)
	{
		String outputPath = config.outputFile() != null ? config.outputFile() : "out";
		// Remove extension if present
		if (outputPath.contains("."))
		{
			outputPath = outputPath.substring(0, outputPath.lastIndexOf('.'));
		}
		String symPath = outputPath + ".nebsym";

		SymbolExporter exporter = new SymbolExporter();
		try
		{
			Log.info("Exporting symbols to: " + symPath);
			exporter.export(analyzer.getGlobalScope(),
					analyzer.getPrimitiveImplScopes(),
					outputPath, symPath);
		}
		catch (IOException e)
		{
			Log.err("Failed to export symbols: " + e.getMessage());
		}
	}

}