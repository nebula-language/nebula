// Generated from NebulaParser.g4 by ANTLR 4.13.1

    package org.nebula.nebc.frontend.parser.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NebulaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, SINGLE_LINE_DOC_COMMENT=2, EMPTY_DELIMITED_DOC_COMMENT=3, 
		DELIMITED_DOC_COMMENT=4, SINGLE_LINE_COMMENT=5, DELIMITED_COMMENT=6, WHITESPACES=7, 
		AS=8, ASYNC=9, AWAIT=10, BOOL=11, BREAK=12, CASE=13, CHAR=14, CLASS=15, 
		CONST=16, CONTINUE=17, DECIMAL=18, DEFAULT=19, DROPS=20, ELSE=21, ENUM=22, 
		EXTERN=23, FALSE=24, F32=25, F64=26, FOR=27, FOREACH=28, IF=29, IN=30, 
		INT8=31, INT16=32, INT32=33, INT64=34, INTERFACE=35, IMPORT=36, IS=37, 
		KEEPS=38, MUTATES=39, BACKLINK=40, NAMESPACE=41, NONE=42, NEW=43, MATCH=44, 
		OPERATOR=45, OVERRIDE=46, PRIVATE=47, PROTECTED=48, PUBLIC=49, RETURN=50, 
		STATIC=51, STRING=52, STRUCT=53, SWITCH=54, TAG=55, TAGGED=56, THIS=57, 
		TRAIT=58, TRUE=59, UINT8=60, UINT16=61, UINT32=62, UINT64=63, UNION=64, 
		USE=65, VAR=66, VOID=67, WHILE=68, IMPL=69, UNDERSCORE=70, IDENTIFIER=71, 
		LITERAL_ACCESS=72, INTEGER_LITERAL=73, HEX_INTEGER_LITERAL=74, BIN_INTEGER_LITERAL=75, 
		REAL_LITERAL=76, CHARACTER_LITERAL=77, REGULAR_STRING=78, VERBATIUM_STRING=79, 
		INTERPOLATED_REGULAR_STRING_START=80, INTERPOLATED_VERBATIUM_STRING_START=81, 
		OPEN_BRACE=82, CLOSE_BRACE=83, OPEN_BRACKET=84, CLOSE_BRACKET=85, OPEN_PARENS=86, 
		CLOSE_PARENS=87, DOT=88, COMMA=89, DOUBLE_COLON=90, COLON=91, SEMICOLON=92, 
		PLUS=93, MINUS=94, STAR=95, POW=96, DIV=97, PERCENT=98, AMP=99, PIPE=100, 
		CARET=101, BANG=102, TILDE=103, HASH=104, ASSIGNMENT=105, LT=106, GT=107, 
		INTERR=108, OP_COALESCING=109, OP_OPTIONAL_CHAIN=110, OP_INC=111, OP_DEC=112, 
		OP_AND=113, OP_OR=114, OP_EQ=115, OP_NE=116, OP_LE=117, OP_GE=118, OP_ADD_ASSIGNMENT=119, 
		OP_SUB_ASSIGNMENT=120, OP_MULT_ASSIGNMENT=121, OP_POW_ASSIGNMENT=122, 
		OP_DIV_ASSIGNMENT=123, OP_MOD_ASSIGNMENT=124, OP_AND_ASSIGNMENT=125, OP_OR_ASSIGNMENT=126, 
		OP_XOR_ASSIGNMENT=127, OP_LEFT_SHIFT_ASSIGNMENT=128, OP_RANGE=129, FAT_ARROW=130, 
		DOUBLE_CURLY_INSIDE=131, OPEN_BRACE_INSIDE=132, REGULAR_CHAR_INSIDE=133, 
		REGULAR_STRING_INSIDE=134, VERBATIUM_DOUBLE_QUOTE_INSIDE=135, VERBATIUM_INSIDE_STRING=136, 
		DOUBLE_QUOTE_INSIDE=137, CLOSE_BRACE_INSIDE=138, FORMAT_STRING=139, DOUBLE_CURLY_CLOSE_INSIDE=140;
	public static final int
		RULE_compilation_unit = 0, RULE_extern_declaration = 1, RULE_extern_member = 2, 
		RULE_use_statement = 3, RULE_use_tail = 4, RULE_use_selector = 5, RULE_use_selector_item = 6, 
		RULE_use_alias = 7, RULE_tag_statement = 8, RULE_tag_declaration = 9, 
		RULE_tag_enumeration = 10, RULE_tag_expression = 11, RULE_namespace_declaration = 12, 
		RULE_qualified_name = 13, RULE_enum_declaration = 14, RULE_enum_block = 15, 
		RULE_top_level_declaration = 16, RULE_statement = 17, RULE_break_statement = 18, 
		RULE_continue_statement = 19, RULE_expression_statement = 20, RULE_expression_block = 21, 
		RULE_statement_block = 22, RULE_block_statements = 23, RULE_block_tail = 24, 
		RULE_if_expression = 25, RULE_if_statement = 26, RULE_match_expression = 27, 
		RULE_for_statement = 28, RULE_traditional_for_control = 29, RULE_for_initializer = 30, 
		RULE_for_iterator = 31, RULE_while_statement = 32, RULE_foreach_statement = 33, 
		RULE_foreach_control = 34, RULE_return_statement = 35, RULE_match_body = 36, 
		RULE_match_arm = 37, RULE_pattern = 38, RULE_pattern_or = 39, RULE_pattern_atom = 40, 
		RULE_destructuring_pattern = 41, RULE_binding_list = 42, RULE_tuple_pattern = 43, 
		RULE_parenthesized_pattern = 44, RULE_attribute = 45, RULE_attribute_path = 46, 
		RULE_const_declaration = 47, RULE_variable_declaration = 48, RULE_visibility_modifier = 49, 
		RULE_cvt_modifier = 50, RULE_backlink_modifier = 51, RULE_modifiers = 52, 
		RULE_field_declaration = 53, RULE_variable_declarators = 54, RULE_variable_declarator = 55, 
		RULE_method_declaration = 56, RULE_constructor_declaration = 57, RULE_parameters = 58, 
		RULE_parameter_list = 59, RULE_parameter = 60, RULE_method_body = 61, 
		RULE_operator_declaration = 62, RULE_overloadable_operator = 63, RULE_class_declaration = 64, 
		RULE_class_body = 65, RULE_class_member = 66, RULE_struct_declaration = 67, 
		RULE_struct_body = 68, RULE_struct_member = 69, RULE_inheritance_clause = 70, 
		RULE_trait_declaration = 71, RULE_trait_body = 72, RULE_trait_block = 73, 
		RULE_trait_member = 74, RULE_union_declaration = 75, RULE_union_body = 76, 
		RULE_union_payload = 77, RULE_union_variant = 78, RULE_impl_declaration = 79, 
		RULE_impl_block = 80, RULE_impl_member = 81, RULE_return_type = 82, RULE_type = 83, 
		RULE_type_suffix = 84, RULE_base_type = 85, RULE_tuple_type = 86, RULE_tuple_type_element = 87, 
		RULE_class_type = 88, RULE_predefined_type = 89, RULE_numeric_type = 90, 
		RULE_integral_type = 91, RULE_floating_point_type = 92, RULE_rank_specifier = 93, 
		RULE_generic_parameter = 94, RULE_constraint = 95, RULE_type_parameters = 96, 
		RULE_type_argument_list = 97, RULE_nested_gt = 98, RULE_tuple_literal = 99, 
		RULE_parenthesized_expression = 100, RULE_nonAssignmentExpression = 101, 
		RULE_expression = 102, RULE_assignment_expression = 103, RULE_null_coalescing_expression = 104, 
		RULE_new_expression = 105, RULE_assignment_operator = 106, RULE_binary_or_expression = 107, 
		RULE_binary_and_expression = 108, RULE_inclusive_or_expression = 109, 
		RULE_exclusive_or_expression = 110, RULE_and_expression = 111, RULE_equality_expression = 112, 
		RULE_relational_expression = 113, RULE_shift_expression = 114, RULE_left_shift = 115, 
		RULE_right_shift = 116, RULE_additive_expression = 117, RULE_multiplicative_expression = 118, 
		RULE_exponentiation_expression = 119, RULE_unary_expression = 120, RULE_cast_expression = 121, 
		RULE_primary_expression = 122, RULE_primary_expression_start = 123, RULE_postfix_operator = 124, 
		RULE_array_literal = 125, RULE_expression_list = 126, RULE_arguments = 127, 
		RULE_argument_list = 128, RULE_namedArgument = 129, RULE_positionalArgument = 130, 
		RULE_argument = 131, RULE_literal = 132, RULE_string_literal = 133, RULE_interpolated_regular_string = 134, 
		RULE_interpolated_regular_string_part = 135, RULE_interpolated_string_expression = 136;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "extern_declaration", "extern_member", "use_statement", 
			"use_tail", "use_selector", "use_selector_item", "use_alias", "tag_statement", 
			"tag_declaration", "tag_enumeration", "tag_expression", "namespace_declaration", 
			"qualified_name", "enum_declaration", "enum_block", "top_level_declaration", 
			"statement", "break_statement", "continue_statement", "expression_statement", 
			"expression_block", "statement_block", "block_statements", "block_tail", 
			"if_expression", "if_statement", "match_expression", "for_statement", 
			"traditional_for_control", "for_initializer", "for_iterator", "while_statement", 
			"foreach_statement", "foreach_control", "return_statement", "match_body", 
			"match_arm", "pattern", "pattern_or", "pattern_atom", "destructuring_pattern", 
			"binding_list", "tuple_pattern", "parenthesized_pattern", "attribute", 
			"attribute_path", "const_declaration", "variable_declaration", "visibility_modifier", 
			"cvt_modifier", "backlink_modifier", "modifiers", "field_declaration", 
			"variable_declarators", "variable_declarator", "method_declaration", 
			"constructor_declaration", "parameters", "parameter_list", "parameter", 
			"method_body", "operator_declaration", "overloadable_operator", "class_declaration", 
			"class_body", "class_member", "struct_declaration", "struct_body", "struct_member", 
			"inheritance_clause", "trait_declaration", "trait_body", "trait_block", 
			"trait_member", "union_declaration", "union_body", "union_payload", "union_variant", 
			"impl_declaration", "impl_block", "impl_member", "return_type", "type", 
			"type_suffix", "base_type", "tuple_type", "tuple_type_element", "class_type", 
			"predefined_type", "numeric_type", "integral_type", "floating_point_type", 
			"rank_specifier", "generic_parameter", "constraint", "type_parameters", 
			"type_argument_list", "nested_gt", "tuple_literal", "parenthesized_expression", 
			"nonAssignmentExpression", "expression", "assignment_expression", "null_coalescing_expression", 
			"new_expression", "assignment_operator", "binary_or_expression", "binary_and_expression", 
			"inclusive_or_expression", "exclusive_or_expression", "and_expression", 
			"equality_expression", "relational_expression", "shift_expression", "left_shift", 
			"right_shift", "additive_expression", "multiplicative_expression", "exponentiation_expression", 
			"unary_expression", "cast_expression", "primary_expression", "primary_expression_start", 
			"postfix_operator", "array_literal", "expression_list", "arguments", 
			"argument_list", "namedArgument", "positionalArgument", "argument", "literal", 
			"string_literal", "interpolated_regular_string", "interpolated_regular_string_part", 
			"interpolated_string_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u00EF\\u00BB\\u00BF'", null, "'/***/'", null, null, null, null, 
			"'as'", "'async'", "'await'", "'bool'", "'break'", "'case'", "'char'", 
			"'class'", "'const'", "'continue'", "'decimal'", "'default'", "'drops'", 
			"'else'", "'enum'", "'extern'", "'false'", "'f32'", "'f64'", "'for'", 
			"'foreach'", "'if'", "'in'", "'i8'", "'i16'", "'i32'", "'i64'", "'interface'", 
			"'import'", "'is'", "'keeps'", "'mutates'", "'backlink'", "'namespace'", 
			"'none'", "'new'", "'match'", "'operator'", "'override'", "'private'", 
			"'protected'", "'public'", "'return'", "'static'", "'string'", "'struct'", 
			"'switch'", "'tag'", "'tagged'", "'this'", "'trait'", "'true'", "'u8'", 
			"'u16'", "'u32'", "'u64'", "'union'", "'use'", "'var'", "'void'", "'while'", 
			"'impl'", "'_'", null, null, null, null, null, null, null, null, null, 
			null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "'::'", 
			"':'", "';'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'&'", "'|'", 
			"'^'", "'!'", "'~'", "'#'", "'='", "'<'", "'>'", "'?'", "'??'", "'?.'", 
			"'++'", "'--'", "'&&'", "'||'", "'=='", "'!='", "'<='", "'>='", "'+='", 
			"'-='", "'*='", "'**='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", 
			"'..'", "'=>'", "'{{'", null, null, null, null, null, null, null, null, 
			"'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BYTE_ORDER_MARK", "SINGLE_LINE_DOC_COMMENT", "EMPTY_DELIMITED_DOC_COMMENT", 
			"DELIMITED_DOC_COMMENT", "SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", 
			"WHITESPACES", "AS", "ASYNC", "AWAIT", "BOOL", "BREAK", "CASE", "CHAR", 
			"CLASS", "CONST", "CONTINUE", "DECIMAL", "DEFAULT", "DROPS", "ELSE", 
			"ENUM", "EXTERN", "FALSE", "F32", "F64", "FOR", "FOREACH", "IF", "IN", 
			"INT8", "INT16", "INT32", "INT64", "INTERFACE", "IMPORT", "IS", "KEEPS", 
			"MUTATES", "BACKLINK", "NAMESPACE", "NONE", "NEW", "MATCH", "OPERATOR", 
			"OVERRIDE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "STATIC", "STRING", 
			"STRUCT", "SWITCH", "TAG", "TAGGED", "THIS", "TRAIT", "TRUE", "UINT8", 
			"UINT16", "UINT32", "UINT64", "UNION", "USE", "VAR", "VOID", "WHILE", 
			"IMPL", "UNDERSCORE", "IDENTIFIER", "LITERAL_ACCESS", "INTEGER_LITERAL", 
			"HEX_INTEGER_LITERAL", "BIN_INTEGER_LITERAL", "REAL_LITERAL", "CHARACTER_LITERAL", 
			"REGULAR_STRING", "VERBATIUM_STRING", "INTERPOLATED_REGULAR_STRING_START", 
			"INTERPOLATED_VERBATIUM_STRING_START", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_PARENS", "CLOSE_PARENS", "DOT", "COMMA", "DOUBLE_COLON", 
			"COLON", "SEMICOLON", "PLUS", "MINUS", "STAR", "POW", "DIV", "PERCENT", 
			"AMP", "PIPE", "CARET", "BANG", "TILDE", "HASH", "ASSIGNMENT", "LT", 
			"GT", "INTERR", "OP_COALESCING", "OP_OPTIONAL_CHAIN", "OP_INC", "OP_DEC", 
			"OP_AND", "OP_OR", "OP_EQ", "OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", 
			"OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", "OP_POW_ASSIGNMENT", "OP_DIV_ASSIGNMENT", 
			"OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", "OP_XOR_ASSIGNMENT", 
			"OP_LEFT_SHIFT_ASSIGNMENT", "OP_RANGE", "FAT_ARROW", "DOUBLE_CURLY_INSIDE", 
			"OPEN_BRACE_INSIDE", "REGULAR_CHAR_INSIDE", "REGULAR_STRING_INSIDE", 
			"VERBATIUM_DOUBLE_QUOTE_INSIDE", "VERBATIUM_INSIDE_STRING", "DOUBLE_QUOTE_INSIDE", 
			"CLOSE_BRACE_INSIDE", "FORMAT_STRING", "DOUBLE_CURLY_CLOSE_INSIDE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NebulaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NebulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NebulaParser.EOF, 0); }
		public List<Top_level_declarationContext> top_level_declaration() {
			return getRuleContexts(Top_level_declarationContext.class);
		}
		public Top_level_declarationContext top_level_declaration(int i) {
			return getRuleContext(Top_level_declarationContext.class,i);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitCompilation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -739784376190646272L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1099515822251L) != 0)) {
				{
				{
				setState(274);
				top_level_declaration();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Extern_declarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode EXTERN() { return getToken(NebulaParser.EXTERN, 0); }
		public TerminalNode REGULAR_STRING() { return getToken(NebulaParser.REGULAR_STRING, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<Extern_memberContext> extern_member() {
			return getRuleContexts(Extern_memberContext.class);
		}
		public Extern_memberContext extern_member(int i) {
			return getRuleContext(Extern_memberContext.class,i);
		}
		public Extern_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterExtern_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitExtern_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitExtern_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_declarationContext extern_declaration() throws RecognitionException {
		Extern_declarationContext _localctx = new Extern_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_extern_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			modifiers();
			setState(283);
			match(EXTERN);
			setState(284);
			match(REGULAR_STRING);
			setState(285);
			match(OPEN_BRACE);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145110541689927680L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 137439477777L) != 0)) {
				{
				{
				setState(286);
				extern_member();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Extern_memberContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Extern_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterExtern_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitExtern_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitExtern_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_memberContext extern_member() throws RecognitionException {
		Extern_memberContext _localctx = new Extern_memberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_extern_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			method_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Use_statementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(NebulaParser.USE, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public Use_tailContext use_tail() {
			return getRuleContext(Use_tailContext.class,0);
		}
		public Use_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_statementContext use_statement() throws RecognitionException {
		Use_statementContext _localctx = new Use_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_use_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(USE);
			setState(297);
			qualified_name();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==DOUBLE_COLON) {
				{
				setState(298);
				use_tail();
				}
			}

			setState(301);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Use_tailContext extends ParserRuleContext {
		public TerminalNode DOUBLE_COLON() { return getToken(NebulaParser.DOUBLE_COLON, 0); }
		public Use_selectorContext use_selector() {
			return getRuleContext(Use_selectorContext.class,0);
		}
		public Use_aliasContext use_alias() {
			return getRuleContext(Use_aliasContext.class,0);
		}
		public Use_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUse_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUse_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUse_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_tailContext use_tail() throws RecognitionException {
		Use_tailContext _localctx = new Use_tailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_use_tail);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(DOUBLE_COLON);
				setState(304);
				use_selector();
				}
				break;
			case AS:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				use_alias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Use_selectorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(NebulaParser.STAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Use_aliasContext use_alias() {
			return getRuleContext(Use_aliasContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public List<Use_selector_itemContext> use_selector_item() {
			return getRuleContexts(Use_selector_itemContext.class);
		}
		public Use_selector_itemContext use_selector_item(int i) {
			return getRuleContext(Use_selector_itemContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Use_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUse_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUse_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUse_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_selectorContext use_selector() throws RecognitionException {
		Use_selectorContext _localctx = new Use_selectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_use_selector);
		int _la;
		try {
			int _alt;
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(STAR);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(IDENTIFIER);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(310);
					use_alias();
					}
				}

				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(OPEN_BRACE);
				setState(314);
				use_selector_item();
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315);
						match(COMMA);
						setState(316);
						use_selector_item();
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(322);
					match(COMMA);
					}
				}

				setState(325);
				match(CLOSE_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Use_selector_itemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Use_aliasContext use_alias() {
			return getRuleContext(Use_aliasContext.class,0);
		}
		public TerminalNode STAR() { return getToken(NebulaParser.STAR, 0); }
		public Use_selector_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_selector_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUse_selector_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUse_selector_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUse_selector_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_selector_itemContext use_selector_item() throws RecognitionException {
		Use_selector_itemContext _localctx = new Use_selector_itemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_use_selector_item);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(IDENTIFIER);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(330);
					use_alias();
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Use_aliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(NebulaParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Use_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUse_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUse_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUse_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_aliasContext use_alias() throws RecognitionException {
		Use_aliasContext _localctx = new Use_aliasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_use_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(AS);
			setState(337);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_statementContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(NebulaParser.TAG, 0); }
		public Tag_declarationContext tag_declaration() {
			return getRuleContext(Tag_declarationContext.class,0);
		}
		public TerminalNode AS() { return getToken(NebulaParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public Tag_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTag_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTag_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTag_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_statementContext tag_statement() throws RecognitionException {
		Tag_statementContext _localctx = new Tag_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tag_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				setState(339);
				visibility_modifier();
				}
			}

			setState(342);
			match(TAG);
			setState(343);
			tag_declaration();
			setState(344);
			match(AS);
			setState(345);
			match(IDENTIFIER);
			setState(346);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public Tag_enumerationContext tag_enumeration() {
			return getRuleContext(Tag_enumerationContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public Tag_expressionContext tag_expression() {
			return getRuleContext(Tag_expressionContext.class,0);
		}
		public Tag_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTag_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTag_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTag_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_declarationContext tag_declaration() throws RecognitionException {
		Tag_declarationContext _localctx = new Tag_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tag_declaration);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(OPEN_BRACE);
				setState(350);
				tag_enumeration();
				setState(351);
				match(CLOSE_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(OPEN_BRACE);
				setState(354);
				tag_expression(0);
				setState(355);
				match(CLOSE_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_enumerationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Tag_enumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTag_enumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTag_enumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTag_enumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_enumerationContext tag_enumeration() throws RecognitionException {
		Tag_enumerationContext _localctx = new Tag_enumerationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tag_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			type();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360);
				match(COMMA);
				setState(361);
				type();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public List<Tag_expressionContext> tag_expression() {
			return getRuleContexts(Tag_expressionContext.class);
		}
		public Tag_expressionContext tag_expression(int i) {
			return getRuleContext(Tag_expressionContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public TerminalNode BANG() { return getToken(NebulaParser.BANG, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode AMP() { return getToken(NebulaParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(NebulaParser.PIPE, 0); }
		public Tag_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTag_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTag_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTag_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_expressionContext tag_expression() throws RecognitionException {
		return tag_expression(0);
	}

	private Tag_expressionContext tag_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tag_expressionContext _localctx = new Tag_expressionContext(_ctx, _parentState);
		Tag_expressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_tag_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(368);
				match(OPEN_PARENS);
				setState(369);
				tag_expression(0);
				setState(370);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				{
				setState(372);
				match(BANG);
				setState(373);
				tag_expression(4);
				}
				break;
			case 3:
				{
				setState(374);
				type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(383);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Tag_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tag_expression);
						setState(377);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(378);
						match(AMP);
						}
						setState(379);
						tag_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Tag_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tag_expression);
						setState(380);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(381);
						match(PIPE);
						}
						setState(382);
						tag_expression(3);
						}
						break;
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Namespace_declarationContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(NebulaParser.NAMESPACE, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public List<Top_level_declarationContext> top_level_declaration() {
			return getRuleContexts(Top_level_declarationContext.class);
		}
		public Top_level_declarationContext top_level_declaration(int i) {
			return getRuleContext(Top_level_declarationContext.class,i);
		}
		public Namespace_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterNamespace_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitNamespace_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitNamespace_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_declarationContext namespace_declaration() throws RecognitionException {
		Namespace_declarationContext _localctx = new Namespace_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namespace_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(NAMESPACE);
			setState(389);
			qualified_name();
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(390);
				match(OPEN_BRACE);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -739784376190646272L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1099515822251L) != 0)) {
					{
					{
					setState(391);
					top_level_declaration();
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				match(CLOSE_BRACE);
				}
				break;
			case SEMICOLON:
				{
				setState(398);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Qualified_nameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NebulaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NebulaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(NebulaParser.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(NebulaParser.DOUBLE_COLON, i);
		}
		public List<TerminalNode> DOT() { return getTokens(NebulaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NebulaParser.DOT, i);
		}
		public Qualified_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterQualified_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitQualified_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitQualified_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_nameContext qualified_name() throws RecognitionException {
		Qualified_nameContext _localctx = new Qualified_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_qualified_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(IDENTIFIER);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==DOUBLE_COLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(403);
					match(IDENTIFIER);
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_declarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(NebulaParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Enum_blockContext enum_block() {
			return getRuleContext(Enum_blockContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitEnum_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitEnum_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enum_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(409);
				attribute();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			match(ENUM);
			setState(416);
			match(IDENTIFIER);
			setState(417);
			enum_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(NebulaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NebulaParser.IDENTIFIER, i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Enum_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterEnum_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitEnum_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitEnum_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_blockContext enum_block() throws RecognitionException {
		Enum_blockContext _localctx = new Enum_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enum_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(OPEN_BRACE);
			setState(420);
			match(IDENTIFIER);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(421);
				match(COMMA);
				setState(422);
				match(IDENTIFIER);
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Top_level_declarationContext extends ParserRuleContext {
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public Tag_statementContext tag_statement() {
			return getRuleContext(Tag_statementContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Const_declarationContext const_declaration() {
			return getRuleContext(Const_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Trait_declarationContext trait_declaration() {
			return getRuleContext(Trait_declarationContext.class,0);
		}
		public Impl_declarationContext impl_declaration() {
			return getRuleContext(Impl_declarationContext.class,0);
		}
		public Union_declarationContext union_declaration() {
			return getRuleContext(Union_declarationContext.class,0);
		}
		public Namespace_declarationContext namespace_declaration() {
			return getRuleContext(Namespace_declarationContext.class,0);
		}
		public Extern_declarationContext extern_declaration() {
			return getRuleContext(Extern_declarationContext.class,0);
		}
		public Top_level_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTop_level_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTop_level_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTop_level_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_declarationContext top_level_declaration() throws RecognitionException {
		Top_level_declarationContext _localctx = new Top_level_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_top_level_declaration);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				use_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				tag_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				enum_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				const_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				method_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				class_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				struct_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				trait_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(438);
				impl_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(439);
				union_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(440);
				namespace_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(441);
				extern_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Use_statementContext use_statement() {
			return getRuleContext(Use_statementContext.class,0);
		}
		public Tag_statementContext tag_statement() {
			return getRuleContext(Tag_statementContext.class,0);
		}
		public Const_declarationContext const_declaration() {
			return getRuleContext(Const_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Foreach_statementContext foreach_statement() {
			return getRuleContext(Foreach_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				use_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				tag_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				const_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				variable_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				statement_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(449);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(450);
				for_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(451);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(452);
				foreach_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(453);
				return_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(454);
				break_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(455);
				continue_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(456);
				expression_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(NebulaParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(BREAK);
			setState(460);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(NebulaParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(CONTINUE);
			setState(463);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitExpression_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			expression();
			setState(466);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public Block_statementsContext block_statements() {
			return getRuleContext(Block_statementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public Block_tailContext block_tail() {
			return getRuleContext(Block_tailContext.class,0);
		}
		public Expression_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterExpression_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitExpression_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitExpression_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_blockContext expression_block() throws RecognitionException {
		Expression_blockContext _localctx = new Expression_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(OPEN_BRACE);
			setState(469);
			block_statements();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(470);
				block_tail();
				}
			}

			setState(473);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public Block_statementsContext block_statements() {
			return getRuleContext(Block_statementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitStatement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitStatement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(OPEN_BRACE);
			setState(476);
			block_statements();
			setState(477);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_statementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterBlock_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitBlock_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitBlock_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementsContext block_statements() throws RecognitionException {
		Block_statementsContext _localctx = new Block_statementsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					statement();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_tailContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Block_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterBlock_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitBlock_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitBlock_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_tailContext block_tail() throws RecognitionException {
		Block_tailContext _localctx = new Block_tailContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_block_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_expressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NebulaParser.IF, 0); }
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public List<Expression_blockContext> expression_block() {
			return getRuleContexts(Expression_blockContext.class);
		}
		public Expression_blockContext expression_block(int i) {
			return getRuleContext(Expression_blockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(NebulaParser.ELSE, 0); }
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitIf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitIf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(IF);
			setState(488);
			parenthesized_expression();
			setState(489);
			expression_block();
			setState(490);
			match(ELSE);
			setState(491);
			expression_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NebulaParser.IF, 0); }
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(NebulaParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(IF);
			setState(494);
			parenthesized_expression();
			setState(495);
			statement();
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(496);
				match(ELSE);
				setState(497);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_expressionContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(NebulaParser.MATCH, 0); }
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Match_bodyContext match_body() {
			return getRuleContext(Match_bodyContext.class,0);
		}
		public Match_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterMatch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitMatch_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitMatch_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_expressionContext match_expression() throws RecognitionException {
		Match_expressionContext _localctx = new Match_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_match_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(MATCH);
			setState(501);
			parenthesized_expression();
			setState(502);
			match_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(NebulaParser.FOR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Traditional_for_controlContext traditional_for_control() {
			return getRuleContext(Traditional_for_controlContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(FOR);
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(505);
				traditional_for_control();
				}
				break;
			case 2:
				{
				setState(506);
				parenthesized_expression();
				}
				break;
			}
			setState(509);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Traditional_for_controlContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_iteratorContext for_iterator() {
			return getRuleContext(For_iteratorContext.class,0);
		}
		public Traditional_for_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traditional_for_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTraditional_for_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTraditional_for_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTraditional_for_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Traditional_for_controlContext traditional_for_control() throws RecognitionException {
		Traditional_for_controlContext _localctx = new Traditional_for_controlContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_traditional_for_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(OPEN_PARENS);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(512);
				for_initializer();
				}
				break;
			}
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(515);
				expression();
				}
			}

			setState(518);
			match(SEMICOLON);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(519);
				for_iterator();
				}
			}

			setState(522);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_initializerContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterFor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitFor_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitFor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_for_initializer);
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				expression_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_iteratorContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_iteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterFor_iterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitFor_iterator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitFor_iterator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_iteratorContext for_iterator() throws RecognitionException {
		For_iteratorContext _localctx = new For_iteratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_iterator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			expression_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(NebulaParser.WHILE, 0); }
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(WHILE);
			setState(531);
			parenthesized_expression();
			setState(532);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreach_statementContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(NebulaParser.FOREACH, 0); }
		public Foreach_controlContext foreach_control() {
			return getRuleContext(Foreach_controlContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Foreach_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterForeach_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitForeach_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitForeach_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_statementContext foreach_statement() throws RecognitionException {
		Foreach_statementContext _localctx = new Foreach_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_foreach_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(FOREACH);
			setState(535);
			foreach_control();
			setState(536);
			statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Foreach_controlContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(NebulaParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public TerminalNode VAR() { return getToken(NebulaParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Foreach_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterForeach_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitForeach_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitForeach_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_controlContext foreach_control() throws RecognitionException {
		Foreach_controlContext _localctx = new Foreach_controlContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_foreach_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(OPEN_PARENS);
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(539);
				match(VAR);
				}
				break;
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case STRING:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(540);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(543);
			match(IDENTIFIER);
			setState(544);
			match(IN);
			setState(545);
			expression();
			setState(546);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(NebulaParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(RETURN);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(549);
				expression();
				}
			}

			setState(552);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public List<Match_armContext> match_arm() {
			return getRuleContexts(Match_armContext.class);
		}
		public Match_armContext match_arm(int i) {
			return getRuleContext(Match_armContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Match_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterMatch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitMatch_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitMatch_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_bodyContext match_body() throws RecognitionException {
		Match_bodyContext _localctx = new Match_bodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_match_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(OPEN_BRACE);
			setState(555);
			match_arm();
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(556);
					match(COMMA);
					setState(557);
					match_arm();
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(563);
				match(COMMA);
				}
			}

			setState(566);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_armContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode FAT_ARROW() { return getToken(NebulaParser.FAT_ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Match_armContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_arm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterMatch_arm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitMatch_arm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitMatch_arm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_armContext match_arm() throws RecognitionException {
		Match_armContext _localctx = new Match_armContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_match_arm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			pattern();
			setState(569);
			match(FAT_ARROW);
			setState(570);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public Pattern_orContext pattern_or() {
			return getRuleContext(Pattern_orContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			pattern_or();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_orContext extends ParserRuleContext {
		public List<Pattern_atomContext> pattern_atom() {
			return getRuleContexts(Pattern_atomContext.class);
		}
		public Pattern_atomContext pattern_atom(int i) {
			return getRuleContext(Pattern_atomContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(NebulaParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(NebulaParser.PIPE, i);
		}
		public Pattern_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterPattern_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitPattern_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitPattern_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_orContext pattern_or() throws RecognitionException {
		Pattern_orContext _localctx = new Pattern_orContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pattern_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			pattern_atom();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(575);
				match(PIPE);
				setState(576);
				pattern_atom();
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pattern_atomContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(NebulaParser.UNDERSCORE, 0); }
		public Destructuring_patternContext destructuring_pattern() {
			return getRuleContext(Destructuring_patternContext.class,0);
		}
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Parenthesized_patternContext parenthesized_pattern() {
			return getRuleContext(Parenthesized_patternContext.class,0);
		}
		public Pattern_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterPattern_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitPattern_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitPattern_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_atomContext pattern_atom() throws RecognitionException {
		Pattern_atomContext _localctx = new Pattern_atomContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_pattern_atom);
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(UNDERSCORE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				destructuring_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				qualified_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
				tuple_pattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(587);
				parenthesized_pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Destructuring_patternContext extends ParserRuleContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public Binding_listContext binding_list() {
			return getRuleContext(Binding_listContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Destructuring_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructuring_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterDestructuring_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitDestructuring_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitDestructuring_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destructuring_patternContext destructuring_pattern() throws RecognitionException {
		Destructuring_patternContext _localctx = new Destructuring_patternContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_destructuring_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			qualified_name();
			setState(591);
			match(OPEN_PARENS);
			setState(592);
			binding_list();
			setState(593);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binding_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NebulaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NebulaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(NebulaParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(NebulaParser.UNDERSCORE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Binding_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterBinding_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitBinding_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitBinding_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binding_listContext binding_list() throws RecognitionException {
		Binding_listContext _localctx = new Binding_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_binding_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !(_la==UNDERSCORE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(596);
				match(COMMA);
				setState(597);
				_la = _input.LA(1);
				if ( !(_la==UNDERSCORE || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_patternContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public List<Pattern_atomContext> pattern_atom() {
			return getRuleContexts(Pattern_atomContext.class);
		}
		public Pattern_atomContext pattern_atom(int i) {
			return getRuleContext(Pattern_atomContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTuple_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTuple_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTuple_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tuple_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(OPEN_PARENS);
			setState(604);
			pattern_atom();
			setState(607); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(605);
				match(COMMA);
				setState(606);
				pattern_atom();
				}
				}
				setState(609); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(611);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parenthesized_patternContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Parenthesized_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterParenthesized_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitParenthesized_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitParenthesized_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_patternContext parenthesized_pattern() throws RecognitionException {
		Parenthesized_patternContext _localctx = new Parenthesized_patternContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parenthesized_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(OPEN_PARENS);
			setState(614);
			pattern();
			setState(615);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(NebulaParser.HASH, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(NebulaParser.OPEN_BRACKET, 0); }
		public Attribute_pathContext attribute_path() {
			return getRuleContext(Attribute_pathContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NebulaParser.CLOSE_BRACKET, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(HASH);
			setState(618);
			match(OPEN_BRACKET);
			setState(619);
			attribute_path();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(620);
				arguments();
				}
			}

			setState(623);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attribute_pathContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NebulaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NebulaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(NebulaParser.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(NebulaParser.DOUBLE_COLON, i);
		}
		public Attribute_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterAttribute_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitAttribute_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitAttribute_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_pathContext attribute_path() throws RecognitionException {
		Attribute_pathContext _localctx = new Attribute_pathContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_attribute_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(IDENTIFIER);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE_COLON) {
				{
				{
				setState(626);
				match(DOUBLE_COLON);
				setState(627);
				match(IDENTIFIER);
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(NebulaParser.CONST, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Const_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterConst_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitConst_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitConst_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declarationContext const_declaration() throws RecognitionException {
		Const_declarationContext _localctx = new Const_declarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_const_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(633);
				attribute();
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(639);
			match(CONST);
			setState(640);
			variable_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(NebulaParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CONST() { return getToken(NebulaParser.CONST, 0); }
		public Backlink_modifierContext backlink_modifier() {
			return getRuleContext(Backlink_modifierContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			modifiers();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(643);
				match(CONST);
				}
			}

			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKLINK) {
				{
				setState(646);
				backlink_modifier();
				}
			}

			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(649);
				match(VAR);
				}
				break;
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case STRING:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(650);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(653);
			variable_declarators();
			setState(654);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Visibility_modifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(NebulaParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(NebulaParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(NebulaParser.PROTECTED, 0); }
		public Visibility_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterVisibility_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitVisibility_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitVisibility_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Visibility_modifierContext visibility_modifier() throws RecognitionException {
		Visibility_modifierContext _localctx = new Visibility_modifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_visibility_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cvt_modifierContext extends ParserRuleContext {
		public TerminalNode KEEPS() { return getToken(NebulaParser.KEEPS, 0); }
		public TerminalNode DROPS() { return getToken(NebulaParser.DROPS, 0); }
		public TerminalNode MUTATES() { return getToken(NebulaParser.MUTATES, 0); }
		public Cvt_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvt_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterCvt_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitCvt_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitCvt_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cvt_modifierContext cvt_modifier() throws RecognitionException {
		Cvt_modifierContext _localctx = new Cvt_modifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_cvt_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 824634769408L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Backlink_modifierContext extends ParserRuleContext {
		public TerminalNode BACKLINK() { return getToken(NebulaParser.BACKLINK, 0); }
		public Backlink_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backlink_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterBacklink_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitBacklink_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitBacklink_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Backlink_modifierContext backlink_modifier() throws RecognitionException {
		Backlink_modifierContext _localctx = new Backlink_modifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_backlink_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(BACKLINK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifiersContext extends ParserRuleContext {
		public List<Visibility_modifierContext> visibility_modifier() {
			return getRuleContexts(Visibility_modifierContext.class);
		}
		public Visibility_modifierContext visibility_modifier(int i) {
			return getRuleContext(Visibility_modifierContext.class,i);
		}
		public List<TerminalNode> STATIC() { return getTokens(NebulaParser.STATIC); }
		public TerminalNode STATIC(int i) {
			return getToken(NebulaParser.STATIC, i);
		}
		public List<TerminalNode> OVERRIDE() { return getTokens(NebulaParser.OVERRIDE); }
		public TerminalNode OVERRIDE(int i) {
			return getToken(NebulaParser.OVERRIDE, i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3307330976350208L) != 0)) {
				{
				setState(665);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
					{
					setState(662);
					visibility_modifier();
					}
					break;
				case STATIC:
					{
					setState(663);
					match(STATIC);
					}
					break;
				case OVERRIDE:
					{
					setState(664);
					match(OVERRIDE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_declarationContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterField_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitField_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitField_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_field_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(670);
				attribute();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676);
			variable_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declaratorsContext extends ParserRuleContext {
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterVariable_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitVariable_declarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitVariable_declarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaratorsContext variable_declarators() throws RecognitionException {
		Variable_declaratorsContext _localctx = new Variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			variable_declarator();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(679);
				match(COMMA);
				setState(680);
				variable_declarator();
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(NebulaParser.ASSIGNMENT, 0); }
		public NonAssignmentExpressionContext nonAssignmentExpression() {
			return getRuleContext(NonAssignmentExpressionContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterVariable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitVariable_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitVariable_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(IDENTIFIER);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(687);
				match(ASSIGNMENT);
				setState(688);
				nonAssignmentExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(691);
				attribute();
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(697);
			modifiers();
			setState(698);
			return_type();
			setState(699);
			match(IDENTIFIER);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(700);
				type_parameters();
				}
			}

			setState(703);
			parameters();
			setState(704);
			method_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constructor_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Visibility_modifierContext visibility_modifier() {
			return getRuleContext(Visibility_modifierContext.class,0);
		}
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterConstructor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitConstructor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitConstructor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(706);
				attribute();
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				setState(712);
				visibility_modifier();
				}
			}

			setState(715);
			match(IDENTIFIER);
			setState(716);
			parameters();
			setState(717);
			statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(OPEN_PARENS);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1148417048031508480L) != 0) || _la==IDENTIFIER || _la==OPEN_PARENS) {
				{
				setState(720);
				parameter_list();
				}
			}

			setState(723);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			parameter();
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(726);
				match(COMMA);
				setState(727);
				parameter();
				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Cvt_modifierContext cvt_modifier() {
			return getRuleContext(Cvt_modifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(NebulaParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824634769408L) != 0)) {
				{
				setState(733);
				cvt_modifier();
				}
			}

			setState(736);
			type();
			setState(737);
			match(IDENTIFIER);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(738);
				match(ASSIGNMENT);
				setState(739);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_bodyContext extends ParserRuleContext {
		public Expression_blockContext expression_block() {
			return getRuleContext(Expression_blockContext.class,0);
		}
		public TerminalNode FAT_ARROW() { return getToken(NebulaParser.FAT_ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_method_body);
		try {
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				expression_block();
				}
				break;
			case FAT_ARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(FAT_ARROW);
				setState(744);
				expression();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator_declarationContext extends ParserRuleContext {
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(NebulaParser.OPERATOR, 0); }
		public Overloadable_operatorContext overloadable_operator() {
			return getRuleContext(Overloadable_operatorContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitOperator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitOperator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_operator_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(748);
				attribute();
				}
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(754);
			return_type();
			setState(755);
			match(OPERATOR);
			setState(756);
			overloadable_operator();
			setState(757);
			parameters();
			setState(758);
			method_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Overloadable_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(NebulaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NebulaParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(NebulaParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(NebulaParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(NebulaParser.PERCENT, 0); }
		public TerminalNode CARET() { return getToken(NebulaParser.CARET, 0); }
		public TerminalNode AMP() { return getToken(NebulaParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(NebulaParser.PIPE, 0); }
		public List<TerminalNode> LT() { return getTokens(NebulaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(NebulaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(NebulaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(NebulaParser.GT, i);
		}
		public TerminalNode OP_EQ() { return getToken(NebulaParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(NebulaParser.OP_NE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(NebulaParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(NebulaParser.CLOSE_BRACKET, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(NebulaParser.ASSIGNMENT, 0); }
		public Overloadable_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloadable_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterOverloadable_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitOverloadable_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitOverloadable_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overloadable_operatorContext overloadable_operator() throws RecognitionException {
		Overloadable_operatorContext _localctx = new Overloadable_operatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_overloadable_operator);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(762);
				match(STAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(763);
				match(DIV);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(764);
				match(PERCENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(765);
				match(CARET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(766);
				match(AMP);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(767);
				match(PIPE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(768);
				match(LT);
				setState(769);
				match(LT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(770);
				match(GT);
				setState(771);
				match(GT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(772);
				match(OP_EQ);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(773);
				match(OP_NE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(774);
				match(OPEN_BRACKET);
				setState(775);
				match(CLOSE_BRACKET);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(776);
				match(OPEN_BRACKET);
				setState(777);
				match(CLOSE_BRACKET);
				setState(778);
				match(ASSIGNMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(NebulaParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Inheritance_clauseContext inheritance_clause() {
			return getRuleContext(Inheritance_clauseContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(781);
				attribute();
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787);
			match(CLASS);
			setState(788);
			match(IDENTIFIER);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(789);
				type_parameters();
				}
			}

			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(792);
				inheritance_clause();
				}
			}

			setState(795);
			class_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<Class_memberContext> class_member() {
			return getRuleContexts(Class_memberContext.class);
		}
		public Class_memberContext class_member(int i) {
			return getRuleContext(Class_memberContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(OPEN_BRACE);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145109442178234368L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 274878955555L) != 0)) {
				{
				{
				setState(798);
				class_member();
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_memberContext extends ParserRuleContext {
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public Class_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterClass_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitClass_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitClass_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_memberContext class_member() throws RecognitionException {
		Class_memberContext _localctx = new Class_memberContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_class_member);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				operator_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				field_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				constructor_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_declarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(NebulaParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Inheritance_clauseContext inheritance_clause() {
			return getRuleContext(Inheritance_clauseContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(812);
				attribute();
				}
				}
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(818);
			match(STRUCT);
			setState(819);
			match(IDENTIFIER);
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(820);
				type_parameters();
				}
			}

			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(823);
				inheritance_clause();
				}
			}

			setState(826);
			struct_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<Struct_memberContext> struct_member() {
			return getRuleContexts(Struct_memberContext.class);
		}
		public Struct_memberContext struct_member(int i) {
			return getRuleContext(Struct_memberContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(OPEN_BRACE);
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145109442178234368L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 274878955555L) != 0)) {
				{
				{
				setState(829);
				struct_member();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(835);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_memberContext extends ParserRuleContext {
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public Struct_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterStruct_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitStruct_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitStruct_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_memberContext struct_member() throws RecognitionException {
		Struct_memberContext _localctx = new Struct_memberContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_struct_member);
		try {
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				operator_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(839);
				field_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(840);
				constructor_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inheritance_clauseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Inheritance_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterInheritance_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitInheritance_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitInheritance_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inheritance_clauseContext inheritance_clause() throws RecognitionException {
		Inheritance_clauseContext _localctx = new Inheritance_clauseContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_inheritance_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(COLON);
			setState(844);
			type();
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(845);
				match(COMMA);
				setState(846);
				type();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trait_declarationContext extends ParserRuleContext {
		public TerminalNode TRAIT() { return getToken(NebulaParser.TRAIT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Trait_bodyContext trait_body() {
			return getRuleContext(Trait_bodyContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Trait_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTrait_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTrait_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTrait_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_declarationContext trait_declaration() throws RecognitionException {
		Trait_declarationContext _localctx = new Trait_declarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_trait_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(852);
				attribute();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(858);
			match(TRAIT);
			setState(859);
			match(IDENTIFIER);
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(860);
				type_parameters();
				}
			}

			setState(863);
			trait_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trait_bodyContext extends ParserRuleContext {
		public Trait_blockContext trait_block() {
			return getRuleContext(Trait_blockContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Trait_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTrait_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTrait_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTrait_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_bodyContext trait_body() throws RecognitionException {
		Trait_bodyContext _localctx = new Trait_bodyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_trait_body);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				trait_block();
				}
				break;
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case OVERRIDE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRING:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case VOID:
			case IDENTIFIER:
			case OPEN_PARENS:
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				method_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trait_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<Trait_memberContext> trait_member() {
			return getRuleContexts(Trait_memberContext.class);
		}
		public Trait_memberContext trait_member(int i) {
			return getRuleContext(Trait_memberContext.class,i);
		}
		public Trait_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTrait_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTrait_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTrait_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_blockContext trait_block() throws RecognitionException {
		Trait_blockContext _localctx = new Trait_blockContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_trait_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(OPEN_BRACE);
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145110541689927680L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 137439477777L) != 0)) {
				{
				{
				setState(870);
				trait_member();
				}
				}
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(876);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trait_memberContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Trait_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTrait_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTrait_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTrait_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_memberContext trait_member() throws RecognitionException {
		Trait_memberContext _localctx = new Trait_memberContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trait_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			method_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_declarationContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(NebulaParser.UNION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Union_bodyContext union_body() {
			return getRuleContext(Union_bodyContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode TAGGED() { return getToken(NebulaParser.TAGGED, 0); }
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Union_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUnion_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUnion_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUnion_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_declarationContext union_declaration() throws RecognitionException {
		Union_declarationContext _localctx = new Union_declarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_union_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(880);
				attribute();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAGGED) {
				{
				setState(886);
				match(TAGGED);
				}
			}

			setState(889);
			match(UNION);
			setState(890);
			match(IDENTIFIER);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(891);
				type_parameters();
				}
			}

			setState(894);
			union_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public List<Union_variantContext> union_variant() {
			return getRuleContexts(Union_variantContext.class);
		}
		public Union_variantContext union_variant(int i) {
			return getRuleContext(Union_variantContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Union_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUnion_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUnion_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUnion_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_bodyContext union_body() throws RecognitionException {
		Union_bodyContext _localctx = new Union_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_union_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(OPEN_BRACE);
			setState(897);
			union_variant();
			setState(902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(898);
					match(COMMA);
					setState(899);
					union_variant();
					}
					} 
				}
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(905);
				match(COMMA);
				}
			}

			setState(908);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_payloadContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Union_payloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_payload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUnion_payload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUnion_payload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUnion_payload(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_payloadContext union_payload() throws RecognitionException {
		Union_payloadContext _localctx = new Union_payloadContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_union_payload);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(OPEN_PARENS);
			setState(911);
			parameter();
			setState(912);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Union_variantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Union_payloadContext union_payload() {
			return getRuleContext(Union_payloadContext.class,0);
		}
		public Union_variantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUnion_variant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUnion_variant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUnion_variant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_variantContext union_variant() throws RecognitionException {
		Union_variantContext _localctx = new Union_variantContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_union_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(IDENTIFIER);
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(915);
				union_payload();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Impl_declarationContext extends ParserRuleContext {
		public TerminalNode IMPL() { return getToken(NebulaParser.IMPL, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode FOR() { return getToken(NebulaParser.FOR, 0); }
		public Impl_blockContext impl_block() {
			return getRuleContext(Impl_blockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Impl_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterImpl_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitImpl_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitImpl_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Impl_declarationContext impl_declaration() throws RecognitionException {
		Impl_declarationContext _localctx = new Impl_declarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_impl_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(918);
				attribute();
				}
				}
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(924);
			match(IMPL);
			setState(925);
			type();
			setState(926);
			match(FOR);
			setState(927);
			type();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(928);
				match(COMMA);
				setState(929);
				type();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(935);
				impl_block();
				}
				break;
			case SEMICOLON:
				{
				setState(936);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Impl_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<Impl_memberContext> impl_member() {
			return getRuleContexts(Impl_memberContext.class);
		}
		public Impl_memberContext impl_member(int i) {
			return getRuleContext(Impl_memberContext.class,i);
		}
		public Impl_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterImpl_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitImpl_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitImpl_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Impl_blockContext impl_block() throws RecognitionException {
		Impl_blockContext _localctx = new Impl_blockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_impl_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(OPEN_BRACE);
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145110541689927680L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 137439477777L) != 0)) {
				{
				{
				setState(940);
				impl_member();
				}
				}
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(946);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Impl_memberContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Impl_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impl_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterImpl_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitImpl_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitImpl_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Impl_memberContext impl_member() throws RecognitionException {
		Impl_memberContext _localctx = new Impl_memberContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_impl_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			method_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(NebulaParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_return_type);
		try {
			setState(952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				match(VOID);
				}
				break;
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case STRING:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case IDENTIFIER:
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public List<Type_suffixContext> type_suffix() {
			return getRuleContexts(Type_suffixContext.class);
		}
		public Type_suffixContext type_suffix(int i) {
			return getRuleContext(Type_suffixContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(954);
				match(IDENTIFIER);
				setState(955);
				match(COLON);
				}
				break;
			}
			setState(958);
			base_type();
			setState(962);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(959);
					type_suffix();
					}
					} 
				}
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_suffixContext extends ParserRuleContext {
		public Rank_specifierContext rank_specifier() {
			return getRuleContext(Rank_specifierContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(NebulaParser.INTERR, 0); }
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_type_suffix);
		try {
			setState(967);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				rank_specifier();
				}
				break;
			case INTERR:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				match(INTERR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Base_typeContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_base_type);
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(969);
				class_type();
				}
				break;
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case STRING:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(970);
				predefined_type();
				}
				break;
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(971);
				tuple_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public List<Tuple_type_elementContext> tuple_type_element() {
			return getRuleContexts(Tuple_type_elementContext.class);
		}
		public Tuple_type_elementContext tuple_type_element(int i) {
			return getRuleContext(Tuple_type_elementContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(OPEN_PARENS);
			setState(975);
			tuple_type_element();
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(976);
				match(COMMA);
				setState(977);
				tuple_type_element();
				}
				}
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(983);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_type_elementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTuple_type_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTuple_type_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTuple_type_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_tuple_type_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			type();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(986);
				match(IDENTIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_typeContext extends ParserRuleContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterClass_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitClass_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitClass_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_class_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			qualified_name();
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(990);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(NebulaParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(NebulaParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(NebulaParser.STRING, 0); }
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterPredefined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitPredefined_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitPredefined_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_predefined_type);
		try {
			setState(997);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				match(BOOL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(CHAR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				match(STRING);
				}
				break;
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
				enterOuterAlt(_localctx, 4);
				{
				setState(996);
				numeric_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_typeContext extends ParserRuleContext {
		public Integral_typeContext integral_type() {
			return getRuleContext(Integral_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterNumeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitNumeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitNumeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_numeric_type);
		try {
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				integral_type();
				}
				break;
			case DECIMAL:
			case F32:
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				floating_point_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Integral_typeContext extends ParserRuleContext {
		public TerminalNode INT8() { return getToken(NebulaParser.INT8, 0); }
		public TerminalNode INT16() { return getToken(NebulaParser.INT16, 0); }
		public TerminalNode INT32() { return getToken(NebulaParser.INT32, 0); }
		public TerminalNode INT64() { return getToken(NebulaParser.INT64, 0); }
		public TerminalNode UINT8() { return getToken(NebulaParser.UINT8, 0); }
		public TerminalNode UINT16() { return getToken(NebulaParser.UINT16, 0); }
		public TerminalNode UINT32() { return getToken(NebulaParser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(NebulaParser.UINT64, 0); }
		public Integral_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterIntegral_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitIntegral_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitIntegral_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integral_typeContext integral_type() throws RecognitionException {
		Integral_typeContext _localctx = new Integral_typeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921472394592256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Floating_point_typeContext extends ParserRuleContext {
		public TerminalNode F32() { return getToken(NebulaParser.F32, 0); }
		public TerminalNode F64() { return getToken(NebulaParser.F64, 0); }
		public TerminalNode DECIMAL() { return getToken(NebulaParser.DECIMAL, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterFloating_point_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitFloating_point_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitFloating_point_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 100925440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rank_specifierContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(NebulaParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(NebulaParser.CLOSE_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Rank_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterRank_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitRank_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitRank_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rank_specifierContext rank_specifier() throws RecognitionException {
		Rank_specifierContext _localctx = new Rank_specifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(OPEN_BRACKET);
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(1008);
				expression();
				}
			}

			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1011);
				match(COMMA);
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1017);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_parameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public Generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterGeneric_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitGeneric_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitGeneric_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_generic_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(IDENTIFIER);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1020);
				match(COLON);
				setState(1021);
				constraint();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_parametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NebulaParser.LT, 0); }
		public List<Generic_parameterContext> generic_parameter() {
			return getRuleContexts(Generic_parameterContext.class);
		}
		public Generic_parameterContext generic_parameter(int i) {
			return getRuleContext(Generic_parameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(NebulaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Type_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parametersContext type_parameters() throws RecognitionException {
		Type_parametersContext _localctx = new Type_parametersContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_type_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(LT);
			setState(1027);
			generic_parameter();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1028);
				match(COMMA);
				setState(1029);
				generic_parameter();
				}
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1035);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_argument_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(NebulaParser.LT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Nested_gtContext nested_gt() {
			return getRuleContext(Nested_gtContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_argument_listContext type_argument_list() throws RecognitionException {
		Type_argument_listContext _localctx = new Type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_type_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(LT);
			setState(1038);
			type();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1039);
				match(COMMA);
				setState(1040);
				type();
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1046);
			nested_gt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nested_gtContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(NebulaParser.GT, 0); }
		public Nested_gtContext nested_gt() {
			return getRuleContext(Nested_gtContext.class,0);
		}
		public Nested_gtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_gt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterNested_gt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitNested_gt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitNested_gt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_gtContext nested_gt() throws RecognitionException {
		Nested_gtContext _localctx = new Nested_gtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_nested_gt);
		try {
			setState(1051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				match(GT);
				setState(1050);
				nested_gt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuple_literalContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Tuple_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTuple_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTuple_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTuple_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_literalContext tuple_literal() throws RecognitionException {
		Tuple_literalContext _localctx = new Tuple_literalContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(OPEN_PARENS);
			setState(1054);
			argument();
			setState(1057); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1055);
				match(COMMA);
				setState(1056);
				argument();
				}
				}
				setState(1059); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(1061);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitParenthesized_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			match(OPEN_PARENS);
			setState(1064);
			expression();
			setState(1065);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonAssignmentExpressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public NonAssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonAssignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterNonAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitNonAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitNonAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonAssignmentExpressionContext nonAssignmentExpression() throws RecognitionException {
		NonAssignmentExpressionContext _localctx = new NonAssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_nonAssignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			null_coalescing_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			assignment_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_expressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_assignment_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			null_coalescing_expression();
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 16760833L) != 0)) {
				{
				setState(1072);
				assignment_operator();
				setState(1073);
				assignment_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Null_coalescing_expressionContext extends ParserRuleContext {
		public Binary_or_expressionContext binary_or_expression() {
			return getRuleContext(Binary_or_expressionContext.class,0);
		}
		public TerminalNode OP_COALESCING() { return getToken(NebulaParser.OP_COALESCING, 0); }
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_coalescing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterNull_coalescing_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitNull_coalescing_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitNull_coalescing_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_coalescing_expressionContext null_coalescing_expression() throws RecognitionException {
		Null_coalescing_expressionContext _localctx = new Null_coalescing_expressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_null_coalescing_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			binary_or_expression();
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COALESCING) {
				{
				setState(1078);
				match(OP_COALESCING);
				setState(1079);
				null_coalescing_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class New_expressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(NebulaParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitNew_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(NEW);
			setState(1083);
			type();
			setState(1084);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(NebulaParser.ASSIGNMENT, 0); }
		public TerminalNode OP_ADD_ASSIGNMENT() { return getToken(NebulaParser.OP_ADD_ASSIGNMENT, 0); }
		public TerminalNode OP_SUB_ASSIGNMENT() { return getToken(NebulaParser.OP_SUB_ASSIGNMENT, 0); }
		public TerminalNode OP_MULT_ASSIGNMENT() { return getToken(NebulaParser.OP_MULT_ASSIGNMENT, 0); }
		public TerminalNode OP_POW_ASSIGNMENT() { return getToken(NebulaParser.OP_POW_ASSIGNMENT, 0); }
		public TerminalNode OP_DIV_ASSIGNMENT() { return getToken(NebulaParser.OP_DIV_ASSIGNMENT, 0); }
		public TerminalNode OP_MOD_ASSIGNMENT() { return getToken(NebulaParser.OP_MOD_ASSIGNMENT, 0); }
		public TerminalNode OP_AND_ASSIGNMENT() { return getToken(NebulaParser.OP_AND_ASSIGNMENT, 0); }
		public TerminalNode OP_OR_ASSIGNMENT() { return getToken(NebulaParser.OP_OR_ASSIGNMENT, 0); }
		public TerminalNode OP_XOR_ASSIGNMENT() { return getToken(NebulaParser.OP_XOR_ASSIGNMENT, 0); }
		public TerminalNode OP_LEFT_SHIFT_ASSIGNMENT() { return getToken(NebulaParser.OP_LEFT_SHIFT_ASSIGNMENT, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 16760833L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_or_expressionContext extends ParserRuleContext {
		public List<Binary_and_expressionContext> binary_and_expression() {
			return getRuleContexts(Binary_and_expressionContext.class);
		}
		public Binary_and_expressionContext binary_and_expression(int i) {
			return getRuleContext(Binary_and_expressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(NebulaParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(NebulaParser.OP_OR, i);
		}
		public Binary_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterBinary_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitBinary_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitBinary_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_or_expressionContext binary_or_expression() throws RecognitionException {
		Binary_or_expressionContext _localctx = new Binary_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_binary_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			binary_and_expression();
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(1089);
				match(OP_OR);
				setState(1090);
				binary_and_expression();
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(NebulaParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(NebulaParser.OP_AND, i);
		}
		public Binary_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterBinary_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitBinary_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitBinary_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_and_expressionContext binary_and_expression() throws RecognitionException {
		Binary_and_expressionContext _localctx = new Binary_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_binary_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			inclusive_or_expression();
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(1097);
				match(OP_AND);
				setState(1098);
				inclusive_or_expression();
				}
				}
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(NebulaParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(NebulaParser.PIPE, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			exclusive_or_expression();
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(1105);
				match(PIPE);
				setState(1106);
				exclusive_or_expression();
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(NebulaParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(NebulaParser.CARET, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			and_expression();
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1113);
				match(CARET);
				setState(1114);
				and_expression();
				}
				}
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(NebulaParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(NebulaParser.AMP, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			equality_expression();
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(1121);
				match(AMP);
				setState(1122);
				equality_expression();
				}
				}
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(NebulaParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(NebulaParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(NebulaParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(NebulaParser.OP_NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			relational_expression();
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_EQ || _la==OP_NE) {
				{
				{
				setState(1129);
				_la = _input.LA(1);
				if ( !(_la==OP_EQ || _la==OP_NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1130);
				relational_expression();
				}
				}
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public TerminalNode IS() { return getToken(NebulaParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LT() { return getToken(NebulaParser.LT, 0); }
		public TerminalNode GT() { return getToken(NebulaParser.GT, 0); }
		public TerminalNode OP_LE() { return getToken(NebulaParser.OP_LE, 0); }
		public TerminalNode OP_GE() { return getToken(NebulaParser.OP_GE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			shift_expression();
			setState(1144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case OP_LE:
			case OP_GE:
				{
				setState(1137);
				_la = _input.LA(1);
				if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 6147L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1138);
				shift_expression();
				}
				break;
			case IS:
				{
				setState(1139);
				match(IS);
				setState(1140);
				type();
				setState(1142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1141);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case EOF:
			case BOOL:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case ENUM:
			case EXTERN:
			case FALSE:
			case F32:
			case F64:
			case IF:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case BACKLINK:
			case NAMESPACE:
			case NONE:
			case NEW:
			case MATCH:
			case OVERRIDE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRING:
			case STRUCT:
			case TAG:
			case TAGGED:
			case THIS:
			case TRAIT:
			case TRUE:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case UNION:
			case USE:
			case VAR:
			case VOID:
			case IMPL:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case OPEN_BRACE:
			case CLOSE_BRACE:
			case OPEN_BRACKET:
			case CLOSE_BRACKET:
			case OPEN_PARENS:
			case CLOSE_PARENS:
			case COMMA:
			case COLON:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case AMP:
			case PIPE:
			case CARET:
			case BANG:
			case TILDE:
			case HASH:
			case ASSIGNMENT:
			case OP_COALESCING:
			case OP_AND:
			case OP_OR:
			case OP_EQ:
			case OP_NE:
			case OP_ADD_ASSIGNMENT:
			case OP_SUB_ASSIGNMENT:
			case OP_MULT_ASSIGNMENT:
			case OP_POW_ASSIGNMENT:
			case OP_DIV_ASSIGNMENT:
			case OP_MOD_ASSIGNMENT:
			case OP_AND_ASSIGNMENT:
			case OP_OR_ASSIGNMENT:
			case OP_XOR_ASSIGNMENT:
			case OP_LEFT_SHIFT_ASSIGNMENT:
			case DOUBLE_CURLY_INSIDE:
			case REGULAR_CHAR_INSIDE:
			case REGULAR_STRING_INSIDE:
			case DOUBLE_QUOTE_INSIDE:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<Left_shiftContext> left_shift() {
			return getRuleContexts(Left_shiftContext.class);
		}
		public Left_shiftContext left_shift(int i) {
			return getRuleContext(Left_shiftContext.class,i);
		}
		public List<Right_shiftContext> right_shift() {
			return getRuleContexts(Right_shiftContext.class);
		}
		public Right_shiftContext right_shift(int i) {
			return getRuleContext(Right_shiftContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			additive_expression();
			setState(1155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1149);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
						{
						setState(1147);
						left_shift();
						}
						break;
					case GT:
						{
						setState(1148);
						right_shift();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1151);
					additive_expression();
					}
					} 
				}
				setState(1157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Left_shiftContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(NebulaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(NebulaParser.LT, i);
		}
		public Left_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterLeft_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitLeft_shift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitLeft_shift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_shiftContext left_shift() throws RecognitionException {
		Left_shiftContext _localctx = new Left_shiftContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_left_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(LT);
			setState(1159);
			match(LT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Right_shiftContext extends ParserRuleContext {
		public List<TerminalNode> GT() { return getTokens(NebulaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(NebulaParser.GT, i);
		}
		public Right_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterRight_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitRight_shift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitRight_shift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_shiftContext right_shift() throws RecognitionException {
		Right_shiftContext _localctx = new Right_shiftContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(GT);
			setState(1162);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(NebulaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(NebulaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(NebulaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(NebulaParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			multiplicative_expression();
			setState(1169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1165);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1166);
					multiplicative_expression();
					}
					} 
				}
				setState(1171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Exponentiation_expressionContext> exponentiation_expression() {
			return getRuleContexts(Exponentiation_expressionContext.class);
		}
		public Exponentiation_expressionContext exponentiation_expression(int i) {
			return getRuleContext(Exponentiation_expressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(NebulaParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(NebulaParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(NebulaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(NebulaParser.DIV, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(NebulaParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(NebulaParser.PERCENT, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			exponentiation_expression();
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 13L) != 0)) {
				{
				{
				setState(1173);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 13L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1174);
				exponentiation_expression();
				}
				}
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exponentiation_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode POW() { return getToken(NebulaParser.POW, 0); }
		public Exponentiation_expressionContext exponentiation_expression() {
			return getRuleContext(Exponentiation_expressionContext.class,0);
		}
		public Exponentiation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentiation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterExponentiation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitExponentiation_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitExponentiation_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exponentiation_expressionContext exponentiation_expression() throws RecognitionException {
		Exponentiation_expressionContext _localctx = new Exponentiation_expressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_exponentiation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			unary_expression();
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(1181);
				match(POW);
				setState(1182);
				exponentiation_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(NebulaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NebulaParser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(NebulaParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(NebulaParser.TILDE, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_unary_expression);
		int _la;
		try {
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				cast_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				_la = _input.LA(1);
				if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1539L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1187);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
				primary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cast_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_cast_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(OPEN_PARENS);
			setState(1192);
			type();
			setState(1193);
			match(CLOSE_PARENS);
			setState(1194);
			unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<Postfix_operatorContext> postfix_operator() {
			return getRuleContexts(Postfix_operatorContext.class);
		}
		public Postfix_operatorContext postfix_operator(int i) {
			return getRuleContext(Postfix_operatorContext.class,i);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_primary_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			primary_expression_start();
			setState(1200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1197);
					postfix_operator();
					}
					} 
				}
				setState(1202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primary_expression_startContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Tuple_literalContext tuple_literal() {
			return getRuleContext(Tuple_literalContext.class,0);
		}
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public Match_expressionContext match_expression() {
			return getRuleContext(Match_expressionContext.class,0);
		}
		public Expression_blockContext expression_block() {
			return getRuleContext(Expression_blockContext.class,0);
		}
		public TerminalNode THIS() { return getToken(NebulaParser.THIS, 0); }
		public TerminalNode NONE() { return getToken(NebulaParser.NONE, 0); }
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Primary_expression_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterPrimary_expression_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitPrimary_expression_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitPrimary_expression_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expression_startContext primary_expression_start() throws RecognitionException {
		Primary_expression_startContext _localctx = new Primary_expression_startContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_primary_expression_start);
		try {
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1204);
				parenthesized_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1205);
				tuple_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1206);
				if_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1207);
				match_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1208);
				expression_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1209);
				match(THIS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1210);
				match(NONE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1211);
				array_literal();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1212);
				new_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1213);
				match(IDENTIFIER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1214);
				qualified_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Postfix_operatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(NebulaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(NebulaParser.INTEGER_LITERAL, 0); }
		public TerminalNode OP_OPTIONAL_CHAIN() { return getToken(NebulaParser.OP_OPTIONAL_CHAIN, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(NebulaParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(NebulaParser.CLOSE_BRACKET, 0); }
		public TerminalNode OP_INC() { return getToken(NebulaParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(NebulaParser.OP_DEC, 0); }
		public TerminalNode BANG() { return getToken(NebulaParser.BANG, 0); }
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterPostfix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitPostfix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitPostfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_postfix_operator);
		int _la;
		try {
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				match(DOT);
				setState(1218);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				match(DOT);
				setState(1220);
				match(INTEGER_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1221);
				match(OP_OPTIONAL_CHAIN);
				setState(1222);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1223);
				match(OP_OPTIONAL_CHAIN);
				setState(1224);
				match(OPEN_PARENS);
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
					{
					setState(1225);
					argument_list();
					}
				}

				setState(1228);
				match(CLOSE_PARENS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1229);
				match(OPEN_PARENS);
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
					{
					setState(1230);
					argument_list();
					}
				}

				setState(1233);
				match(CLOSE_PARENS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1234);
				match(OPEN_BRACKET);
				setState(1235);
				expression_list();
				setState(1236);
				match(CLOSE_BRACKET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1238);
				match(OP_INC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1239);
				match(OP_DEC);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1240);
				match(BANG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(NebulaParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(NebulaParser.CLOSE_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(OPEN_BRACKET);
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(1244);
				expression_list();
				}
			}

			setState(1247);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			expression();
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1250);
				match(COMMA);
				setState(1251);
				expression();
				}
				}
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			match(OPEN_PARENS);
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(1258);
				argument_list();
				}
			}

			setState(1261);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			argument();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1264);
				match(COMMA);
				setState(1265);
				argument();
				}
				}
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(IDENTIFIER);
			setState(1272);
			match(COLON);
			setState(1273);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PositionalArgumentContext extends ParserRuleContext {
		public NonAssignmentExpressionContext nonAssignmentExpression() {
			return getRuleContext(NonAssignmentExpressionContext.class,0);
		}
		public PositionalArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionalArgumentContext positionalArgument() throws RecognitionException {
		PositionalArgumentContext _localctx = new PositionalArgumentContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_positionalArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			nonAssignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public NamedArgumentContext namedArgument() {
			return getRuleContext(NamedArgumentContext.class,0);
		}
		public PositionalArgumentContext positionalArgument() {
			return getRuleContext(PositionalArgumentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_argument);
		try {
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				namedArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				positionalArgument();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(NebulaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(NebulaParser.FALSE, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(NebulaParser.INTEGER_LITERAL, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(NebulaParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode BIN_INTEGER_LITERAL() { return getToken(NebulaParser.BIN_INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(NebulaParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(NebulaParser.CHARACTER_LITERAL, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode LITERAL_ACCESS() { return getToken(NebulaParser.LITERAL_ACCESS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_literal);
		try {
			setState(1290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				match(FALSE);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1283);
				match(INTEGER_LITERAL);
				}
				break;
			case HEX_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1284);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case BIN_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1285);
				match(BIN_INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1286);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1287);
				match(CHARACTER_LITERAL);
				}
				break;
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 8);
				{
				setState(1288);
				string_literal();
				}
				break;
			case LITERAL_ACCESS:
				enterOuterAlt(_localctx, 9);
				{
				setState(1289);
				match(LITERAL_ACCESS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode REGULAR_STRING() { return getToken(NebulaParser.REGULAR_STRING, 0); }
		public TerminalNode VERBATIUM_STRING() { return getToken(NebulaParser.VERBATIUM_STRING, 0); }
		public Interpolated_regular_stringContext interpolated_regular_string() {
			return getRuleContext(Interpolated_regular_stringContext.class,0);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_string_literal);
		try {
			setState(1295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1292);
				match(REGULAR_STRING);
				}
				break;
			case VERBATIUM_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				match(VERBATIUM_STRING);
				}
				break;
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(1294);
				interpolated_regular_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interpolated_regular_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_REGULAR_STRING_START() { return getToken(NebulaParser.INTERPOLATED_REGULAR_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(NebulaParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_regular_string_partContext> interpolated_regular_string_part() {
			return getRuleContexts(Interpolated_regular_string_partContext.class);
		}
		public Interpolated_regular_string_partContext interpolated_regular_string_part(int i) {
			return getRuleContext(Interpolated_regular_string_partContext.class,i);
		}
		public Interpolated_regular_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterInterpolated_regular_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitInterpolated_regular_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitInterpolated_regular_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_regular_stringContext interpolated_regular_string() throws RecognitionException {
		Interpolated_regular_stringContext _localctx = new Interpolated_regular_stringContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_interpolated_regular_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(INTERPOLATED_REGULAR_STRING_START);
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & -3458764507365463041L) != 0)) {
				{
				{
				setState(1298);
				interpolated_regular_string_part();
				}
				}
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1304);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interpolated_regular_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(NebulaParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode REGULAR_CHAR_INSIDE() { return getToken(NebulaParser.REGULAR_CHAR_INSIDE, 0); }
		public TerminalNode REGULAR_STRING_INSIDE() { return getToken(NebulaParser.REGULAR_STRING_INSIDE, 0); }
		public Interpolated_regular_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterInterpolated_regular_string_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitInterpolated_regular_string_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitInterpolated_regular_string_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_regular_string_partContext interpolated_regular_string_part() throws RecognitionException {
		Interpolated_regular_string_partContext _localctx = new Interpolated_regular_string_partContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_interpolated_regular_string_part);
		try {
			setState(1310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case IF:
			case NONE:
			case NEW:
			case MATCH:
			case THIS:
			case TRUE:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case OPEN_BRACE:
			case OPEN_BRACKET:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case BANG:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1306);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1307);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case REGULAR_CHAR_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1308);
				match(REGULAR_CHAR_INSIDE);
				}
				break;
			case REGULAR_STRING_INSIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1309);
				match(REGULAR_STRING_INSIDE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Interpolated_string_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public List<TerminalNode> FORMAT_STRING() { return getTokens(NebulaParser.FORMAT_STRING); }
		public TerminalNode FORMAT_STRING(int i) {
			return getToken(NebulaParser.FORMAT_STRING, i);
		}
		public Interpolated_string_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterInterpolated_string_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitInterpolated_string_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitInterpolated_string_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_string_expressionContext interpolated_string_expression() throws RecognitionException {
		Interpolated_string_expressionContext _localctx = new Interpolated_string_expressionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_interpolated_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			expression();
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1313);
				match(COMMA);
				setState(1314);
				expression();
				}
				}
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1320);
				match(COLON);
				setState(1322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1321);
					match(FORMAT_STRING);
					}
					}
					setState(1324); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FORMAT_STRING );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return tag_expression_sempred((Tag_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tag_expression_sempred(Tag_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u008c\u0531\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0001\u0000\u0005"+
		"\u0000\u0114\b\u0000\n\u0000\f\u0000\u0117\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u0120\b\u0001\n\u0001\f\u0001\u0123\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u012c"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0133\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0138"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u013e"+
		"\b\u0005\n\u0005\f\u0005\u0141\t\u0005\u0001\u0005\u0003\u0005\u0144\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0148\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u014c\b\u0006\u0001\u0006\u0003\u0006\u014f\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u0155\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0166\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u016b\b\n\n\n\f\n\u016e\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0178\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0180\b\u000b\n\u000b\f\u000b\u0183"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0189\b\f\n\f\f\f\u018c"+
		"\t\f\u0001\f\u0001\f\u0003\f\u0190\b\f\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u0195\b\r\n\r\f\r\u0198\t\r\u0001\u000e\u0005\u000e\u019b\b\u000e\n\u000e"+
		"\f\u000e\u019e\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01a8\b\u000f"+
		"\n\u000f\f\u000f\u01ab\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01bb"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u01ca\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d8\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0005\u0017\u01e1\b\u0017\n\u0017\f\u0017\u01e4\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01f3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01fc\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0202\b\u001d\u0001\u001d"+
		"\u0003\u001d\u0205\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0209\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u020f"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0003\"\u021e\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u0227\b#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0005$\u022f\b$\n$\f$\u0232\t$\u0001$\u0003"+
		"$\u0235\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u0242\b\'\n\'\f\'\u0245\t\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u024d\b(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0005*\u0257\b*\n*\f*\u025a\t*\u0001+\u0001+\u0001"+
		"+\u0001+\u0004+\u0260\b+\u000b+\f+\u0261\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u026e\b-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0005.\u0275\b.\n.\f.\u0278\t.\u0001/\u0005/\u027b\b/"+
		"\n/\f/\u027e\t/\u0001/\u0001/\u0001/\u00010\u00010\u00030\u0285\b0\u0001"+
		"0\u00030\u0288\b0\u00010\u00010\u00030\u028c\b0\u00010\u00010\u00010\u0001"+
		"1\u00011\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00054\u029a"+
		"\b4\n4\f4\u029d\t4\u00015\u00055\u02a0\b5\n5\f5\u02a3\t5\u00015\u0001"+
		"5\u00016\u00016\u00016\u00056\u02aa\b6\n6\f6\u02ad\t6\u00017\u00017\u0001"+
		"7\u00037\u02b2\b7\u00018\u00058\u02b5\b8\n8\f8\u02b8\t8\u00018\u00018"+
		"\u00018\u00018\u00038\u02be\b8\u00018\u00018\u00018\u00019\u00059\u02c4"+
		"\b9\n9\f9\u02c7\t9\u00019\u00039\u02ca\b9\u00019\u00019\u00019\u00019"+
		"\u0001:\u0001:\u0003:\u02d2\b:\u0001:\u0001:\u0001;\u0001;\u0001;\u0005"+
		";\u02d9\b;\n;\f;\u02dc\t;\u0001<\u0003<\u02df\b<\u0001<\u0001<\u0001<"+
		"\u0001<\u0003<\u02e5\b<\u0001=\u0001=\u0001=\u0001=\u0003=\u02eb\b=\u0001"+
		">\u0005>\u02ee\b>\n>\f>\u02f1\t>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003"+
		"?\u030c\b?\u0001@\u0005@\u030f\b@\n@\f@\u0312\t@\u0001@\u0001@\u0001@"+
		"\u0003@\u0317\b@\u0001@\u0003@\u031a\b@\u0001@\u0001@\u0001A\u0001A\u0005"+
		"A\u0320\bA\nA\fA\u0323\tA\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0003"+
		"B\u032b\bB\u0001C\u0005C\u032e\bC\nC\fC\u0331\tC\u0001C\u0001C\u0001C"+
		"\u0003C\u0336\bC\u0001C\u0003C\u0339\bC\u0001C\u0001C\u0001D\u0001D\u0005"+
		"D\u033f\bD\nD\fD\u0342\tD\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0003"+
		"E\u034a\bE\u0001F\u0001F\u0001F\u0001F\u0005F\u0350\bF\nF\fF\u0353\tF"+
		"\u0001G\u0005G\u0356\bG\nG\fG\u0359\tG\u0001G\u0001G\u0001G\u0003G\u035e"+
		"\bG\u0001G\u0001G\u0001H\u0001H\u0003H\u0364\bH\u0001I\u0001I\u0005I\u0368"+
		"\bI\nI\fI\u036b\tI\u0001I\u0001I\u0001J\u0001J\u0001K\u0005K\u0372\bK"+
		"\nK\fK\u0375\tK\u0001K\u0003K\u0378\bK\u0001K\u0001K\u0001K\u0003K\u037d"+
		"\bK\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0005L\u0385\bL\nL\fL\u0388"+
		"\tL\u0001L\u0003L\u038b\bL\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001"+
		"N\u0001N\u0003N\u0395\bN\u0001O\u0005O\u0398\bO\nO\fO\u039b\tO\u0001O"+
		"\u0001O\u0001O\u0001O\u0001O\u0001O\u0005O\u03a3\bO\nO\fO\u03a6\tO\u0001"+
		"O\u0001O\u0003O\u03aa\bO\u0001P\u0001P\u0005P\u03ae\bP\nP\fP\u03b1\tP"+
		"\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0003R\u03b9\bR\u0001S\u0001"+
		"S\u0003S\u03bd\bS\u0001S\u0001S\u0005S\u03c1\bS\nS\fS\u03c4\tS\u0001T"+
		"\u0001T\u0003T\u03c8\bT\u0001U\u0001U\u0001U\u0003U\u03cd\bU\u0001V\u0001"+
		"V\u0001V\u0001V\u0005V\u03d3\bV\nV\fV\u03d6\tV\u0001V\u0001V\u0001W\u0001"+
		"W\u0003W\u03dc\bW\u0001X\u0001X\u0003X\u03e0\bX\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0003Y\u03e6\bY\u0001Z\u0001Z\u0003Z\u03ea\bZ\u0001[\u0001[\u0001\\"+
		"\u0001\\\u0001]\u0001]\u0003]\u03f2\b]\u0001]\u0005]\u03f5\b]\n]\f]\u03f8"+
		"\t]\u0001]\u0001]\u0001^\u0001^\u0001^\u0003^\u03ff\b^\u0001_\u0001_\u0001"+
		"`\u0001`\u0001`\u0001`\u0005`\u0407\b`\n`\f`\u040a\t`\u0001`\u0001`\u0001"+
		"a\u0001a\u0001a\u0001a\u0005a\u0412\ba\na\fa\u0415\ta\u0001a\u0001a\u0001"+
		"b\u0001b\u0001b\u0003b\u041c\bb\u0001c\u0001c\u0001c\u0001c\u0004c\u0422"+
		"\bc\u000bc\fc\u0423\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001e\u0001"+
		"e\u0001f\u0001f\u0001g\u0001g\u0001g\u0001g\u0003g\u0434\bg\u0001h\u0001"+
		"h\u0001h\u0003h\u0439\bh\u0001i\u0001i\u0001i\u0001i\u0001j\u0001j\u0001"+
		"k\u0001k\u0001k\u0005k\u0444\bk\nk\fk\u0447\tk\u0001l\u0001l\u0001l\u0005"+
		"l\u044c\bl\nl\fl\u044f\tl\u0001m\u0001m\u0001m\u0005m\u0454\bm\nm\fm\u0457"+
		"\tm\u0001n\u0001n\u0001n\u0005n\u045c\bn\nn\fn\u045f\tn\u0001o\u0001o"+
		"\u0001o\u0005o\u0464\bo\no\fo\u0467\to\u0001p\u0001p\u0001p\u0005p\u046c"+
		"\bp\np\fp\u046f\tp\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0003q\u0477"+
		"\bq\u0003q\u0479\bq\u0001r\u0001r\u0001r\u0003r\u047e\br\u0001r\u0001"+
		"r\u0005r\u0482\br\nr\fr\u0485\tr\u0001s\u0001s\u0001s\u0001t\u0001t\u0001"+
		"t\u0001u\u0001u\u0001u\u0005u\u0490\bu\nu\fu\u0493\tu\u0001v\u0001v\u0001"+
		"v\u0005v\u0498\bv\nv\fv\u049b\tv\u0001w\u0001w\u0001w\u0003w\u04a0\bw"+
		"\u0001x\u0001x\u0001x\u0001x\u0003x\u04a6\bx\u0001y\u0001y\u0001y\u0001"+
		"y\u0001y\u0001z\u0001z\u0005z\u04af\bz\nz\fz\u04b2\tz\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0003"+
		"{\u04c0\b{\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0003|\u04cb\b|\u0001|\u0001|\u0001|\u0003|\u04d0\b|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0003|\u04da\b|\u0001}\u0001}\u0003"+
		"}\u04de\b}\u0001}\u0001}\u0001~\u0001~\u0001~\u0005~\u04e5\b~\n~\f~\u04e8"+
		"\t~\u0001\u007f\u0001\u007f\u0003\u007f\u04ec\b\u007f\u0001\u007f\u0001"+
		"\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u04f3\b\u0080\n"+
		"\u0080\f\u0080\u04f6\t\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001"+
		"\u0081\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083\u0003\u0083\u0500"+
		"\b\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u050b\b\u0084\u0001"+
		"\u0085\u0001\u0085\u0001\u0085\u0003\u0085\u0510\b\u0085\u0001\u0086\u0001"+
		"\u0086\u0005\u0086\u0514\b\u0086\n\u0086\f\u0086\u0517\t\u0086\u0001\u0086"+
		"\u0001\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0003\u0087"+
		"\u051f\b\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0005\u0088\u0524\b"+
		"\u0088\n\u0088\f\u0088\u0527\t\u0088\u0001\u0088\u0001\u0088\u0004\u0088"+
		"\u052b\b\u0088\u000b\u0088\f\u0088\u052c\u0003\u0088\u052f\b\u0088\u0001"+
		"\u0088\u0000\u0001\u0016\u0089\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0000\f\u0002\u0000XXZZ\u0001\u0000FG\u0001"+
		"\u0000/1\u0002\u0000\u0014\u0014&\'\u0002\u0000\u001f\"<?\u0002\u0000"+
		"\u0012\u0012\u0019\u001a\u0002\u0000iiw\u0080\u0001\u0000st\u0002\u0000"+
		"jkuv\u0001\u0000]^\u0002\u0000__ab\u0002\u0000]^fg\u057d\u0000\u0115\u0001"+
		"\u0000\u0000\u0000\u0002\u011a\u0001\u0000\u0000\u0000\u0004\u0126\u0001"+
		"\u0000\u0000\u0000\u0006\u0128\u0001\u0000\u0000\u0000\b\u0132\u0001\u0000"+
		"\u0000\u0000\n\u0147\u0001\u0000\u0000\u0000\f\u014e\u0001\u0000\u0000"+
		"\u0000\u000e\u0150\u0001\u0000\u0000\u0000\u0010\u0154\u0001\u0000\u0000"+
		"\u0000\u0012\u0165\u0001\u0000\u0000\u0000\u0014\u0167\u0001\u0000\u0000"+
		"\u0000\u0016\u0177\u0001\u0000\u0000\u0000\u0018\u0184\u0001\u0000\u0000"+
		"\u0000\u001a\u0191\u0001\u0000\u0000\u0000\u001c\u019c\u0001\u0000\u0000"+
		"\u0000\u001e\u01a3\u0001\u0000\u0000\u0000 \u01ba\u0001\u0000\u0000\u0000"+
		"\"\u01c9\u0001\u0000\u0000\u0000$\u01cb\u0001\u0000\u0000\u0000&\u01ce"+
		"\u0001\u0000\u0000\u0000(\u01d1\u0001\u0000\u0000\u0000*\u01d4\u0001\u0000"+
		"\u0000\u0000,\u01db\u0001\u0000\u0000\u0000.\u01e2\u0001\u0000\u0000\u0000"+
		"0\u01e5\u0001\u0000\u0000\u00002\u01e7\u0001\u0000\u0000\u00004\u01ed"+
		"\u0001\u0000\u0000\u00006\u01f4\u0001\u0000\u0000\u00008\u01f8\u0001\u0000"+
		"\u0000\u0000:\u01ff\u0001\u0000\u0000\u0000<\u020e\u0001\u0000\u0000\u0000"+
		">\u0210\u0001\u0000\u0000\u0000@\u0212\u0001\u0000\u0000\u0000B\u0216"+
		"\u0001\u0000\u0000\u0000D\u021a\u0001\u0000\u0000\u0000F\u0224\u0001\u0000"+
		"\u0000\u0000H\u022a\u0001\u0000\u0000\u0000J\u0238\u0001\u0000\u0000\u0000"+
		"L\u023c\u0001\u0000\u0000\u0000N\u023e\u0001\u0000\u0000\u0000P\u024c"+
		"\u0001\u0000\u0000\u0000R\u024e\u0001\u0000\u0000\u0000T\u0253\u0001\u0000"+
		"\u0000\u0000V\u025b\u0001\u0000\u0000\u0000X\u0265\u0001\u0000\u0000\u0000"+
		"Z\u0269\u0001\u0000\u0000\u0000\\\u0271\u0001\u0000\u0000\u0000^\u027c"+
		"\u0001\u0000\u0000\u0000`\u0282\u0001\u0000\u0000\u0000b\u0290\u0001\u0000"+
		"\u0000\u0000d\u0292\u0001\u0000\u0000\u0000f\u0294\u0001\u0000\u0000\u0000"+
		"h\u029b\u0001\u0000\u0000\u0000j\u02a1\u0001\u0000\u0000\u0000l\u02a6"+
		"\u0001\u0000\u0000\u0000n\u02ae\u0001\u0000\u0000\u0000p\u02b6\u0001\u0000"+
		"\u0000\u0000r\u02c5\u0001\u0000\u0000\u0000t\u02cf\u0001\u0000\u0000\u0000"+
		"v\u02d5\u0001\u0000\u0000\u0000x\u02de\u0001\u0000\u0000\u0000z\u02ea"+
		"\u0001\u0000\u0000\u0000|\u02ef\u0001\u0000\u0000\u0000~\u030b\u0001\u0000"+
		"\u0000\u0000\u0080\u0310\u0001\u0000\u0000\u0000\u0082\u031d\u0001\u0000"+
		"\u0000\u0000\u0084\u032a\u0001\u0000\u0000\u0000\u0086\u032f\u0001\u0000"+
		"\u0000\u0000\u0088\u033c\u0001\u0000\u0000\u0000\u008a\u0349\u0001\u0000"+
		"\u0000\u0000\u008c\u034b\u0001\u0000\u0000\u0000\u008e\u0357\u0001\u0000"+
		"\u0000\u0000\u0090\u0363\u0001\u0000\u0000\u0000\u0092\u0365\u0001\u0000"+
		"\u0000\u0000\u0094\u036e\u0001\u0000\u0000\u0000\u0096\u0373\u0001\u0000"+
		"\u0000\u0000\u0098\u0380\u0001\u0000\u0000\u0000\u009a\u038e\u0001\u0000"+
		"\u0000\u0000\u009c\u0392\u0001\u0000\u0000\u0000\u009e\u0399\u0001\u0000"+
		"\u0000\u0000\u00a0\u03ab\u0001\u0000\u0000\u0000\u00a2\u03b4\u0001\u0000"+
		"\u0000\u0000\u00a4\u03b8\u0001\u0000\u0000\u0000\u00a6\u03bc\u0001\u0000"+
		"\u0000\u0000\u00a8\u03c7\u0001\u0000\u0000\u0000\u00aa\u03cc\u0001\u0000"+
		"\u0000\u0000\u00ac\u03ce\u0001\u0000\u0000\u0000\u00ae\u03d9\u0001\u0000"+
		"\u0000\u0000\u00b0\u03dd\u0001\u0000\u0000\u0000\u00b2\u03e5\u0001\u0000"+
		"\u0000\u0000\u00b4\u03e9\u0001\u0000\u0000\u0000\u00b6\u03eb\u0001\u0000"+
		"\u0000\u0000\u00b8\u03ed\u0001\u0000\u0000\u0000\u00ba\u03ef\u0001\u0000"+
		"\u0000\u0000\u00bc\u03fb\u0001\u0000\u0000\u0000\u00be\u0400\u0001\u0000"+
		"\u0000\u0000\u00c0\u0402\u0001\u0000\u0000\u0000\u00c2\u040d\u0001\u0000"+
		"\u0000\u0000\u00c4\u041b\u0001\u0000\u0000\u0000\u00c6\u041d\u0001\u0000"+
		"\u0000\u0000\u00c8\u0427\u0001\u0000\u0000\u0000\u00ca\u042b\u0001\u0000"+
		"\u0000\u0000\u00cc\u042d\u0001\u0000\u0000\u0000\u00ce\u042f\u0001\u0000"+
		"\u0000\u0000\u00d0\u0435\u0001\u0000\u0000\u0000\u00d2\u043a\u0001\u0000"+
		"\u0000\u0000\u00d4\u043e\u0001\u0000\u0000\u0000\u00d6\u0440\u0001\u0000"+
		"\u0000\u0000\u00d8\u0448\u0001\u0000\u0000\u0000\u00da\u0450\u0001\u0000"+
		"\u0000\u0000\u00dc\u0458\u0001\u0000\u0000\u0000\u00de\u0460\u0001\u0000"+
		"\u0000\u0000\u00e0\u0468\u0001\u0000\u0000\u0000\u00e2\u0470\u0001\u0000"+
		"\u0000\u0000\u00e4\u047a\u0001\u0000\u0000\u0000\u00e6\u0486\u0001\u0000"+
		"\u0000\u0000\u00e8\u0489\u0001\u0000\u0000\u0000\u00ea\u048c\u0001\u0000"+
		"\u0000\u0000\u00ec\u0494\u0001\u0000\u0000\u0000\u00ee\u049c\u0001\u0000"+
		"\u0000\u0000\u00f0\u04a5\u0001\u0000\u0000\u0000\u00f2\u04a7\u0001\u0000"+
		"\u0000\u0000\u00f4\u04ac\u0001\u0000\u0000\u0000\u00f6\u04bf\u0001\u0000"+
		"\u0000\u0000\u00f8\u04d9\u0001\u0000\u0000\u0000\u00fa\u04db\u0001\u0000"+
		"\u0000\u0000\u00fc\u04e1\u0001\u0000\u0000\u0000\u00fe\u04e9\u0001\u0000"+
		"\u0000\u0000\u0100\u04ef\u0001\u0000\u0000\u0000\u0102\u04f7\u0001\u0000"+
		"\u0000\u0000\u0104\u04fb\u0001\u0000\u0000\u0000\u0106\u04ff\u0001\u0000"+
		"\u0000\u0000\u0108\u050a\u0001\u0000\u0000\u0000\u010a\u050f\u0001\u0000"+
		"\u0000\u0000\u010c\u0511\u0001\u0000\u0000\u0000\u010e\u051e\u0001\u0000"+
		"\u0000\u0000\u0110\u0520\u0001\u0000\u0000\u0000\u0112\u0114\u0003 \u0010"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0005\u0000\u0000\u0001\u0119\u0001\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0003h4\u0000\u011b\u011c\u0005\u0017\u0000\u0000\u011c"+
		"\u011d\u0005N\u0000\u0000\u011d\u0121\u0005R\u0000\u0000\u011e\u0120\u0003"+
		"\u0004\u0002\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001"+
		"\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0005S\u0000\u0000\u0125\u0003\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0003p8\u0000\u0127\u0005\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0005A\u0000\u0000\u0129\u012b\u0003\u001a\r\u0000\u012a"+
		"\u012c\u0003\b\u0004\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005\\\u0000\u0000\u012e\u0007\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"Z\u0000\u0000\u0130\u0133\u0003\n\u0005\u0000\u0131\u0133\u0003\u000e"+
		"\u0007\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000"+
		"\u0000\u0000\u0133\t\u0001\u0000\u0000\u0000\u0134\u0148\u0005_\u0000"+
		"\u0000\u0135\u0137\u0005G\u0000\u0000\u0136\u0138\u0003\u000e\u0007\u0000"+
		"\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u0148\u0001\u0000\u0000\u0000\u0139\u013a\u0005R\u0000\u0000\u013a"+
		"\u013f\u0003\f\u0006\u0000\u013b\u013c\u0005Y\u0000\u0000\u013c\u013e"+
		"\u0003\f\u0006\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0141\u0001"+
		"\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0142\u0144\u0005Y\u0000\u0000\u0143\u0142\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005S\u0000\u0000\u0146\u0148\u0001\u0000\u0000"+
		"\u0000\u0147\u0134\u0001\u0000\u0000\u0000\u0147\u0135\u0001\u0000\u0000"+
		"\u0000\u0147\u0139\u0001\u0000\u0000\u0000\u0148\u000b\u0001\u0000\u0000"+
		"\u0000\u0149\u014b\u0005G\u0000\u0000\u014a\u014c\u0003\u000e\u0007\u0000"+
		"\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014f\u0005_\u0000\u0000\u014e"+
		"\u0149\u0001\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\r\u0001\u0000\u0000\u0000\u0150\u0151\u0005\b\u0000\u0000\u0151\u0152"+
		"\u0005G\u0000\u0000\u0152\u000f\u0001\u0000\u0000\u0000\u0153\u0155\u0003"+
		"b1\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u00057\u0000\u0000"+
		"\u0157\u0158\u0003\u0012\t\u0000\u0158\u0159\u0005\b\u0000\u0000\u0159"+
		"\u015a\u0005G\u0000\u0000\u015a\u015b\u0005\\\u0000\u0000\u015b\u0011"+
		"\u0001\u0000\u0000\u0000\u015c\u0166\u0003\u00a6S\u0000\u015d\u015e\u0005"+
		"R\u0000\u0000\u015e\u015f\u0003\u0014\n\u0000\u015f\u0160\u0005S\u0000"+
		"\u0000\u0160\u0166\u0001\u0000\u0000\u0000\u0161\u0162\u0005R\u0000\u0000"+
		"\u0162\u0163\u0003\u0016\u000b\u0000\u0163\u0164\u0005S\u0000\u0000\u0164"+
		"\u0166\u0001\u0000\u0000\u0000\u0165\u015c\u0001\u0000\u0000\u0000\u0165"+
		"\u015d\u0001\u0000\u0000\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0166"+
		"\u0013\u0001\u0000\u0000\u0000\u0167\u016c\u0003\u00a6S\u0000\u0168\u0169"+
		"\u0005Y\u0000\u0000\u0169\u016b\u0003\u00a6S\u0000\u016a\u0168\u0001\u0000"+
		"\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u0015\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0170\u0006\u000b"+
		"\uffff\uffff\u0000\u0170\u0171\u0005V\u0000\u0000\u0171\u0172\u0003\u0016"+
		"\u000b\u0000\u0172\u0173\u0005W\u0000\u0000\u0173\u0178\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005f\u0000\u0000\u0175\u0178\u0003\u0016\u000b\u0004"+
		"\u0176\u0178\u0003\u00a6S\u0000\u0177\u016f\u0001\u0000\u0000\u0000\u0177"+
		"\u0174\u0001\u0000\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178"+
		"\u0181\u0001\u0000\u0000\u0000\u0179\u017a\n\u0003\u0000\u0000\u017a\u017b"+
		"\u0005c\u0000\u0000\u017b\u0180\u0003\u0016\u000b\u0004\u017c\u017d\n"+
		"\u0002\u0000\u0000\u017d\u017e\u0005d\u0000\u0000\u017e\u0180\u0003\u0016"+
		"\u000b\u0003\u017f\u0179\u0001\u0000\u0000\u0000\u017f\u017c\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0017\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0185\u0005)\u0000"+
		"\u0000\u0185\u018f\u0003\u001a\r\u0000\u0186\u018a\u0005R\u0000\u0000"+
		"\u0187\u0189\u0003 \u0010\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189"+
		"\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c"+
		"\u018a\u0001\u0000\u0000\u0000\u018d\u0190\u0005S\u0000\u0000\u018e\u0190"+
		"\u0005\\\u0000\u0000\u018f\u0186\u0001\u0000\u0000\u0000\u018f\u018e\u0001"+
		"\u0000\u0000\u0000\u0190\u0019\u0001\u0000\u0000\u0000\u0191\u0196\u0005"+
		"G\u0000\u0000\u0192\u0193\u0007\u0000\u0000\u0000\u0193\u0195\u0005G\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u001b\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000"+
		"\u0000\u0199\u019b\u0003Z-\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b"+
		"\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0016\u0000\u0000\u01a0"+
		"\u01a1\u0005G\u0000\u0000\u01a1\u01a2\u0003\u001e\u000f\u0000\u01a2\u001d"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005R\u0000\u0000\u01a4\u01a9\u0005"+
		"G\u0000\u0000\u01a5\u01a6\u0005Y\u0000\u0000\u01a6\u01a8\u0005G\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0005S\u0000\u0000\u01ad\u001f\u0001\u0000\u0000\u0000"+
		"\u01ae\u01bb\u0003\u0006\u0003\u0000\u01af\u01bb\u0003\u0010\b\u0000\u01b0"+
		"\u01bb\u0003\u001c\u000e\u0000\u01b1\u01bb\u0003^/\u0000\u01b2\u01bb\u0003"+
		"p8\u0000\u01b3\u01bb\u0003\u0080@\u0000\u01b4\u01bb\u0003\u0086C\u0000"+
		"\u01b5\u01bb\u0003\u008eG\u0000\u01b6\u01bb\u0003\u009eO\u0000\u01b7\u01bb"+
		"\u0003\u0096K\u0000\u01b8\u01bb\u0003\u0018\f\u0000\u01b9\u01bb\u0003"+
		"\u0002\u0001\u0000\u01ba\u01ae\u0001\u0000\u0000\u0000\u01ba\u01af\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b0\u0001\u0000\u0000\u0000\u01ba\u01b1\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b2\u0001\u0000\u0000\u0000\u01ba\u01b3\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b4\u0001\u0000\u0000\u0000\u01ba\u01b5\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b6\u0001\u0000\u0000\u0000\u01ba\u01b7\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb!\u0001\u0000\u0000\u0000\u01bc\u01ca\u0003\u0006"+
		"\u0003\u0000\u01bd\u01ca\u0003\u0010\b\u0000\u01be\u01ca\u0003^/\u0000"+
		"\u01bf\u01ca\u0003`0\u0000\u01c0\u01ca\u0003,\u0016\u0000\u01c1\u01ca"+
		"\u00034\u001a\u0000\u01c2\u01ca\u00038\u001c\u0000\u01c3\u01ca\u0003@"+
		" \u0000\u01c4\u01ca\u0003B!\u0000\u01c5\u01ca\u0003F#\u0000\u01c6\u01ca"+
		"\u0003$\u0012\u0000\u01c7\u01ca\u0003&\u0013\u0000\u01c8\u01ca\u0003("+
		"\u0014\u0000\u01c9\u01bc\u0001\u0000\u0000\u0000\u01c9\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c9\u01be\u0001\u0000\u0000\u0000\u01c9\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c0\u0001\u0000\u0000\u0000\u01c9\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c2\u0001\u0000\u0000\u0000\u01c9\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c4\u0001\u0000\u0000\u0000\u01c9\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca#\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0005\f\u0000\u0000\u01cc\u01cd\u0005\\\u0000\u0000"+
		"\u01cd%\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005\u0011\u0000\u0000\u01cf"+
		"\u01d0\u0005\\\u0000\u0000\u01d0\'\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0003\u00ccf\u0000\u01d2\u01d3\u0005\\\u0000\u0000\u01d3)\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0005R\u0000\u0000\u01d5\u01d7\u0003.\u0017\u0000"+
		"\u01d6\u01d8\u00030\u0018\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0005S\u0000\u0000\u01da+\u0001\u0000\u0000\u0000\u01db\u01dc\u0005"+
		"R\u0000\u0000\u01dc\u01dd\u0003.\u0017\u0000\u01dd\u01de\u0005S\u0000"+
		"\u0000\u01de-\u0001\u0000\u0000\u0000\u01df\u01e1\u0003\"\u0011\u0000"+
		"\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e3/\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0003\u00ccf\u0000\u01e61\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005"+
		"\u001d\u0000\u0000\u01e8\u01e9\u0003\u00c8d\u0000\u01e9\u01ea\u0003*\u0015"+
		"\u0000\u01ea\u01eb\u0005\u0015\u0000\u0000\u01eb\u01ec\u0003*\u0015\u0000"+
		"\u01ec3\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005\u001d\u0000\u0000\u01ee"+
		"\u01ef\u0003\u00c8d\u0000\u01ef\u01f2\u0003\"\u0011\u0000\u01f0\u01f1"+
		"\u0005\u0015\u0000\u0000\u01f1\u01f3\u0003\"\u0011\u0000\u01f2\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f35\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0005,\u0000\u0000\u01f5\u01f6\u0003\u00c8d\u0000"+
		"\u01f6\u01f7\u0003H$\u0000\u01f77\u0001\u0000\u0000\u0000\u01f8\u01fb"+
		"\u0005\u001b\u0000\u0000\u01f9\u01fc\u0003:\u001d\u0000\u01fa\u01fc\u0003"+
		"\u00c8d\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0003\"\u0011"+
		"\u0000\u01fe9\u0001\u0000\u0000\u0000\u01ff\u0201\u0005V\u0000\u0000\u0200"+
		"\u0202\u0003<\u001e\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0001\u0000\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u0205"+
		"\u0003\u00ccf\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0208\u0005"+
		"\\\u0000\u0000\u0207\u0209\u0003>\u001f\u0000\u0208\u0207\u0001\u0000"+
		"\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0005W\u0000\u0000\u020b;\u0001\u0000\u0000\u0000"+
		"\u020c\u020f\u0003`0\u0000\u020d\u020f\u0003\u00fc~\u0000\u020e\u020c"+
		"\u0001\u0000\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f=\u0001"+
		"\u0000\u0000\u0000\u0210\u0211\u0003\u00fc~\u0000\u0211?\u0001\u0000\u0000"+
		"\u0000\u0212\u0213\u0005D\u0000\u0000\u0213\u0214\u0003\u00c8d\u0000\u0214"+
		"\u0215\u0003\"\u0011\u0000\u0215A\u0001\u0000\u0000\u0000\u0216\u0217"+
		"\u0005\u001c\u0000\u0000\u0217\u0218\u0003D\"\u0000\u0218\u0219\u0003"+
		",\u0016\u0000\u0219C\u0001\u0000\u0000\u0000\u021a\u021d\u0005V\u0000"+
		"\u0000\u021b\u021e\u0005B\u0000\u0000\u021c\u021e\u0003\u00a6S\u0000\u021d"+
		"\u021b\u0001\u0000\u0000\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0005G\u0000\u0000\u0220\u0221"+
		"\u0005\u001e\u0000\u0000\u0221\u0222\u0003\u00ccf\u0000\u0222\u0223\u0005"+
		"W\u0000\u0000\u0223E\u0001\u0000\u0000\u0000\u0224\u0226\u00052\u0000"+
		"\u0000\u0225\u0227\u0003\u00ccf\u0000\u0226\u0225\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0005\\\u0000\u0000\u0229G\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0005R\u0000\u0000\u022b\u0230\u0003J%\u0000\u022c\u022d\u0005"+
		"Y\u0000\u0000\u022d\u022f\u0003J%\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000"+
		"\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u0235\u0005Y\u0000\u0000"+
		"\u0234\u0233\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0005S\u0000\u0000\u0237"+
		"I\u0001\u0000\u0000\u0000\u0238\u0239\u0003L&\u0000\u0239\u023a\u0005"+
		"\u0082\u0000\u0000\u023a\u023b\u0003\u00ccf\u0000\u023bK\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0003N\'\u0000\u023dM\u0001\u0000\u0000\u0000\u023e"+
		"\u0243\u0003P(\u0000\u023f\u0240\u0005d\u0000\u0000\u0240\u0242\u0003"+
		"P(\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242\u0245\u0001\u0000\u0000"+
		"\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000"+
		"\u0000\u0244O\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000"+
		"\u0246\u024d\u0003\u0108\u0084\u0000\u0247\u024d\u0005F\u0000\u0000\u0248"+
		"\u024d\u0003R)\u0000\u0249\u024d\u0003\u001a\r\u0000\u024a\u024d\u0003"+
		"V+\u0000\u024b\u024d\u0003X,\u0000\u024c\u0246\u0001\u0000\u0000\u0000"+
		"\u024c\u0247\u0001\u0000\u0000\u0000\u024c\u0248\u0001\u0000\u0000\u0000"+
		"\u024c\u0249\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000"+
		"\u024c\u024b\u0001\u0000\u0000\u0000\u024dQ\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0003\u001a\r\u0000\u024f\u0250\u0005V\u0000\u0000\u0250\u0251"+
		"\u0003T*\u0000\u0251\u0252\u0005W\u0000\u0000\u0252S\u0001\u0000\u0000"+
		"\u0000\u0253\u0258\u0007\u0001\u0000\u0000\u0254\u0255\u0005Y\u0000\u0000"+
		"\u0255\u0257\u0007\u0001\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000"+
		"\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0001\u0000\u0000\u0000\u0259U\u0001\u0000\u0000\u0000\u025a"+
		"\u0258\u0001\u0000\u0000\u0000\u025b\u025c\u0005V\u0000\u0000\u025c\u025f"+
		"\u0003P(\u0000\u025d\u025e\u0005Y\u0000\u0000\u025e\u0260\u0003P(\u0000"+
		"\u025f\u025d\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000"+
		"\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000"+
		"\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264\u0005W\u0000\u0000\u0264"+
		"W\u0001\u0000\u0000\u0000\u0265\u0266\u0005V\u0000\u0000\u0266\u0267\u0003"+
		"L&\u0000\u0267\u0268\u0005W\u0000\u0000\u0268Y\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0005h\u0000\u0000\u026a\u026b\u0005T\u0000\u0000\u026b\u026d"+
		"\u0003\\.\u0000\u026c\u026e\u0003\u00fe\u007f\u0000\u026d\u026c\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0005U\u0000\u0000\u0270[\u0001\u0000\u0000"+
		"\u0000\u0271\u0276\u0005G\u0000\u0000\u0272\u0273\u0005Z\u0000\u0000\u0273"+
		"\u0275\u0005G\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u0278"+
		"\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0276\u0277"+
		"\u0001\u0000\u0000\u0000\u0277]\u0001\u0000\u0000\u0000\u0278\u0276\u0001"+
		"\u0000\u0000\u0000\u0279\u027b\u0003Z-\u0000\u027a\u0279\u0001\u0000\u0000"+
		"\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027f\u0001\u0000\u0000"+
		"\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027f\u0280\u0005\u0010\u0000"+
		"\u0000\u0280\u0281\u0003`0\u0000\u0281_\u0001\u0000\u0000\u0000\u0282"+
		"\u0284\u0003h4\u0000\u0283\u0285\u0005\u0010\u0000\u0000\u0284\u0283\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0287\u0001"+
		"\u0000\u0000\u0000\u0286\u0288\u0003f3\u0000\u0287\u0286\u0001\u0000\u0000"+
		"\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000\u0000"+
		"\u0000\u0289\u028c\u0005B\u0000\u0000\u028a\u028c\u0003\u00a6S\u0000\u028b"+
		"\u0289\u0001\u0000\u0000\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0001\u0000\u0000\u0000\u028d\u028e\u0003l6\u0000\u028e\u028f\u0005"+
		"\\\u0000\u0000\u028fa\u0001\u0000\u0000\u0000\u0290\u0291\u0007\u0002"+
		"\u0000\u0000\u0291c\u0001\u0000\u0000\u0000\u0292\u0293\u0007\u0003\u0000"+
		"\u0000\u0293e\u0001\u0000\u0000\u0000\u0294\u0295\u0005(\u0000\u0000\u0295"+
		"g\u0001\u0000\u0000\u0000\u0296\u029a\u0003b1\u0000\u0297\u029a\u0005"+
		"3\u0000\u0000\u0298\u029a\u0005.\u0000\u0000\u0299\u0296\u0001\u0000\u0000"+
		"\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u0298\u0001\u0000\u0000"+
		"\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029ci\u0001\u0000\u0000\u0000"+
		"\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u02a0\u0003Z-\u0000\u029f\u029e"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1\u029f"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a5"+
		"\u0003`0\u0000\u02a5k\u0001\u0000\u0000\u0000\u02a6\u02ab\u0003n7\u0000"+
		"\u02a7\u02a8\u0005Y\u0000\u0000\u02a8\u02aa\u0003n7\u0000\u02a9\u02a7"+
		"\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab\u02a9"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02acm\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae\u02b1\u0005"+
		"G\u0000\u0000\u02af\u02b0\u0005i\u0000\u0000\u02b0\u02b2\u0003\u00cae"+
		"\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b2o\u0001\u0000\u0000\u0000\u02b3\u02b5\u0003Z-\u0000\u02b4"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b8\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b9\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u0003h4\u0000\u02ba\u02bb\u0003\u00a4R\u0000\u02bb\u02bd\u0005"+
		"G\u0000\u0000\u02bc\u02be\u0003\u00c0`\u0000\u02bd\u02bc\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000"+
		"\u0000\u02bf\u02c0\u0003t:\u0000\u02c0\u02c1\u0003z=\u0000\u02c1q\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c4\u0003Z-\u0000\u02c3\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c7\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c8\u02ca\u0003b1\u0000\u02c9"+
		"\u02c8\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005G\u0000\u0000\u02cc\u02cd"+
		"\u0003t:\u0000\u02cd\u02ce\u0003,\u0016\u0000\u02ces\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d1\u0005V\u0000\u0000\u02d0\u02d2\u0003v;\u0000\u02d1"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005W\u0000\u0000\u02d4u\u0001"+
		"\u0000\u0000\u0000\u02d5\u02da\u0003x<\u0000\u02d6\u02d7\u0005Y\u0000"+
		"\u0000\u02d7\u02d9\u0003x<\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d9"+
		"\u02dc\u0001\u0000\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02da"+
		"\u02db\u0001\u0000\u0000\u0000\u02dbw\u0001\u0000\u0000\u0000\u02dc\u02da"+
		"\u0001\u0000\u0000\u0000\u02dd\u02df\u0003d2\u0000\u02de\u02dd\u0001\u0000"+
		"\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000"+
		"\u0000\u0000\u02e0\u02e1\u0003\u00a6S\u0000\u02e1\u02e4\u0005G\u0000\u0000"+
		"\u02e2\u02e3\u0005i\u0000\u0000\u02e3\u02e5\u0003\u00ccf\u0000\u02e4\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5y\u0001"+
		"\u0000\u0000\u0000\u02e6\u02eb\u0003*\u0015\u0000\u02e7\u02e8\u0005\u0082"+
		"\u0000\u0000\u02e8\u02eb\u0003\u00ccf\u0000\u02e9\u02eb\u0005\\\u0000"+
		"\u0000\u02ea\u02e6\u0001\u0000\u0000\u0000\u02ea\u02e7\u0001\u0000\u0000"+
		"\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02eb{\u0001\u0000\u0000\u0000"+
		"\u02ec\u02ee\u0003Z-\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ee\u02f1"+
		"\u0001\u0000\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f0\u02f2\u0001\u0000\u0000\u0000\u02f1\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f3\u0003\u00a4R\u0000\u02f3\u02f4\u0005"+
		"-\u0000\u0000\u02f4\u02f5\u0003~?\u0000\u02f5\u02f6\u0003t:\u0000\u02f6"+
		"\u02f7\u0003z=\u0000\u02f7}\u0001\u0000\u0000\u0000\u02f8\u030c\u0005"+
		"]\u0000\u0000\u02f9\u030c\u0005^\u0000\u0000\u02fa\u030c\u0005_\u0000"+
		"\u0000\u02fb\u030c\u0005a\u0000\u0000\u02fc\u030c\u0005b\u0000\u0000\u02fd"+
		"\u030c\u0005e\u0000\u0000\u02fe\u030c\u0005c\u0000\u0000\u02ff\u030c\u0005"+
		"d\u0000\u0000\u0300\u0301\u0005j\u0000\u0000\u0301\u030c\u0005j\u0000"+
		"\u0000\u0302\u0303\u0005k\u0000\u0000\u0303\u030c\u0005k\u0000\u0000\u0304"+
		"\u030c\u0005s\u0000\u0000\u0305\u030c\u0005t\u0000\u0000\u0306\u0307\u0005"+
		"T\u0000\u0000\u0307\u030c\u0005U\u0000\u0000\u0308\u0309\u0005T\u0000"+
		"\u0000\u0309\u030a\u0005U\u0000\u0000\u030a\u030c\u0005i\u0000\u0000\u030b"+
		"\u02f8\u0001\u0000\u0000\u0000\u030b\u02f9\u0001\u0000\u0000\u0000\u030b"+
		"\u02fa\u0001\u0000\u0000\u0000\u030b\u02fb\u0001\u0000\u0000\u0000\u030b"+
		"\u02fc\u0001\u0000\u0000\u0000\u030b\u02fd\u0001\u0000\u0000\u0000\u030b"+
		"\u02fe\u0001\u0000\u0000\u0000\u030b\u02ff\u0001\u0000\u0000\u0000\u030b"+
		"\u0300\u0001\u0000\u0000\u0000\u030b\u0302\u0001\u0000\u0000\u0000\u030b"+
		"\u0304\u0001\u0000\u0000\u0000\u030b\u0305\u0001\u0000\u0000\u0000\u030b"+
		"\u0306\u0001\u0000\u0000\u0000\u030b\u0308\u0001\u0000\u0000\u0000\u030c"+
		"\u007f\u0001\u0000\u0000\u0000\u030d\u030f\u0003Z-\u0000\u030e\u030d\u0001"+
		"\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e\u0001"+
		"\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0313\u0001"+
		"\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0313\u0314\u0005"+
		"\u000f\u0000\u0000\u0314\u0316\u0005G\u0000\u0000\u0315\u0317\u0003\u00c0"+
		"`\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000"+
		"\u0000\u0317\u0319\u0001\u0000\u0000\u0000\u0318\u031a\u0003\u008cF\u0000"+
		"\u0319\u0318\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000"+
		"\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031c\u0003\u0082A\u0000\u031c"+
		"\u0081\u0001\u0000\u0000\u0000\u031d\u0321\u0005R\u0000\u0000\u031e\u0320"+
		"\u0003\u0084B\u0000\u031f\u031e\u0001\u0000\u0000\u0000\u0320\u0323\u0001"+
		"\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0321\u0322\u0001"+
		"\u0000\u0000\u0000\u0322\u0324\u0001\u0000\u0000\u0000\u0323\u0321\u0001"+
		"\u0000\u0000\u0000\u0324\u0325\u0005S\u0000\u0000\u0325\u0083\u0001\u0000"+
		"\u0000\u0000\u0326\u032b\u0003|>\u0000\u0327\u032b\u0003p8\u0000\u0328"+
		"\u032b\u0003j5\u0000\u0329\u032b\u0003r9\u0000\u032a\u0326\u0001\u0000"+
		"\u0000\u0000\u032a\u0327\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000"+
		"\u0000\u0000\u032a\u0329\u0001\u0000\u0000\u0000\u032b\u0085\u0001\u0000"+
		"\u0000\u0000\u032c\u032e\u0003Z-\u0000\u032d\u032c\u0001\u0000\u0000\u0000"+
		"\u032e\u0331\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000"+
		"\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0332\u0001\u0000\u0000\u0000"+
		"\u0331\u032f\u0001\u0000\u0000\u0000\u0332\u0333\u00055\u0000\u0000\u0333"+
		"\u0335\u0005G\u0000\u0000\u0334\u0336\u0003\u00c0`\u0000\u0335\u0334\u0001"+
		"\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0338\u0001"+
		"\u0000\u0000\u0000\u0337\u0339\u0003\u008cF\u0000\u0338\u0337\u0001\u0000"+
		"\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033a\u0001\u0000"+
		"\u0000\u0000\u033a\u033b\u0003\u0088D\u0000\u033b\u0087\u0001\u0000\u0000"+
		"\u0000\u033c\u0340\u0005R\u0000\u0000\u033d\u033f\u0003\u008aE\u0000\u033e"+
		"\u033d\u0001\u0000\u0000\u0000\u033f\u0342\u0001\u0000\u0000\u0000\u0340"+
		"\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341"+
		"\u0343\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000\u0000\u0343"+
		"\u0344\u0005S\u0000\u0000\u0344\u0089\u0001\u0000\u0000\u0000\u0345\u034a"+
		"\u0003|>\u0000\u0346\u034a\u0003p8\u0000\u0347\u034a\u0003j5\u0000\u0348"+
		"\u034a\u0003r9\u0000\u0349\u0345\u0001\u0000\u0000\u0000\u0349\u0346\u0001"+
		"\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u0348\u0001"+
		"\u0000\u0000\u0000\u034a\u008b\u0001\u0000\u0000\u0000\u034b\u034c\u0005"+
		"[\u0000\u0000\u034c\u0351\u0003\u00a6S\u0000\u034d\u034e\u0005Y\u0000"+
		"\u0000\u034e\u0350\u0003\u00a6S\u0000\u034f\u034d\u0001\u0000\u0000\u0000"+
		"\u0350\u0353\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000"+
		"\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u008d\u0001\u0000\u0000\u0000"+
		"\u0353\u0351\u0001\u0000\u0000\u0000\u0354\u0356\u0003Z-\u0000\u0355\u0354"+
		"\u0001\u0000\u0000\u0000\u0356\u0359\u0001\u0000\u0000\u0000\u0357\u0355"+
		"\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u035a"+
		"\u0001\u0000\u0000\u0000\u0359\u0357\u0001\u0000\u0000\u0000\u035a\u035b"+
		"\u0005:\u0000\u0000\u035b\u035d\u0005G\u0000\u0000\u035c\u035e\u0003\u00c0"+
		"`\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f\u0360\u0003\u0090H\u0000"+
		"\u0360\u008f\u0001\u0000\u0000\u0000\u0361\u0364\u0003\u0092I\u0000\u0362"+
		"\u0364\u0003p8\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0362\u0001"+
		"\u0000\u0000\u0000\u0364\u0091\u0001\u0000\u0000\u0000\u0365\u0369\u0005"+
		"R\u0000\u0000\u0366\u0368\u0003\u0094J\u0000\u0367\u0366\u0001\u0000\u0000"+
		"\u0000\u0368\u036b\u0001\u0000\u0000\u0000\u0369\u0367\u0001\u0000\u0000"+
		"\u0000\u0369\u036a\u0001\u0000\u0000\u0000\u036a\u036c\u0001\u0000\u0000"+
		"\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036c\u036d\u0005S\u0000\u0000"+
		"\u036d\u0093\u0001\u0000\u0000\u0000\u036e\u036f\u0003p8\u0000\u036f\u0095"+
		"\u0001\u0000\u0000\u0000\u0370\u0372\u0003Z-\u0000\u0371\u0370\u0001\u0000"+
		"\u0000\u0000\u0372\u0375\u0001\u0000\u0000\u0000\u0373\u0371\u0001\u0000"+
		"\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0377\u0001\u0000"+
		"\u0000\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0376\u0378\u00058\u0000"+
		"\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000"+
		"\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037a\u0005@\u0000\u0000"+
		"\u037a\u037c\u0005G\u0000\u0000\u037b\u037d\u0003\u00c0`\u0000\u037c\u037b"+
		"\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u037e"+
		"\u0001\u0000\u0000\u0000\u037e\u037f\u0003\u0098L\u0000\u037f\u0097\u0001"+
		"\u0000\u0000\u0000\u0380\u0381\u0005R\u0000\u0000\u0381\u0386\u0003\u009c"+
		"N\u0000\u0382\u0383\u0005Y\u0000\u0000\u0383\u0385\u0003\u009cN\u0000"+
		"\u0384\u0382\u0001\u0000\u0000\u0000\u0385\u0388\u0001\u0000\u0000\u0000"+
		"\u0386\u0384\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000"+
		"\u0387\u038a\u0001\u0000\u0000\u0000\u0388\u0386\u0001\u0000\u0000\u0000"+
		"\u0389\u038b\u0005Y\u0000\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038a"+
		"\u038b\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c"+
		"\u038d\u0005S\u0000\u0000\u038d\u0099\u0001\u0000\u0000\u0000\u038e\u038f"+
		"\u0005V\u0000\u0000\u038f\u0390\u0003x<\u0000\u0390\u0391\u0005W\u0000"+
		"\u0000\u0391\u009b\u0001\u0000\u0000\u0000\u0392\u0394\u0005G\u0000\u0000"+
		"\u0393\u0395\u0003\u009aM\u0000\u0394\u0393\u0001\u0000\u0000\u0000\u0394"+
		"\u0395\u0001\u0000\u0000\u0000\u0395\u009d\u0001\u0000\u0000\u0000\u0396"+
		"\u0398\u0003Z-\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0398\u039b\u0001"+
		"\u0000\u0000\u0000\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u039a\u0001"+
		"\u0000\u0000\u0000\u039a\u039c\u0001\u0000\u0000\u0000\u039b\u0399\u0001"+
		"\u0000\u0000\u0000\u039c\u039d\u0005E\u0000\u0000\u039d\u039e\u0003\u00a6"+
		"S\u0000\u039e\u039f\u0005\u001b\u0000\u0000\u039f\u03a4\u0003\u00a6S\u0000"+
		"\u03a0\u03a1\u0005Y\u0000\u0000\u03a1\u03a3\u0003\u00a6S\u0000\u03a2\u03a0"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a6\u0001\u0000\u0000\u0000\u03a4\u03a2"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03a9"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a7\u03aa"+
		"\u0003\u00a0P\u0000\u03a8\u03aa\u0005\\\u0000\u0000\u03a9\u03a7\u0001"+
		"\u0000\u0000\u0000\u03a9\u03a8\u0001\u0000\u0000\u0000\u03aa\u009f\u0001"+
		"\u0000\u0000\u0000\u03ab\u03af\u0005R\u0000\u0000\u03ac\u03ae\u0003\u00a2"+
		"Q\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000"+
		"\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000"+
		"\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000"+
		"\u0000\u03b2\u03b3\u0005S\u0000\u0000\u03b3\u00a1\u0001\u0000\u0000\u0000"+
		"\u03b4\u03b5\u0003p8\u0000\u03b5\u00a3\u0001\u0000\u0000\u0000\u03b6\u03b9"+
		"\u0005C\u0000\u0000\u03b7\u03b9\u0003\u00a6S\u0000\u03b8\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b8\u03b7\u0001\u0000\u0000\u0000\u03b9\u00a5\u0001\u0000"+
		"\u0000\u0000\u03ba\u03bb\u0005G\u0000\u0000\u03bb\u03bd\u0005[\u0000\u0000"+
		"\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03c2\u0003\u00aaU\u0000\u03bf"+
		"\u03c1\u0003\u00a8T\u0000\u03c0\u03bf\u0001\u0000\u0000\u0000\u03c1\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c3"+
		"\u0001\u0000\u0000\u0000\u03c3\u00a7\u0001\u0000\u0000\u0000\u03c4\u03c2"+
		"\u0001\u0000\u0000\u0000\u03c5\u03c8\u0003\u00ba]\u0000\u03c6\u03c8\u0005"+
		"l\u0000\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000\u03c7\u03c6\u0001\u0000"+
		"\u0000\u0000\u03c8\u00a9\u0001\u0000\u0000\u0000\u03c9\u03cd\u0003\u00b0"+
		"X\u0000\u03ca\u03cd\u0003\u00b2Y\u0000\u03cb\u03cd\u0003\u00acV\u0000"+
		"\u03cc\u03c9\u0001\u0000\u0000\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000"+
		"\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cd\u00ab\u0001\u0000\u0000\u0000"+
		"\u03ce\u03cf\u0005V\u0000\u0000\u03cf\u03d4\u0003\u00aeW\u0000\u03d0\u03d1"+
		"\u0005Y\u0000\u0000\u03d1\u03d3\u0003\u00aeW\u0000\u03d2\u03d0\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d6\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d7\u0001\u0000"+
		"\u0000\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d7\u03d8\u0005W\u0000"+
		"\u0000\u03d8\u00ad\u0001\u0000\u0000\u0000\u03d9\u03db\u0003\u00a6S\u0000"+
		"\u03da\u03dc\u0005G\u0000\u0000\u03db\u03da\u0001\u0000\u0000\u0000\u03db"+
		"\u03dc\u0001\u0000\u0000\u0000\u03dc\u00af\u0001\u0000\u0000\u0000\u03dd"+
		"\u03df\u0003\u001a\r\u0000\u03de\u03e0\u0003\u00c2a\u0000\u03df\u03de"+
		"\u0001\u0000\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0\u00b1"+
		"\u0001\u0000\u0000\u0000\u03e1\u03e6\u0005\u000b\u0000\u0000\u03e2\u03e6"+
		"\u0005\u000e\u0000\u0000\u03e3\u03e6\u00054\u0000\u0000\u03e4\u03e6\u0003"+
		"\u00b4Z\u0000\u03e5\u03e1\u0001\u0000\u0000\u0000\u03e5\u03e2\u0001\u0000"+
		"\u0000\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e6\u00b3\u0001\u0000\u0000\u0000\u03e7\u03ea\u0003\u00b6"+
		"[\u0000\u03e8\u03ea\u0003\u00b8\\\u0000\u03e9\u03e7\u0001\u0000\u0000"+
		"\u0000\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u00b5\u0001\u0000\u0000"+
		"\u0000\u03eb\u03ec\u0007\u0004\u0000\u0000\u03ec\u00b7\u0001\u0000\u0000"+
		"\u0000\u03ed\u03ee\u0007\u0005\u0000\u0000\u03ee\u00b9\u0001\u0000\u0000"+
		"\u0000\u03ef\u03f1\u0005T\u0000\u0000\u03f0\u03f2\u0003\u00ccf\u0000\u03f1"+
		"\u03f0\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f3\u03f5\u0005Y\u0000\u0000\u03f4\u03f3"+
		"\u0001\u0000\u0000\u0000\u03f5\u03f8\u0001\u0000\u0000\u0000\u03f6\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7\u03f9"+
		"\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f9\u03fa"+
		"\u0005U\u0000\u0000\u03fa\u00bb\u0001\u0000\u0000\u0000\u03fb\u03fe\u0005"+
		"G\u0000\u0000\u03fc\u03fd\u0005[\u0000\u0000\u03fd\u03ff\u0003\u00be_"+
		"\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000"+
		"\u0000\u03ff\u00bd\u0001\u0000\u0000\u0000\u0400\u0401\u0005G\u0000\u0000"+
		"\u0401\u00bf\u0001\u0000\u0000\u0000\u0402\u0403\u0005j\u0000\u0000\u0403"+
		"\u0408\u0003\u00bc^\u0000\u0404\u0405\u0005Y\u0000\u0000\u0405\u0407\u0003"+
		"\u00bc^\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0407\u040a\u0001\u0000"+
		"\u0000\u0000\u0408\u0406\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000"+
		"\u0000\u0000\u0409\u040b\u0001\u0000\u0000\u0000\u040a\u0408\u0001\u0000"+
		"\u0000\u0000\u040b\u040c\u0005k\u0000\u0000\u040c\u00c1\u0001\u0000\u0000"+
		"\u0000\u040d\u040e\u0005j\u0000\u0000\u040e\u0413\u0003\u00a6S\u0000\u040f"+
		"\u0410\u0005Y\u0000\u0000\u0410\u0412\u0003\u00a6S\u0000\u0411\u040f\u0001"+
		"\u0000\u0000\u0000\u0412\u0415\u0001\u0000\u0000\u0000\u0413\u0411\u0001"+
		"\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u0416\u0001"+
		"\u0000\u0000\u0000\u0415\u0413\u0001\u0000\u0000\u0000\u0416\u0417\u0003"+
		"\u00c4b\u0000\u0417\u00c3\u0001\u0000\u0000\u0000\u0418\u041c\u0005k\u0000"+
		"\u0000\u0419\u041a\u0005k\u0000\u0000\u041a\u041c\u0003\u00c4b\u0000\u041b"+
		"\u0418\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000\u0000\u0000\u041c"+
		"\u00c5\u0001\u0000\u0000\u0000\u041d\u041e\u0005V\u0000\u0000\u041e\u0421"+
		"\u0003\u0106\u0083\u0000\u041f\u0420\u0005Y\u0000\u0000\u0420\u0422\u0003"+
		"\u0106\u0083\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0422\u0423\u0001"+
		"\u0000\u0000\u0000\u0423\u0421\u0001\u0000\u0000\u0000\u0423\u0424\u0001"+
		"\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000\u0425\u0426\u0005"+
		"W\u0000\u0000\u0426\u00c7\u0001\u0000\u0000\u0000\u0427\u0428\u0005V\u0000"+
		"\u0000\u0428\u0429\u0003\u00ccf\u0000\u0429\u042a\u0005W\u0000\u0000\u042a"+
		"\u00c9\u0001\u0000\u0000\u0000\u042b\u042c\u0003\u00d0h\u0000\u042c\u00cb"+
		"\u0001\u0000\u0000\u0000\u042d\u042e\u0003\u00ceg\u0000\u042e\u00cd\u0001"+
		"\u0000\u0000\u0000\u042f\u0433\u0003\u00d0h\u0000\u0430\u0431\u0003\u00d4"+
		"j\u0000\u0431\u0432\u0003\u00ceg\u0000\u0432\u0434\u0001\u0000\u0000\u0000"+
		"\u0433\u0430\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000"+
		"\u0434\u00cf\u0001\u0000\u0000\u0000\u0435\u0438\u0003\u00d6k\u0000\u0436"+
		"\u0437\u0005m\u0000\u0000\u0437\u0439\u0003\u00d0h\u0000\u0438\u0436\u0001"+
		"\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u00d1\u0001"+
		"\u0000\u0000\u0000\u043a\u043b\u0005+\u0000\u0000\u043b\u043c\u0003\u00a6"+
		"S\u0000\u043c\u043d\u0003\u00fe\u007f\u0000\u043d\u00d3\u0001\u0000\u0000"+
		"\u0000\u043e\u043f\u0007\u0006\u0000\u0000\u043f\u00d5\u0001\u0000\u0000"+
		"\u0000\u0440\u0445\u0003\u00d8l\u0000\u0441\u0442\u0005r\u0000\u0000\u0442"+
		"\u0444\u0003\u00d8l\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0444\u0447"+
		"\u0001\u0000\u0000\u0000\u0445\u0443\u0001\u0000\u0000\u0000\u0445\u0446"+
		"\u0001\u0000\u0000\u0000\u0446\u00d7\u0001\u0000\u0000\u0000\u0447\u0445"+
		"\u0001\u0000\u0000\u0000\u0448\u044d\u0003\u00dam\u0000\u0449\u044a\u0005"+
		"q\u0000\u0000\u044a\u044c\u0003\u00dam\u0000\u044b\u0449\u0001\u0000\u0000"+
		"\u0000\u044c\u044f\u0001\u0000\u0000\u0000\u044d\u044b\u0001\u0000\u0000"+
		"\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u00d9\u0001\u0000\u0000"+
		"\u0000\u044f\u044d\u0001\u0000\u0000\u0000\u0450\u0455\u0003\u00dcn\u0000"+
		"\u0451\u0452\u0005d\u0000\u0000\u0452\u0454\u0003\u00dcn\u0000\u0453\u0451"+
		"\u0001\u0000\u0000\u0000\u0454\u0457\u0001\u0000\u0000\u0000\u0455\u0453"+
		"\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000\u0000\u0000\u0456\u00db"+
		"\u0001\u0000\u0000\u0000\u0457\u0455\u0001\u0000\u0000\u0000\u0458\u045d"+
		"\u0003\u00deo\u0000\u0459\u045a\u0005e\u0000\u0000\u045a\u045c\u0003\u00de"+
		"o\u0000\u045b\u0459\u0001\u0000\u0000\u0000\u045c\u045f\u0001\u0000\u0000"+
		"\u0000\u045d\u045b\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000\u0000"+
		"\u0000\u045e\u00dd\u0001\u0000\u0000\u0000\u045f\u045d\u0001\u0000\u0000"+
		"\u0000\u0460\u0465\u0003\u00e0p\u0000\u0461\u0462\u0005c\u0000\u0000\u0462"+
		"\u0464\u0003\u00e0p\u0000\u0463\u0461\u0001\u0000\u0000\u0000\u0464\u0467"+
		"\u0001\u0000\u0000\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0465\u0466"+
		"\u0001\u0000\u0000\u0000\u0466\u00df\u0001\u0000\u0000\u0000\u0467\u0465"+
		"\u0001\u0000\u0000\u0000\u0468\u046d\u0003\u00e2q\u0000\u0469\u046a\u0007"+
		"\u0007\u0000\u0000\u046a\u046c\u0003\u00e2q\u0000\u046b\u0469\u0001\u0000"+
		"\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000\u046d\u046b\u0001\u0000"+
		"\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u00e1\u0001\u0000"+
		"\u0000\u0000\u046f\u046d\u0001\u0000\u0000\u0000\u0470\u0478\u0003\u00e4"+
		"r\u0000\u0471\u0472\u0007\b\u0000\u0000\u0472\u0479\u0003\u00e4r\u0000"+
		"\u0473\u0474\u0005%\u0000\u0000\u0474\u0476\u0003\u00a6S\u0000\u0475\u0477"+
		"\u0005G\u0000\u0000\u0476\u0475\u0001\u0000\u0000\u0000\u0476\u0477\u0001"+
		"\u0000\u0000\u0000\u0477\u0479\u0001\u0000\u0000\u0000\u0478\u0471\u0001"+
		"\u0000\u0000\u0000\u0478\u0473\u0001\u0000\u0000\u0000\u0478\u0479\u0001"+
		"\u0000\u0000\u0000\u0479\u00e3\u0001\u0000\u0000\u0000\u047a\u0483\u0003"+
		"\u00eau\u0000\u047b\u047e\u0003\u00e6s\u0000\u047c\u047e\u0003\u00e8t"+
		"\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047d\u047c\u0001\u0000\u0000"+
		"\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f\u0480\u0003\u00eau\u0000"+
		"\u0480\u0482\u0001\u0000\u0000\u0000\u0481\u047d\u0001\u0000\u0000\u0000"+
		"\u0482\u0485\u0001\u0000\u0000\u0000\u0483\u0481\u0001\u0000\u0000\u0000"+
		"\u0483\u0484\u0001\u0000\u0000\u0000\u0484\u00e5\u0001\u0000\u0000\u0000"+
		"\u0485\u0483\u0001\u0000\u0000\u0000\u0486\u0487\u0005j\u0000\u0000\u0487"+
		"\u0488\u0005j\u0000\u0000\u0488\u00e7\u0001\u0000\u0000\u0000\u0489\u048a"+
		"\u0005k\u0000\u0000\u048a\u048b\u0005k\u0000\u0000\u048b\u00e9\u0001\u0000"+
		"\u0000\u0000\u048c\u0491\u0003\u00ecv\u0000\u048d\u048e\u0007\t\u0000"+
		"\u0000\u048e\u0490\u0003\u00ecv\u0000\u048f\u048d\u0001\u0000\u0000\u0000"+
		"\u0490\u0493\u0001\u0000\u0000\u0000\u0491\u048f\u0001\u0000\u0000\u0000"+
		"\u0491\u0492\u0001\u0000\u0000\u0000\u0492\u00eb\u0001\u0000\u0000\u0000"+
		"\u0493\u0491\u0001\u0000\u0000\u0000\u0494\u0499\u0003\u00eew\u0000\u0495"+
		"\u0496\u0007\n\u0000\u0000\u0496\u0498\u0003\u00eew\u0000\u0497\u0495"+
		"\u0001\u0000\u0000\u0000\u0498\u049b\u0001\u0000\u0000\u0000\u0499\u0497"+
		"\u0001\u0000\u0000\u0000\u0499\u049a\u0001\u0000\u0000\u0000\u049a\u00ed"+
		"\u0001\u0000\u0000\u0000\u049b\u0499\u0001\u0000\u0000\u0000\u049c\u049f"+
		"\u0003\u00f0x\u0000\u049d\u049e\u0005`\u0000\u0000\u049e\u04a0\u0003\u00ee"+
		"w\u0000\u049f\u049d\u0001\u0000\u0000\u0000\u049f\u04a0\u0001\u0000\u0000"+
		"\u0000\u04a0\u00ef\u0001\u0000\u0000\u0000\u04a1\u04a6\u0003\u00f2y\u0000"+
		"\u04a2\u04a3\u0007\u000b\u0000\u0000\u04a3\u04a6\u0003\u00f0x\u0000\u04a4"+
		"\u04a6\u0003\u00f4z\u0000\u04a5\u04a1\u0001\u0000\u0000\u0000\u04a5\u04a2"+
		"\u0001\u0000\u0000\u0000\u04a5\u04a4\u0001\u0000\u0000\u0000\u04a6\u00f1"+
		"\u0001\u0000\u0000\u0000\u04a7\u04a8\u0005V\u0000\u0000\u04a8\u04a9\u0003"+
		"\u00a6S\u0000\u04a9\u04aa\u0005W\u0000\u0000\u04aa\u04ab\u0003\u00f0x"+
		"\u0000\u04ab\u00f3\u0001\u0000\u0000\u0000\u04ac\u04b0\u0003\u00f6{\u0000"+
		"\u04ad\u04af\u0003\u00f8|\u0000\u04ae\u04ad\u0001\u0000\u0000\u0000\u04af"+
		"\u04b2\u0001\u0000\u0000\u0000\u04b0\u04ae\u0001\u0000\u0000\u0000\u04b0"+
		"\u04b1\u0001\u0000\u0000\u0000\u04b1\u00f5\u0001\u0000\u0000\u0000\u04b2"+
		"\u04b0\u0001\u0000\u0000\u0000\u04b3\u04c0\u0003\u0108\u0084\u0000\u04b4"+
		"\u04c0\u0003\u00c8d\u0000\u04b5\u04c0\u0003\u00c6c\u0000\u04b6\u04c0\u0003"+
		"2\u0019\u0000\u04b7\u04c0\u00036\u001b\u0000\u04b8\u04c0\u0003*\u0015"+
		"\u0000\u04b9\u04c0\u00059\u0000\u0000\u04ba\u04c0\u0005*\u0000\u0000\u04bb"+
		"\u04c0\u0003\u00fa}\u0000\u04bc\u04c0\u0003\u00d2i\u0000\u04bd\u04c0\u0005"+
		"G\u0000\u0000\u04be\u04c0\u0003\u001a\r\u0000\u04bf\u04b3\u0001\u0000"+
		"\u0000\u0000\u04bf\u04b4\u0001\u0000\u0000\u0000\u04bf\u04b5\u0001\u0000"+
		"\u0000\u0000\u04bf\u04b6\u0001\u0000\u0000\u0000\u04bf\u04b7\u0001\u0000"+
		"\u0000\u0000\u04bf\u04b8\u0001\u0000\u0000\u0000\u04bf\u04b9\u0001\u0000"+
		"\u0000\u0000\u04bf\u04ba\u0001\u0000\u0000\u0000\u04bf\u04bb\u0001\u0000"+
		"\u0000\u0000\u04bf\u04bc\u0001\u0000\u0000\u0000\u04bf\u04bd\u0001\u0000"+
		"\u0000\u0000\u04bf\u04be\u0001\u0000\u0000\u0000\u04c0\u00f7\u0001\u0000"+
		"\u0000\u0000\u04c1\u04c2\u0005X\u0000\u0000\u04c2\u04da\u0005G\u0000\u0000"+
		"\u04c3\u04c4\u0005X\u0000\u0000\u04c4\u04da\u0005I\u0000\u0000\u04c5\u04c6"+
		"\u0005n\u0000\u0000\u04c6\u04da\u0005G\u0000\u0000\u04c7\u04c8\u0005n"+
		"\u0000\u0000\u04c8\u04ca\u0005V\u0000\u0000\u04c9\u04cb\u0003\u0100\u0080"+
		"\u0000\u04ca\u04c9\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000\u0000"+
		"\u0000\u04cb\u04cc\u0001\u0000\u0000\u0000\u04cc\u04da\u0005W\u0000\u0000"+
		"\u04cd\u04cf\u0005V\u0000\u0000\u04ce\u04d0\u0003\u0100\u0080\u0000\u04cf"+
		"\u04ce\u0001\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0"+
		"\u04d1\u0001\u0000\u0000\u0000\u04d1\u04da\u0005W\u0000\u0000\u04d2\u04d3"+
		"\u0005T\u0000\u0000\u04d3\u04d4\u0003\u00fc~\u0000\u04d4\u04d5\u0005U"+
		"\u0000\u0000\u04d5\u04da\u0001\u0000\u0000\u0000\u04d6\u04da\u0005o\u0000"+
		"\u0000\u04d7\u04da\u0005p\u0000\u0000\u04d8\u04da\u0005f\u0000\u0000\u04d9"+
		"\u04c1\u0001\u0000\u0000\u0000\u04d9\u04c3\u0001\u0000\u0000\u0000\u04d9"+
		"\u04c5\u0001\u0000\u0000\u0000\u04d9\u04c7\u0001\u0000\u0000\u0000\u04d9"+
		"\u04cd\u0001\u0000\u0000\u0000\u04d9\u04d2\u0001\u0000\u0000\u0000\u04d9"+
		"\u04d6\u0001\u0000\u0000\u0000\u04d9\u04d7\u0001\u0000\u0000\u0000\u04d9"+
		"\u04d8\u0001\u0000\u0000\u0000\u04da\u00f9\u0001\u0000\u0000\u0000\u04db"+
		"\u04dd\u0005T\u0000\u0000\u04dc\u04de\u0003\u00fc~\u0000\u04dd\u04dc\u0001"+
		"\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000\u04de\u04df\u0001"+
		"\u0000\u0000\u0000\u04df\u04e0\u0005U\u0000\u0000\u04e0\u00fb\u0001\u0000"+
		"\u0000\u0000\u04e1\u04e6\u0003\u00ccf\u0000\u04e2\u04e3\u0005Y\u0000\u0000"+
		"\u04e3\u04e5\u0003\u00ccf\u0000\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e5"+
		"\u04e8\u0001\u0000\u0000\u0000\u04e6\u04e4\u0001\u0000\u0000\u0000\u04e6"+
		"\u04e7\u0001\u0000\u0000\u0000\u04e7\u00fd\u0001\u0000\u0000\u0000\u04e8"+
		"\u04e6\u0001\u0000\u0000\u0000\u04e9\u04eb\u0005V\u0000\u0000\u04ea\u04ec"+
		"\u0003\u0100\u0080\u0000\u04eb\u04ea\u0001\u0000\u0000\u0000\u04eb\u04ec"+
		"\u0001\u0000\u0000\u0000\u04ec\u04ed\u0001\u0000\u0000\u0000\u04ed\u04ee"+
		"\u0005W\u0000\u0000\u04ee\u00ff\u0001\u0000\u0000\u0000\u04ef\u04f4\u0003"+
		"\u0106\u0083\u0000\u04f0\u04f1\u0005Y\u0000\u0000\u04f1\u04f3\u0003\u0106"+
		"\u0083\u0000\u04f2\u04f0\u0001\u0000\u0000\u0000\u04f3\u04f6\u0001\u0000"+
		"\u0000\u0000\u04f4\u04f2\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001\u0000"+
		"\u0000\u0000\u04f5\u0101\u0001\u0000\u0000\u0000\u04f6\u04f4\u0001\u0000"+
		"\u0000\u0000\u04f7\u04f8\u0005G\u0000\u0000\u04f8\u04f9\u0005[\u0000\u0000"+
		"\u04f9\u04fa\u0003\u00ccf\u0000\u04fa\u0103\u0001\u0000\u0000\u0000\u04fb"+
		"\u04fc\u0003\u00cae\u0000\u04fc\u0105\u0001\u0000\u0000\u0000\u04fd\u0500"+
		"\u0003\u0102\u0081\u0000\u04fe\u0500\u0003\u0104\u0082\u0000\u04ff\u04fd"+
		"\u0001\u0000\u0000\u0000\u04ff\u04fe\u0001\u0000\u0000\u0000\u0500\u0107"+
		"\u0001\u0000\u0000\u0000\u0501\u050b\u0005;\u0000\u0000\u0502\u050b\u0005"+
		"\u0018\u0000\u0000\u0503\u050b\u0005I\u0000\u0000\u0504\u050b\u0005J\u0000"+
		"\u0000\u0505\u050b\u0005K\u0000\u0000\u0506\u050b\u0005L\u0000\u0000\u0507"+
		"\u050b\u0005M\u0000\u0000\u0508\u050b\u0003\u010a\u0085\u0000\u0509\u050b"+
		"\u0005H\u0000\u0000\u050a\u0501\u0001\u0000\u0000\u0000\u050a\u0502\u0001"+
		"\u0000\u0000\u0000\u050a\u0503\u0001\u0000\u0000\u0000\u050a\u0504\u0001"+
		"\u0000\u0000\u0000\u050a\u0505\u0001\u0000\u0000\u0000\u050a\u0506\u0001"+
		"\u0000\u0000\u0000\u050a\u0507\u0001\u0000\u0000\u0000\u050a\u0508\u0001"+
		"\u0000\u0000\u0000\u050a\u0509\u0001\u0000\u0000\u0000\u050b\u0109\u0001"+
		"\u0000\u0000\u0000\u050c\u0510\u0005N\u0000\u0000\u050d\u0510\u0005O\u0000"+
		"\u0000\u050e\u0510\u0003\u010c\u0086\u0000\u050f\u050c\u0001\u0000\u0000"+
		"\u0000\u050f\u050d\u0001\u0000\u0000\u0000\u050f\u050e\u0001\u0000\u0000"+
		"\u0000\u0510\u010b\u0001\u0000\u0000\u0000\u0511\u0515\u0005P\u0000\u0000"+
		"\u0512\u0514\u0003\u010e\u0087\u0000\u0513\u0512\u0001\u0000\u0000\u0000"+
		"\u0514\u0517\u0001\u0000\u0000\u0000\u0515\u0513\u0001\u0000\u0000\u0000"+
		"\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0518\u0001\u0000\u0000\u0000"+
		"\u0517\u0515\u0001\u0000\u0000\u0000\u0518\u0519\u0005\u0089\u0000\u0000"+
		"\u0519\u010d\u0001\u0000\u0000\u0000\u051a\u051f\u0003\u0110\u0088\u0000"+
		"\u051b\u051f\u0005\u0083\u0000\u0000\u051c\u051f\u0005\u0085\u0000\u0000"+
		"\u051d\u051f\u0005\u0086\u0000\u0000\u051e\u051a\u0001\u0000\u0000\u0000"+
		"\u051e\u051b\u0001\u0000\u0000\u0000\u051e\u051c\u0001\u0000\u0000\u0000"+
		"\u051e\u051d\u0001\u0000\u0000\u0000\u051f\u010f\u0001\u0000\u0000\u0000"+
		"\u0520\u0525\u0003\u00ccf\u0000\u0521\u0522\u0005Y\u0000\u0000\u0522\u0524"+
		"\u0003\u00ccf\u0000\u0523\u0521\u0001\u0000\u0000\u0000\u0524\u0527\u0001"+
		"\u0000\u0000\u0000\u0525\u0523\u0001\u0000\u0000\u0000\u0525\u0526\u0001"+
		"\u0000\u0000\u0000\u0526\u052e\u0001\u0000\u0000\u0000\u0527\u0525\u0001"+
		"\u0000\u0000\u0000\u0528\u052a\u0005[\u0000\u0000\u0529\u052b\u0005\u008b"+
		"\u0000\u0000\u052a\u0529\u0001\u0000\u0000\u0000\u052b\u052c\u0001\u0000"+
		"\u0000\u0000\u052c\u052a\u0001\u0000\u0000\u0000\u052c\u052d\u0001\u0000"+
		"\u0000\u0000\u052d\u052f\u0001\u0000\u0000\u0000\u052e\u0528\u0001\u0000"+
		"\u0000\u0000\u052e\u052f\u0001\u0000\u0000\u0000\u052f\u0111\u0001\u0000"+
		"\u0000\u0000\u0088\u0115\u0121\u012b\u0132\u0137\u013f\u0143\u0147\u014b"+
		"\u014e\u0154\u0165\u016c\u0177\u017f\u0181\u018a\u018f\u0196\u019c\u01a9"+
		"\u01ba\u01c9\u01d7\u01e2\u01f2\u01fb\u0201\u0204\u0208\u020e\u021d\u0226"+
		"\u0230\u0234\u0243\u024c\u0258\u0261\u026d\u0276\u027c\u0284\u0287\u028b"+
		"\u0299\u029b\u02a1\u02ab\u02b1\u02b6\u02bd\u02c5\u02c9\u02d1\u02da\u02de"+
		"\u02e4\u02ea\u02ef\u030b\u0310\u0316\u0319\u0321\u032a\u032f\u0335\u0338"+
		"\u0340\u0349\u0351\u0357\u035d\u0363\u0369\u0373\u0377\u037c\u0386\u038a"+
		"\u0394\u0399\u03a4\u03a9\u03af\u03b8\u03bc\u03c2\u03c7\u03cc\u03d4\u03db"+
		"\u03df\u03e5\u03e9\u03f1\u03f6\u03fe\u0408\u0413\u041b\u0423\u0433\u0438"+
		"\u0445\u044d\u0455\u045d\u0465\u046d\u0476\u0478\u047d\u0483\u0491\u0499"+
		"\u049f\u04a5\u04b0\u04bf\u04ca\u04cf\u04d9\u04dd\u04e6\u04eb\u04f4\u04ff"+
		"\u050a\u050f\u0515\u051e\u0525\u052c\u052e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}