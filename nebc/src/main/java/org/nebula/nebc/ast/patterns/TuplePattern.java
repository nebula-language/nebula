package org.nebula.nebc.ast.patterns;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.List;

/**
 * A tuple pattern that structurally matches a tuple selector against a fixed sequence of
 * sub-patterns.
 *
 * <p>Syntax: {@code (pattern1, pattern2, ...)}
 *
 * <p>Example:
 * <pre>
 * match ((marioForm, item))
 * {
 *     (Normal, Mushroom) => Super,
 *     (Super,  Flower)   => Fire,
 *     _                  => this.marioForm,
 * }
 * </pre>
 *
 * <ul>
 *   <li>{@link #elements} — the ordered list of sub-patterns, one per tuple field.</li>
 * </ul>
 */
public class TuplePattern extends Pattern
{
	public final List<Pattern> elements;

	public TuplePattern(SourceSpan span, List<Pattern> elements)
	{
		super(span);
		this.elements = elements;
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitTuplePattern(this);
	}
}
