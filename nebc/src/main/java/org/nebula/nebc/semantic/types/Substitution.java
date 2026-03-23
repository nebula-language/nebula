package org.nebula.nebc.semantic.types;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Helper to substitute {@link TypeParameterType}s with concrete {@link Type}s.
 * Used during monomorphization and generic method calls.
 */
public class Substitution
{
    private final Map<TypeParameterType, Type> mapping = new HashMap<>();

    /**
     * Maps a generic composite's original name to its partially-built monomorphized
     * counterpart.  Populated before we recurse into a composite's members so that
     * any self-referential types (e.g. the implicit {@code this} param in methods)
     * resolve to the new concrete type instead of triggering infinite recursion.
     */
    private final Map<String, CompositeType> monoCache = new HashMap<>();

    public void bind(TypeParameterType param, Type concrete)
    {
        mapping.put(param, concrete);
    }

    /**
     * Recursively replaces all type parameters in the given type with their
     * bound concrete types.
     */
    public Type substitute(Type type)
    {
        if (type instanceof TypeParameterType tpt)
        {
            // Fast path: exact identity match.
            Type direct = mapping.get(tpt);
            if (direct != null)
                return direct;
            // Fallback: match by parameter name so that TypeParameterType instances
            // created in different scopes (e.g. struct member scope vs constructor
            // FunctionType) still resolve correctly.
            for (Map.Entry<TypeParameterType, Type> entry : mapping.entrySet())
            {
                if (entry.getKey().name().equals(tpt.name()))
                    return entry.getValue();
            }
            return tpt;
        }
        if (type instanceof ArrayType at)
        {
            Type substitutedBase = substitute(at.baseType);
            if (substitutedBase == at.baseType)
                return at;
            return new ArrayType(substitutedBase, at.elementCount);
        }
        if (type instanceof TupleType tt)
        {
            List<Type> substitutedElements = tt.elementTypes.stream()
                .map(this::substitute)
                .collect(Collectors.toList());
            boolean changed = false;
            for (int i = 0; i < tt.elementTypes.size(); i++)
            {
                if (substitutedElements.get(i) != tt.elementTypes.get(i))
                {
                    changed = true;
                    break;
                }
            }
            return changed ? new TupleType(substitutedElements) : tt;
        }
        if (type instanceof OptionalType ot)
        {
            Type substitutedInner = substitute(ot.innerType);
            if (substitutedInner == ot.innerType)
                return ot;
            return new OptionalType(substitutedInner);
        }
        if (type instanceof FunctionType ft)
        {
            Type substitutedReturn = substitute(ft.returnType);
            List<Type> substitutedParams = ft.parameterTypes.stream()
                .map(this::substitute)
                .collect(Collectors.toList());

            boolean changed = substitutedReturn != ft.returnType;
            if (!changed)
            {
                for (int i = 0; i < ft.parameterTypes.size(); i++)
                {
                    if (substitutedParams.get(i) != ft.parameterTypes.get(i))
                    {
                        changed = true;
                        break;
                    }
                }
            }

            if (!changed)
                return ft;
            return new FunctionType(substitutedReturn, substitutedParams, ft.parameterInfo);
        }
        if (type instanceof CompositeType ct)
        {
            // If we are already building a monomorphized version of this composite,
            // return the partially-built instance to break the recursion cycle.
            CompositeType cached = monoCache.get(ct.name());
            if (cached != null)
                return cached;

            // Only monomorphize if the composite actually references type parameters
            // (in fields and/or method signatures) and we have a non-empty substitution mapping.
            boolean hasTypeParams = ct.getMemberScope().getSymbols().values().stream()
                .anyMatch(s -> (s instanceof org.nebula.nebc.semantic.symbol.VariableSymbol vs
                        && referencesTypeParam(vs.getType()))
                    || (s instanceof org.nebula.nebc.semantic.symbol.MethodSymbol ms
                        && (referencesTypeParam(ms.getType().returnType)
                            || ms.getType().parameterTypes.stream().anyMatch(this::referencesTypeParam))));
            if (hasTypeParams && !mapping.isEmpty())
                return monomorphizeComposite(ct);

            return ct;
        }
        return type;
    }

