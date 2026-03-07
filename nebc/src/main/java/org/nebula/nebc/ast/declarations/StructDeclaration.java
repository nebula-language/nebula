package org.nebula.nebc.ast.declarations;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.GenericParam;
import org.nebula.nebc.ast.types.TypeNode;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.Collections;
import java.util.List;

public class StructDeclaration extends Declaration
{
	public final String name;
	public final List<GenericParam> typeParams;
	public final List<TypeNode> inheritance;
	public final List<Declaration> members;
	public final List<AttributeNode> attributes;

	public StructDeclaration(SourceSpan span, String name, List<GenericParam> typeParams, List<TypeNode> inheritance, List<Declaration> members, List<AttributeNode> attributes)
	{
		super(span);
		this.name = name;
		this.typeParams = typeParams;
		this.inheritance = inheritance;
		this.members = members;
		this.attributes = Collections.unmodifiableList(attributes);
	}

	/** Backwards-compatible overload — no attributes. */
	public StructDeclaration(SourceSpan span, String name, List<GenericParam> typeParams, List<TypeNode> inheritance, List<Declaration> members)
	{
		this(span, name, typeParams, inheritance, members, Collections.emptyList());
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitStructDeclaration(this);
	}
}