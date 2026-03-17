package org.nebula.nebc.ast.declarations;

import org.nebula.nebc.ast.ASTNode;
import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.Parameter;
import org.nebula.nebc.ast.types.TypeNode;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.Collections;
import java.util.List;

public class OperatorDeclaration extends Declaration
{
	/** Declared return type, or {@code null} when the caller omits it (legacy/void). */
	public final TypeNode returnType;
	public final String operatorToken;
	public final List<Parameter> parameters;
	public final ASTNode body; // Block or FAT_ARROW expression
	public final List<AttributeNode> attributes;

	public OperatorDeclaration(SourceSpan span, TypeNode returnType, String operatorToken, List<Parameter> parameters, ASTNode body, List<AttributeNode> attributes)
	{
		super(span);
		this.returnType = returnType;
		this.operatorToken = operatorToken;
		this.parameters = parameters;
		this.body = body;
		this.attributes = Collections.unmodifiableList(attributes);
	}

	/** Backwards-compatible overload — no return type, no attributes. */
	public OperatorDeclaration(SourceSpan span, String operatorToken, List<Parameter> parameters, ASTNode body)
	{
		this(span, null, operatorToken, parameters, body, Collections.emptyList());
	}

	/** Backwards-compatible overload — no return type. */
	public OperatorDeclaration(SourceSpan span, String operatorToken, List<Parameter> parameters, ASTNode body, List<AttributeNode> attributes)
	{
		this(span, null, operatorToken, parameters, body, attributes);
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitOperatorDeclaration(this);
	}
}