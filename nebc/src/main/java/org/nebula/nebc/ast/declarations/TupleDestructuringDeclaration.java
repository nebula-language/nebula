package org.nebula.nebc.ast.declarations;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.expressions.Expression;
import org.nebula.nebc.ast.types.TypeNode;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.List;

/**
 * Represents a tuple-destructuring variable declaration.
 * Grammar: {@code var (x, y) = expr;} or {@code var (i32 count, str label) = expr;}
 */
public class TupleDestructuringDeclaration extends Declaration
{
    /** One binding element: an optional explicit type and a variable name. */
    public record Binding(TypeNode type, String name) {}

    public final List<Binding> bindings;
    public final Expression initializer;
    public final boolean isVar;

    public TupleDestructuringDeclaration(SourceSpan span, List<Binding> bindings, Expression initializer, boolean isVar)
    {
        super(span);
        this.bindings = List.copyOf(bindings);
        this.initializer = initializer;
        this.isVar = isVar;
    }

    @Override
    public <R> R accept(ASTVisitor<R> visitor)
    {
        return visitor.visitTupleDestructuringDeclaration(this);
    }
}
