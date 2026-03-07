package org.nebula.nebc.ast.statements;

import org.nebula.nebc.ast.ASTVisitor;
import org.nebula.nebc.frontend.diagnostic.SourceSpan;

import java.util.List;

/**
 * Represents a {@code use} directive in any of its forms:
 * <ul>
 *   <li>{@code use foo;}                  — import namespace {@code foo}</li>
 *   <li>{@code use foo::bar;}             — import {@code bar} from {@code foo}</li>
 *   <li>{@code use foo::bar as baz;}      — import with alias</li>
 *   <li>{@code use foo::*;}               — glob import all from {@code foo}</li>
 *   <li>{@code use foo::{a, b as c};}     — multi-item import from {@code foo}</li>
 * </ul>
 */
public class UseStatement extends Statement
{
	/** The base path before any {@code ::} selector (e.g. {@code "std::io"} in {@code use std::io::*}). */
	public final String qualifiedName;

	/**
	 * Alias for a simple import ({@code use foo::bar as baz}).
	 * {@code null} when not aliased, when using a glob, or when using multi-item import.
	 */
	public final String alias;

	/** {@code true} when the use is a glob ({@code use foo::*}). */
	public final boolean isGlob;

	/**
	 * Non-null (possibly empty) when this is a multi-item import
	 * ({@code use foo::{a, b as c}}).
	 * Each entry holds the imported name and optional alias.
	 */
	public final List<UseItem> items;

	/** A single item inside a multi-import: {@code Name (as Alias)?}. */
	public record UseItem(String name, String alias, boolean isGlob) {}

	/** Simple namespace import or single-item import. */
	public UseStatement(SourceSpan span, String qualifiedName, String alias)
	{
		super(span);
		this.qualifiedName = qualifiedName;
		this.alias = alias;
		this.isGlob = false;
		this.items = null;
	}

	/** Glob or multi-item import constructor. */
	public UseStatement(SourceSpan span, String qualifiedName, boolean isGlob, List<UseItem> items)
	{
		super(span);
		this.qualifiedName = qualifiedName;
		this.alias = null;
		this.isGlob = isGlob;
		this.items = items;
	}

	@Override
	public <R> R accept(ASTVisitor<R> visitor)
	{
		return visitor.visitUseStatement(this);
	}
}
