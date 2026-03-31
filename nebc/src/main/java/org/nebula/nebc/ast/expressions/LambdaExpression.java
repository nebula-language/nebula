package org.nebula.nebc.ast.expressions;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.ASTNode;
import org.nebula.nebc.ast.types.TypeNode;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;
import java.util.List;

/**
 * Represents a lambda (anonymous function) expression.
 * @grammar |Type param, Type param| => expr  or  |Type param| { body }
 */
public class LambdaExpression extends Expression
{
    public record LambdaParam(TypeNode type, String name) {}

    public final List<LambdaParam> params;
    public final ASTNode body;

    public LambdaExpression(SourceSpan span, List<LambdaParam> params, ASTNode body)
    {
        super(span);
        this.params = params;
        this.body = body;
    }

    @Override
    public <R> R accept(ASTVisitor<R> visitor)
    {
        return visitor.visitLambdaExpression(this);
    }
}
