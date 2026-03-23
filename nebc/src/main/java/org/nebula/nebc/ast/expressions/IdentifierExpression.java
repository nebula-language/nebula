package org.nebula.nebc.ast.expressions;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

public class IdentifierExpression extends Expression
{
	public final String name;
    /**
     * Explicit generic type arguments written at the call site, e.g. the "T,bool" in
     * {@code HashMap<T, bool>.new()}.  Empty string when no type args were written.
     * Used by the semantic analyser to record the intended specialisation.
     */
    public final String explicitTypeArgs;

    public IdentifierExpression(SourceSpan span, String name)
    {
        this(span, name, "");
    }

    public IdentifierExpression(SourceSpan span, String name, String explicitTypeArgs)
    {
        super(span);
        this.name = name;
        this.explicitTypeArgs = explicitTypeArgs;
    }

	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitIdentifierExpression(this);
	}
}