package org.nebula.nebc.semantic.types;

// A simple hierarchy to represent resolved types
public abstract class Type
{
	// Singleton types for basic primitives
	public static final Type ERROR = new PrimitiveType("<error>"); // The "Recovery" type
	public static final Type ANY = new PrimitiveType("<any>"); // For wildcards

	public abstract String name();

	public boolean isAssignableTo(Type destination)
	{
		if (this == ERROR || destination == ERROR)
			return true; // Prevent cascading errors
		if (this == ANY || destination == ANY)
			return true;
		// Any concrete type is assignable to a type parameter (resolved at monomorphization)
		if (destination instanceof TypeParameterType)
			return true;
		// REF is the generic 'this' pointer — any composite type is assignable to it
		if (destination == PrimitiveType.REF && this instanceof CompositeType)
			return true;
		// T is implicitly liftable to T? (optional promotion)
		if (destination instanceof OptionalType opt && this.isAssignableTo(opt.innerType))
			return true;
		if (this.name().equals(destination.name()))
			return true;
		// For generic CompositeTypes, compare base names (e.g. Stack<> ≈ Stack<i32> ≈ Stack)
		if (this instanceof CompositeType && destination instanceof CompositeType)
		{
			String thisBase = stripGenericArgs(this.name());
			String destBase = stripGenericArgs(destination.name());
			if (thisBase.equals(destBase))
				return true;
		}
		return false;
	}

	/** Extracts the base name before '&lt;', or returns the full name if no generic args. */
	private static String stripGenericArgs(String name)
	{
		int lt = name.indexOf('<');
		return lt >= 0 ? name.substring(0, lt) : name;
	}
}

// You will eventually need ClassType, FunctionType, etc.