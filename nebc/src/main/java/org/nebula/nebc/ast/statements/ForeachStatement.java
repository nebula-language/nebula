package org.nebula.nebc.ast.statements;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.types.TypeNode;
import org.nebula.nebc.ast.expressions.Expression;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;
import java.util.List;

public class ForeachStatement extends Statement
{
	public final TypeNode variableType; // null if 'var'
	public final String variableName;
	public final Expression iterable;
	public final Statement body;

	/** Non-null when using tuple destructuring: each element is (type, name). */
	public final List<TupleBinding> tupleBindings;

	public record TupleBinding(TypeNode type, String name) {}

	public ForeachStatement(SourceSpan span, TypeNode variableType, String variableName, Expression iterable, Statement body)
	{
		super(span);
		this.variableType = variableType;
		this.variableName = variableName;
		this.iterable = iterable;
		this.body = body;
		this.tupleBindings = null;
	}

	public ForeachStatement(SourceSpan span, List<TupleBinding> tupleBindings, Expression iterable, Statement body)
	{
		super(span);
		this.variableType = null;
		this.variableName = "_tuple_";
		this.iterable = iterable;
		this.body = body;
		this.tupleBindings = tupleBindings;
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitForeachStatement(this);
	}
}