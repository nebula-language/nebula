package org.nebula.nebc.codegen;

import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.LLVMContextRef;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.nebula.nebc.semantic.types.ArrayType;
import org.nebula.nebc.semantic.types.CompositeType;
import org.nebula.nebc.semantic.types.EnumType;
import org.nebula.nebc.semantic.types.FunctionType;
import org.nebula.nebc.semantic.types.OptionalType;
import org.nebula.nebc.semantic.types.PrimitiveType;
import org.nebula.nebc.semantic.types.TupleType;
import org.nebula.nebc.semantic.types.Type;
import org.nebula.nebc.semantic.types.TypeParameterType;
import org.nebula.nebc.semantic.types.UnionType;

import static org.bytedeco.llvm.global.LLVM.*;

/**
 * Maps Nebula semantic {@link Type} objects to LLVM {@link LLVMTypeRef} values.
 * <p>
 * This class caches named struct types to ensure type consistency within an
 * LLVM context.
 */
public final class LLVMTypeMapper
{

	private LLVMTypeMapper()
	{
		// Utility class
	}

	/**
	 * Converts a Nebula semantic type to its LLVM IR representation.
	 *
	 * @param ctx  The LLVM context in which the type is created.
	 * @param type The Nebula semantic type to map.
	 * @return The corresponding LLVM type ref.
	 * @throws CodegenException if the type cannot be mapped.
	 */
	public static LLVMTypeRef map(LLVMContextRef ctx, Type type)
	{
		if (type == null)
		{
			new RuntimeException("DEBUG: null type passed to LLVMTypeMapper.map").printStackTrace(System.err);
			throw new CodegenException("Internal error: Attempted to map a null type to LLVM.");
		}
		if (type instanceof PrimitiveType pt)
		{
			return mapPrimitive(ctx, pt);
		}
		if (type instanceof FunctionType ft)
		{
			return mapFunction(ctx, ft);
		}
		// Enums are represented as plain i32 discriminants.
		if (type instanceof EnumType)
		{
			return LLVMInt32TypeInContext(ctx);
		}
		// Tagged unions: { i32 tag, [N x i8] payload } where N is computed dynamically
		if (type instanceof UnionType ut)
		{
			return getOrCreateUnionStructType(ctx, ut);
		}
		// Optional T? → { i1 present, T value }
		if (type instanceof OptionalType ot)
		{
			return getOrCreateOptionalStructType(ctx, ot);
		}
		// Arrays: fixed-size arrays are inlined as [N x elemType], dynamic arrays
		// are represented as opaque pointers (pointer to element type).
		if (type instanceof ArrayType at)
		{
			if (at.elementCount > 0)
			{
				// Fixed-size array: inline [N x elemType]
				// For struct base types, use the actual struct layout (not ptr)
				// so that structs are stored inline by value in the array.
				LLVMTypeRef elemType;
				if (at.baseType instanceof org.nebula.nebc.semantic.types.StructType st)
				{
					elemType = getOrCreateStructType(ctx, st);
				}
				else
				{
					elemType = map(ctx, at.baseType);
				}
				return LLVMArrayType(elemType, at.elementCount);
			}
			return LLVMPointerTypeInContext(ctx, 0);
		}
		if (type instanceof CompositeType ct)
		{
			return mapComposite(ctx, ct);
		}
		if (type instanceof TupleType tt)
		{
			return getOrCreateTupleType(ctx, tt);
		}
		if (type instanceof TypeParameterType tpt)
		{
			// Erased generic lowering: unresolved type parameters are represented as
			// opaque pointers in LLVM IR. This allows template/library symbols to be
			// emitted with a stable ptr-based ABI.
			return LLVMPointerTypeInContext(ctx, 0);
		}
		throw new CodegenException("Unmappable type: " + type.name());
	}

	// ── Primitives ──────────────────────────────────────────────

