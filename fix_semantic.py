#!/usr/bin/env python3
"""Apply all built-in type/symbol registrations to SemanticAnalyzer.java"""

import re

SA_PATH = 'nebc/src/main/java/org/nebula/nebc/semantic/SemanticAnalyzer.java'

with open(SA_PATH, 'r') as f:
    content = f.read()

# ============================================================================
# 1. Add built-in declarations in declareTypes method
# ============================================================================

# Find the declareTypes method and add built-in registrations after PrimitiveType.defineAll
old_declare = '''\tpublic void declareTypes(CompilationUnit unit)
\t{
\t\tcurrentScope = globalScope;
\t\t// Initialize built-in primitive types as TypeSymbols
\t\tPrimitiveType.defineAll(globalScope);

\t\tdeclareTypesRecursive(unit.declarations);
\t}'''

new_declare = '''\tpublic void declareTypes(CompilationUnit unit)
\t{
\t\tcurrentScope = globalScope;
\t\t// Initialize built-in primitive types as TypeSymbols
\t\tPrimitiveType.defineAll(globalScope);

\t\t// Built-in assert(bool) -> void
\t\tFunctionType assertType = new FunctionType(PrimitiveType.VOID, List.of(PrimitiveType.BOOL));
\t\tglobalScope.define(new MethodSymbol("assert", assertType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));

\t\t// Built-in print(str) -> void and println variants
\t\tFunctionType printStrType = new FunctionType(PrimitiveType.VOID, List.of(PrimitiveType.STR));
\t\tglobalScope.define(new MethodSymbol("print", printStrType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));

\t\t// Register std::math namespace with common math functions
\t\tdeclareStdMathNamespace();

\t\t// Register stub traits for std::ops, std::Stringable, std::Eq, std::Safe, std::Ptr, Box
\t\tdeclareStdHelperTypes();

\t\tdeclareTypesRecursive(unit.declarations);
\t}'''

content = content.replace(old_declare, new_declare)

# ============================================================================
# 2. Add helper methods after declareTypes and before declareTypesRecursive
# ============================================================================

old_recursive = '''\tprivate void declareTypesRecursive(List<ASTNode> declarations)
\t{
\t\tif (declarations == null)
\t\t\treturn;'''

