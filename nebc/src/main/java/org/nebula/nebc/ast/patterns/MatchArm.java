package org.nebula.nebc.ast.patterns;

import org.nebula.nebc.ast.ASTNode;
import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.expressions.Expression;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

public class MatchArm extends ASTNode
{
	public final Pattern pattern;
	public final Expression guard; // nullable — the IF guard expression
	public final Expression result;

	public MatchArm(SourceSpan span, Pattern pattern, Expression guard, Expression result)
	{
		super(span);
		this.pattern = pattern;
		this.guard = guard;
		this.result = result;
	}

	/** Backwards-compatible constructor with no guard. */
	public MatchArm(SourceSpan span, Pattern pattern, Expression result)
	{
		this(span, pattern, null, result);
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitMatchArm(this);
	}
}