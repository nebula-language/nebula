package org.nebula.nebc.ast.declarations;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.Modifier;
import org.nebula.nebc.ast.types.TypeNode;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.Collections;
import java.util.List;

public class VariableDeclaration extends Declaration
{
	public final TypeNode type; // null if using 'var'
	public final List<Modifier> modifiers;
	public final List<VariableDeclarator> declarators;
	public final boolean isVar;      // true if 'var' was used
	public final boolean isConst;    // true if 'const' was used
	public final boolean isBacklink; // true if 'backlink' modifier is present
	public final List<AttributeNode> attributes;

	public VariableDeclaration(SourceSpan span, TypeNode type, List<Modifier> modifiers, List<VariableDeclarator> declarators, boolean isVar, boolean isBacklink, List<AttributeNode> attributes, boolean isConst)
	{
		super(span);
		this.type = type;
		this.modifiers = Collections.unmodifiableList(modifiers);
		this.declarators = declarators;
		this.isVar = isVar;
		this.isConst = isConst;
		this.isBacklink = isBacklink;
		this.attributes = Collections.unmodifiableList(attributes);
	}

	public VariableDeclaration(SourceSpan span, TypeNode type, List<VariableDeclarator> declarators, boolean isVar, boolean isBacklink, List<AttributeNode> attributes)
	{
		this(span, type, Collections.emptyList(), declarators, isVar, isBacklink, attributes, false);
	}

	public VariableDeclaration(SourceSpan span, TypeNode type, List<Modifier> modifiers, List<VariableDeclarator> declarators, boolean isVar, boolean isBacklink, List<AttributeNode> attributes)
	{
		this(span, type, modifiers, declarators, isVar, isBacklink, attributes, false);
	}

	/** Backwards-compatible overload — no attributes, no backlink. */
	public VariableDeclaration(SourceSpan span, TypeNode type, List<VariableDeclarator> declarators, boolean isVar)
	{
		this(span, type, Collections.emptyList(), declarators, isVar, false, Collections.emptyList(), false);
	}

	/** Backwards-compatible overload — no attributes. */
	public VariableDeclaration(SourceSpan span, TypeNode type, List<VariableDeclarator> declarators, boolean isVar, boolean isBacklink)
	{
		this(span, type, Collections.emptyList(), declarators, isVar, isBacklink, Collections.emptyList(), false);
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

	public boolean isConst()
	{
		return isConst;
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitVariableDeclaration(this);
	}
}