helper_methods = '''\tprivate void declareStdMathNamespace()
\t{
\t\t// Navigate to std::math, creating if needed
\t\tSymbol stdSym = globalScope.resolveLocal("std");
\t\tSymbolTable stdScope;
\t\tif (stdSym instanceof NamespaceSymbol stdNs)
\t\t{
\t\t\tstdScope = stdNs.getMemberTable();
\t\t}
\t\telse
\t\t{
\t\t\tNamespaceType stdType = new NamespaceType("std", globalScope);
\t\t\tNamespaceSymbol stdNs = new NamespaceSymbol("std", stdType, null);
\t\t\tglobalScope.define(stdNs);
\t\t\tstdScope = stdNs.getMemberTable();
\t\t\tstdScope.setOwner(stdNs);
\t\t}

\t\tSymbol mathSym = stdScope.resolveLocal("math");
\t\tSymbolTable mathScope;
\t\tif (mathSym instanceof NamespaceSymbol mathNs)
\t\t{
\t\t\tmathScope = mathNs.getMemberTable();
\t\t}
\t\telse
\t\t{
\t\t\tNamespaceType mathType = new NamespaceType("math", stdScope);
\t\t\tNamespaceSymbol mathNs = new NamespaceSymbol("math", mathType, null);
\t\t\tstdScope.define(mathNs);
\t\t\tmathScope = mathNs.getMemberTable();
\t\t\tmathScope.setOwner(mathNs);
\t\t}

\t\t// Register common math functions
\t\tFunctionType f64ToF64 = new FunctionType(PrimitiveType.F64, List.of(PrimitiveType.F64));
\t\tFunctionType f64f64ToF64 = new FunctionType(PrimitiveType.F64, List.of(PrimitiveType.F64, PrimitiveType.F64));

\t\tmathScope.define(new MethodSymbol("abs", f64ToF64, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tmathScope.define(new MethodSymbol("sqrt", f64ToF64, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tmathScope.define(new MethodSymbol("pow", f64f64ToF64, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tmathScope.define(new MethodSymbol("floor", f64ToF64, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tmathScope.define(new MethodSymbol("ceil", f64ToF64, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tmathScope.define(new MethodSymbol("max", f64f64ToF64, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tmathScope.define(new MethodSymbol("min", f64f64ToF64, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tmathScope.define(new MethodSymbol("log", f64ToF64, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));

\t\t// PI constant
\t\tVariableSymbol piSym = new VariableSymbol("PI", PrimitiveType.F64, false, null);
\t\tmathScope.define(piSym);
\t}

\tprivate void declareStdHelperTypes()
\t{
\t\t// Navigate to std namespace
\t\tSymbol stdSym = globalScope.resolveLocal("std");
\t\tSymbolTable stdScope;
\t\tif (stdSym instanceof NamespaceSymbol stdNs)
\t\t{
\t\t\tstdScope = stdNs.getMemberTable();
\t\t}
\t\telse
\t\t{
\t\t\treturn; // std namespace should exist at this point
\t\t}

\t\t// std::Stringable — trait stub
\t\tTraitType stringableTrait = new TraitType("Stringable", stdScope);
\t\tFunctionType toStrType = new FunctionType(PrimitiveType.STR, List.of(stringableTrait));
\t\tMethodSymbol toStrMethod = new MethodSymbol("toStr", toStrType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList());
\t\tstringableTrait.addRequiredMethod(toStrMethod);
\t\tstdScope.define(new TypeSymbol("Stringable", stringableTrait, null));

\t\t// std::Eq — trait stub
\t\tTraitType eqTrait = new TraitType("Eq", stdScope);
\t\tstdScope.define(new TypeSymbol("Eq", eqTrait, null));

\t\t// std::Safe — trait stub
\t\tTraitType safeTrait = new TraitType("Safe", stdScope);
\t\tstdScope.define(new TypeSymbol("Safe", safeTrait, null));

\t\t// std::Ptr — struct stub with from() method
\t\tStructType ptrType = new StructType("Ptr", stdScope);
\t\tFunctionType ptrFromType = new FunctionType(ptrType, List.of(Type.ANY));
\t\tMethodSymbol ptrFrom = new MethodSymbol("from", ptrFromType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList());
\t\tptrType.getMemberScope().define(ptrFrom);
\t\tstdScope.define(new TypeSymbol("Ptr", ptrType, null));

\t\t// std::ops namespace with Add, Sub, Mul, Neg traits
\t\tSymbol opsSym = stdScope.resolveLocal("ops");
\t\tSymbolTable opsScope;
\t\tif (opsSym instanceof NamespaceSymbol opsNs)
\t\t{
\t\t\topsScope = opsNs.getMemberTable();
\t\t}
\t\telse
\t\t{
\t\t\tNamespaceType opsType = new NamespaceType("ops", stdScope);
\t\t\tNamespaceSymbol opsNs = new NamespaceSymbol("ops", opsType, null);
\t\t\tstdScope.define(opsNs);
\t\t\topsScope = opsNs.getMemberTable();
\t\t\topsScope.setOwner(opsNs);
\t\t}
\t\tfor (String opName : new String[]{"Add", "Sub", "Mul", "Neg"})
\t\t{
\t\t\tTraitType opTrait = new TraitType(opName, opsScope);
\t\t\topsScope.define(new TypeSymbol(opName, opTrait, null));
\t\t}

\t\t// Box<T> — generic struct stub
\t\tStructType boxType = new StructType("Box", globalScope);
\t\tTypeParameterType boxT = new TypeParameterType("T", null);
\t\tboxType.getMemberScope().define(new TypeSymbol("T", boxT, null));
\t\tFunctionType boxNewType = new FunctionType(boxType, List.of(boxType, boxT));
\t\tboxType.getMemberScope().define(new MethodSymbol("new", boxNewType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType boxValueType = new FunctionType(boxT, List.of(boxType));
\t\tboxType.getMemberScope().define(new MethodSymbol("value", boxValueType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tglobalScope.define(new TypeSymbol("Box", boxType, null));

\t\t// Result<T,E> — generic union stub
\t\tUnionType resultType = new UnionType("Result", globalScope);
\t\tTypeParameterType resultT = new TypeParameterType("T", null);
\t\tTypeParameterType resultE = new TypeParameterType("E", null);
\t\tresultType.getMemberScope().define(new TypeSymbol("T", resultT, null));
\t\tresultType.getMemberScope().define(new TypeSymbol("E", resultE, null));
\t\t// Ok(T) and Err(E) variant constructors
\t\tStructType okVariant = new StructType("Ok", resultType.getMemberScope());
\t\tokVariant.getMemberScope().define(new VariableSymbol("value", resultT, false, null));
\t\tresultType.addVariant(okVariant);
\t\tresultType.getMemberScope().define(new TypeSymbol("Ok", okVariant, null));
\t\tStructType errVariant = new StructType("Err", resultType.getMemberScope());
\t\terrVariant.getMemberScope().define(new VariableSymbol("value", resultE, false, null));
\t\tresultType.addVariant(errVariant);
\t\tresultType.getMemberScope().define(new TypeSymbol("Err", errVariant, null));
\t\t// unwrap() method
\t\tFunctionType unwrapType = new FunctionType(resultT, List.of(resultType));
\t\tresultType.getMemberScope().define(new MethodSymbol("unwrap", unwrapType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType isOkType = new FunctionType(PrimitiveType.BOOL, List.of(resultType));
\t\tresultType.getMemberScope().define(new MethodSymbol("isOk", isOkType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tresultType.getMemberScope().define(new MethodSymbol("isErr", isOkType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tglobalScope.define(new TypeSymbol("Result", resultType, null));

\t\t// List<T> — alias for ArrayList (generic struct stub)
\t\tStructType listType = new StructType("List", globalScope);
\t\tTypeParameterType listT = new TypeParameterType("T", null);
\t\tlistType.getMemberScope().define(new TypeSymbol("T", listT, null));
\t\tFunctionType listNewType = new FunctionType(listType, List.of(listType));
\t\tlistType.getMemberScope().define(new MethodSymbol("new", listNewType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listAddType = new FunctionType(PrimitiveType.VOID, List.of(listType, listT));
\t\tlistType.getMemberScope().define(new MethodSymbol("add", listAddType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tlistType.getMemberScope().define(new MethodSymbol("push", listAddType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listGetType = new FunctionType(listT, List.of(listType, PrimitiveType.I64));
\t\tlistType.getMemberScope().define(new MethodSymbol("get", listGetType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listSizeType = new FunctionType(PrimitiveType.I64, List.of(listType));
\t\tlistType.getMemberScope().define(new MethodSymbol("size", listSizeType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tlistType.getMemberScope().define(new MethodSymbol("length", listSizeType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listIsEmptyType = new FunctionType(PrimitiveType.BOOL, List.of(listType));
\t\tlistType.getMemberScope().define(new MethodSymbol("isEmpty", listIsEmptyType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listRemoveType = new FunctionType(PrimitiveType.VOID, List.of(listType, listT));
\t\tlistType.getMemberScope().define(new MethodSymbol("remove", listRemoveType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listRemoveAtType = new FunctionType(listT, List.of(listType, PrimitiveType.I64));
\t\tlistType.getMemberScope().define(new MethodSymbol("removeAt", listRemoveAtType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listContainsType = new FunctionType(PrimitiveType.BOOL, List.of(listType, listT));
\t\tlistType.getMemberScope().define(new MethodSymbol("contains", listContainsType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listInsertAtType = new FunctionType(PrimitiveType.VOID, List.of(listType, PrimitiveType.I64, listT));
\t\tlistType.getMemberScope().define(new MethodSymbol("insertAt", listInsertAtType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listPopType = new FunctionType(new OptionalType(listT), List.of(listType));
\t\tlistType.getMemberScope().define(new MethodSymbol("pop", listPopType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType listClearType = new FunctionType(PrimitiveType.VOID, List.of(listType));
\t\tlistType.getMemberScope().define(new MethodSymbol("clear", listClearType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tglobalScope.define(new TypeSymbol("List", listType, null));

\t\t// Also register in std::collections namespace
\t\tSymbol collSym = stdScope.resolveLocal("collections");
\t\tSymbolTable collScope = null;
\t\tif (collSym instanceof NamespaceSymbol collNs)
\t\t{
\t\t\tcollScope = collNs.getMemberTable();
\t\t}
\t\telse
\t\t{
\t\t\tNamespaceType collType = new NamespaceType("collections", stdScope);
\t\t\tNamespaceSymbol collNs = new NamespaceSymbol("collections", collType, null);
\t\t\tstdScope.define(collNs);
\t\t\tcollScope = collNs.getMemberTable();
\t\t\tcollScope.setOwner(collNs);
\t\t}
\t\tcollScope.alias("List", globalScope.resolveLocal("List"));

\t\t// Map<K,V> — generic struct stub
\t\tStructType mapType = new StructType("Map", globalScope);
\t\tTypeParameterType mapK = new TypeParameterType("K", null);
\t\tTypeParameterType mapV = new TypeParameterType("V", null);
\t\tmapType.getMemberScope().define(new TypeSymbol("K", mapK, null));
\t\tmapType.getMemberScope().define(new TypeSymbol("V", mapV, null));
\t\tFunctionType mapNewType = new FunctionType(mapType, List.of(mapType));
\t\tmapType.getMemberScope().define(new MethodSymbol("new", mapNewType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType mapPutType = new FunctionType(PrimitiveType.VOID, List.of(mapType, mapK, mapV));
\t\tmapType.getMemberScope().define(new MethodSymbol("put", mapPutType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType mapGetType = new FunctionType(new OptionalType(mapV), List.of(mapType, mapK));
\t\tmapType.getMemberScope().define(new MethodSymbol("get", mapGetType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType mapContainsKeyType = new FunctionType(PrimitiveType.BOOL, List.of(mapType, mapK));
\t\tmapType.getMemberScope().define(new MethodSymbol("containsKey", mapContainsKeyType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType mapRemoveType = new FunctionType(PrimitiveType.VOID, List.of(mapType, mapK));
\t\tmapType.getMemberScope().define(new MethodSymbol("remove", mapRemoveType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType mapSizeType = new FunctionType(PrimitiveType.I64, List.of(mapType));
\t\tmapType.getMemberScope().define(new MethodSymbol("size", mapSizeType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tmapType.getMemberScope().define(new MethodSymbol("length", mapSizeType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType mapIsEmptyType = new FunctionType(PrimitiveType.BOOL, List.of(mapType));
\t\tmapType.getMemberScope().define(new MethodSymbol("isEmpty", mapIsEmptyType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tglobalScope.define(new TypeSymbol("Map", mapType, null));
\t\tcollScope.alias("Map", globalScope.resolveLocal("Map"));

\t\t// Set<T> — generic struct stub
\t\tStructType setType = new StructType("Set", globalScope);
\t\tTypeParameterType setT = new TypeParameterType("T", null);
\t\tsetType.getMemberScope().define(new TypeSymbol("T", setT, null));
\t\tFunctionType setNewType = new FunctionType(setType, List.of(setType));
\t\tsetType.getMemberScope().define(new MethodSymbol("new", setNewType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType setAddType = new FunctionType(PrimitiveType.VOID, List.of(setType, setT));
\t\tsetType.getMemberScope().define(new MethodSymbol("add", setAddType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType setContainsType = new FunctionType(PrimitiveType.BOOL, List.of(setType, setT));
\t\tsetType.getMemberScope().define(new MethodSymbol("contains", setContainsType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType setRemoveType = new FunctionType(PrimitiveType.VOID, List.of(setType, setT));
\t\tsetType.getMemberScope().define(new MethodSymbol("remove", setRemoveType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType setSizeType = new FunctionType(PrimitiveType.I64, List.of(setType));
\t\tsetType.getMemberScope().define(new MethodSymbol("size", setSizeType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tsetType.getMemberScope().define(new MethodSymbol("length", setSizeType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType setIsEmptyType = new FunctionType(PrimitiveType.BOOL, List.of(setType));
\t\tsetType.getMemberScope().define(new MethodSymbol("isEmpty", setIsEmptyType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tFunctionType setUnionType = new FunctionType(setType, List.of(setType, setType));
\t\tsetType.getMemberScope().define(new MethodSymbol("union", setUnionType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tsetType.getMemberScope().define(new MethodSymbol("intersect", setUnionType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tsetType.getMemberScope().define(new MethodSymbol("difference", setUnionType, java.util.Collections.emptyList(), false, null, java.util.Collections.emptyList()));
\t\tglobalScope.define(new TypeSymbol("Set", setType, null));
\t\tcollScope.alias("Set", globalScope.resolveLocal("Set"));
\t}

'''

