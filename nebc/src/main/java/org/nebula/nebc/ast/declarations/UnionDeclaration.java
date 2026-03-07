package org.nebula.nebc.ast.declarations;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.Collections;
import java.util.List;

public class UnionDeclaration extends Declaration
{
	public final String name;
	public final List<UnionVariant> variants;
	public final List<AttributeNode> attributes;

	public UnionDeclaration(SourceSpan span, String name, List<UnionVariant> variants, List<AttributeNode> attributes)
	{
		super(span);
		this.name = name;
		this.variants = variants;
		this.attributes = Collections.unmodifiableList(attributes);
	}

	/** Backwards-compatible overload — no attributes. */
	public UnionDeclaration(SourceSpan span, String name, List<UnionVariant> variants)
	{
		this(span, name, variants, Collections.emptyList());
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitUnionDeclaration(this);
	}
}