    /**
     * Monomorphizes a {@link CompositeType} by substituting type parameters in
     * its field variables and methods, producing a new concrete composite type.
     */
    private CompositeType monomorphizeComposite(CompositeType ct)
    {
        // Build the monomorphized name: e.g. "Pair<i32, str>", "Map<str,i32>"
        // IMPORTANT: iterate type parameters in their DECLARATION ORDER (from the
        // LinkedHashMap member scope), not HashMap.entrySet() order (which is random).
        StringBuilder sb = new StringBuilder(extractBaseName(ct.name()));
        sb.append("<");
        boolean first = true;
        for (org.nebula.nebc.semantic.symbol.Symbol sym : ct.getMemberScope().getSymbols().values())
        {
            if (sym instanceof org.nebula.nebc.semantic.symbol.TypeSymbol tts
                    && tts.getType() instanceof TypeParameterType tpt)
            {
                // Look up the concrete type for this parameter in declaration order.
                Type concrete = mapping.get(tpt);
                if (concrete == null)
                {
                    // Fallback: name-based match for TypeParameterType instances
                    // created in different scopes.
                    for (Map.Entry<TypeParameterType, Type> entry : mapping.entrySet())
                    {
                        if (entry.getKey().name().equals(tpt.name()))
                        {
                            concrete = entry.getValue();
                            break;
                        }
                    }
                }
                if (concrete != null)
                {
                    if (!first) sb.append(",");
                    first = false;
                    sb.append(concrete.name());
                }
            }
        }
        sb.append(">");
        String monoName = sb.toString();

        // Pre-create the result type and register it in the cache BEFORE iterating
        // over members so that self-referential types (e.g. "this" param in methods)
        // resolve to this new instance rather than triggering infinite recursion.
        // Preserve the original kind: UnionType stays UnionType so the codegen
        // can still map it to the correct tagged-union LLVM struct.
        String baseName = extractBaseName(ct.name());
        CompositeType monoType;
        if (ct instanceof UnionType)
            monoType = new UnionType(monoName, null);
        else
            monoType = new StructType(monoName, null);
        monoCache.put(ct.name(), monoType);

        // Set the scope owner to a synthetic TypeSymbol using the generic's BASE name
        // so that MethodSymbol.getMangledName() produces the same prefix as the
        // original generic type (e.g. "Pair__bigger" instead of just "bigger").
        org.nebula.nebc.semantic.symbol.TypeSymbol ownerSym =
            new org.nebula.nebc.semantic.symbol.TypeSymbol(baseName, monoType, null);
        monoType.getMemberScope().setOwner(ownerSym);

        // Copy and substitute all symbols into the new member scope
        for (org.nebula.nebc.semantic.symbol.Symbol sym : ct.getMemberScope().getSymbols().values())
        {
            if (sym instanceof org.nebula.nebc.semantic.symbol.VariableSymbol vs
                && !vs.getName().equals("this"))
            {
                Type substitutedType = substitute(vs.getType());
                monoType.getMemberScope().define(
                    new org.nebula.nebc.semantic.symbol.VariableSymbol(
                        vs.getName(), substitutedType, vs.isMutable(), vs.getDeclarationNode()));
            }
            else if (sym instanceof org.nebula.nebc.semantic.symbol.MethodSymbol ms)
            {
                // Substitute the method's function type (return type and param types)
                FunctionType substitutedFnType = (FunctionType) substitute(ms.getType());
                org.nebula.nebc.semantic.symbol.MethodSymbol monoMethod =
                    new org.nebula.nebc.semantic.symbol.MethodSymbol(
                        ms.getName(), substitutedFnType,
                        ms.getModifiers(),
                        ms.isExtern(),
                        ms.getDeclarationNode(),
                        java.util.Collections.emptyList()); // type params resolved
                monoMethod.setTraitName(ms.getTraitName());
                monoMethod.setExplicitExternC(ms.isExplicitExternC());
                monoMethod.setSyntheticStructural(ms.isSyntheticStructural());
                monoMethod.setGenericBitcode(ms.getGenericBitcode());
                monoMethod.setOverriddenMangledName(ms.getOverriddenMangledName());
                monoType.getMemberScope().define(monoMethod);
            }
            // TypeSymbol entries (type params) are omitted — they are fully resolved now
        }

        // Add the monomorphized 'this' symbol so member-scope lookups work correctly.
        monoType.getMemberScope().define(
            new org.nebula.nebc.semantic.symbol.VariableSymbol("this", monoType, false, null));

        monoCache.remove(ct.name());
        return monoType;
    }

    private static String extractBaseName(String name)
    {
        int lt = name.indexOf('<');
        return lt >= 0 ? name.substring(0, lt) : name;
    }

    private boolean referencesTypeParam(Type type)
    {
        if (type == null)
            return false;
        if (type instanceof TypeParameterType)
            return true;
        if (type instanceof OptionalType ot)
            return referencesTypeParam(ot.innerType);
        if (type instanceof ArrayType at)
            return referencesTypeParam(at.baseType);
        if (type instanceof TupleType tt)
            return tt.elementTypes.stream().anyMatch(this::referencesTypeParam);
        if (type instanceof FunctionType ft)
        {
            if (referencesTypeParam(ft.returnType))
                return true;
            return ft.parameterTypes.stream().anyMatch(this::referencesTypeParam);
        }
        return false;
    }

    /** Returns {@code true} if there are no bindings in this substitution. */
    public boolean isEmpty()
    {
        return mapping.isEmpty();
    }

    /** Returns the underlying mapping. */
    public Map<TypeParameterType, Type> getMapping()
    {
        return mapping;
    }
}