	private static LLVMTypeRef mapPrimitive(LLVMContextRef ctx, PrimitiveType pt)
	{
		// Identity comparison — PrimitiveType uses singleton instances
		if (pt == PrimitiveType.VOID)
			return LLVMVoidTypeInContext(ctx);
		if (pt == PrimitiveType.BOOL)
			return LLVMInt1TypeInContext(ctx);

		if (pt == PrimitiveType.I8 || pt == PrimitiveType.U8)
			return LLVMInt8TypeInContext(ctx);
		if (pt == PrimitiveType.I16 || pt == PrimitiveType.U16)
			return LLVMInt16TypeInContext(ctx);
		if (pt == PrimitiveType.I32 || pt == PrimitiveType.U32)
			return LLVMInt32TypeInContext(ctx);
		if (pt == PrimitiveType.I64 || pt == PrimitiveType.U64)
			return LLVMInt64TypeInContext(ctx);

		if (pt == PrimitiveType.F32)
			return LLVMFloatTypeInContext(ctx);
		if (pt == PrimitiveType.F64)
			return LLVMDoubleTypeInContext(ctx);

		// char → i32 (Unicode code point)
		if (pt == PrimitiveType.CHAR)
			return LLVMInt32TypeInContext(ctx);

		// str → { i8*, i64 }
		if (pt == PrimitiveType.STR)
		{
			return getOrCreateStructType(ctx, pt);
		}

		// Ref, ANY → i8* (pointer)
		if (pt == PrimitiveType.REF || pt == (PrimitiveType) Type.ANY)
			return LLVMPointerTypeInContext(ctx, 0);

		// cstr → ptr (raw null-terminated C string, i.e. char*)
		if (pt == PrimitiveType.CSTR)
			return LLVMPointerTypeInContext(ctx, 0);

		throw new CodegenException("Unmappable primitive type: " + pt.name());
	}

	// ── Functions ───────────────────────────────────────────────

	private static LLVMTypeRef mapComposite(LLVMContextRef ctx, CompositeType ct)
	{
		// For now, we always use pointers to structs for composite types in Nebula
		LLVMTypeRef structType = getOrCreateStructType(ctx, ct);
		return LLVMPointerTypeInContext(ctx, 0);
	}

	/**
	 * Returns the LLVM element type for a fixed-size array. For struct base types
	 * this returns the actual named struct type (not ptr), so the array is
	 * [N x %StructName] with inline values.
	 */
	public static LLVMTypeRef mapFixedArrayElementType(LLVMContextRef ctx, ArrayType at)
	{
		if (at.baseType instanceof org.nebula.nebc.semantic.types.StructType st)
		{
			return getOrCreateStructType(ctx, st);
		}
		return map(ctx, at.baseType);
	}

	private static final java.util.Map<String, LLVMTypeRef> structTypes = new java.util.HashMap<>();

	public static LLVMTypeRef getOrCreateStructType(LLVMContextRef ctx, Type type)
	{
		if (type == PrimitiveType.STR)
		{
			if (structTypes.containsKey("str"))
			{
				return structTypes.get("str");
			}

			LLVMTypeRef[] fields = {LLVMPointerTypeInContext(ctx, 0), LLVMInt64TypeInContext(ctx)};
			LLVMTypeRef structType = LLVMStructCreateNamed(ctx, "str");
			LLVMStructSetBody(structType, new PointerPointer<>(fields), 2, 0);
			structTypes.put("str", structType);
			return structType;
		}

		if (!(type instanceof CompositeType ct))
		{
			throw new CodegenException("Cannot get struct type for non-composite type: " + type.name());
		}

		if (structTypes.containsKey(ct.name()))
		{
			return structTypes.get(ct.name());
		}

		LLVMTypeRef structType = LLVMStructCreateNamed(ctx, ct.name());
		structTypes.put(ct.name(), structType);

		// Collect fields: inherited parent fields first (depth-first, ancestors before child),
		// then the child's own fields.  This mirrors C++ base-subobject layout so that
		// casting a child pointer to its parent type is a valid no-op ptr cast.
		java.util.List<org.nebula.nebc.semantic.symbol.VariableSymbol> fields = new java.util.ArrayList<>();
		if (ct instanceof org.nebula.nebc.semantic.types.ClassType classType)
		{
			collectInheritedFields(classType, fields, new java.util.HashSet<>());
		}
		// Own fields (symbols defined directly in this scope, excluding 'this' and methods)
		for (org.nebula.nebc.semantic.symbol.Symbol s : ct.getMemberScope().getSymbols().values())
		{
			if (s instanceof org.nebula.nebc.semantic.symbol.VariableSymbol vs && !vs.getName().equals("this"))
				fields.add(vs);
		}

		LLVMTypeRef[] fieldTypesArr = new LLVMTypeRef[fields.size()];
		for (int i = 0; i < fields.size(); i++)
		{
			Type fieldType = fields.get(i).getType();
			// Struct fields that are other struct types must be stored inline (value
			// semantics), not as opaque pointers.  map() returns ptr for composites,
			// so we special-case StructType to use the actual named struct layout.
			if (fieldType instanceof org.nebula.nebc.semantic.types.StructType fieldSt)
			{
				fieldTypesArr[i] = getOrCreateStructType(ctx, fieldSt);
			}
			else
			{
				fieldTypesArr[i] = map(ctx, fieldType);
			}
		}

		PointerPointer<LLVMTypeRef> fieldTypes = new PointerPointer<>(fieldTypesArr);
		LLVMStructSetBody(structType, fieldTypes, fields.size(), /* isPacked */ 0);

		return structType;
	}

