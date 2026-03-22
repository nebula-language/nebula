package org.nebula.nebc.ast.expressions;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

/**
 * Represents a named call argument at the AST level (e.g. {@code age: 30}).
 *
 * <p>The semantic phase rewrites these into positional argument order based on
 * the callee signature and default parameters.</p>
 */
public final class NamedArgumentExpression extends Expression
{
	public final String name;
	public final Expression value;

	public NamedArgumentExpression(SourceSpan span, String name, Expression value)
	{
		super(span);
		this.name = name;
		this.value = value;
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitNamedArgumentExpression(this);
	}
}