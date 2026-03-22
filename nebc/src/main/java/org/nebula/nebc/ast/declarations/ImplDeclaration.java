package org.nebula.nebc.ast.declarations;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.ast.types.TypeNode;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.Collections;
import java.util.List;

/**
 * Represents {@code impl TraitName for Type1, Type2 { ... }}.
 */
public class ImplDeclaration extends Declaration
{
    /** The trait being implemented. */
    public final TypeNode traitType;

    /** The type implementing the trait. */
    public final TypeNode targetType;

    /** The method implementations in this block. */
    public final List<MethodDeclaration> members;

    /** Operator overloads declared in this impl block. */
    public final List<OperatorDeclaration> operators;

    /** Compile-time attributes on this impl block. */
    public final List<AttributeNode> attributes;

    public ImplDeclaration(SourceSpan span, TypeNode traitType, TypeNode targetType,
                           List<MethodDeclaration> members, List<OperatorDeclaration> operators,
                           List<AttributeNode> attributes)
    {
        super(span);
        this.traitType = traitType;
        this.targetType = targetType;
        this.members = members;
        this.operators = operators != null ? Collections.unmodifiableList(operators) : Collections.emptyList();
        this.attributes = Collections.unmodifiableList(attributes);
    }

    /** Backwards-compatible overload — no operators. */
    public ImplDeclaration(SourceSpan span, TypeNode traitType, TypeNode targetType, List<MethodDeclaration> members, List<AttributeNode> attributes)
    {
        this(span, traitType, targetType, members, Collections.emptyList(), attributes);
    }

    /** Backwards-compatible overload — no attributes. */
    public ImplDeclaration(SourceSpan span, TypeNode traitType, TypeNode targetType, List<MethodDeclaration> members)
    {
        this(span, traitType, targetType, members, Collections.emptyList(), Collections.emptyList());
    }

    @Override
    public <R> R accept(ASTVisitor<R> visitor)
    {
        return visitor.visitImplDeclaration(this);
    }
}