	public static void clearCache()
	{
		structTypes.clear();
	}

	/**
	 * Recursively collects all inherited field symbols for {@code classType} into
	 * {@code out}, depth-first (most-distant ancestor first), skipping duplicates.
	 * Only {@link VariableSymbol}s (not methods or 'this') are collected.
	 */
	private static void collectInheritedFields(
			org.nebula.nebc.semantic.types.ClassType classType,
			java.util.List<org.nebula.nebc.semantic.symbol.VariableSymbol> out,
			java.util.Set<String> seen)
	{
		for (org.nebula.nebc.semantic.types.ClassType parent : classType.getParentTypes())
		{
			// Recurse into grandparents first
			collectInheritedFields(parent, out, seen);
			// Then add parent's own fields
			for (org.nebula.nebc.semantic.symbol.Symbol s : parent.getMemberScope().getSymbols().values())
			{
				if (s instanceof org.nebula.nebc.semantic.symbol.VariableSymbol vs
						&& !vs.getName().equals("this")
						&& seen.add(vs.getName()))
				{
					out.add(vs);
				}
			}
		}
	}

	/**
	 * Maps a {@link TupleType} to an LLVM anonymous struct.
	 * Tuples are represented as {@code { T0, T1, ... }} where each field maps the
	 * corresponding element type.  The struct is cached by the tuple's display name.
	 */
	public static LLVMTypeRef getOrCreateTupleType(LLVMContextRef ctx, TupleType tt)
	{
		String key = "tuple." + tt.name();
		if (structTypes.containsKey(key))
			return structTypes.get(key);

		LLVMTypeRef structType = LLVMStructCreateNamed(ctx, key);
		structTypes.put(key, structType); // register early to break potential recursion

		LLVMTypeRef[] fieldTypesArr = new LLVMTypeRef[tt.elementTypes.size()];
		for (int i = 0; i < tt.elementTypes.size(); i++)
		{
			fieldTypesArr[i] = map(ctx, tt.elementTypes.get(i));
		}
		LLVMStructSetBody(structType, new PointerPointer<>(fieldTypesArr), fieldTypesArr.length, 0);
		return structType;
	}

	/**
	 * Tagged-union IR layout: {@code { i32 tag, [PAYLOAD_BYTES x i8] payload }}.
	 * The payload region is dynamically sized to hold the widest variant payload.
	 * Variant-specific accessor structs use bitcasting at the call-site.
	 */
	public static final int UNION_MIN_PAYLOAD_BYTES = 16; // minimum: big enough for str {i8*,i64}

