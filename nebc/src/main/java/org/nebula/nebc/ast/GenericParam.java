package org.nebula.nebc.ast;

import org.nebula.nebc.ast.types.TypeNode;

/**
 * Represents a single generic type parameter in a declaration.
 * <p>
 * Examples:
 * <ul>
 * <li>{@code <T>} → name = "T", bound = null</li>
 * <li>{@code <T: Stringable>} → name = "T", bound =
 * NamedType("Stringable")</li>
 * <li>{@code <T: Describable + Measurable>} → name = "T", bound =
 * NamedType("Describable"), additionalBounds = [NamedType("Measurable")]</li>
 * </ul>
 */
public record GenericParam(String name, TypeNode bound, java.util.List<TypeNode> additionalBounds)
{
	public GenericParam(String name, TypeNode bound)
	{
		this(name, bound, java.util.Collections.emptyList());
	}

	/**
	 * {@code true} when this parameter has a trait bound.
	 */
	public boolean hasBound()
	{
		return bound != null;
	}
}
