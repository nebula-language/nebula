package org.nebula.nebc.ast.declarations;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.Collections;
import java.util.List;

public class ConstDeclaration extends Declaration
{
	public final VariableDeclaration declaration;
	public final List<AttributeNode> attributes;

	public ConstDeclaration(SourceSpan span, VariableDeclaration declaration, List<AttributeNode> attributes)
	{
		super(span);
		this.declaration = declaration;
		this.attributes = Collections.unmodifiableList(attributes);
	}

	/** Backwards-compatible overload — no attributes. */
	public ConstDeclaration(SourceSpan span, VariableDeclaration declaration)
	{
		this(span, declaration, Collections.emptyList());
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitConstDeclaration(this);
	}
}