	public static LLVMTypeRef getOrCreateUnionStructType(LLVMContextRef ctx, UnionType ut)
	{
		// Normalize the key: strip type arguments (e.g. "PutResult<V>" → "PutResult")
		// so that generic unions with unerased type params share the same LLVM struct
		// as their base definition.  This prevents IR type-mismatch when the function
		// return type is resolved as "union.PutResult<V>" but the return expression
		// uses the base "union.PutResult" struct.
		String baseName = ut.name();
		int lt = baseName.indexOf('<');
		if (lt >= 0) baseName = baseName.substring(0, lt);
		String key = "union." + baseName;
		if (structTypes.containsKey(key))
			return structTypes.get(key);

		LLVMTypeRef structType = LLVMStructCreateNamed(ctx, key);
		structTypes.put(key, structType); // register early to break recursion

		// Compute the maximum payload size from the variant constructors.
		int maxPayload = UNION_MIN_PAYLOAD_BYTES;
		java.util.Set<String> visited = new java.util.HashSet<>();
		visited.add(baseName); // guard against self-referential unions
		for (var entry : ut.getMemberScope().getSymbols().entrySet())
		{
			if (entry.getValue() instanceof org.nebula.nebc.semantic.symbol.MethodSymbol ms)
			{
				FunctionType ft = ms.getType();
				if (!ft.parameterTypes.isEmpty())
				{
					int variantSize = estimateTypeSize(ctx, ft.parameterTypes.get(0), visited);
					if (variantSize > maxPayload)
						maxPayload = variantSize;
				}
			}
		}

		// { i32, [maxPayload x i8] }
		LLVMTypeRef i32t    = LLVMInt32TypeInContext(ctx);
		LLVMTypeRef payload = LLVMArrayType(LLVMInt8TypeInContext(ctx), maxPayload);
		LLVMTypeRef[] fields = {i32t, payload};
		LLVMStructSetBody(structType, new PointerPointer<>(fields), 2, 0);
		return structType;
	}

	/**
	 * Estimates the byte size of a Nebula type for tagged-union payload sizing.
	 * Uses the LLVM type system where possible, with manual estimates as fallback.
	 * The {@code visited} set prevents infinite recursion on cyclic type graphs.
	 */
	private static int estimateTypeSize(LLVMContextRef ctx, Type type, java.util.Set<String> visited)
	{
		if (type instanceof PrimitiveType pt)
		{
			if (pt == PrimitiveType.BOOL || pt == PrimitiveType.I8 || pt == PrimitiveType.U8) return 1;
			if (pt == PrimitiveType.I16 || pt == PrimitiveType.U16 || pt == PrimitiveType.CHAR) return 2;
			if (pt == PrimitiveType.I32 || pt == PrimitiveType.U32 || pt == PrimitiveType.F32) return 4;
			if (pt == PrimitiveType.I64 || pt == PrimitiveType.U64 || pt == PrimitiveType.F64) return 8;
			if (pt == PrimitiveType.STR) return 16; // { ptr, i64 }
		}
		if (type instanceof EnumType) return 4;
		if (type instanceof org.nebula.nebc.semantic.types.StructType st)
		{
			// Cycle detection: if we've already seen this struct, return pointer size
			if (!visited.add(st.name()))
				return 8;
			// Compute struct size from its fields.
			int size = 0;
			for (var sym : st.getMemberScope().getSymbols().values())
			{
				if (sym instanceof org.nebula.nebc.semantic.symbol.VariableSymbol vs)
				{
					int fieldSize = estimateTypeSize(ctx, vs.getType(), visited);
					// Align field to its natural alignment
					int align = Math.min(fieldSize, 8);
					if (align > 0 && size % align != 0)
						size += align - (size % align);
					size += fieldSize;
				}
			}
			// Final struct alignment to 8 bytes
			if (size % 8 != 0)
				size += 8 - (size % 8);
			return Math.max(size, 8);
		}
		if (type instanceof UnionType innerUt)
		{
			// Cycle detection
			if (!visited.add(innerUt.name()))
				return 8;
			// Nested union: tag (4) + max payload
			int maxInner = UNION_MIN_PAYLOAD_BYTES;
			for (var entry : innerUt.getMemberScope().getSymbols().entrySet())
			{
				if (entry.getValue() instanceof org.nebula.nebc.semantic.symbol.MethodSymbol ms)
				{
					FunctionType ft = ms.getType();
					if (!ft.parameterTypes.isEmpty())
					{
						int variantSize = estimateTypeSize(ctx, ft.parameterTypes.get(0), visited);
						if (variantSize > maxInner)
							maxInner = variantSize;
					}
				}
			}
			return 4 + maxInner;
		}
		if (type instanceof OptionalType ot)
		{
			return 1 + estimateTypeSize(ctx, ot.innerType, visited); // i1 + inner
		}
		if (type instanceof ArrayType at)
		{
			if (at.elementCount > 0)
			{
				// Fixed-size array: N * element size
				return at.elementCount * estimateTypeSize(ctx, at.baseType, visited);
			}
			return 8; // dynamic array = pointer-sized
		}
		// Default: pointer-sized (for classes, function pointers, etc.)
		return 8;
	}