new_recursive = helper_methods + '''\tprivate void declareTypesRecursive(List<ASTNode> declarations)
\t{
\t\tif (declarations == null)
\t\t\treturn;'''

content = content.replace(old_recursive, new_recursive)

# ============================================================================
# 3. Add isStructMember helper (needed for 'self' references like 'this.X')
# ============================================================================

# Find the resetCvtState method and add isStructMember before it
old_resetCvt = '''\tprivate void resetCvtState()
\t{
\t\tsymbolRegion = new IdentityHashMap<>();'''

new_resetCvt = '''\t/** Returns true only if the named symbol is actually a member field of the current type. */
\tprivate boolean isStructMember(String name)
\t{
\t\tif (currentTypeDefinition instanceof CompositeType ct)
\t\t{
\t\t\tSymbol memberSym = ct.getMemberScope().resolveLocal(name);
\t\t\treturn memberSym instanceof VariableSymbol;
\t\t}
\t\treturn false;
\t}

\tprivate void resetCvtState()
\t{
\t\tsymbolRegion = new IdentityHashMap<>();'''

content = content.replace(old_resetCvt, new_resetCvt)

# ============================================================================
# 4. Write back
# ============================================================================

with open(SA_PATH, 'w') as f:
    f.write(content)

print("Done! Applied all built-in registrations.")
