package org.nebula.nebc.ast.types;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.expressions.Expression;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

public class ArrayType extends TypeNode
{
	public final TypeNode baseType; // e.g., 'int' in 'int[]'
	public final int dimensions;        // 1 for [], 2 for [][], etc.
	public final Expression sizeExpression; // non-null for fixed-size arrays like int[512]

	public ArrayType(SourceSpan span, TypeNode baseType, int dimensions, Expression sizeExpression)
	{
		super(span);
		this.baseType = baseType;
		this.dimensions = dimensions;
		this.sizeExpression = sizeExpression;
	}

	public ArrayType(SourceSpan span, TypeNode baseType, int dimensions)
	{
		this(span, baseType, dimensions, null);
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		// You can add visitArrayType to ASTVisitor or handle it in visitTypeReference
		return visitor.visitTypeReference(this);
	}
}