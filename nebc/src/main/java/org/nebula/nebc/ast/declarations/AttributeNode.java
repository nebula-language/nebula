package org.nebula.nebc.ast.declarations;

import org.nebula.nebc.ast.ASTNode;
import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.Collections;
import java.util.List;

/**
 * Represents a compile-time attribute annotation attached to a declaration.
 *
 * <p>Syntax: {@code #[path]} or {@code #[path(args)]}</p>
 *
 * <p>Examples:</p>
 * <pre>
 *   #[test]
 *   #[doc("My description")]
 *   #[std::derive(Eq, Hash)]
 * </pre>
 *
 * <p>The compiler does not interpret attributes itself; it merely parses them
 * and attaches them to their respective symbols.  The {@code std::attributes}
 * reflection API exposes these annotations to Nebula code, enabling any
 * user-land framework (test runners, doc generators, etc.) to inspect and act
 * on them without requiring macro support.</p>
 */
public final class AttributeNode extends ASTNode
{
	/**
	 * The qualified path of the attribute, e.g. {@code "test"} or
	 * {@code "std::derive"}.
	 */
	public final String path;

	/**
	 * The argument expressions passed to the attribute.  May be empty when no
	 * parentheses are present (e.g. {@code #[test]}).
	 */
	public final List<ASTNode> args;

	public AttributeNode(SourceSpan span, String path, List<ASTNode> args)
	{
		super(span);
		this.path = path;
		this.args = Collections.unmodifiableList(args);
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitAttributeNode(this);
	}
}
