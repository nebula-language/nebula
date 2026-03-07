package org.nebula.nebc.ast.declarations;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.types.TypeNode;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.Collections;
import java.util.List;

public class VariableDeclaration extends Declaration
{
	public final TypeNode type; // null if using 'var'
	public final List<VariableDeclarator> declarators;
	public final boolean isVar;      // true if 'var' was used
	public final boolean isBacklink; // true if 'backlink' modifier is present
	public final List<AttributeNode> attributes;

	public VariableDeclaration(SourceSpan span, TypeNode type, List<VariableDeclarator> declarators, boolean isVar, boolean isBacklink, List<AttributeNode> attributes)
	{
		super(span);
		this.type = type;
		this.declarators = declarators;
		this.isVar = isVar;
		this.isBacklink = isBacklink;
		this.attributes = Collections.unmodifiableList(attributes);
	}

	/** Backwards-compatible overload — no attributes, no backlink. */
	public VariableDeclaration(SourceSpan span, TypeNode type, List<VariableDeclarator> declarators, boolean isVar)
	{
		this(span, type, declarators, isVar, false, Collections.emptyList());
	}

	/** Backwards-compatible overload — no attributes. */
	public VariableDeclaration(SourceSpan span, TypeNode type, List<VariableDeclarator> declarators, boolean isVar, boolean isBacklink)
	{
		this(span, type, declarators, isVar, isBacklink, Collections.emptyList());
	}

	public TypeNode getType()
	{
		return type;
	}

	public List<VariableDeclarator> getDeclarators()
	{
		return declarators;
	}

	public boolean isVar()
	{
		return isVar;
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitVariableDeclaration(this);
	}
}