	/**
	 * Optional IR layout: {@code { i1 present, T value }}.
	 */
	public static LLVMTypeRef getOrCreateOptionalStructType(LLVMContextRef ctx, OptionalType ot)
	{
		String key = "opt." + ot.innerType.name();
		if (structTypes.containsKey(key))
			return structTypes.get(key);

		LLVMTypeRef structType = LLVMStructCreateNamed(ctx, key);
		structTypes.put(key, structType);

		LLVMTypeRef i1t    = LLVMInt1TypeInContext(ctx);
		LLVMTypeRef innerT = map(ctx, ot.innerType);
		LLVMTypeRef[] fields = {i1t, innerT};
		LLVMStructSetBody(structType, new PointerPointer<>(fields), 2, 0);
		return structType;
	}

	private static LLVMTypeRef mapFunction(LLVMContextRef ctx, FunctionType ft)
	{
		// Structs are value types — return them by value (the actual LLVM struct type),
		// not as an opaque pointer.  Classes remain pointer-based (heap allocated).
		LLVMTypeRef returnType;
		if (ft.returnType instanceof org.nebula.nebc.semantic.types.StructType stRet)
		{
			returnType = getOrCreateStructType(ctx, stRet);
		}
		else
		{
			returnType = map(ctx, ft.returnType);
		}
		int paramCount = ft.parameterTypes.size();
		if (paramCount == 0)
		{
			return LLVMFunctionType(returnType, new LLVMTypeRef(), 0, /* isVarArg */ 0);
		}
		// Build the expanded LLVM parameter list.
		// Dynamic array parameters (elementCount == 0) are expanded to (ptr, i64) to
		// pass both the data pointer and the runtime element count as a fat-parameter pair.
		// Fixed-size array parameters are passed as their inline [N x elemType] directly.
		java.util.List<LLVMTypeRef> expanded = new java.util.ArrayList<>();
		for (int i = 0; i < paramCount; i++)
		{
			expanded.add(map(ctx, ft.parameterTypes.get(i)));
			if (ft.parameterTypes.get(i) instanceof ArrayType at && at.elementCount == 0)
			{
				expanded.add(LLVMInt64TypeInContext(ctx));
			}
		}
		int llvmCount = expanded.size();
		PointerPointer<LLVMTypeRef> paramTypes = new PointerPointer<>(llvmCount);
		for (int i = 0; i < llvmCount; i++)
		{
			paramTypes.put(i, expanded.get(i));
		}
		return LLVMFunctionType(returnType, paramTypes, llvmCount, /* isVarArg */ 0);
	}

	/**
	 * Maps a Nebula {@link FunctionType} to its C-ABI-compatible LLVM function type.
	 * Nebula's {@code str} fat-pointer struct ({@code { ptr, i64 }}) is lowered to
	 * a raw {@code ptr} so that {@code extern "C"} declarations match the expected
	 * C ABI ({@code char*} / {@code const char*}).
	 */
	public static LLVMTypeRef mapForExternC(LLVMContextRef ctx, FunctionType ft)
	{
		LLVMTypeRef returnType;
		if (ft.returnType instanceof org.nebula.nebc.semantic.types.StructType stRet)
		{
			returnType = getOrCreateStructType(ctx, stRet);
		}
		else
		{
			returnType = externCLower(ctx, ft.returnType);
		}
		int paramCount = ft.parameterTypes.size();
		if (paramCount == 0)
		{
			return LLVMFunctionType(returnType, new LLVMTypeRef(), 0, /* isVarArg */ 0);
		}
		PointerPointer<LLVMTypeRef> paramTypes = new PointerPointer<>(paramCount);
		for (int i = 0; i < paramCount; i++)
		{
			paramTypes.put(i, externCLower(ctx, ft.parameterTypes.get(i)));
		}
		return LLVMFunctionType(returnType, paramTypes, paramCount, /* isVarArg */ 0);
	}

	/**
	 * Lowers a single Nebula type to its C ABI counterpart:
	 * <ul>
	 *   <li>{@code str} &rarr; {@code ptr} (C {@code char*})</li>
	 *   <li>everything else &rarr; {@link #map(LLVMContextRef, Type)}</li>
	 * </ul>
	 */
	public static LLVMTypeRef externCLower(LLVMContextRef ctx, Type type)
	{
		if (type == PrimitiveType.STR)
			return LLVMPointerTypeInContext(ctx, 0);
		return map(ctx, type);
	}
}
