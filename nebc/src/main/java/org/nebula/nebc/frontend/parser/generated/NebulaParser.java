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
		AS=8, BACKLINK=9, BOX_KW=10, BOOL=11, BREAK=12, CHAR=13, CONST=14, CONTINUE=15, 
		DECIMAL=16, DROPS=17, ELSE=18, ENUM=19, EXTERN=20, FALSE=21, F32=22, F64=23, 
		FOR=24, FOREACH=25, IF=26, IN=27, INOUT=28, INT8=29, INT16=30, INT32=31, 
		INT64=32, INT128=33, IS=34, KEEPS=35, LET=36, MUTATES=37, NAMESPACE=38, 
		NONE=39, MATCH=40, OPERATOR=41, PRIV=42, PUB=43, RETURN=44, SELF=45, STATIC=46, 
		STR=47, TYPE=48, TAG=49, TAGGED=50, TRAIT=51, TRUE=52, UINT8=53, UINT16=54, 
		UINT32=55, UINT64=56, UINT128=57, UNION=58, USE=59, VALUE=60, VAR=61, 
		VOID=62, WHILE=63, IMPL=64, PRIVATE=65, UNDERSCORE=66, IDENTIFIER=67, 
		LITERAL_ACCESS=68, INTEGER_LITERAL=69, HEX_INTEGER_LITERAL=70, BIN_INTEGER_LITERAL=71, 
		REAL_LITERAL=72, CHARACTER_LITERAL=73, REGULAR_STRING=74, VERBATIUM_STRING=75, 
		INTERPOLATED_REGULAR_STRING_START=76, INTERPOLATED_VERBATIUM_STRING_START=77, 
		OPEN_BRACE=78, CLOSE_BRACE=79, OPEN_BRACKET=80, CLOSE_BRACKET=81, OPEN_PARENS=82, 
		CLOSE_PARENS=83, DOT=84, COMMA=85, DOUBLE_COLON=86, COLON=87, SEMICOLON=88, 
		PLUS=89, MINUS=90, STAR=91, POW=92, DIV=93, PERCENT=94, AMP=95, PIPE=96, 
		CARET=97, BANG=98, TILDE=99, HASH=100, ASSIGNMENT=101, LT=102, GT=103, 
		INTERR=104, OP_COALESCING=105, OP_OPTIONAL_CHAIN=106, OP_INC=107, OP_DEC=108, 
		OP_AND=109, OP_OR=110, OP_EQ=111, OP_NE=112, OP_LE=113, OP_GE=114, OP_ADD_ASSIGNMENT=115, 
		OP_SUB_ASSIGNMENT=116, OP_MULT_ASSIGNMENT=117, OP_POW_ASSIGNMENT=118, 
		OP_DIV_ASSIGNMENT=119, OP_MOD_ASSIGNMENT=120, OP_AND_ASSIGNMENT=121, OP_OR_ASSIGNMENT=122, 
		OP_XOR_ASSIGNMENT=123, OP_LEFT_SHIFT_ASSIGNMENT=124, OP_RANGE_DESC_INC=125, 
		OP_RANGE_DESC_EX=126, OP_RANGE_INC=127, OP_RANGE=128, FAT_ARROW=129, DOUBLE_CURLY_INSIDE=130, 
		OPEN_BRACE_INSIDE=131, REGULAR_CHAR_INSIDE=132, REGULAR_STRING_INSIDE=133, 
		VERBATIUM_DOUBLE_QUOTE_INSIDE=134, VERBATIUM_INSIDE_STRING=135, DOUBLE_QUOTE_INSIDE=136, 
		CLOSE_BRACE_INSIDE=137, FORMAT_STRING=138, DOUBLE_CURLY_CLOSE_INSIDE=139, 
		THIS=140;
	public static final int
		RULE_compilation_unit = 0, RULE_extern_declaration = 1, RULE_extern_member = 2, 
		RULE_use_statement = 3, RULE_use_tail = 4, RULE_use_selector = 5, RULE_use_selector_item = 6, 
		RULE_use_alias = 7, RULE_tag_statement = 8, RULE_tag_declaration = 9, 
		RULE_tag_enumeration = 10, RULE_tag_expression = 11, RULE_namespace_declaration = 12, 
		RULE_qualified_name = 13, RULE_enum_declaration = 14, RULE_enum_body = 15, 
		RULE_enum_variant = 16, RULE_enum_payload_list = 17, RULE_enum_payload_item = 18, 
		RULE_field_ident = 19, RULE_plain_ident = 20, RULE_top_level_declaration = 21, 
		RULE_let_declaration = 22, RULE_statement = 23, RULE_match_statement = 24, 
		RULE_labeled_statement = 25, RULE_break_statement = 26, RULE_continue_statement = 27, 
		RULE_expression_statement = 28, RULE_expression_block = 29, RULE_statement_block = 30, 
		RULE_block_statements = 31, RULE_if_expression = 32, RULE_if_statement = 33, 
		RULE_match_expression = 34, RULE_for_statement = 35, RULE_range_for_control = 36, 
		RULE_traditional_for_control = 37, RULE_for_initializer = 38, RULE_for_iterator = 39, 
		RULE_while_statement = 40, RULE_foreach_statement = 41, RULE_foreach_control = 42, 
		RULE_foreach_binding = 43, RULE_foreach_tuple_elem = 44, RULE_return_statement = 45, 
		RULE_match_body = 46, RULE_match_arm = 47, RULE_pattern = 48, RULE_type_binding_pattern = 49, 
		RULE_simple_pattern_type = 50, RULE_variant_pattern = 51, RULE_variant_pattern_arg = 52, 
		RULE_tuple_pattern_elem = 53, RULE_attribute = 54, RULE_attribute_path = 55, 
		RULE_const_declaration = 56, RULE_variable_declaration = 57, RULE_tuple_decl_elem = 58, 
		RULE_visibility_modifier = 59, RULE_cvt_modifier = 60, RULE_backlink_modifier = 61, 
		RULE_modifiers = 62, RULE_field_declaration = 63, RULE_variable_declarators = 64, 
		RULE_variable_declarator = 65, RULE_method_declaration = 66, RULE_constructor_declaration = 67, 
		RULE_parameters = 68, RULE_parameter_list = 69, RULE_parameter = 70, RULE_method_body = 71, 
		RULE_operator_declaration = 72, RULE_overloadable_operator = 73, RULE_type_declaration = 74, 
		RULE_type_body = 75, RULE_type_member = 76, RULE_trait_declaration = 77, 
		RULE_trait_supers = 78, RULE_trait_body = 79, RULE_trait_block = 80, RULE_trait_member = 81, 
		RULE_union_declaration = 82, RULE_union_body = 83, RULE_union_payload = 84, 
		RULE_union_variant = 85, RULE_impl_declaration = 86, RULE_type_with_params = 87, 
		RULE_impl_block = 88, RULE_impl_member = 89, RULE_return_type = 90, RULE_type = 91, 
		RULE_type_suffix = 92, RULE_base_type = 93, RULE_tuple_type = 94, RULE_tuple_type_element = 95, 
		RULE_class_type = 96, RULE_predefined_type = 97, RULE_numeric_type = 98, 
		RULE_integral_type = 99, RULE_floating_point_type = 100, RULE_rank_specifier = 101, 
		RULE_generic_parameter = 102, RULE_constraint_list = 103, RULE_constraint = 104, 
		RULE_type_parameters = 105, RULE_type_argument_list = 106, RULE_type_or_const_arg = 107, 
		RULE_nested_gt = 108, RULE_tuple_literal = 109, RULE_parenthesized_expression = 110, 
		RULE_nonAssignmentExpression = 111, RULE_expression = 112, RULE_assignment_expression = 113, 
		RULE_ternary_expression = 114, RULE_null_coalescing_expression = 115, 
		RULE_range_expression = 116, RULE_range_operator = 117, RULE_assignment_operator = 118, 
		RULE_binary_or_expression = 119, RULE_binary_and_expression = 120, RULE_inclusive_or_expression = 121, 
		RULE_exclusive_or_expression = 122, RULE_and_expression = 123, RULE_equality_expression = 124, 
		RULE_relational_expression = 125, RULE_shift_expression = 126, RULE_left_shift = 127, 
		RULE_right_shift = 128, RULE_additive_expression = 129, RULE_multiplicative_expression = 130, 
		RULE_exponentiation_expression = 131, RULE_unary_expression = 132, RULE_cast_expression = 133, 
		RULE_primary_expression = 134, RULE_primary_expression_start = 135, RULE_struct_literal_expression = 136, 
		RULE_struct_field_init = 137, RULE_lambda_expression = 138, RULE_lambda_param = 139, 
		RULE_postfix_operator = 140, RULE_array_literal = 141, RULE_expression_list = 142, 
		RULE_arguments = 143, RULE_argument_list = 144, RULE_namedArgument = 145, 
		RULE_positionalArgument = 146, RULE_argument = 147, RULE_literal = 148, 
		RULE_string_literal = 149, RULE_interpolated_regular_string = 150, RULE_interpolated_regular_string_part = 151, 
		RULE_interpolated_string_expression = 152;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "extern_declaration", "extern_member", "use_statement", 
			"use_tail", "use_selector", "use_selector_item", "use_alias", "tag_statement", 
			"tag_declaration", "tag_enumeration", "tag_expression", "namespace_declaration", 
			"qualified_name", "enum_declaration", "enum_body", "enum_variant", "enum_payload_list", 
			"enum_payload_item", "field_ident", "plain_ident", "top_level_declaration", 
			"let_declaration", "statement", "match_statement", "labeled_statement", 
			"break_statement", "continue_statement", "expression_statement", "expression_block", 
			"statement_block", "block_statements", "if_expression", "if_statement", 
			"match_expression", "for_statement", "range_for_control", "traditional_for_control", 
			"for_initializer", "for_iterator", "while_statement", "foreach_statement", 
			"foreach_control", "foreach_binding", "foreach_tuple_elem", "return_statement", 
			"match_body", "match_arm", "pattern", "type_binding_pattern", "simple_pattern_type", 
			"variant_pattern", "variant_pattern_arg", "tuple_pattern_elem", "attribute", 
			"attribute_path", "const_declaration", "variable_declaration", "tuple_decl_elem", 
			"visibility_modifier", "cvt_modifier", "backlink_modifier", "modifiers", 
			"field_declaration", "variable_declarators", "variable_declarator", "method_declaration", 
			"constructor_declaration", "parameters", "parameter_list", "parameter", 
			"method_body", "operator_declaration", "overloadable_operator", "type_declaration", 
			"type_body", "type_member", "trait_declaration", "trait_supers", "trait_body", 
			"trait_block", "trait_member", "union_declaration", "union_body", "union_payload", 
			"union_variant", "impl_declaration", "type_with_params", "impl_block", 
			"impl_member", "return_type", "type", "type_suffix", "base_type", "tuple_type", 
			"tuple_type_element", "class_type", "predefined_type", "numeric_type", 
			"integral_type", "floating_point_type", "rank_specifier", "generic_parameter", 
			"constraint_list", "constraint", "type_parameters", "type_argument_list", 
			"type_or_const_arg", "nested_gt", "tuple_literal", "parenthesized_expression", 
			"nonAssignmentExpression", "expression", "assignment_expression", "ternary_expression", 
			"null_coalescing_expression", "range_expression", "range_operator", "assignment_operator", 
			"binary_or_expression", "binary_and_expression", "inclusive_or_expression", 
			"exclusive_or_expression", "and_expression", "equality_expression", "relational_expression", 
			"shift_expression", "left_shift", "right_shift", "additive_expression", 
			"multiplicative_expression", "exponentiation_expression", "unary_expression", 
			"cast_expression", "primary_expression", "primary_expression_start", 
			"struct_literal_expression", "struct_field_init", "lambda_expression", 
			"lambda_param", "postfix_operator", "array_literal", "expression_list", 
			"arguments", "argument_list", "namedArgument", "positionalArgument", 
			"argument", "literal", "string_literal", "interpolated_regular_string", 
			"interpolated_regular_string_part", "interpolated_string_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u00EF\\u00BB\\u00BF'", null, "'/***/'", null, null, null, null, 
			"'as'", "'backlink'", "'Box'", "'bool'", "'break'", "'char'", "'const'", 
			"'continue'", "'decimal'", "'drops'", "'else'", "'enum'", "'extern'", 
			"'false'", "'f32'", "'f64'", "'for'", "'foreach'", "'if'", "'in'", "'inout'", 
			"'i8'", "'i16'", "'i32'", "'i64'", "'i128'", "'is'", "'keeps'", "'let'", 
			"'mutates'", "'namespace'", "'none'", "'match'", "'operator'", "'priv'", 
			"'pub'", "'return'", "'self'", "'static'", "'str'", "'type'", "'tag'", 
			"'tagged'", "'trait'", "'true'", "'u8'", "'u16'", "'u32'", "'u64'", "'u128'", 
			"'union'", "'use'", "'value'", "'var'", "'void'", "'while'", "'impl'", 
			"'private'", "'_'", null, null, null, null, null, null, null, null, null, 
			null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'.'", "','", "'::'", 
			"':'", "';'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'&'", "'|'", 
			"'^'", "'!'", "'~'", "'#'", "'='", "'<'", "'>'", "'?'", "'??'", "'?.'", 
			"'++'", "'--'", "'&&'", "'||'", "'=='", "'!='", "'<='", "'>='", "'+='", 
			"'-='", "'*='", "'**='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", 
			"'..>='", "'..>'", "'..='", "'..'", "'=>'", "'{{'", null, null, null, 
			null, null, null, null, null, "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BYTE_ORDER_MARK", "SINGLE_LINE_DOC_COMMENT", "EMPTY_DELIMITED_DOC_COMMENT", 
			"DELIMITED_DOC_COMMENT", "SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", 
			"WHITESPACES", "AS", "BACKLINK", "BOX_KW", "BOOL", "BREAK", "CHAR", "CONST", 
			"CONTINUE", "DECIMAL", "DROPS", "ELSE", "ENUM", "EXTERN", "FALSE", "F32", 
			"F64", "FOR", "FOREACH", "IF", "IN", "INOUT", "INT8", "INT16", "INT32", 
			"INT64", "INT128", "IS", "KEEPS", "LET", "MUTATES", "NAMESPACE", "NONE", 
			"MATCH", "OPERATOR", "PRIV", "PUB", "RETURN", "SELF", "STATIC", "STR", 
			"TYPE", "TAG", "TAGGED", "TRAIT", "TRUE", "UINT8", "UINT16", "UINT32", 
			"UINT64", "UINT128", "UNION", "USE", "VALUE", "VAR", "VOID", "WHILE", 
			"IMPL", "PRIVATE", "UNDERSCORE", "IDENTIFIER", "LITERAL_ACCESS", "INTEGER_LITERAL", 
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
			"OP_LEFT_SHIFT_ASSIGNMENT", "OP_RANGE_DESC_INC", "OP_RANGE_DESC_EX", 
			"OP_RANGE_INC", "OP_RANGE", "FAT_ARROW", "DOUBLE_CURLY_INSIDE", "OPEN_BRACE_INSIDE", 
			"REGULAR_CHAR_INSIDE", "REGULAR_STRING_INSIDE", "VERBATIUM_DOUBLE_QUOTE_INSIDE", 
			"VERBATIUM_INSIDE_STRING", "DOUBLE_QUOTE_INSIDE", "CLOSE_BRACE_INSIDE", 
			"FORMAT_STRING", "DOUBLE_CURLY_CLOSE_INSIDE", "THIS"
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
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9218846807249481216L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 68719738891L) != 0)) {
				{
				{
				setState(306);
				top_level_declaration();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
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
			setState(314);
			modifiers();
			setState(315);
			match(EXTERN);
			setState(316);
			match(REGULAR_STRING);
			setState(317);
			match(OPEN_BRACE);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6044090201331018752L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 34359869445L) != 0)) {
				{
				{
				setState(318);
				extern_member();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
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
			setState(326);
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
			setState(328);
			match(USE);
			setState(329);
			qualified_name();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==DOUBLE_COLON) {
				{
				setState(330);
				use_tail();
				}
			}

			setState(333);
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
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(DOUBLE_COLON);
				setState(336);
				use_selector();
				}
				break;
			case AS:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
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
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				match(STAR);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(IDENTIFIER);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(342);
					use_alias();
					}
				}

				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(OPEN_BRACE);
				setState(346);
				use_selector_item();
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(347);
						match(COMMA);
						setState(348);
						use_selector_item();
						}
						} 
					}
					setState(353);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(354);
					match(COMMA);
					}
				}

				setState(357);
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
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(IDENTIFIER);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(362);
					use_alias();
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
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
			setState(368);
			match(AS);
			setState(369);
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
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 8388611L) != 0)) {
				{
				setState(371);
				visibility_modifier();
				}
			}

			setState(374);
			match(TAG);
			setState(375);
			tag_declaration();
			setState(376);
			match(AS);
			setState(377);
			match(IDENTIFIER);
			setState(378);
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
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(OPEN_BRACE);
				setState(382);
				tag_enumeration();
				setState(383);
				match(CLOSE_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(OPEN_BRACE);
				setState(386);
				tag_expression(0);
				setState(387);
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
			setState(391);
			type();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(392);
				match(COMMA);
				setState(393);
				type();
				}
				}
				setState(398);
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
		public TerminalNode MINUS() { return getToken(NebulaParser.MINUS, 0); }
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
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(400);
				match(OPEN_PARENS);
				setState(401);
				tag_expression(0);
				setState(402);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				{
				setState(404);
				match(BANG);
				setState(405);
				tag_expression(5);
				}
				break;
			case 3:
				{
				setState(406);
				type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(418);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Tag_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tag_expression);
						setState(409);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(410);
						match(AMP);
						}
						setState(411);
						tag_expression(5);
						}
						break;
					case 2:
						{
						_localctx = new Tag_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tag_expression);
						setState(412);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(413);
						match(PIPE);
						}
						setState(414);
						tag_expression(4);
						}
						break;
					case 3:
						{
						_localctx = new Tag_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tag_expression);
						setState(415);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(416);
						match(MINUS);
						}
						setState(417);
						tag_expression(3);
						}
						break;
					}
					} 
				}
				setState(422);
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
			setState(423);
			match(NAMESPACE);
			setState(424);
			qualified_name();
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(425);
				match(OPEN_BRACE);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9218846807249481216L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 68719738891L) != 0)) {
					{
					{
					setState(426);
					top_level_declaration();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				match(CLOSE_BRACE);
				}
				break;
			case SEMICOLON:
				{
				setState(433);
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
			setState(436);
			match(IDENTIFIER);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==DOUBLE_COLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(438);
					match(IDENTIFIER);
					}
					} 
				}
				setState(443);
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
		public Enum_bodyContext enum_body() {
			return getRuleContext(Enum_bodyContext.class,0);
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
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
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
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(444);
				attribute();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 8388611L) != 0)) {
				{
				setState(450);
				visibility_modifier();
				}
			}

			setState(453);
			match(ENUM);
			setState(454);
			match(IDENTIFIER);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(455);
				type_parameters();
				}
			}

			setState(458);
			enum_body();
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
	public static class Enum_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public List<Enum_variantContext> enum_variant() {
			return getRuleContexts(Enum_variantContext.class);
		}
		public Enum_variantContext enum_variant(int i) {
			return getRuleContext(Enum_variantContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Enum_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterEnum_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitEnum_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitEnum_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_bodyContext enum_body() throws RecognitionException {
		Enum_bodyContext _localctx = new Enum_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enum_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(OPEN_BRACE);
			setState(461);
			enum_variant();
			setState(466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					match(COMMA);
					setState(463);
					enum_variant();
					}
					} 
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(469);
				match(COMMA);
				}
			}

			setState(472);
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
	public static class Enum_variantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public Enum_payload_listContext enum_payload_list() {
			return getRuleContext(Enum_payload_listContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Enum_variantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterEnum_variant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitEnum_variant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitEnum_variant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_variantContext enum_variant() throws RecognitionException {
		Enum_variantContext _localctx = new Enum_variantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enum_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(IDENTIFIER);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(475);
				match(OPEN_PARENS);
				setState(476);
				enum_payload_list();
				setState(477);
				match(CLOSE_PARENS);
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
	public static class Enum_payload_listContext extends ParserRuleContext {
		public List<Enum_payload_itemContext> enum_payload_item() {
			return getRuleContexts(Enum_payload_itemContext.class);
		}
		public Enum_payload_itemContext enum_payload_item(int i) {
			return getRuleContext(Enum_payload_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Enum_payload_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_payload_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterEnum_payload_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitEnum_payload_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitEnum_payload_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_payload_listContext enum_payload_list() throws RecognitionException {
		Enum_payload_listContext _localctx = new Enum_payload_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enum_payload_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			enum_payload_item();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(482);
				match(COMMA);
				setState(483);
				enum_payload_item();
				}
				}
				setState(488);
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
	public static class Enum_payload_itemContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Field_identContext field_ident() {
			return getRuleContext(Field_identContext.class,0);
		}
		public Enum_payload_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_payload_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterEnum_payload_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitEnum_payload_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitEnum_payload_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_payload_itemContext enum_payload_item() throws RecognitionException {
		Enum_payload_itemContext _localctx = new Enum_payload_itemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enum_payload_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			type();
			setState(490);
			field_ident();
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
	public static class Field_identContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode VALUE() { return getToken(NebulaParser.VALUE, 0); }
		public TerminalNode LET() { return getToken(NebulaParser.LET, 0); }
		public TerminalNode STR() { return getToken(NebulaParser.STR, 0); }
		public Field_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterField_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitField_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitField_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_identContext field_ident() throws RecognitionException {
		Field_identContext _localctx = new Field_identContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_field_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & 2164262913L) != 0)) ) {
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
	public static class Plain_identContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode VALUE() { return getToken(NebulaParser.VALUE, 0); }
		public TerminalNode LET() { return getToken(NebulaParser.LET, 0); }
		public TerminalNode STR() { return getToken(NebulaParser.STR, 0); }
		public TerminalNode SELF() { return getToken(NebulaParser.SELF, 0); }
		public TerminalNode KEEPS() { return getToken(NebulaParser.KEEPS, 0); }
		public TerminalNode DROPS() { return getToken(NebulaParser.DROPS, 0); }
		public TerminalNode MUTATES() { return getToken(NebulaParser.MUTATES, 0); }
		public TerminalNode INOUT() { return getToken(NebulaParser.INOUT, 0); }
		public TerminalNode UNION() { return getToken(NebulaParser.UNION, 0); }
		public TerminalNode MATCH() { return getToken(NebulaParser.MATCH, 0); }
		public TerminalNode BOX_KW() { return getToken(NebulaParser.BOX_KW, 0); }
		public Plain_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plain_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterPlain_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitPlain_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitPlain_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plain_identContext plain_ident() throws RecognitionException {
		Plain_identContext _localctx = new Plain_identContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_plain_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 145522736066986113L) != 0)) ) {
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
		public Let_declarationContext let_declaration() {
			return getRuleContext(Let_declarationContext.class,0);
		}
		public Const_declarationContext const_declaration() {
			return getRuleContext(Const_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
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
		enterRule(_localctx, 42, RULE_top_level_declaration);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				use_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				tag_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				enum_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				let_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
				const_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(501);
				variable_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(502);
				method_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(503);
				type_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(504);
				trait_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(505);
				impl_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(506);
				union_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(507);
				namespace_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(508);
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
	public static class Let_declarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(NebulaParser.LET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(NebulaParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Let_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterLet_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitLet_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitLet_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_declarationContext let_declaration() throws RecognitionException {
		Let_declarationContext _localctx = new Let_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_let_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(LET);
			setState(512);
			match(IDENTIFIER);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(513);
				match(COLON);
				setState(514);
				type();
				}
			}

			setState(517);
			match(ASSIGNMENT);
			setState(518);
			expression();
			setState(519);
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
		public Let_declarationContext let_declaration() {
			return getRuleContext(Let_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
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
		public Match_statementContext match_statement() {
			return getRuleContext(Match_statementContext.class,0);
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
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				use_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				tag_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				const_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				let_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(525);
				variable_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(526);
				statement_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(527);
				labeled_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(528);
				if_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(529);
				for_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(530);
				while_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(531);
				foreach_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(532);
				return_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(533);
				break_statement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(534);
				continue_statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(535);
				match_statement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(536);
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
	public static class Match_statementContext extends ParserRuleContext {
		public Match_expressionContext match_expression() {
			return getRuleContext(Match_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public Match_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterMatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitMatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitMatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_statementContext match_statement() throws RecognitionException {
		Match_statementContext _localctx = new Match_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_match_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match_expression();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(540);
				match(SEMICOLON);
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
	public static class Labeled_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_labeled_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(IDENTIFIER);
			setState(544);
			match(COLON);
			setState(545);
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
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(NebulaParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 52, RULE_break_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(BREAK);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(548);
				match(IDENTIFIER);
				}
			}

			setState(551);
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
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 54, RULE_continue_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(CONTINUE);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(554);
				match(IDENTIFIER);
				}
			}

			setState(557);
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
		enterRule(_localctx, 56, RULE_expression_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			expression();
			setState(560);
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
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 58, RULE_expression_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(OPEN_BRACE);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					statement();
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
				{
				setState(569);
				expression();
				}
			}

			setState(572);
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
		enterRule(_localctx, 60, RULE_statement_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(OPEN_BRACE);
			setState(575);
			block_statements();
			setState(576);
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
		enterRule(_localctx, 62, RULE_block_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3661665914323456L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 63401275389L) != 0) || _la==THIS) {
				{
				{
				setState(578);
				statement();
				}
				}
				setState(583);
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
	public static class If_expressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NebulaParser.IF, 0); }
		public List<Expression_blockContext> expression_block() {
			return getRuleContexts(Expression_blockContext.class);
		}
		public Expression_blockContext expression_block(int i) {
			return getRuleContext(Expression_blockContext.class,i);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(NebulaParser.ELSE, 0); }
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(IF);
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(585);
				parenthesized_expression();
				}
				break;
			case 2:
				{
				setState(586);
				expression();
				}
				break;
			}
			setState(589);
			expression_block();
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(590);
				match(ELSE);
				setState(591);
				if_expression();
				}
				break;
			case 2:
				{
				setState(592);
				match(ELSE);
				setState(593);
				expression_block();
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
		enterRule(_localctx, 66, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(IF);
			setState(597);
			parenthesized_expression();
			setState(598);
			statement();
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(599);
				match(ELSE);
				setState(600);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 68, RULE_match_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(MATCH);
			setState(604);
			expression();
			setState(605);
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
		public Range_for_controlContext range_for_control() {
			return getRuleContext(Range_for_controlContext.class,0);
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
		enterRule(_localctx, 70, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(FOR);
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(608);
				traditional_for_control();
				}
				break;
			case 2:
				{
				setState(609);
				range_for_control();
				}
				break;
			}
			setState(612);
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
	public static class Range_for_controlContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public TerminalNode IN() { return getToken(NebulaParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(NebulaParser.UNDERSCORE, 0); }
		public TerminalNode VAR() { return getToken(NebulaParser.VAR, 0); }
		public TerminalNode LET() { return getToken(NebulaParser.LET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Range_for_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_for_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterRange_for_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitRange_for_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitRange_for_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_for_controlContext range_for_control() throws RecognitionException {
		Range_for_controlContext _localctx = new Range_for_controlContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_range_for_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(OPEN_PARENS);
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(615);
				match(VAR);
				}
				break;
			case LET:
				{
				setState(616);
				match(LET);
				}
				break;
			case BOX_KW:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case INT128:
			case STR:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case UINT128:
			case VOID:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(617);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(620);
			_la = _input.LA(1);
			if ( !(_la==UNDERSCORE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(621);
			match(IN);
			setState(622);
			expression();
			setState(623);
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
		enterRule(_localctx, 74, RULE_traditional_for_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(OPEN_PARENS);
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(626);
				for_initializer();
				}
				break;
			}
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
				{
				setState(629);
				expression();
				}
			}

			setState(632);
			match(SEMICOLON);
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
				{
				setState(633);
				for_iterator();
				}
			}

			setState(636);
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
		enterRule(_localctx, 76, RULE_for_initializer);
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
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
		enterRule(_localctx, 78, RULE_for_iterator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
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
		enterRule(_localctx, 80, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(WHILE);
			setState(645);
			parenthesized_expression();
			setState(646);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 82, RULE_foreach_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(FOREACH);
			setState(649);
			foreach_control();
			setState(650);
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
	public static class Foreach_controlContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public Foreach_bindingContext foreach_binding() {
			return getRuleContext(Foreach_bindingContext.class,0);
		}
		public TerminalNode IN() { return getToken(NebulaParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
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
		enterRule(_localctx, 84, RULE_foreach_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(OPEN_PARENS);
			setState(653);
			foreach_binding();
			setState(654);
			match(IN);
			setState(655);
			expression();
			setState(656);
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
	public static class Foreach_bindingContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(NebulaParser.UNDERSCORE, 0); }
		public TerminalNode VAR() { return getToken(NebulaParser.VAR, 0); }
		public TerminalNode LET() { return getToken(NebulaParser.LET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public List<Foreach_tuple_elemContext> foreach_tuple_elem() {
			return getRuleContexts(Foreach_tuple_elemContext.class);
		}
		public Foreach_tuple_elemContext foreach_tuple_elem(int i) {
			return getRuleContext(Foreach_tuple_elemContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Foreach_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterForeach_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitForeach_binding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitForeach_binding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_bindingContext foreach_binding() throws RecognitionException {
		Foreach_bindingContext _localctx = new Foreach_bindingContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_foreach_binding);
		int _la;
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(658);
					match(VAR);
					}
					break;
				case LET:
					{
					setState(659);
					match(LET);
					}
					break;
				case BOX_KW:
				case BOOL:
				case CHAR:
				case DECIMAL:
				case F32:
				case F64:
				case INT8:
				case INT16:
				case INT32:
				case INT64:
				case INT128:
				case STR:
				case UINT8:
				case UINT16:
				case UINT32:
				case UINT64:
				case UINT128:
				case VOID:
				case IDENTIFIER:
				case OPEN_PARENS:
					{
					setState(660);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(663);
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(OPEN_PARENS);
				setState(665);
				foreach_tuple_elem();
				setState(668); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(666);
					match(COMMA);
					setState(667);
					foreach_tuple_elem();
					}
					}
					setState(670); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(672);
				match(CLOSE_PARENS);
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
	public static class Foreach_tuple_elemContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(NebulaParser.UNDERSCORE, 0); }
		public Foreach_tuple_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_tuple_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterForeach_tuple_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitForeach_tuple_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitForeach_tuple_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_tuple_elemContext foreach_tuple_elem() throws RecognitionException {
		Foreach_tuple_elemContext _localctx = new Foreach_tuple_elemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_foreach_tuple_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			type();
			setState(677);
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
		enterRule(_localctx, 90, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(RETURN);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
				{
				setState(680);
				expression();
				}
			}

			setState(683);
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
		enterRule(_localctx, 92, RULE_match_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(OPEN_BRACE);
			setState(686);
			match_arm();
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(687);
					match(COMMA);
					setState(688);
					match_arm();
					}
					} 
				}
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(694);
				match(COMMA);
				}
			}

			setState(697);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(NebulaParser.IF, 0); }
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
		enterRule(_localctx, 94, RULE_match_arm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			pattern();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(700);
				match(IF);
				setState(701);
				expression();
				}
			}

			setState(704);
			match(FAT_ARROW);
			setState(705);
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
		public TerminalNode NONE() { return getToken(NebulaParser.NONE, 0); }
		public TerminalNode UNDERSCORE() { return getToken(NebulaParser.UNDERSCORE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Type_binding_patternContext type_binding_pattern() {
			return getRuleContext(Type_binding_patternContext.class,0);
		}
		public Variant_patternContext variant_pattern() {
			return getRuleContext(Variant_patternContext.class,0);
		}
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public List<Tuple_pattern_elemContext> tuple_pattern_elem() {
			return getRuleContexts(Tuple_pattern_elemContext.class);
		}
		public Tuple_pattern_elemContext tuple_pattern_elem(int i) {
			return getRuleContext(Tuple_pattern_elemContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
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
		enterRule(_localctx, 96, RULE_pattern);
		int _la;
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				match(NONE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				match(UNDERSCORE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				type_binding_pattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(711);
				variant_pattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(712);
				qualified_name();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(713);
				match(OPEN_PARENS);
				setState(714);
				tuple_pattern_elem();
				setState(717); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(715);
					match(COMMA);
					setState(716);
					tuple_pattern_elem();
					}
					}
					setState(719); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(721);
				match(CLOSE_PARENS);
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
	public static class Type_binding_patternContext extends ParserRuleContext {
		public Simple_pattern_typeContext simple_pattern_type() {
			return getRuleContext(Simple_pattern_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(NebulaParser.UNDERSCORE, 0); }
		public Type_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_binding_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType_binding_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType_binding_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType_binding_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_binding_patternContext type_binding_pattern() throws RecognitionException {
		Type_binding_patternContext _localctx = new Type_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_type_binding_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			simple_pattern_type();
			setState(726);
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
	public static class Simple_pattern_typeContext extends ParserRuleContext {
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Simple_pattern_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_pattern_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterSimple_pattern_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitSimple_pattern_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitSimple_pattern_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_pattern_typeContext simple_pattern_type() throws RecognitionException {
		Simple_pattern_typeContext _localctx = new Simple_pattern_typeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_simple_pattern_type);
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case INT128:
			case STR:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case UINT128:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				predefined_type();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				match(IDENTIFIER);
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
	public static class Variant_patternContext extends ParserRuleContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public List<Variant_pattern_argContext> variant_pattern_arg() {
			return getRuleContexts(Variant_pattern_argContext.class);
		}
		public Variant_pattern_argContext variant_pattern_arg(int i) {
			return getRuleContext(Variant_pattern_argContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Variant_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterVariant_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitVariant_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitVariant_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variant_patternContext variant_pattern() throws RecognitionException {
		Variant_patternContext _localctx = new Variant_patternContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_variant_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			qualified_name();
			setState(733);
			match(OPEN_PARENS);
			setState(734);
			variant_pattern_arg();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(735);
				match(COMMA);
				setState(736);
				variant_pattern_arg();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
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
	public static class Variant_pattern_argContext extends ParserRuleContext {
		public Variant_patternContext variant_pattern() {
			return getRuleContext(Variant_patternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(NebulaParser.UNDERSCORE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Variant_pattern_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_pattern_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterVariant_pattern_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitVariant_pattern_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitVariant_pattern_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variant_pattern_argContext variant_pattern_arg() throws RecognitionException {
		Variant_pattern_argContext _localctx = new Variant_pattern_argContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variant_pattern_arg);
		int _la;
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				variant_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				type();
				setState(746);
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
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				match(UNDERSCORE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(749);
				literal();
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
	public static class Tuple_pattern_elemContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(NebulaParser.UNDERSCORE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Tuple_pattern_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTuple_pattern_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTuple_pattern_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTuple_pattern_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_elemContext tuple_pattern_elem() throws RecognitionException {
		Tuple_pattern_elemContext _localctx = new Tuple_pattern_elemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tuple_pattern_elem);
		int _la;
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOX_KW:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case INT128:
			case STR:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case UINT128:
			case VOID:
			case IDENTIFIER:
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				type();
				setState(753);
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
				break;
			case FALSE:
			case TRUE:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
				literal();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				match(UNDERSCORE);
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
		enterRule(_localctx, 108, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(HASH);
			setState(760);
			match(OPEN_BRACKET);
			setState(761);
			attribute_path();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(762);
				arguments();
				}
			}

			setState(765);
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
		enterRule(_localctx, 110, RULE_attribute_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(IDENTIFIER);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE_COLON) {
				{
				{
				setState(768);
				match(DOUBLE_COLON);
				setState(769);
				match(IDENTIFIER);
				}
				}
				setState(774);
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
		enterRule(_localctx, 112, RULE_const_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(775);
				attribute();
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(781);
			match(CONST);
			setState(782);
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
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public List<Tuple_decl_elemContext> tuple_decl_elem() {
			return getRuleContexts(Tuple_decl_elemContext.class);
		}
		public Tuple_decl_elemContext tuple_decl_elem(int i) {
			return getRuleContext(Tuple_decl_elemContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(NebulaParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NebulaParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(NebulaParser.VAR, 0); }
		public TerminalNode LET() { return getToken(NebulaParser.LET, 0); }
		public TerminalNode CONST() { return getToken(NebulaParser.CONST, 0); }
		public Backlink_modifierContext backlink_modifier() {
			return getRuleContext(Backlink_modifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 114, RULE_variable_declaration);
		int _la;
		try {
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				modifiers();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(785);
					match(CONST);
					}
				}

				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BACKLINK) {
					{
					setState(788);
					backlink_modifier();
					}
				}

				setState(791);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(792);
				match(OPEN_PARENS);
				setState(793);
				tuple_decl_elem();
				setState(796); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(794);
					match(COMMA);
					setState(795);
					tuple_decl_elem();
					}
					}
					setState(798); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(800);
				match(CLOSE_PARENS);
				setState(801);
				match(ASSIGNMENT);
				setState(802);
				expression();
				setState(803);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				modifiers();
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(806);
					match(CONST);
					}
				}

				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BACKLINK) {
					{
					setState(809);
					backlink_modifier();
					}
				}

				setState(815);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(812);
					match(VAR);
					}
					break;
				case LET:
					{
					setState(813);
					match(LET);
					}
					break;
				case BOX_KW:
				case BOOL:
				case CHAR:
				case DECIMAL:
				case F32:
				case F64:
				case INT8:
				case INT16:
				case INT32:
				case INT64:
				case INT128:
				case STR:
				case UINT8:
				case UINT16:
				case UINT32:
				case UINT64:
				case UINT128:
				case VOID:
				case IDENTIFIER:
				case OPEN_PARENS:
					{
					setState(814);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(817);
				variable_declarators();
				setState(818);
				match(SEMICOLON);
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
	public static class Tuple_decl_elemContext extends ParserRuleContext {
		public Plain_identContext plain_ident() {
			return getRuleContext(Plain_identContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Tuple_decl_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_decl_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTuple_decl_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTuple_decl_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTuple_decl_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_decl_elemContext tuple_decl_elem() throws RecognitionException {
		Tuple_decl_elemContext _localctx = new Tuple_decl_elemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_tuple_decl_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(822);
				type();
				}
				break;
			}
			setState(825);
			plain_ident();
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
		public TerminalNode PUB() { return getToken(NebulaParser.PUB, 0); }
		public TerminalNode PRIV() { return getToken(NebulaParser.PRIV, 0); }
		public TerminalNode PRIVATE() { return getToken(NebulaParser.PRIVATE, 0); }
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
		enterRule(_localctx, 118, RULE_visibility_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 8388611L) != 0)) ) {
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
		public TerminalNode INOUT() { return getToken(NebulaParser.INOUT, 0); }
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
		enterRule(_localctx, 120, RULE_cvt_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 172067258368L) != 0)) ) {
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
		enterRule(_localctx, 122, RULE_backlink_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
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
		public List<TerminalNode> VALUE() { return getTokens(NebulaParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(NebulaParser.VALUE, i);
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
		enterRule(_localctx, 124, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 8650771L) != 0)) {
				{
				setState(836);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIV:
				case PUB:
				case PRIVATE:
					{
					setState(833);
					visibility_modifier();
					}
					break;
				case STATIC:
					{
					setState(834);
					match(STATIC);
					}
					break;
				case VALUE:
					{
					setState(835);
					match(VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(840);
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
		enterRule(_localctx, 126, RULE_field_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(841);
				attribute();
				}
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(847);
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
		enterRule(_localctx, 128, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			variable_declarator();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(850);
				match(COMMA);
				setState(851);
				variable_declarator();
				}
				}
				setState(856);
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
		public Plain_identContext plain_ident() {
			return getRuleContext(Plain_identContext.class,0);
		}
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
		enterRule(_localctx, 130, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			plain_ident();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(858);
				match(ASSIGNMENT);
				setState(859);
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
		public Plain_identContext plain_ident() {
			return getRuleContext(Plain_identContext.class,0);
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
		enterRule(_localctx, 132, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(862);
				attribute();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(868);
			modifiers();
			setState(869);
			return_type();
			setState(870);
			plain_ident();
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(871);
				type_parameters();
				}
			}

			setState(874);
			parameters();
			setState(875);
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
		enterRule(_localctx, 134, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(877);
				attribute();
				}
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 8388611L) != 0)) {
				{
				setState(883);
				visibility_modifier();
				}
			}

			setState(886);
			match(IDENTIFIER);
			setState(887);
			parameters();
			setState(888);
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
		enterRule(_localctx, 136, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(OPEN_PARENS);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4891050121535630336L) != 0) || _la==IDENTIFIER || _la==OPEN_PARENS) {
				{
				setState(891);
				parameter_list();
				}
			}

			setState(894);
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
		enterRule(_localctx, 138, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			parameter();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(897);
				match(COMMA);
				setState(898);
				parameter();
				}
				}
				setState(903);
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
		public Field_identContext field_ident() {
			return getRuleContext(Field_identContext.class,0);
		}
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
		enterRule(_localctx, 140, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 172067258368L) != 0)) {
				{
				setState(904);
				cvt_modifier();
				}
			}

			setState(907);
			type();
			setState(908);
			field_ident();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(909);
				match(ASSIGNMENT);
				setState(910);
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
		enterRule(_localctx, 142, RULE_method_body);
		try {
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(913);
				expression_block();
				}
				break;
			case FAT_ARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(914);
				match(FAT_ARROW);
				setState(915);
				expression();
				setState(917);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(916);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
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
		enterRule(_localctx, 144, RULE_operator_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(922);
				attribute();
				}
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(928);
			return_type();
			setState(929);
			match(OPERATOR);
			setState(930);
			overloadable_operator();
			setState(931);
			parameters();
			setState(932);
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
		enterRule(_localctx, 146, RULE_overloadable_operator);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(936);
				match(STAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(937);
				match(DIV);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(938);
				match(PERCENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(939);
				match(CARET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(940);
				match(AMP);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(941);
				match(PIPE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(942);
				match(LT);
				setState(943);
				match(LT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(944);
				match(GT);
				setState(945);
				match(GT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(946);
				match(OP_EQ);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(947);
				match(OP_NE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(948);
				match(OPEN_BRACKET);
				setState(949);
				match(CLOSE_BRACKET);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(950);
				match(OPEN_BRACKET);
				setState(951);
				match(CLOSE_BRACKET);
				setState(952);
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
	public static class Type_declarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(NebulaParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Type_bodyContext type_body() {
			return getRuleContext(Type_bodyContext.class,0);
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
		public TerminalNode VALUE() { return getToken(NebulaParser.VALUE, 0); }
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(955);
				attribute();
				}
				}
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 8388611L) != 0)) {
				{
				setState(961);
				visibility_modifier();
				}
			}

			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(964);
				match(VALUE);
				}
			}

			setState(967);
			match(TYPE);
			setState(968);
			match(IDENTIFIER);
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(969);
				type_parameters();
				}
			}

			setState(972);
			type_body();
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
	public static class Type_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public List<Type_memberContext> type_member() {
			return getRuleContexts(Type_memberContext.class);
		}
		public Type_memberContext type_member(int i) {
			return getRuleContext(Type_memberContext.class,i);
		}
		public Type_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_bodyContext type_body() throws RecognitionException {
		Type_bodyContext _localctx = new Type_bodyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_type_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(OPEN_BRACE);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8349898094892117504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 34359869445L) != 0)) {
				{
				{
				setState(975);
				type_member();
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(981);
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
	public static class Type_memberContext extends ParserRuleContext {
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Type_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_memberContext type_member() throws RecognitionException {
		Type_memberContext _localctx = new Type_memberContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_type_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			field_declaration();
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
		public Trait_supersContext trait_supers() {
			return getRuleContext(Trait_supersContext.class,0);
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
		enterRule(_localctx, 154, RULE_trait_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(985);
				attribute();
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(991);
			match(TRAIT);
			setState(992);
			match(IDENTIFIER);
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(993);
				type_parameters();
				}
			}

			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(996);
				trait_supers();
				}
			}

			setState(999);
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
	public static class Trait_supersContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(NebulaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(NebulaParser.PLUS, i);
		}
		public Trait_supersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_supers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTrait_supers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTrait_supers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTrait_supers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_supersContext trait_supers() throws RecognitionException {
		Trait_supersContext _localctx = new Trait_supersContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_trait_supers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(COLON);
			setState(1002);
			type();
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(1003);
				match(PLUS);
				setState(1004);
				type();
				}
				}
				setState(1009);
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
		enterRule(_localctx, 158, RULE_trait_body);
		try {
			setState(1012);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				trait_block();
				}
				break;
			case BOX_KW:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case INT128:
			case PRIV:
			case PUB:
			case SELF:
			case STATIC:
			case STR:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case UINT128:
			case VALUE:
			case VOID:
			case PRIVATE:
			case IDENTIFIER:
			case OPEN_PARENS:
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
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
		enterRule(_localctx, 160, RULE_trait_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(OPEN_BRACE);
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6044090201331018752L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 34359869445L) != 0)) {
				{
				{
				setState(1015);
				trait_member();
				}
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1021);
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
		enterRule(_localctx, 162, RULE_trait_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
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
		enterRule(_localctx, 164, RULE_union_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(1025);
				attribute();
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAGGED) {
				{
				setState(1031);
				match(TAGGED);
				}
			}

			setState(1034);
			match(UNION);
			setState(1035);
			match(IDENTIFIER);
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1036);
				type_parameters();
				}
			}

			setState(1039);
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
		enterRule(_localctx, 166, RULE_union_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(OPEN_BRACE);
			setState(1042);
			union_variant();
			setState(1047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1043);
					match(COMMA);
					setState(1044);
					union_variant();
					}
					} 
				}
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1050);
				match(COMMA);
				}
			}

			setState(1053);
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
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
		enterRule(_localctx, 168, RULE_union_payload);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(OPEN_PARENS);
			setState(1056);
			parameter();
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1057);
				match(COMMA);
				setState(1058);
				parameter();
				}
				}
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1064);
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
		enterRule(_localctx, 170, RULE_union_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(IDENTIFIER);
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(1067);
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
		public Type_with_paramsContext type_with_params() {
			return getRuleContext(Type_with_paramsContext.class,0);
		}
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
		public TerminalNode FOR() { return getToken(NebulaParser.FOR, 0); }
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
		enterRule(_localctx, 172, RULE_impl_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH) {
				{
				{
				setState(1070);
				attribute();
				}
				}
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1076);
			match(IMPL);
			setState(1077);
			type_with_params();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1078);
				match(FOR);
				setState(1079);
				type();
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1080);
					match(COMMA);
					setState(1081);
					type();
					}
					}
					setState(1086);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(1089);
				impl_block();
				}
				break;
			case SEMICOLON:
				{
				setState(1090);
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
	public static class Type_with_paramsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_parametersContext type_parameters() {
			return getRuleContext(Type_parametersContext.class,0);
		}
		public Type_with_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_with_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType_with_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType_with_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType_with_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_with_paramsContext type_with_params() throws RecognitionException {
		Type_with_paramsContext _localctx = new Type_with_paramsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_type_with_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			type();
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1094);
				type_parameters();
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
		enterRule(_localctx, 176, RULE_impl_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(OPEN_BRACE);
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6044090201331018752L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 34359869445L) != 0)) {
				{
				{
				setState(1098);
				impl_member();
				}
				}
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1104);
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
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
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
		enterRule(_localctx, 178, RULE_impl_member);
		try {
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				method_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1107);
				operator_declaration();
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
	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(NebulaParser.VOID, 0); }
		public TerminalNode SELF() { return getToken(NebulaParser.SELF, 0); }
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
		enterRule(_localctx, 180, RULE_return_type);
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1110);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1111);
				match(SELF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1112);
				type();
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
		enterRule(_localctx, 182, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1115);
				match(IDENTIFIER);
				setState(1116);
				match(COLON);
				}
				break;
			}
			setState(1119);
			base_type();
			setState(1123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1120);
					type_suffix();
					}
					} 
				}
				setState(1125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
		enterRule(_localctx, 184, RULE_type_suffix);
		try {
			setState(1128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				rank_specifier();
				}
				break;
			case INTERR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
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
		enterRule(_localctx, 186, RULE_base_type);
		try {
			setState(1133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOX_KW:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
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
			case INT128:
			case STR:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case UINT128:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				predefined_type();
				}
				break;
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
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
		enterRule(_localctx, 188, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(OPEN_PARENS);
			setState(1136);
			tuple_type_element();
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1137);
				match(COMMA);
				setState(1138);
				tuple_type_element();
				}
				}
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1144);
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
		enterRule(_localctx, 190, RULE_tuple_type_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			type();
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1147);
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
		public TerminalNode BOX_KW() { return getToken(NebulaParser.BOX_KW, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
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
		enterRule(_localctx, 192, RULE_class_type);
		try {
			setState(1156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOX_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				match(BOX_KW);
				setState(1151);
				type_argument_list();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
				qualified_name();
				setState(1154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1153);
					type_argument_list();
					}
					break;
				}
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
	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(NebulaParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(NebulaParser.CHAR, 0); }
		public TerminalNode STR() { return getToken(NebulaParser.STR, 0); }
		public TerminalNode VOID() { return getToken(NebulaParser.VOID, 0); }
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
		enterRule(_localctx, 194, RULE_predefined_type);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1158);
				match(BOOL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159);
				match(CHAR);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1160);
				match(STR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(1161);
				match(VOID);
				}
				break;
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case INT128:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case UINT128:
				enterOuterAlt(_localctx, 5);
				{
				setState(1162);
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
		enterRule(_localctx, 196, RULE_numeric_type);
		try {
			setState(1167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case INT128:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case UINT128:
				enterOuterAlt(_localctx, 1);
				{
				setState(1165);
				integral_type();
				}
				break;
			case DECIMAL:
			case F32:
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(1166);
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
		public TerminalNode INT128() { return getToken(NebulaParser.INT128, 0); }
		public TerminalNode UINT8() { return getToken(NebulaParser.UINT8, 0); }
		public TerminalNode UINT16() { return getToken(NebulaParser.UINT16, 0); }
		public TerminalNode UINT32() { return getToken(NebulaParser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(NebulaParser.UINT64, 0); }
		public TerminalNode UINT128() { return getToken(NebulaParser.UINT128, 0); }
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
		enterRule(_localctx, 198, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 279223193539969024L) != 0)) ) {
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
		enterRule(_localctx, 200, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 12648448L) != 0)) ) {
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
		enterRule(_localctx, 202, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(OPEN_BRACKET);
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
				{
				setState(1174);
				expression();
				}
			}

			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1177);
				match(COMMA);
				}
				}
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1183);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public Constraint_listContext constraint_list() {
			return getRuleContext(Constraint_listContext.class,0);
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
		enterRule(_localctx, 204, RULE_generic_parameter);
		int _la;
		try {
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				type();
				setState(1186);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1188);
				match(IDENTIFIER);
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1189);
					match(COLON);
					setState(1190);
					constraint_list();
					}
				}

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
	public static class Constraint_listContext extends ParserRuleContext {
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(NebulaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(NebulaParser.PLUS, i);
		}
		public Constraint_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterConstraint_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitConstraint_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitConstraint_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constraint_listContext constraint_list() throws RecognitionException {
		Constraint_listContext _localctx = new Constraint_listContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_constraint_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			constraint();
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(1196);
				match(PLUS);
				setState(1197);
				constraint();
				}
				}
				setState(1202);
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
	public static class ConstraintContext extends ParserRuleContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
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
		enterRule(_localctx, 208, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			qualified_name();
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1204);
				type_argument_list();
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
		enterRule(_localctx, 210, RULE_type_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(LT);
			setState(1208);
			generic_parameter();
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1209);
				match(COMMA);
				setState(1210);
				generic_parameter();
				}
				}
				setState(1215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1216);
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
		public List<Type_or_const_argContext> type_or_const_arg() {
			return getRuleContexts(Type_or_const_argContext.class);
		}
		public Type_or_const_argContext type_or_const_arg(int i) {
			return getRuleContext(Type_or_const_argContext.class,i);
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
		enterRule(_localctx, 212, RULE_type_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(LT);
			setState(1219);
			type_or_const_arg();
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1220);
				match(COMMA);
				setState(1221);
				type_or_const_arg();
				}
				}
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1227);
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
	public static class Type_or_const_argContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Type_or_const_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_or_const_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterType_or_const_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitType_or_const_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitType_or_const_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_or_const_argContext type_or_const_arg() throws RecognitionException {
		Type_or_const_argContext _localctx = new Type_or_const_argContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_type_or_const_arg);
		try {
			setState(1231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOX_KW:
			case BOOL:
			case CHAR:
			case DECIMAL:
			case F32:
			case F64:
			case INT8:
			case INT16:
			case INT32:
			case INT64:
			case INT128:
			case STR:
			case UINT8:
			case UINT16:
			case UINT32:
			case UINT64:
			case UINT128:
			case VOID:
			case IDENTIFIER:
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229);
				type();
				}
				break;
			case FALSE:
			case TRUE:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case BIN_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				literal();
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
		enterRule(_localctx, 216, RULE_nested_gt);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				match(GT);
				setState(1235);
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
		enterRule(_localctx, 218, RULE_tuple_literal);
		int _la;
		try {
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				match(OPEN_PARENS);
				setState(1239);
				argument();
				setState(1242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1240);
					match(COMMA);
					setState(1241);
					argument();
					}
					}
					setState(1244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(1246);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(OPEN_PARENS);
				setState(1249);
				argument();
				setState(1250);
				match(COMMA);
				setState(1251);
				match(CLOSE_PARENS);
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
		enterRule(_localctx, 220, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(OPEN_PARENS);
			setState(1256);
			expression();
			setState(1257);
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
		public Ternary_expressionContext ternary_expression() {
			return getRuleContext(Ternary_expressionContext.class,0);
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
		enterRule(_localctx, 222, RULE_nonAssignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			ternary_expression();
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
		enterRule(_localctx, 224, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
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
		public Ternary_expressionContext ternary_expression() {
			return getRuleContext(Ternary_expressionContext.class,0);
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
		enterRule(_localctx, 226, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			ternary_expression();
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1264);
				assignment_operator();
				setState(1265);
				assignment_expression();
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
	public static class Ternary_expressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(NebulaParser.INTERR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public Ternary_expressionContext ternary_expression() {
			return getRuleContext(Ternary_expressionContext.class,0);
		}
		public Ternary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterTernary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitTernary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitTernary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_expressionContext ternary_expression() throws RecognitionException {
		Ternary_expressionContext _localctx = new Ternary_expressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_ternary_expression);
		try {
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1269);
				null_coalescing_expression();
				setState(1270);
				match(INTERR);
				setState(1271);
				expression();
				setState(1272);
				match(COLON);
				setState(1273);
				ternary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1275);
				null_coalescing_expression();
				setState(1276);
				match(INTERR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1278);
				null_coalescing_expression();
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
	public static class Null_coalescing_expressionContext extends ParserRuleContext {
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
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
		enterRule(_localctx, 230, RULE_null_coalescing_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			range_expression();
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1282);
				match(OP_COALESCING);
				setState(1283);
				null_coalescing_expression();
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
	public static class Range_expressionContext extends ParserRuleContext {
		public List<Binary_or_expressionContext> binary_or_expression() {
			return getRuleContexts(Binary_or_expressionContext.class);
		}
		public Binary_or_expressionContext binary_or_expression(int i) {
			return getRuleContext(Binary_or_expressionContext.class,i);
		}
		public Range_operatorContext range_operator() {
			return getRuleContext(Range_operatorContext.class,0);
		}
		public Range_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterRange_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitRange_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitRange_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_expressionContext range_expression() throws RecognitionException {
		Range_expressionContext _localctx = new Range_expressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_range_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			binary_or_expression();
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1287);
				range_operator();
				setState(1288);
				binary_or_expression();
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
	public static class Range_operatorContext extends ParserRuleContext {
		public TerminalNode OP_RANGE() { return getToken(NebulaParser.OP_RANGE, 0); }
		public TerminalNode OP_RANGE_INC() { return getToken(NebulaParser.OP_RANGE_INC, 0); }
		public TerminalNode OP_RANGE_DESC_EX() { return getToken(NebulaParser.OP_RANGE_DESC_EX, 0); }
		public TerminalNode OP_RANGE_DESC_INC() { return getToken(NebulaParser.OP_RANGE_DESC_INC, 0); }
		public Range_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterRange_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitRange_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitRange_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_operatorContext range_operator() throws RecognitionException {
		Range_operatorContext _localctx = new Range_operatorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_range_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 15L) != 0)) ) {
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
		enterRule(_localctx, 236, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 16760833L) != 0)) ) {
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
		enterRule(_localctx, 238, RULE_binary_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			binary_and_expression();
			setState(1301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1297);
					match(OP_OR);
					setState(1298);
					binary_and_expression();
					}
					} 
				}
				setState(1303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
		enterRule(_localctx, 240, RULE_binary_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			inclusive_or_expression();
			setState(1309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1305);
					match(OP_AND);
					setState(1306);
					inclusive_or_expression();
					}
					} 
				}
				setState(1311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
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
		enterRule(_localctx, 242, RULE_inclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			exclusive_or_expression();
			setState(1317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1313);
					match(PIPE);
					setState(1314);
					exclusive_or_expression();
					}
					} 
				}
				setState(1319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		enterRule(_localctx, 244, RULE_exclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			and_expression();
			setState(1325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1321);
					match(CARET);
					setState(1322);
					and_expression();
					}
					} 
				}
				setState(1327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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
		enterRule(_localctx, 246, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			equality_expression();
			setState(1333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1329);
					match(AMP);
					setState(1330);
					equality_expression();
					}
					} 
				}
				setState(1335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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
		enterRule(_localctx, 248, RULE_equality_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			relational_expression();
			setState(1341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1337);
					_la = _input.LA(1);
					if ( !(_la==OP_EQ || _la==OP_NE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1338);
					relational_expression();
					}
					} 
				}
				setState(1343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
		enterRule(_localctx, 250, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			shift_expression();
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1345);
				_la = _input.LA(1);
				if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 6147L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1346);
				shift_expression();
				}
				break;
			case 2:
				{
				setState(1347);
				match(IS);
				setState(1348);
				type();
				setState(1350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1349);
					match(IDENTIFIER);
					}
					break;
				}
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
		enterRule(_localctx, 252, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			additive_expression();
			setState(1363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1357);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
						{
						setState(1355);
						left_shift();
						}
						break;
					case GT:
						{
						setState(1356);
						right_shift();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1359);
					additive_expression();
					}
					} 
				}
				setState(1365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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
		enterRule(_localctx, 254, RULE_left_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			match(LT);
			setState(1367);
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
		enterRule(_localctx, 256, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			match(GT);
			setState(1370);
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
		enterRule(_localctx, 258, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			multiplicative_expression();
			setState(1377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1373);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1374);
					multiplicative_expression();
					}
					} 
				}
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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
		enterRule(_localctx, 260, RULE_multiplicative_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			exponentiation_expression();
			setState(1385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1381);
					_la = _input.LA(1);
					if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 13L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1382);
					exponentiation_expression();
					}
					} 
				}
				setState(1387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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
		enterRule(_localctx, 262, RULE_exponentiation_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			unary_expression();
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1389);
				match(POW);
				setState(1390);
				exponentiation_expression();
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
		public TerminalNode AMP() { return getToken(NebulaParser.AMP, 0); }
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
		enterRule(_localctx, 264, RULE_unary_expression);
		int _la;
		try {
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393);
				cast_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394);
				_la = _input.LA(1);
				if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 1539L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1395);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1396);
				match(AMP);
				setState(1397);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1398);
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
		enterRule(_localctx, 266, RULE_cast_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(OPEN_PARENS);
			setState(1402);
			type();
			setState(1403);
			match(CLOSE_PARENS);
			setState(1404);
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
		enterRule(_localctx, 268, RULE_primary_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			primary_expression_start();
			setState(1410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1407);
					postfix_operator();
					}
					} 
				}
				setState(1412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public Struct_literal_expressionContext struct_literal_expression() {
			return getRuleContext(Struct_literal_expressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(NebulaParser.SELF, 0); }
		public TerminalNode THIS() { return getToken(NebulaParser.THIS, 0); }
		public TerminalNode NONE() { return getToken(NebulaParser.NONE, 0); }
		public TerminalNode VOID() { return getToken(NebulaParser.VOID, 0); }
		public TerminalNode BOX_KW() { return getToken(NebulaParser.BOX_KW, 0); }
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Plain_identContext plain_ident() {
			return getRuleContext(Plain_identContext.class,0);
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
		enterRule(_localctx, 270, RULE_primary_expression_start);
		try {
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				parenthesized_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1415);
				tuple_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1416);
				if_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1417);
				match_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1418);
				expression_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1419);
				lambda_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1420);
				struct_literal_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1421);
				match(SELF);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1422);
				match(THIS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1423);
				match(NONE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1424);
				match(VOID);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1425);
				match(BOX_KW);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1426);
				array_literal();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1427);
				match(IDENTIFIER);
				setState(1428);
				type_argument_list();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1429);
				qualified_name();
				setState(1430);
				type_argument_list();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1432);
				plain_ident();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1433);
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
	public static class Struct_literal_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(NebulaParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(NebulaParser.CLOSE_BRACE, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public List<Struct_field_initContext> struct_field_init() {
			return getRuleContexts(Struct_field_initContext.class);
		}
		public Struct_field_initContext struct_field_init(int i) {
			return getRuleContext(Struct_field_initContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Struct_literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterStruct_literal_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitStruct_literal_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitStruct_literal_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_literal_expressionContext struct_literal_expression() throws RecognitionException {
		Struct_literal_expressionContext _localctx = new Struct_literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_struct_literal_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1436);
				qualified_name();
				setState(1437);
				type_argument_list();
				}
				break;
			case 2:
				{
				setState(1439);
				qualified_name();
				}
				break;
			}
			setState(1442);
			match(OPEN_BRACE);
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 145522736066986113L) != 0)) {
				{
				setState(1443);
				struct_field_init();
				setState(1448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1444);
						match(COMMA);
						setState(1445);
						struct_field_init();
						}
						} 
					}
					setState(1450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				}
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1451);
					match(COMMA);
					}
				}

				}
			}

			setState(1456);
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
	public static class Struct_field_initContext extends ParserRuleContext {
		public Plain_identContext plain_ident() {
			return getRuleContext(Plain_identContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NebulaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Struct_field_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_field_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterStruct_field_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitStruct_field_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitStruct_field_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_field_initContext struct_field_init() throws RecognitionException {
		Struct_field_initContext _localctx = new Struct_field_initContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_struct_field_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			plain_ident();
			setState(1459);
			match(COLON);
			setState(1460);
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
	public static class Lambda_expressionContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(NebulaParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(NebulaParser.PIPE, i);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public List<Lambda_paramContext> lambda_param() {
			return getRuleContexts(Lambda_paramContext.class);
		}
		public Lambda_paramContext lambda_param(int i) {
			return getRuleContext(Lambda_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NebulaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NebulaParser.COMMA, i);
		}
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterLambda_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitLambda_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitLambda_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_lambda_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(PIPE);
			setState(1471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4891049949468371968L) != 0) || _la==IDENTIFIER || _la==OPEN_PARENS) {
				{
				setState(1463);
				lambda_param();
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1464);
					match(COMMA);
					setState(1465);
					lambda_param();
					}
					}
					setState(1470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1473);
			match(PIPE);
			setState(1474);
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
	public static class Lambda_paramContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Lambda_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).enterLambda_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NebulaParserListener ) ((NebulaParserListener)listener).exitLambda_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NebulaParserVisitor ) return ((NebulaParserVisitor<? extends T>)visitor).visitLambda_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_paramContext lambda_param() throws RecognitionException {
		Lambda_paramContext _localctx = new Lambda_paramContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_lambda_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			type();
			setState(1477);
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
	public static class Postfix_operatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(NebulaParser.DOT, 0); }
		public Plain_identContext plain_ident() {
			return getRuleContext(Plain_identContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(NebulaParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(NebulaParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(NebulaParser.INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(NebulaParser.REAL_LITERAL, 0); }
		public TerminalNode OP_OPTIONAL_CHAIN() { return getToken(NebulaParser.OP_OPTIONAL_CHAIN, 0); }
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
		enterRule(_localctx, 280, RULE_postfix_operator);
		int _la;
		try {
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				match(DOT);
				setState(1480);
				plain_ident();
				setState(1481);
				type_argument_list();
				setState(1482);
				match(OPEN_PARENS);
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
					{
					setState(1483);
					argument_list();
					}
				}

				setState(1486);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				match(DOT);
				setState(1489);
				plain_ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				match(DOT);
				setState(1491);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1492);
				match(DOT);
				setState(1493);
				match(REAL_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1494);
				match(OP_OPTIONAL_CHAIN);
				setState(1495);
				plain_ident();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1496);
				match(OP_OPTIONAL_CHAIN);
				setState(1497);
				match(OPEN_PARENS);
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
					{
					setState(1498);
					argument_list();
					}
				}

				setState(1501);
				match(CLOSE_PARENS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1502);
				match(OPEN_PARENS);
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
					{
					setState(1503);
					argument_list();
					}
				}

				setState(1506);
				match(CLOSE_PARENS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1507);
				match(OPEN_BRACKET);
				setState(1508);
				expression_list();
				setState(1509);
				match(CLOSE_BRACKET);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1511);
				match(OP_INC);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1512);
				match(OP_DEC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1513);
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
		enterRule(_localctx, 282, RULE_array_literal);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1516);
			match(OPEN_BRACKET);
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
				{
				setState(1517);
				expression();
				setState(1522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1518);
						match(COMMA);
						setState(1519);
						expression();
						}
						} 
					}
					setState(1524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				}
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1525);
					match(COMMA);
					}
				}

				}
			}

			setState(1530);
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
		enterRule(_localctx, 284, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			expression();
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1533);
				match(COMMA);
				setState(1534);
				expression();
				}
				}
				setState(1539);
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
		enterRule(_localctx, 286, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			match(OPEN_PARENS);
			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 7260384255L) != 0) || _la==THIS) {
				{
				setState(1541);
				argument_list();
				}
			}

			setState(1544);
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
		enterRule(_localctx, 288, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			argument();
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1547);
				match(COMMA);
				setState(1548);
				argument();
				}
				}
				setState(1553);
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
		public Plain_identContext plain_ident() {
			return getRuleContext(Plain_identContext.class,0);
		}
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
		enterRule(_localctx, 290, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			plain_ident();
			setState(1555);
			match(COLON);
			setState(1556);
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
		enterRule(_localctx, 292, RULE_positionalArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
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
		enterRule(_localctx, 294, RULE_argument);
		try {
			setState(1562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				namedArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
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
		enterRule(_localctx, 296, RULE_literal);
		try {
			setState(1573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				match(FALSE);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1566);
				match(INTEGER_LITERAL);
				}
				break;
			case HEX_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1567);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case BIN_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1568);
				match(BIN_INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1569);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1570);
				match(CHARACTER_LITERAL);
				}
				break;
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 8);
				{
				setState(1571);
				string_literal();
				}
				break;
			case LITERAL_ACCESS:
				enterOuterAlt(_localctx, 9);
				{
				setState(1572);
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
		enterRule(_localctx, 298, RULE_string_literal);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1575);
				match(REGULAR_STRING);
				}
				break;
			case VERBATIUM_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				match(VERBATIUM_STRING);
				}
				break;
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(1577);
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
		enterRule(_localctx, 300, RULE_interpolated_regular_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(INTERPOLATED_REGULAR_STRING_START);
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6057519310797145088L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & -9223372029594391553L) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & 259L) != 0)) {
				{
				{
				setState(1581);
				interpolated_regular_string_part();
				}
				}
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1587);
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
		enterRule(_localctx, 302, RULE_interpolated_regular_string_part);
		try {
			setState(1593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOX_KW:
			case DROPS:
			case FALSE:
			case IF:
			case INOUT:
			case KEEPS:
			case LET:
			case MUTATES:
			case NONE:
			case MATCH:
			case SELF:
			case STR:
			case TRUE:
			case UNION:
			case VALUE:
			case VOID:
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
			case AMP:
			case PIPE:
			case BANG:
			case TILDE:
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1589);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1590);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case REGULAR_CHAR_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1591);
				match(REGULAR_CHAR_INSIDE);
				}
				break;
			case REGULAR_STRING_INSIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1592);
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
		enterRule(_localctx, 304, RULE_interpolated_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			expression();
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1596);
				match(COMMA);
				setState(1597);
				expression();
				}
				}
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1603);
				match(COLON);
				setState(1605); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1604);
					match(FORMAT_STRING);
					}
					}
					setState(1607); 
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u008c\u064c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0001\u0000\u0005\u0000\u0134\b\u0000\n\u0000\f\u0000\u0137\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0140\b\u0001\n\u0001\f\u0001\u0143\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u014c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0153\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0158\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u015e\b\u0005\n\u0005\f\u0005\u0161\t\u0005\u0001\u0005"+
		"\u0003\u0005\u0164\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0168\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u016c\b\u0006\u0001\u0006\u0003"+
		"\u0006\u016f\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003"+
		"\b\u0175\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0186"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u018b\b\n\n\n\f\n\u018e\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0198\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u01a3\b\u000b\n\u000b\f\u000b\u01a6\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u01ac\b\f\n\f\f\f\u01af\t\f\u0001\f\u0001"+
		"\f\u0003\f\u01b3\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u01b8\b\r\n\r\f\r"+
		"\u01bb\t\r\u0001\u000e\u0005\u000e\u01be\b\u000e\n\u000e\f\u000e\u01c1"+
		"\t\u000e\u0001\u000e\u0003\u000e\u01c4\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u01c9\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01d1\b\u000f\n\u000f"+
		"\f\u000f\u01d4\t\u000f\u0001\u000f\u0003\u000f\u01d7\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01e0\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u01e5\b\u0011\n\u0011\f\u0011\u01e8\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01fe\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0204\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u021a\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u021e\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0226\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u022c\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0235\b\u001d\n\u001d\f\u001d\u0238\t\u001d\u0001\u001d"+
		"\u0003\u001d\u023b\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0005\u001f\u0244\b\u001f\n\u001f"+
		"\f\u001f\u0247\t\u001f\u0001 \u0001 \u0001 \u0003 \u024c\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u0253\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u025a\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0003#\u0263\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u026b"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0003%\u0274\b%\u0001"+
		"%\u0003%\u0277\b%\u0001%\u0001%\u0003%\u027b\b%\u0001%\u0001%\u0001&\u0001"+
		"&\u0003&\u0281\b&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0003+\u0296\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0004+\u029d"+
		"\b+\u000b+\f+\u029e\u0001+\u0001+\u0003+\u02a3\b+\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0003-\u02aa\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0005.\u02b2\b.\n.\f.\u02b5\t.\u0001.\u0003.\u02b8\b.\u0001.\u0001."+
		"\u0001/\u0001/\u0001/\u0003/\u02bf\b/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00040\u02ce"+
		"\b0\u000b0\f0\u02cf\u00010\u00010\u00030\u02d4\b0\u00011\u00011\u0001"+
		"1\u00012\u00012\u00032\u02db\b2\u00013\u00013\u00013\u00013\u00013\u0005"+
		"3\u02e2\b3\n3\f3\u02e5\t3\u00013\u00013\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00034\u02ef\b4\u00015\u00015\u00015\u00015\u00015\u00035\u02f6"+
		"\b5\u00016\u00016\u00016\u00016\u00036\u02fc\b6\u00016\u00016\u00017\u0001"+
		"7\u00017\u00057\u0303\b7\n7\f7\u0306\t7\u00018\u00058\u0309\b8\n8\f8\u030c"+
		"\t8\u00018\u00018\u00018\u00019\u00019\u00039\u0313\b9\u00019\u00039\u0316"+
		"\b9\u00019\u00019\u00019\u00019\u00019\u00049\u031d\b9\u000b9\f9\u031e"+
		"\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u0328\b9\u0001"+
		"9\u00039\u032b\b9\u00019\u00019\u00019\u00039\u0330\b9\u00019\u00019\u0001"+
		"9\u00039\u0335\b9\u0001:\u0003:\u0338\b:\u0001:\u0001:\u0001;\u0001;\u0001"+
		"<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001>\u0005>\u0345\b>\n>\f>\u0348"+
		"\t>\u0001?\u0005?\u034b\b?\n?\f?\u034e\t?\u0001?\u0001?\u0001@\u0001@"+
		"\u0001@\u0005@\u0355\b@\n@\f@\u0358\t@\u0001A\u0001A\u0001A\u0003A\u035d"+
		"\bA\u0001B\u0005B\u0360\bB\nB\fB\u0363\tB\u0001B\u0001B\u0001B\u0001B"+
		"\u0003B\u0369\bB\u0001B\u0001B\u0001B\u0001C\u0005C\u036f\bC\nC\fC\u0372"+
		"\tC\u0001C\u0003C\u0375\bC\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0003"+
		"D\u037d\bD\u0001D\u0001D\u0001E\u0001E\u0001E\u0005E\u0384\bE\nE\fE\u0387"+
		"\tE\u0001F\u0003F\u038a\bF\u0001F\u0001F\u0001F\u0001F\u0003F\u0390\b"+
		"F\u0001G\u0001G\u0001G\u0001G\u0003G\u0396\bG\u0001G\u0003G\u0399\bG\u0001"+
		"H\u0005H\u039c\bH\nH\fH\u039f\tH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003"+
		"I\u03ba\bI\u0001J\u0005J\u03bd\bJ\nJ\fJ\u03c0\tJ\u0001J\u0003J\u03c3\b"+
		"J\u0001J\u0003J\u03c6\bJ\u0001J\u0001J\u0001J\u0003J\u03cb\bJ\u0001J\u0001"+
		"J\u0001K\u0001K\u0005K\u03d1\bK\nK\fK\u03d4\tK\u0001K\u0001K\u0001L\u0001"+
		"L\u0001M\u0005M\u03db\bM\nM\fM\u03de\tM\u0001M\u0001M\u0001M\u0003M\u03e3"+
		"\bM\u0001M\u0003M\u03e6\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0005"+
		"N\u03ee\bN\nN\fN\u03f1\tN\u0001O\u0001O\u0003O\u03f5\bO\u0001P\u0001P"+
		"\u0005P\u03f9\bP\nP\fP\u03fc\tP\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0005"+
		"R\u0403\bR\nR\fR\u0406\tR\u0001R\u0003R\u0409\bR\u0001R\u0001R\u0001R"+
		"\u0003R\u040e\bR\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0005S\u0416"+
		"\bS\nS\fS\u0419\tS\u0001S\u0003S\u041c\bS\u0001S\u0001S\u0001T\u0001T"+
		"\u0001T\u0001T\u0005T\u0424\bT\nT\fT\u0427\tT\u0001T\u0001T\u0001U\u0001"+
		"U\u0003U\u042d\bU\u0001V\u0005V\u0430\bV\nV\fV\u0433\tV\u0001V\u0001V"+
		"\u0001V\u0001V\u0001V\u0001V\u0005V\u043b\bV\nV\fV\u043e\tV\u0003V\u0440"+
		"\bV\u0001V\u0001V\u0003V\u0444\bV\u0001W\u0001W\u0003W\u0448\bW\u0001"+
		"X\u0001X\u0005X\u044c\bX\nX\fX\u044f\tX\u0001X\u0001X\u0001Y\u0001Y\u0003"+
		"Y\u0455\bY\u0001Z\u0001Z\u0001Z\u0003Z\u045a\bZ\u0001[\u0001[\u0003[\u045e"+
		"\b[\u0001[\u0001[\u0005[\u0462\b[\n[\f[\u0465\t[\u0001\\\u0001\\\u0003"+
		"\\\u0469\b\\\u0001]\u0001]\u0001]\u0003]\u046e\b]\u0001^\u0001^\u0001"+
		"^\u0001^\u0005^\u0474\b^\n^\f^\u0477\t^\u0001^\u0001^\u0001_\u0001_\u0003"+
		"_\u047d\b_\u0001`\u0001`\u0001`\u0001`\u0003`\u0483\b`\u0003`\u0485\b"+
		"`\u0001a\u0001a\u0001a\u0001a\u0001a\u0003a\u048c\ba\u0001b\u0001b\u0003"+
		"b\u0490\bb\u0001c\u0001c\u0001d\u0001d\u0001e\u0001e\u0003e\u0498\be\u0001"+
		"e\u0005e\u049b\be\ne\fe\u049e\te\u0001e\u0001e\u0001f\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0003f\u04a8\bf\u0003f\u04aa\bf\u0001g\u0001g\u0001g\u0005"+
		"g\u04af\bg\ng\fg\u04b2\tg\u0001h\u0001h\u0003h\u04b6\bh\u0001i\u0001i"+
		"\u0001i\u0001i\u0005i\u04bc\bi\ni\fi\u04bf\ti\u0001i\u0001i\u0001j\u0001"+
		"j\u0001j\u0001j\u0005j\u04c7\bj\nj\fj\u04ca\tj\u0001j\u0001j\u0001k\u0001"+
		"k\u0003k\u04d0\bk\u0001l\u0001l\u0001l\u0003l\u04d5\bl\u0001m\u0001m\u0001"+
		"m\u0001m\u0004m\u04db\bm\u000bm\fm\u04dc\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0003m\u04e6\bm\u0001n\u0001n\u0001n\u0001n\u0001o\u0001"+
		"o\u0001p\u0001p\u0001q\u0001q\u0001q\u0001q\u0003q\u04f4\bq\u0001r\u0001"+
		"r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0003r\u0500"+
		"\br\u0001s\u0001s\u0001s\u0003s\u0505\bs\u0001t\u0001t\u0001t\u0001t\u0003"+
		"t\u050b\bt\u0001u\u0001u\u0001v\u0001v\u0001w\u0001w\u0001w\u0005w\u0514"+
		"\bw\nw\fw\u0517\tw\u0001x\u0001x\u0001x\u0005x\u051c\bx\nx\fx\u051f\t"+
		"x\u0001y\u0001y\u0001y\u0005y\u0524\by\ny\fy\u0527\ty\u0001z\u0001z\u0001"+
		"z\u0005z\u052c\bz\nz\fz\u052f\tz\u0001{\u0001{\u0001{\u0005{\u0534\b{"+
		"\n{\f{\u0537\t{\u0001|\u0001|\u0001|\u0005|\u053c\b|\n|\f|\u053f\t|\u0001"+
		"}\u0001}\u0001}\u0001}\u0001}\u0001}\u0003}\u0547\b}\u0003}\u0549\b}\u0001"+
		"~\u0001~\u0001~\u0003~\u054e\b~\u0001~\u0001~\u0005~\u0552\b~\n~\f~\u0555"+
		"\t~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001"+
		"\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0005\u0081\u0560\b\u0081\n"+
		"\u0081\f\u0081\u0563\t\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0005"+
		"\u0082\u0568\b\u0082\n\u0082\f\u0082\u056b\t\u0082\u0001\u0083\u0001\u0083"+
		"\u0001\u0083\u0003\u0083\u0570\b\u0083\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u0578\b\u0084\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0086\u0001\u0086"+
		"\u0005\u0086\u0581\b\u0086\n\u0086\f\u0086\u0584\t\u0086\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0003\u0087\u059b\b\u0087\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0001\u0088\u0003\u0088\u05a1\b\u0088\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0001\u0088\u0005\u0088\u05a7\b\u0088\n\u0088\f\u0088\u05aa\t\u0088"+
		"\u0001\u0088\u0003\u0088\u05ad\b\u0088\u0003\u0088\u05af\b\u0088\u0001"+
		"\u0088\u0001\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0005\u008a\u05bb\b\u008a\n"+
		"\u008a\f\u008a\u05be\t\u008a\u0003\u008a\u05c0\b\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008c\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u05cd\b\u008c\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008c\u0003\u008c\u05dc\b\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0003"+
		"\u008c\u05e1\b\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u05eb\b\u008c\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u05f1\b\u008d\n"+
		"\u008d\f\u008d\u05f4\t\u008d\u0001\u008d\u0003\u008d\u05f7\b\u008d\u0003"+
		"\u008d\u05f9\b\u008d\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0005\u008e\u0600\b\u008e\n\u008e\f\u008e\u0603\t\u008e\u0001\u008f"+
		"\u0001\u008f\u0003\u008f\u0607\b\u008f\u0001\u008f\u0001\u008f\u0001\u0090"+
		"\u0001\u0090\u0001\u0090\u0005\u0090\u060e\b\u0090\n\u0090\f\u0090\u0611"+
		"\t\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0092\u0001"+
		"\u0092\u0001\u0093\u0001\u0093\u0003\u0093\u061b\b\u0093\u0001\u0094\u0001"+
		"\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001"+
		"\u0094\u0001\u0094\u0003\u0094\u0626\b\u0094\u0001\u0095\u0001\u0095\u0001"+
		"\u0095\u0003\u0095\u062b\b\u0095\u0001\u0096\u0001\u0096\u0005\u0096\u062f"+
		"\b\u0096\n\u0096\f\u0096\u0632\t\u0096\u0001\u0096\u0001\u0096\u0001\u0097"+
		"\u0001\u0097\u0001\u0097\u0001\u0097\u0003\u0097\u063a\b\u0097\u0001\u0098"+
		"\u0001\u0098\u0001\u0098\u0005\u0098\u063f\b\u0098\n\u0098\f\u0098\u0642"+
		"\t\u0098\u0001\u0098\u0001\u0098\u0004\u0098\u0646\b\u0098\u000b\u0098"+
		"\f\u0098\u0647\u0003\u0098\u064a\b\u0098\u0001\u0098\u0000\u0001\u0016"+
		"\u0099\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0000\u0010\u0002\u0000TTVV\u0004\u0000$$//<"+
		"<CC\n\u0000\n\n\u0011\u0011\u001c\u001c#%((--//::<<CC\u0001\u0000BC\u0002"+
		"\u0000$$==\u0002\u0000*+AA\u0004\u0000\u0011\u0011\u001c\u001c##%%\u0002"+
		"\u0000\u001d!59\u0002\u0000\u0010\u0010\u0016\u0017\u0001\u0000}\u0080"+
		"\u0002\u0000ees|\u0001\u0000op\u0002\u0000fgqr\u0001\u0000YZ\u0002\u0000"+
		"[[]^\u0002\u0000YZbc\u06c6\u0000\u0135\u0001\u0000\u0000\u0000\u0002\u013a"+
		"\u0001\u0000\u0000\u0000\u0004\u0146\u0001\u0000\u0000\u0000\u0006\u0148"+
		"\u0001\u0000\u0000\u0000\b\u0152\u0001\u0000\u0000\u0000\n\u0167\u0001"+
		"\u0000\u0000\u0000\f\u016e\u0001\u0000\u0000\u0000\u000e\u0170\u0001\u0000"+
		"\u0000\u0000\u0010\u0174\u0001\u0000\u0000\u0000\u0012\u0185\u0001\u0000"+
		"\u0000\u0000\u0014\u0187\u0001\u0000\u0000\u0000\u0016\u0197\u0001\u0000"+
		"\u0000\u0000\u0018\u01a7\u0001\u0000\u0000\u0000\u001a\u01b4\u0001\u0000"+
		"\u0000\u0000\u001c\u01bf\u0001\u0000\u0000\u0000\u001e\u01cc\u0001\u0000"+
		"\u0000\u0000 \u01da\u0001\u0000\u0000\u0000\"\u01e1\u0001\u0000\u0000"+
		"\u0000$\u01e9\u0001\u0000\u0000\u0000&\u01ec\u0001\u0000\u0000\u0000("+
		"\u01ee\u0001\u0000\u0000\u0000*\u01fd\u0001\u0000\u0000\u0000,\u01ff\u0001"+
		"\u0000\u0000\u0000.\u0219\u0001\u0000\u0000\u00000\u021b\u0001\u0000\u0000"+
		"\u00002\u021f\u0001\u0000\u0000\u00004\u0223\u0001\u0000\u0000\u00006"+
		"\u0229\u0001\u0000\u0000\u00008\u022f\u0001\u0000\u0000\u0000:\u0232\u0001"+
		"\u0000\u0000\u0000<\u023e\u0001\u0000\u0000\u0000>\u0245\u0001\u0000\u0000"+
		"\u0000@\u0248\u0001\u0000\u0000\u0000B\u0254\u0001\u0000\u0000\u0000D"+
		"\u025b\u0001\u0000\u0000\u0000F\u025f\u0001\u0000\u0000\u0000H\u0266\u0001"+
		"\u0000\u0000\u0000J\u0271\u0001\u0000\u0000\u0000L\u0280\u0001\u0000\u0000"+
		"\u0000N\u0282\u0001\u0000\u0000\u0000P\u0284\u0001\u0000\u0000\u0000R"+
		"\u0288\u0001\u0000\u0000\u0000T\u028c\u0001\u0000\u0000\u0000V\u02a2\u0001"+
		"\u0000\u0000\u0000X\u02a4\u0001\u0000\u0000\u0000Z\u02a7\u0001\u0000\u0000"+
		"\u0000\\\u02ad\u0001\u0000\u0000\u0000^\u02bb\u0001\u0000\u0000\u0000"+
		"`\u02d3\u0001\u0000\u0000\u0000b\u02d5\u0001\u0000\u0000\u0000d\u02da"+
		"\u0001\u0000\u0000\u0000f\u02dc\u0001\u0000\u0000\u0000h\u02ee\u0001\u0000"+
		"\u0000\u0000j\u02f5\u0001\u0000\u0000\u0000l\u02f7\u0001\u0000\u0000\u0000"+
		"n\u02ff\u0001\u0000\u0000\u0000p\u030a\u0001\u0000\u0000\u0000r\u0334"+
		"\u0001\u0000\u0000\u0000t\u0337\u0001\u0000\u0000\u0000v\u033b\u0001\u0000"+
		"\u0000\u0000x\u033d\u0001\u0000\u0000\u0000z\u033f\u0001\u0000\u0000\u0000"+
		"|\u0346\u0001\u0000\u0000\u0000~\u034c\u0001\u0000\u0000\u0000\u0080\u0351"+
		"\u0001\u0000\u0000\u0000\u0082\u0359\u0001\u0000\u0000\u0000\u0084\u0361"+
		"\u0001\u0000\u0000\u0000\u0086\u0370\u0001\u0000\u0000\u0000\u0088\u037a"+
		"\u0001\u0000\u0000\u0000\u008a\u0380\u0001\u0000\u0000\u0000\u008c\u0389"+
		"\u0001\u0000\u0000\u0000\u008e\u0398\u0001\u0000\u0000\u0000\u0090\u039d"+
		"\u0001\u0000\u0000\u0000\u0092\u03b9\u0001\u0000\u0000\u0000\u0094\u03be"+
		"\u0001\u0000\u0000\u0000\u0096\u03ce\u0001\u0000\u0000\u0000\u0098\u03d7"+
		"\u0001\u0000\u0000\u0000\u009a\u03dc\u0001\u0000\u0000\u0000\u009c\u03e9"+
		"\u0001\u0000\u0000\u0000\u009e\u03f4\u0001\u0000\u0000\u0000\u00a0\u03f6"+
		"\u0001\u0000\u0000\u0000\u00a2\u03ff\u0001\u0000\u0000\u0000\u00a4\u0404"+
		"\u0001\u0000\u0000\u0000\u00a6\u0411\u0001\u0000\u0000\u0000\u00a8\u041f"+
		"\u0001\u0000\u0000\u0000\u00aa\u042a\u0001\u0000\u0000\u0000\u00ac\u0431"+
		"\u0001\u0000\u0000\u0000\u00ae\u0445\u0001\u0000\u0000\u0000\u00b0\u0449"+
		"\u0001\u0000\u0000\u0000\u00b2\u0454\u0001\u0000\u0000\u0000\u00b4\u0459"+
		"\u0001\u0000\u0000\u0000\u00b6\u045d\u0001\u0000\u0000\u0000\u00b8\u0468"+
		"\u0001\u0000\u0000\u0000\u00ba\u046d\u0001\u0000\u0000\u0000\u00bc\u046f"+
		"\u0001\u0000\u0000\u0000\u00be\u047a\u0001\u0000\u0000\u0000\u00c0\u0484"+
		"\u0001\u0000\u0000\u0000\u00c2\u048b\u0001\u0000\u0000\u0000\u00c4\u048f"+
		"\u0001\u0000\u0000\u0000\u00c6\u0491\u0001\u0000\u0000\u0000\u00c8\u0493"+
		"\u0001\u0000\u0000\u0000\u00ca\u0495\u0001\u0000\u0000\u0000\u00cc\u04a9"+
		"\u0001\u0000\u0000\u0000\u00ce\u04ab\u0001\u0000\u0000\u0000\u00d0\u04b3"+
		"\u0001\u0000\u0000\u0000\u00d2\u04b7\u0001\u0000\u0000\u0000\u00d4\u04c2"+
		"\u0001\u0000\u0000\u0000\u00d6\u04cf\u0001\u0000\u0000\u0000\u00d8\u04d4"+
		"\u0001\u0000\u0000\u0000\u00da\u04e5\u0001\u0000\u0000\u0000\u00dc\u04e7"+
		"\u0001\u0000\u0000\u0000\u00de\u04eb\u0001\u0000\u0000\u0000\u00e0\u04ed"+
		"\u0001\u0000\u0000\u0000\u00e2\u04ef\u0001\u0000\u0000\u0000\u00e4\u04ff"+
		"\u0001\u0000\u0000\u0000\u00e6\u0501\u0001\u0000\u0000\u0000\u00e8\u0506"+
		"\u0001\u0000\u0000\u0000\u00ea\u050c\u0001\u0000\u0000\u0000\u00ec\u050e"+
		"\u0001\u0000\u0000\u0000\u00ee\u0510\u0001\u0000\u0000\u0000\u00f0\u0518"+
		"\u0001\u0000\u0000\u0000\u00f2\u0520\u0001\u0000\u0000\u0000\u00f4\u0528"+
		"\u0001\u0000\u0000\u0000\u00f6\u0530\u0001\u0000\u0000\u0000\u00f8\u0538"+
		"\u0001\u0000\u0000\u0000\u00fa\u0540\u0001\u0000\u0000\u0000\u00fc\u054a"+
		"\u0001\u0000\u0000\u0000\u00fe\u0556\u0001\u0000\u0000\u0000\u0100\u0559"+
		"\u0001\u0000\u0000\u0000\u0102\u055c\u0001\u0000\u0000\u0000\u0104\u0564"+
		"\u0001\u0000\u0000\u0000\u0106\u056c\u0001\u0000\u0000\u0000\u0108\u0577"+
		"\u0001\u0000\u0000\u0000\u010a\u0579\u0001\u0000\u0000\u0000\u010c\u057e"+
		"\u0001\u0000\u0000\u0000\u010e\u059a\u0001\u0000\u0000\u0000\u0110\u05a0"+
		"\u0001\u0000\u0000\u0000\u0112\u05b2\u0001\u0000\u0000\u0000\u0114\u05b6"+
		"\u0001\u0000\u0000\u0000\u0116\u05c4\u0001\u0000\u0000\u0000\u0118\u05ea"+
		"\u0001\u0000\u0000\u0000\u011a\u05ec\u0001\u0000\u0000\u0000\u011c\u05fc"+
		"\u0001\u0000\u0000\u0000\u011e\u0604\u0001\u0000\u0000\u0000\u0120\u060a"+
		"\u0001\u0000\u0000\u0000\u0122\u0612\u0001\u0000\u0000\u0000\u0124\u0616"+
		"\u0001\u0000\u0000\u0000\u0126\u061a\u0001\u0000\u0000\u0000\u0128\u0625"+
		"\u0001\u0000\u0000\u0000\u012a\u062a\u0001\u0000\u0000\u0000\u012c\u062c"+
		"\u0001\u0000\u0000\u0000\u012e\u0639\u0001\u0000\u0000\u0000\u0130\u063b"+
		"\u0001\u0000\u0000\u0000\u0132\u0134\u0003*\u0015\u0000\u0133\u0132\u0001"+
		"\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001"+
		"\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0005"+
		"\u0000\u0000\u0001\u0139\u0001\u0001\u0000\u0000\u0000\u013a\u013b\u0003"+
		"|>\u0000\u013b\u013c\u0005\u0014\u0000\u0000\u013c\u013d\u0005J\u0000"+
		"\u0000\u013d\u0141\u0005N\u0000\u0000\u013e\u0140\u0003\u0004\u0002\u0000"+
		"\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000"+
		"\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005O\u0000\u0000\u0145\u0003\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0003\u0084B\u0000\u0147\u0005\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005;\u0000\u0000\u0149\u014b\u0003\u001a\r\u0000\u014a\u014c\u0003"+
		"\b\u0004\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0005X\u0000"+
		"\u0000\u014e\u0007\u0001\u0000\u0000\u0000\u014f\u0150\u0005V\u0000\u0000"+
		"\u0150\u0153\u0003\n\u0005\u0000\u0151\u0153\u0003\u000e\u0007\u0000\u0152"+
		"\u014f\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\t\u0001\u0000\u0000\u0000\u0154\u0168\u0005[\u0000\u0000\u0155\u0157"+
		"\u0005C\u0000\u0000\u0156\u0158\u0003\u000e\u0007\u0000\u0157\u0156\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0168\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0005N\u0000\u0000\u015a\u015f\u0003\f"+
		"\u0006\u0000\u015b\u015c\u0005U\u0000\u0000\u015c\u015e\u0003\f\u0006"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0162\u0164\u0005U\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005O\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167"+
		"\u0154\u0001\u0000\u0000\u0000\u0167\u0155\u0001\u0000\u0000\u0000\u0167"+
		"\u0159\u0001\u0000\u0000\u0000\u0168\u000b\u0001\u0000\u0000\u0000\u0169"+
		"\u016b\u0005C\u0000\u0000\u016a\u016c\u0003\u000e\u0007\u0000\u016b\u016a"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016f"+
		"\u0001\u0000\u0000\u0000\u016d\u016f\u0005[\u0000\u0000\u016e\u0169\u0001"+
		"\u0000\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f\r\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0005\b\u0000\u0000\u0171\u0172\u0005C\u0000"+
		"\u0000\u0172\u000f\u0001\u0000\u0000\u0000\u0173\u0175\u0003v;\u0000\u0174"+
		"\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u00051\u0000\u0000\u0177\u0178"+
		"\u0003\u0012\t\u0000\u0178\u0179\u0005\b\u0000\u0000\u0179\u017a\u0005"+
		"C\u0000\u0000\u017a\u017b\u0005X\u0000\u0000\u017b\u0011\u0001\u0000\u0000"+
		"\u0000\u017c\u0186\u0003\u00b6[\u0000\u017d\u017e\u0005N\u0000\u0000\u017e"+
		"\u017f\u0003\u0014\n\u0000\u017f\u0180\u0005O\u0000\u0000\u0180\u0186"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0005N\u0000\u0000\u0182\u0183\u0003"+
		"\u0016\u000b\u0000\u0183\u0184\u0005O\u0000\u0000\u0184\u0186\u0001\u0000"+
		"\u0000\u0000\u0185\u017c\u0001\u0000\u0000\u0000\u0185\u017d\u0001\u0000"+
		"\u0000\u0000\u0185\u0181\u0001\u0000\u0000\u0000\u0186\u0013\u0001\u0000"+
		"\u0000\u0000\u0187\u018c\u0003\u00b6[\u0000\u0188\u0189\u0005U\u0000\u0000"+
		"\u0189\u018b\u0003\u00b6[\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b"+
		"\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0001\u0000\u0000\u0000\u018d\u0015\u0001\u0000\u0000\u0000\u018e"+
		"\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0006\u000b\uffff\uffff\u0000"+
		"\u0190\u0191\u0005R\u0000\u0000\u0191\u0192\u0003\u0016\u000b\u0000\u0192"+
		"\u0193\u0005S\u0000\u0000\u0193\u0198\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0005b\u0000\u0000\u0195\u0198\u0003\u0016\u000b\u0005\u0196\u0198\u0003"+
		"\u00b6[\u0000\u0197\u018f\u0001\u0000\u0000\u0000\u0197\u0194\u0001\u0000"+
		"\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198\u01a4\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\n\u0004\u0000\u0000\u019a\u019b\u0005_\u0000"+
		"\u0000\u019b\u01a3\u0003\u0016\u000b\u0005\u019c\u019d\n\u0003\u0000\u0000"+
		"\u019d\u019e\u0005`\u0000\u0000\u019e\u01a3\u0003\u0016\u000b\u0004\u019f"+
		"\u01a0\n\u0002\u0000\u0000\u01a0\u01a1\u0005Z\u0000\u0000\u01a1\u01a3"+
		"\u0003\u0016\u000b\u0003\u01a2\u0199\u0001\u0000\u0000\u0000\u01a2\u019c"+
		"\u0001\u0000\u0000\u0000\u01a2\u019f\u0001\u0000\u0000\u0000\u01a3\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a5\u0017\u0001\u0000\u0000\u0000\u01a6\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005&\u0000\u0000\u01a8\u01b2\u0003"+
		"\u001a\r\u0000\u01a9\u01ad\u0005N\u0000\u0000\u01aa\u01ac\u0003*\u0015"+
		"\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b3\u0005O\u0000\u0000\u01b1\u01b3\u0005X\u0000\u0000\u01b2"+
		"\u01a9\u0001\u0000\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3"+
		"\u0019\u0001\u0000\u0000\u0000\u01b4\u01b9\u0005C\u0000\u0000\u01b5\u01b6"+
		"\u0007\u0000\u0000\u0000\u01b6\u01b8\u0005C\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u001b\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01be\u0003"+
		"l6\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000"+
		"\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c4\u0003v;\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0005\u0013\u0000\u0000\u01c6\u01c8\u0005C\u0000\u0000\u01c7\u01c9"+
		"\u0003\u00d2i\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003"+
		"\u001e\u000f\u0000\u01cb\u001d\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005"+
		"N\u0000\u0000\u01cd\u01d2\u0003 \u0010\u0000\u01ce\u01cf\u0005U\u0000"+
		"\u0000\u01cf\u01d1\u0003 \u0010\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d7\u0005U\u0000\u0000\u01d6"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005O\u0000\u0000\u01d9\u001f"+
		"\u0001\u0000\u0000\u0000\u01da\u01df\u0005C\u0000\u0000\u01db\u01dc\u0005"+
		"R\u0000\u0000\u01dc\u01dd\u0003\"\u0011\u0000\u01dd\u01de\u0005S\u0000"+
		"\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01db\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0!\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e6\u0003$\u0012\u0000\u01e2\u01e3\u0005U\u0000\u0000\u01e3\u01e5"+
		"\u0003$\u0012\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7#\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ea\u0003\u00b6[\u0000\u01ea\u01eb\u0003&\u0013\u0000"+
		"\u01eb%\u0001\u0000\u0000\u0000\u01ec\u01ed\u0007\u0001\u0000\u0000\u01ed"+
		"\'\u0001\u0000\u0000\u0000\u01ee\u01ef\u0007\u0002\u0000\u0000\u01ef)"+
		"\u0001\u0000\u0000\u0000\u01f0\u01fe\u0003\u0006\u0003\u0000\u01f1\u01fe"+
		"\u0003\u0010\b\u0000\u01f2\u01fe\u0003\u001c\u000e\u0000\u01f3\u01fe\u0003"+
		",\u0016\u0000\u01f4\u01fe\u0003p8\u0000\u01f5\u01fe\u0003r9\u0000\u01f6"+
		"\u01fe\u0003\u0084B\u0000\u01f7\u01fe\u0003\u0094J\u0000\u01f8\u01fe\u0003"+
		"\u009aM\u0000\u01f9\u01fe\u0003\u00acV\u0000\u01fa\u01fe\u0003\u00a4R"+
		"\u0000\u01fb\u01fe\u0003\u0018\f\u0000\u01fc\u01fe\u0003\u0002\u0001\u0000"+
		"\u01fd\u01f0\u0001\u0000\u0000\u0000\u01fd\u01f1\u0001\u0000\u0000\u0000"+
		"\u01fd\u01f2\u0001\u0000\u0000\u0000\u01fd\u01f3\u0001\u0000\u0000\u0000"+
		"\u01fd\u01f4\u0001\u0000\u0000\u0000\u01fd\u01f5\u0001\u0000\u0000\u0000"+
		"\u01fd\u01f6\u0001\u0000\u0000\u0000\u01fd\u01f7\u0001\u0000\u0000\u0000"+
		"\u01fd\u01f8\u0001\u0000\u0000\u0000\u01fd\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fa\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe+\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0005$\u0000\u0000\u0200\u0203\u0005C\u0000\u0000\u0201\u0202\u0005"+
		"W\u0000\u0000\u0202\u0204\u0003\u00b6[\u0000\u0203\u0201\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0005e\u0000\u0000\u0206\u0207\u0003\u00e0p\u0000\u0207"+
		"\u0208\u0005X\u0000\u0000\u0208-\u0001\u0000\u0000\u0000\u0209\u021a\u0003"+
		"\u0006\u0003\u0000\u020a\u021a\u0003\u0010\b\u0000\u020b\u021a\u0003p"+
		"8\u0000\u020c\u021a\u0003,\u0016\u0000\u020d\u021a\u0003r9\u0000\u020e"+
		"\u021a\u0003<\u001e\u0000\u020f\u021a\u00032\u0019\u0000\u0210\u021a\u0003"+
		"B!\u0000\u0211\u021a\u0003F#\u0000\u0212\u021a\u0003P(\u0000\u0213\u021a"+
		"\u0003R)\u0000\u0214\u021a\u0003Z-\u0000\u0215\u021a\u00034\u001a\u0000"+
		"\u0216\u021a\u00036\u001b\u0000\u0217\u021a\u00030\u0018\u0000\u0218\u021a"+
		"\u00038\u001c\u0000\u0219\u0209\u0001\u0000\u0000\u0000\u0219\u020a\u0001"+
		"\u0000\u0000\u0000\u0219\u020b\u0001\u0000\u0000\u0000\u0219\u020c\u0001"+
		"\u0000\u0000\u0000\u0219\u020d\u0001\u0000\u0000\u0000\u0219\u020e\u0001"+
		"\u0000\u0000\u0000\u0219\u020f\u0001\u0000\u0000\u0000\u0219\u0210\u0001"+
		"\u0000\u0000\u0000\u0219\u0211\u0001\u0000\u0000\u0000\u0219\u0212\u0001"+
		"\u0000\u0000\u0000\u0219\u0213\u0001\u0000\u0000\u0000\u0219\u0214\u0001"+
		"\u0000\u0000\u0000\u0219\u0215\u0001\u0000\u0000\u0000\u0219\u0216\u0001"+
		"\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u0218\u0001"+
		"\u0000\u0000\u0000\u021a/\u0001\u0000\u0000\u0000\u021b\u021d\u0003D\""+
		"\u0000\u021c\u021e\u0005X\u0000\u0000\u021d\u021c\u0001\u0000\u0000\u0000"+
		"\u021d\u021e\u0001\u0000\u0000\u0000\u021e1\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0005C\u0000\u0000\u0220\u0221\u0005W\u0000\u0000\u0221\u0222\u0003"+
		".\u0017\u0000\u02223\u0001\u0000\u0000\u0000\u0223\u0225\u0005\f\u0000"+
		"\u0000\u0224\u0226\u0005C\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000"+
		"\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000"+
		"\u0227\u0228\u0005X\u0000\u0000\u02285\u0001\u0000\u0000\u0000\u0229\u022b"+
		"\u0005\u000f\u0000\u0000\u022a\u022c\u0005C\u0000\u0000\u022b\u022a\u0001"+
		"\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0005X\u0000\u0000\u022e7\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0003\u00e0p\u0000\u0230\u0231\u0005X\u0000\u0000\u0231"+
		"9\u0001\u0000\u0000\u0000\u0232\u0236\u0005N\u0000\u0000\u0233\u0235\u0003"+
		".\u0017\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0235\u0238\u0001\u0000"+
		"\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000"+
		"\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0239\u023b\u0003\u00e0p\u0000\u023a\u0239\u0001\u0000\u0000"+
		"\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0005O\u0000\u0000\u023d;\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0005N\u0000\u0000\u023f\u0240\u0003>\u001f\u0000\u0240\u0241\u0005"+
		"O\u0000\u0000\u0241=\u0001\u0000\u0000\u0000\u0242\u0244\u0003.\u0017"+
		"\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000\u0000"+
		"\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246?\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000"+
		"\u0248\u024b\u0005\u001a\u0000\u0000\u0249\u024c\u0003\u00dcn\u0000\u024a"+
		"\u024c\u0003\u00e0p\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024a"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u0252"+
		"\u0003:\u001d\u0000\u024e\u024f\u0005\u0012\u0000\u0000\u024f\u0253\u0003"+
		"@ \u0000\u0250\u0251\u0005\u0012\u0000\u0000\u0251\u0253\u0003:\u001d"+
		"\u0000\u0252\u024e\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253A\u0001\u0000\u0000\u0000"+
		"\u0254\u0255\u0005\u001a\u0000\u0000\u0255\u0256\u0003\u00dcn\u0000\u0256"+
		"\u0259\u0003.\u0017\u0000\u0257\u0258\u0005\u0012\u0000\u0000\u0258\u025a"+
		"\u0003.\u0017\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u0259\u025a\u0001"+
		"\u0000\u0000\u0000\u025aC\u0001\u0000\u0000\u0000\u025b\u025c\u0005(\u0000"+
		"\u0000\u025c\u025d\u0003\u00e0p\u0000\u025d\u025e\u0003\\.\u0000\u025e"+
		"E\u0001\u0000\u0000\u0000\u025f\u0262\u0005\u0018\u0000\u0000\u0260\u0263"+
		"\u0003J%\u0000\u0261\u0263\u0003H$\u0000\u0262\u0260\u0001\u0000\u0000"+
		"\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u0003.\u0017\u0000\u0265G\u0001\u0000\u0000\u0000\u0266"+
		"\u026a\u0005R\u0000\u0000\u0267\u026b\u0005=\u0000\u0000\u0268\u026b\u0005"+
		"$\u0000\u0000\u0269\u026b\u0003\u00b6[\u0000\u026a\u0267\u0001\u0000\u0000"+
		"\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026a\u0269\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0007\u0003\u0000"+
		"\u0000\u026d\u026e\u0005\u001b\u0000\u0000\u026e\u026f\u0003\u00e0p\u0000"+
		"\u026f\u0270\u0005S\u0000\u0000\u0270I\u0001\u0000\u0000\u0000\u0271\u0273"+
		"\u0005R\u0000\u0000\u0272\u0274\u0003L&\u0000\u0273\u0272\u0001\u0000"+
		"\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0276\u0001\u0000"+
		"\u0000\u0000\u0275\u0277\u0003\u00e0p\u0000\u0276\u0275\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000"+
		"\u0000\u0278\u027a\u0005X\u0000\u0000\u0279\u027b\u0003N\'\u0000\u027a"+
		"\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0001\u0000\u0000\u0000\u027c\u027d\u0005S\u0000\u0000\u027dK\u0001"+
		"\u0000\u0000\u0000\u027e\u0281\u0003r9\u0000\u027f\u0281\u0003\u011c\u008e"+
		"\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u027f\u0001\u0000\u0000"+
		"\u0000\u0281M\u0001\u0000\u0000\u0000\u0282\u0283\u0003\u011c\u008e\u0000"+
		"\u0283O\u0001\u0000\u0000\u0000\u0284\u0285\u0005?\u0000\u0000\u0285\u0286"+
		"\u0003\u00dcn\u0000\u0286\u0287\u0003.\u0017\u0000\u0287Q\u0001\u0000"+
		"\u0000\u0000\u0288\u0289\u0005\u0019\u0000\u0000\u0289\u028a\u0003T*\u0000"+
		"\u028a\u028b\u0003.\u0017\u0000\u028bS\u0001\u0000\u0000\u0000\u028c\u028d"+
		"\u0005R\u0000\u0000\u028d\u028e\u0003V+\u0000\u028e\u028f\u0005\u001b"+
		"\u0000\u0000\u028f\u0290\u0003\u00e0p\u0000\u0290\u0291\u0005S\u0000\u0000"+
		"\u0291U\u0001\u0000\u0000\u0000\u0292\u0296\u0005=\u0000\u0000\u0293\u0296"+
		"\u0005$\u0000\u0000\u0294\u0296\u0003\u00b6[\u0000\u0295\u0292\u0001\u0000"+
		"\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0294\u0001\u0000"+
		"\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u02a3\u0007\u0003"+
		"\u0000\u0000\u0298\u0299\u0005R\u0000\u0000\u0299\u029c\u0003X,\u0000"+
		"\u029a\u029b\u0005U\u0000\u0000\u029b\u029d\u0003X,\u0000\u029c\u029a"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u029c"+
		"\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a1\u0005S\u0000\u0000\u02a1\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a2\u0295\u0001\u0000\u0000\u0000\u02a2\u0298\u0001"+
		"\u0000\u0000\u0000\u02a3W\u0001\u0000\u0000\u0000\u02a4\u02a5\u0003\u00b6"+
		"[\u0000\u02a5\u02a6\u0007\u0003\u0000\u0000\u02a6Y\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a9\u0005,\u0000\u0000\u02a8\u02aa\u0003\u00e0p\u0000\u02a9\u02a8"+
		"\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ab"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005X\u0000\u0000\u02ac[\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ae\u0005N\u0000\u0000\u02ae\u02b3\u0003^/\u0000"+
		"\u02af\u02b0\u0005U\u0000\u0000\u02b0\u02b2\u0003^/\u0000\u02b1\u02af"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b8"+
		"\u0005U\u0000\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02ba\u0005"+
		"O\u0000\u0000\u02ba]\u0001\u0000\u0000\u0000\u02bb\u02be\u0003`0\u0000"+
		"\u02bc\u02bd\u0005\u001a\u0000\u0000\u02bd\u02bf\u0003\u00e0p\u0000\u02be"+
		"\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005\u0081\u0000\u0000\u02c1"+
		"\u02c2\u0003\u00e0p\u0000\u02c2_\u0001\u0000\u0000\u0000\u02c3\u02d4\u0005"+
		"\'\u0000\u0000\u02c4\u02d4\u0005B\u0000\u0000\u02c5\u02d4\u0003\u0128"+
		"\u0094\u0000\u02c6\u02d4\u0003b1\u0000\u02c7\u02d4\u0003f3\u0000\u02c8"+
		"\u02d4\u0003\u001a\r\u0000\u02c9\u02ca\u0005R\u0000\u0000\u02ca\u02cd"+
		"\u0003j5\u0000\u02cb\u02cc\u0005U\u0000\u0000\u02cc\u02ce\u0003j5\u0000"+
		"\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000"+
		"\u02cf\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005S\u0000\u0000\u02d2"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d3\u02c3\u0001\u0000\u0000\u0000\u02d3"+
		"\u02c4\u0001\u0000\u0000\u0000\u02d3\u02c5\u0001\u0000\u0000\u0000\u02d3"+
		"\u02c6\u0001\u0000\u0000\u0000\u02d3\u02c7\u0001\u0000\u0000\u0000\u02d3"+
		"\u02c8\u0001\u0000\u0000\u0000\u02d3\u02c9\u0001\u0000\u0000\u0000\u02d4"+
		"a\u0001\u0000\u0000\u0000\u02d5\u02d6\u0003d2\u0000\u02d6\u02d7\u0007"+
		"\u0003\u0000\u0000\u02d7c\u0001\u0000\u0000\u0000\u02d8\u02db\u0003\u00c2"+
		"a\u0000\u02d9\u02db\u0005C\u0000\u0000\u02da\u02d8\u0001\u0000\u0000\u0000"+
		"\u02da\u02d9\u0001\u0000\u0000\u0000\u02dbe\u0001\u0000\u0000\u0000\u02dc"+
		"\u02dd\u0003\u001a\r\u0000\u02dd\u02de\u0005R\u0000\u0000\u02de\u02e3"+
		"\u0003h4\u0000\u02df\u02e0\u0005U\u0000\u0000\u02e0\u02e2\u0003h4\u0000"+
		"\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e7\u0005S\u0000\u0000\u02e7g\u0001\u0000\u0000\u0000\u02e8\u02ef"+
		"\u0003f3\u0000\u02e9\u02ea\u0003\u00b6[\u0000\u02ea\u02eb\u0007\u0003"+
		"\u0000\u0000\u02eb\u02ef\u0001\u0000\u0000\u0000\u02ec\u02ef\u0005B\u0000"+
		"\u0000\u02ed\u02ef\u0003\u0128\u0094\u0000\u02ee\u02e8\u0001\u0000\u0000"+
		"\u0000\u02ee\u02e9\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ed\u0001\u0000\u0000\u0000\u02efi\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0003\u00b6[\u0000\u02f1\u02f2\u0007\u0003\u0000\u0000\u02f2"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f3\u02f6\u0003\u0128\u0094\u0000\u02f4"+
		"\u02f6\u0005B\u0000\u0000\u02f5\u02f0\u0001\u0000\u0000\u0000\u02f5\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f6k\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0005d\u0000\u0000\u02f8\u02f9\u0005P\u0000"+
		"\u0000\u02f9\u02fb\u0003n7\u0000\u02fa\u02fc\u0003\u011e\u008f\u0000\u02fb"+
		"\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005Q\u0000\u0000\u02fem\u0001"+
		"\u0000\u0000\u0000\u02ff\u0304\u0005C\u0000\u0000\u0300\u0301\u0005V\u0000"+
		"\u0000\u0301\u0303\u0005C\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000"+
		"\u0303\u0306\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000"+
		"\u0304\u0305\u0001\u0000\u0000\u0000\u0305o\u0001\u0000\u0000\u0000\u0306"+
		"\u0304\u0001\u0000\u0000\u0000\u0307\u0309\u0003l6\u0000\u0308\u0307\u0001"+
		"\u0000\u0000\u0000\u0309\u030c\u0001\u0000\u0000\u0000\u030a\u0308\u0001"+
		"\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b\u030d\u0001"+
		"\u0000\u0000\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030d\u030e\u0005"+
		"\u000e\u0000\u0000\u030e\u030f\u0003r9\u0000\u030fq\u0001\u0000\u0000"+
		"\u0000\u0310\u0312\u0003|>\u0000\u0311\u0313\u0005\u000e\u0000\u0000\u0312"+
		"\u0311\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313"+
		"\u0315\u0001\u0000\u0000\u0000\u0314\u0316\u0003z=\u0000\u0315\u0314\u0001"+
		"\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0317\u0001"+
		"\u0000\u0000\u0000\u0317\u0318\u0007\u0004\u0000\u0000\u0318\u0319\u0005"+
		"R\u0000\u0000\u0319\u031c\u0003t:\u0000\u031a\u031b\u0005U\u0000\u0000"+
		"\u031b\u031d\u0003t:\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031d\u031e"+
		"\u0001\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031e\u031f"+
		"\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0005S\u0000\u0000\u0321\u0322\u0005e\u0000\u0000\u0322\u0323\u0003\u00e0"+
		"p\u0000\u0323\u0324\u0005X\u0000\u0000\u0324\u0335\u0001\u0000\u0000\u0000"+
		"\u0325\u0327\u0003|>\u0000\u0326\u0328\u0005\u000e\u0000\u0000\u0327\u0326"+
		"\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000\u0000\u0000\u0328\u032a"+
		"\u0001\u0000\u0000\u0000\u0329\u032b\u0003z=\u0000\u032a\u0329\u0001\u0000"+
		"\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032f\u0001\u0000"+
		"\u0000\u0000\u032c\u0330\u0005=\u0000\u0000\u032d\u0330\u0005$\u0000\u0000"+
		"\u032e\u0330\u0003\u00b6[\u0000\u032f\u032c\u0001\u0000\u0000\u0000\u032f"+
		"\u032d\u0001\u0000\u0000\u0000\u032f\u032e\u0001\u0000\u0000\u0000\u0330"+
		"\u0331\u0001\u0000\u0000\u0000\u0331\u0332\u0003\u0080@\u0000\u0332\u0333"+
		"\u0005X\u0000\u0000\u0333\u0335\u0001\u0000\u0000\u0000\u0334\u0310\u0001"+
		"\u0000\u0000\u0000\u0334\u0325\u0001\u0000\u0000\u0000\u0335s\u0001\u0000"+
		"\u0000\u0000\u0336\u0338\u0003\u00b6[\u0000\u0337\u0336\u0001\u0000\u0000"+
		"\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000"+
		"\u0000\u0339\u033a\u0003(\u0014\u0000\u033au\u0001\u0000\u0000\u0000\u033b"+
		"\u033c\u0007\u0005\u0000\u0000\u033cw\u0001\u0000\u0000\u0000\u033d\u033e"+
		"\u0007\u0006\u0000\u0000\u033ey\u0001\u0000\u0000\u0000\u033f\u0340\u0005"+
		"\t\u0000\u0000\u0340{\u0001\u0000\u0000\u0000\u0341\u0345\u0003v;\u0000"+
		"\u0342\u0345\u0005.\u0000\u0000\u0343\u0345\u0005<\u0000\u0000\u0344\u0341"+
		"\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0344\u0343"+
		"\u0001\u0000\u0000\u0000\u0345\u0348\u0001\u0000\u0000\u0000\u0346\u0344"+
		"\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347}\u0001"+
		"\u0000\u0000\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0349\u034b\u0003"+
		"l6\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034b\u034e\u0001\u0000\u0000"+
		"\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000"+
		"\u0000\u034d\u034f\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000"+
		"\u0000\u034f\u0350\u0003r9\u0000\u0350\u007f\u0001\u0000\u0000\u0000\u0351"+
		"\u0356\u0003\u0082A\u0000\u0352\u0353\u0005U\u0000\u0000\u0353\u0355\u0003"+
		"\u0082A\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u0358\u0001\u0000"+
		"\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000"+
		"\u0000\u0000\u0357\u0081\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000"+
		"\u0000\u0000\u0359\u035c\u0003(\u0014\u0000\u035a\u035b\u0005e\u0000\u0000"+
		"\u035b\u035d\u0003\u00deo\u0000\u035c\u035a\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0001\u0000\u0000\u0000\u035d\u0083\u0001\u0000\u0000\u0000\u035e"+
		"\u0360\u0003l6\u0000\u035f\u035e\u0001\u0000\u0000\u0000\u0360\u0363\u0001"+
		"\u0000\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0361\u0362\u0001"+
		"\u0000\u0000\u0000\u0362\u0364\u0001\u0000\u0000\u0000\u0363\u0361\u0001"+
		"\u0000\u0000\u0000\u0364\u0365\u0003|>\u0000\u0365\u0366\u0003\u00b4Z"+
		"\u0000\u0366\u0368\u0003(\u0014\u0000\u0367\u0369\u0003\u00d2i\u0000\u0368"+
		"\u0367\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369"+
		"\u036a\u0001\u0000\u0000\u0000\u036a\u036b\u0003\u0088D\u0000\u036b\u036c"+
		"\u0003\u008eG\u0000\u036c\u0085\u0001\u0000\u0000\u0000\u036d\u036f\u0003"+
		"l6\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036f\u0372\u0001\u0000\u0000"+
		"\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000"+
		"\u0000\u0371\u0374\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000"+
		"\u0000\u0373\u0375\u0003v;\u0000\u0374\u0373\u0001\u0000\u0000\u0000\u0374"+
		"\u0375\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376"+
		"\u0377\u0005C\u0000\u0000\u0377\u0378\u0003\u0088D\u0000\u0378\u0379\u0003"+
		"<\u001e\u0000\u0379\u0087\u0001\u0000\u0000\u0000\u037a\u037c\u0005R\u0000"+
		"\u0000\u037b\u037d\u0003\u008aE\u0000\u037c\u037b\u0001\u0000\u0000\u0000"+
		"\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000"+
		"\u037e\u037f\u0005S\u0000\u0000\u037f\u0089\u0001\u0000\u0000\u0000\u0380"+
		"\u0385\u0003\u008cF\u0000\u0381\u0382\u0005U\u0000\u0000\u0382\u0384\u0003"+
		"\u008cF\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0384\u0387\u0001\u0000"+
		"\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000"+
		"\u0000\u0000\u0386\u008b\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000"+
		"\u0000\u0000\u0388\u038a\u0003x<\u0000\u0389\u0388\u0001\u0000\u0000\u0000"+
		"\u0389\u038a\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000"+
		"\u038b\u038c\u0003\u00b6[\u0000\u038c\u038f\u0003&\u0013\u0000\u038d\u038e"+
		"\u0005e\u0000\u0000\u038e\u0390\u0003\u00e0p\u0000\u038f\u038d\u0001\u0000"+
		"\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u008d\u0001\u0000"+
		"\u0000\u0000\u0391\u0399\u0003:\u001d\u0000\u0392\u0393\u0005\u0081\u0000"+
		"\u0000\u0393\u0395\u0003\u00e0p\u0000\u0394\u0396\u0005X\u0000\u0000\u0395"+
		"\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396"+
		"\u0399\u0001\u0000\u0000\u0000\u0397\u0399\u0005X\u0000\u0000\u0398\u0391"+
		"\u0001\u0000\u0000\u0000\u0398\u0392\u0001\u0000\u0000\u0000\u0398\u0397"+
		"\u0001\u0000\u0000\u0000\u0399\u008f\u0001\u0000\u0000\u0000\u039a\u039c"+
		"\u0003l6\u0000\u039b\u039a\u0001\u0000\u0000\u0000\u039c\u039f\u0001\u0000"+
		"\u0000\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000"+
		"\u0000\u0000\u039e\u03a0\u0001\u0000\u0000\u0000\u039f\u039d\u0001\u0000"+
		"\u0000\u0000\u03a0\u03a1\u0003\u00b4Z\u0000\u03a1\u03a2\u0005)\u0000\u0000"+
		"\u03a2\u03a3\u0003\u0092I\u0000\u03a3\u03a4\u0003\u0088D\u0000\u03a4\u03a5"+
		"\u0003\u008eG\u0000\u03a5\u0091\u0001\u0000\u0000\u0000\u03a6\u03ba\u0005"+
		"Y\u0000\u0000\u03a7\u03ba\u0005Z\u0000\u0000\u03a8\u03ba\u0005[\u0000"+
		"\u0000\u03a9\u03ba\u0005]\u0000\u0000\u03aa\u03ba\u0005^\u0000\u0000\u03ab"+
		"\u03ba\u0005a\u0000\u0000\u03ac\u03ba\u0005_\u0000\u0000\u03ad\u03ba\u0005"+
		"`\u0000\u0000\u03ae\u03af\u0005f\u0000\u0000\u03af\u03ba\u0005f\u0000"+
		"\u0000\u03b0\u03b1\u0005g\u0000\u0000\u03b1\u03ba\u0005g\u0000\u0000\u03b2"+
		"\u03ba\u0005o\u0000\u0000\u03b3\u03ba\u0005p\u0000\u0000\u03b4\u03b5\u0005"+
		"P\u0000\u0000\u03b5\u03ba\u0005Q\u0000\u0000\u03b6\u03b7\u0005P\u0000"+
		"\u0000\u03b7\u03b8\u0005Q\u0000\u0000\u03b8\u03ba\u0005e\u0000\u0000\u03b9"+
		"\u03a6\u0001\u0000\u0000\u0000\u03b9\u03a7\u0001\u0000\u0000\u0000\u03b9"+
		"\u03a8\u0001\u0000\u0000\u0000\u03b9\u03a9\u0001\u0000\u0000\u0000\u03b9"+
		"\u03aa\u0001\u0000\u0000\u0000\u03b9\u03ab\u0001\u0000\u0000\u0000\u03b9"+
		"\u03ac\u0001\u0000\u0000\u0000\u03b9\u03ad\u0001\u0000\u0000\u0000\u03b9"+
		"\u03ae\u0001\u0000\u0000\u0000\u03b9\u03b0\u0001\u0000\u0000\u0000\u03b9"+
		"\u03b2\u0001\u0000\u0000\u0000\u03b9\u03b3\u0001\u0000\u0000\u0000\u03b9"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b9\u03b6\u0001\u0000\u0000\u0000\u03ba"+
		"\u0093\u0001\u0000\u0000\u0000\u03bb\u03bd\u0003l6\u0000\u03bc\u03bb\u0001"+
		"\u0000\u0000\u0000\u03bd\u03c0\u0001\u0000\u0000\u0000\u03be\u03bc\u0001"+
		"\u0000\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf\u03c2\u0001"+
		"\u0000\u0000\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c1\u03c3\u0003"+
		"v;\u0000\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c5\u0001\u0000\u0000\u0000\u03c4\u03c6\u0005<\u0000\u0000"+
		"\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c8\u00050\u0000\u0000\u03c8"+
		"\u03ca\u0005C\u0000\u0000\u03c9\u03cb\u0003\u00d2i\u0000\u03ca\u03c9\u0001"+
		"\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001"+
		"\u0000\u0000\u0000\u03cc\u03cd\u0003\u0096K\u0000\u03cd\u0095\u0001\u0000"+
		"\u0000\u0000\u03ce\u03d2\u0005N\u0000\u0000\u03cf\u03d1\u0003\u0098L\u0000"+
		"\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d4\u0001\u0000\u0000\u0000"+
		"\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000"+
		"\u03d3\u03d5\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000"+
		"\u03d5\u03d6\u0005O\u0000\u0000\u03d6\u0097\u0001\u0000\u0000\u0000\u03d7"+
		"\u03d8\u0003~?\u0000\u03d8\u0099\u0001\u0000\u0000\u0000\u03d9\u03db\u0003"+
		"l6\u0000\u03da\u03d9\u0001\u0000\u0000\u0000\u03db\u03de\u0001\u0000\u0000"+
		"\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000"+
		"\u0000\u03dd\u03df\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000"+
		"\u0000\u03df\u03e0\u00053\u0000\u0000\u03e0\u03e2\u0005C\u0000\u0000\u03e1"+
		"\u03e3\u0003\u00d2i\u0000\u03e2\u03e1\u0001\u0000\u0000\u0000\u03e2\u03e3"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e5\u0001\u0000\u0000\u0000\u03e4\u03e6"+
		"\u0003\u009cN\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u03e8\u0003"+
		"\u009eO\u0000\u03e8\u009b\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005W\u0000"+
		"\u0000\u03ea\u03ef\u0003\u00b6[\u0000\u03eb\u03ec\u0005Y\u0000\u0000\u03ec"+
		"\u03ee\u0003\u00b6[\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ee\u03f1"+
		"\u0001\u0000\u0000\u0000\u03ef\u03ed\u0001\u0000\u0000\u0000\u03ef\u03f0"+
		"\u0001\u0000\u0000\u0000\u03f0\u009d\u0001\u0000\u0000\u0000\u03f1\u03ef"+
		"\u0001\u0000\u0000\u0000\u03f2\u03f5\u0003\u00a0P\u0000\u03f3\u03f5\u0003"+
		"\u0084B\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f3\u0001\u0000"+
		"\u0000\u0000\u03f5\u009f\u0001\u0000\u0000\u0000\u03f6\u03fa\u0005N\u0000"+
		"\u0000\u03f7\u03f9\u0003\u00a2Q\u0000\u03f8\u03f7\u0001\u0000\u0000\u0000"+
		"\u03f9\u03fc\u0001\u0000\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000"+
		"\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fd\u0001\u0000\u0000\u0000"+
		"\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fd\u03fe\u0005O\u0000\u0000\u03fe"+
		"\u00a1\u0001\u0000\u0000\u0000\u03ff\u0400\u0003\u0084B\u0000\u0400\u00a3"+
		"\u0001\u0000\u0000\u0000\u0401\u0403\u0003l6\u0000\u0402\u0401\u0001\u0000"+
		"\u0000\u0000\u0403\u0406\u0001\u0000\u0000\u0000\u0404\u0402\u0001\u0000"+
		"\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0408\u0001\u0000"+
		"\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0407\u0409\u00052\u0000"+
		"\u0000\u0408\u0407\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000"+
		"\u0000\u0409\u040a\u0001\u0000\u0000\u0000\u040a\u040b\u0005:\u0000\u0000"+
		"\u040b\u040d\u0005C\u0000\u0000\u040c\u040e\u0003\u00d2i\u0000\u040d\u040c"+
		"\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u040f"+
		"\u0001\u0000\u0000\u0000\u040f\u0410\u0003\u00a6S\u0000\u0410\u00a5\u0001"+
		"\u0000\u0000\u0000\u0411\u0412\u0005N\u0000\u0000\u0412\u0417\u0003\u00aa"+
		"U\u0000\u0413\u0414\u0005U\u0000\u0000\u0414\u0416\u0003\u00aaU\u0000"+
		"\u0415\u0413\u0001\u0000\u0000\u0000\u0416\u0419\u0001\u0000\u0000\u0000"+
		"\u0417\u0415\u0001\u0000\u0000\u0000\u0417\u0418\u0001\u0000\u0000\u0000"+
		"\u0418\u041b\u0001\u0000\u0000\u0000\u0419\u0417\u0001\u0000\u0000\u0000"+
		"\u041a\u041c\u0005U\u0000\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041b"+
		"\u041c\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d"+
		"\u041e\u0005O\u0000\u0000\u041e\u00a7\u0001\u0000\u0000\u0000\u041f\u0420"+
		"\u0005R\u0000\u0000\u0420\u0425\u0003\u008cF\u0000\u0421\u0422\u0005U"+
		"\u0000\u0000\u0422\u0424\u0003\u008cF\u0000\u0423\u0421\u0001\u0000\u0000"+
		"\u0000\u0424\u0427\u0001\u0000\u0000\u0000\u0425\u0423\u0001\u0000\u0000"+
		"\u0000\u0425\u0426\u0001\u0000\u0000\u0000\u0426\u0428\u0001\u0000\u0000"+
		"\u0000\u0427\u0425\u0001\u0000\u0000\u0000\u0428\u0429\u0005S\u0000\u0000"+
		"\u0429\u00a9\u0001\u0000\u0000\u0000\u042a\u042c\u0005C\u0000\u0000\u042b"+
		"\u042d\u0003\u00a8T\u0000\u042c\u042b\u0001\u0000\u0000\u0000\u042c\u042d"+
		"\u0001\u0000\u0000\u0000\u042d\u00ab\u0001\u0000\u0000\u0000\u042e\u0430"+
		"\u0003l6\u0000\u042f\u042e\u0001\u0000\u0000\u0000\u0430\u0433\u0001\u0000"+
		"\u0000\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0431\u0432\u0001\u0000"+
		"\u0000\u0000\u0432\u0434\u0001\u0000\u0000\u0000\u0433\u0431\u0001\u0000"+
		"\u0000\u0000\u0434\u0435\u0005@\u0000\u0000\u0435\u043f\u0003\u00aeW\u0000"+
		"\u0436\u0437\u0005\u0018\u0000\u0000\u0437\u043c\u0003\u00b6[\u0000\u0438"+
		"\u0439\u0005U\u0000\u0000\u0439\u043b\u0003\u00b6[\u0000\u043a\u0438\u0001"+
		"\u0000\u0000\u0000\u043b\u043e\u0001\u0000\u0000\u0000\u043c\u043a\u0001"+
		"\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000\u043d\u0440\u0001"+
		"\u0000\u0000\u0000\u043e\u043c\u0001\u0000\u0000\u0000\u043f\u0436\u0001"+
		"\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u0443\u0001"+
		"\u0000\u0000\u0000\u0441\u0444\u0003\u00b0X\u0000\u0442\u0444\u0005X\u0000"+
		"\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0443\u0442\u0001\u0000\u0000"+
		"\u0000\u0444\u00ad\u0001\u0000\u0000\u0000\u0445\u0447\u0003\u00b6[\u0000"+
		"\u0446\u0448\u0003\u00d2i\u0000\u0447\u0446\u0001\u0000\u0000\u0000\u0447"+
		"\u0448\u0001\u0000\u0000\u0000\u0448\u00af\u0001\u0000\u0000\u0000\u0449"+
		"\u044d\u0005N\u0000\u0000\u044a\u044c\u0003\u00b2Y\u0000\u044b\u044a\u0001"+
		"\u0000\u0000\u0000\u044c\u044f\u0001\u0000\u0000\u0000\u044d\u044b\u0001"+
		"\u0000\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u0450\u0001"+
		"\u0000\u0000\u0000\u044f\u044d\u0001\u0000\u0000\u0000\u0450\u0451\u0005"+
		"O\u0000\u0000\u0451\u00b1\u0001\u0000\u0000\u0000\u0452\u0455\u0003\u0084"+
		"B\u0000\u0453\u0455\u0003\u0090H\u0000\u0454\u0452\u0001\u0000\u0000\u0000"+
		"\u0454\u0453\u0001\u0000\u0000\u0000\u0455\u00b3\u0001\u0000\u0000\u0000"+
		"\u0456\u045a\u0005>\u0000\u0000\u0457\u045a\u0005-\u0000\u0000\u0458\u045a"+
		"\u0003\u00b6[\u0000\u0459\u0456\u0001\u0000\u0000\u0000\u0459\u0457\u0001"+
		"\u0000\u0000\u0000\u0459\u0458\u0001\u0000\u0000\u0000\u045a\u00b5\u0001"+
		"\u0000\u0000\u0000\u045b\u045c\u0005C\u0000\u0000\u045c\u045e\u0005W\u0000"+
		"\u0000\u045d\u045b\u0001\u0000\u0000\u0000\u045d\u045e\u0001\u0000\u0000"+
		"\u0000\u045e\u045f\u0001\u0000\u0000\u0000\u045f\u0463\u0003\u00ba]\u0000"+
		"\u0460\u0462\u0003\u00b8\\\u0000\u0461\u0460\u0001\u0000\u0000\u0000\u0462"+
		"\u0465\u0001\u0000\u0000\u0000\u0463\u0461\u0001\u0000\u0000\u0000\u0463"+
		"\u0464\u0001\u0000\u0000\u0000\u0464\u00b7\u0001\u0000\u0000\u0000\u0465"+
		"\u0463\u0001\u0000\u0000\u0000\u0466\u0469\u0003\u00cae\u0000\u0467\u0469"+
		"\u0005h\u0000\u0000\u0468\u0466\u0001\u0000\u0000\u0000\u0468\u0467\u0001"+
		"\u0000\u0000\u0000\u0469\u00b9\u0001\u0000\u0000\u0000\u046a\u046e\u0003"+
		"\u00c0`\u0000\u046b\u046e\u0003\u00c2a\u0000\u046c\u046e\u0003\u00bc^"+
		"\u0000\u046d\u046a\u0001\u0000\u0000\u0000\u046d\u046b\u0001\u0000\u0000"+
		"\u0000\u046d\u046c\u0001\u0000\u0000\u0000\u046e\u00bb\u0001\u0000\u0000"+
		"\u0000\u046f\u0470\u0005R\u0000\u0000\u0470\u0475\u0003\u00be_\u0000\u0471"+
		"\u0472\u0005U\u0000\u0000\u0472\u0474\u0003\u00be_\u0000\u0473\u0471\u0001"+
		"\u0000\u0000\u0000\u0474\u0477\u0001\u0000\u0000\u0000\u0475\u0473\u0001"+
		"\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476\u0478\u0001"+
		"\u0000\u0000\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0478\u0479\u0005"+
		"S\u0000\u0000\u0479\u00bd\u0001\u0000\u0000\u0000\u047a\u047c\u0003\u00b6"+
		"[\u0000\u047b\u047d\u0005C\u0000\u0000\u047c\u047b\u0001\u0000\u0000\u0000"+
		"\u047c\u047d\u0001\u0000\u0000\u0000\u047d\u00bf\u0001\u0000\u0000\u0000"+
		"\u047e\u047f\u0005\n\u0000\u0000\u047f\u0485\u0003\u00d4j\u0000\u0480"+
		"\u0482\u0003\u001a\r\u0000\u0481\u0483\u0003\u00d4j\u0000\u0482\u0481"+
		"\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483\u0485"+
		"\u0001\u0000\u0000\u0000\u0484\u047e\u0001\u0000\u0000\u0000\u0484\u0480"+
		"\u0001\u0000\u0000\u0000\u0485\u00c1\u0001\u0000\u0000\u0000\u0486\u048c"+
		"\u0005\u000b\u0000\u0000\u0487\u048c\u0005\r\u0000\u0000\u0488\u048c\u0005"+
		"/\u0000\u0000\u0489\u048c\u0005>\u0000\u0000\u048a\u048c\u0003\u00c4b"+
		"\u0000\u048b\u0486\u0001\u0000\u0000\u0000\u048b\u0487\u0001\u0000\u0000"+
		"\u0000\u048b\u0488\u0001\u0000\u0000\u0000\u048b\u0489\u0001\u0000\u0000"+
		"\u0000\u048b\u048a\u0001\u0000\u0000\u0000\u048c\u00c3\u0001\u0000\u0000"+
		"\u0000\u048d\u0490\u0003\u00c6c\u0000\u048e\u0490\u0003\u00c8d\u0000\u048f"+
		"\u048d\u0001\u0000\u0000\u0000\u048f\u048e\u0001\u0000\u0000\u0000\u0490"+
		"\u00c5\u0001\u0000\u0000\u0000\u0491\u0492\u0007\u0007\u0000\u0000\u0492"+
		"\u00c7\u0001\u0000\u0000\u0000\u0493\u0494\u0007\b\u0000\u0000\u0494\u00c9"+
		"\u0001\u0000\u0000\u0000\u0495\u0497\u0005P\u0000\u0000\u0496\u0498\u0003"+
		"\u00e0p\u0000\u0497\u0496\u0001\u0000\u0000\u0000\u0497\u0498\u0001\u0000"+
		"\u0000\u0000\u0498\u049c\u0001\u0000\u0000\u0000\u0499\u049b\u0005U\u0000"+
		"\u0000\u049a\u0499\u0001\u0000\u0000\u0000\u049b\u049e\u0001\u0000\u0000"+
		"\u0000\u049c\u049a\u0001\u0000\u0000\u0000\u049c\u049d\u0001\u0000\u0000"+
		"\u0000\u049d\u049f\u0001\u0000\u0000\u0000\u049e\u049c\u0001\u0000\u0000"+
		"\u0000\u049f\u04a0\u0005Q\u0000\u0000\u04a0\u00cb\u0001\u0000\u0000\u0000"+
		"\u04a1\u04a2\u0003\u00b6[\u0000\u04a2\u04a3\u0005C\u0000\u0000\u04a3\u04aa"+
		"\u0001\u0000\u0000\u0000\u04a4\u04a7\u0005C\u0000\u0000\u04a5\u04a6\u0005"+
		"W\u0000\u0000\u04a6\u04a8\u0003\u00ceg\u0000\u04a7\u04a5\u0001\u0000\u0000"+
		"\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8\u04aa\u0001\u0000\u0000"+
		"\u0000\u04a9\u04a1\u0001\u0000\u0000\u0000\u04a9\u04a4\u0001\u0000\u0000"+
		"\u0000\u04aa\u00cd\u0001\u0000\u0000\u0000\u04ab\u04b0\u0003\u00d0h\u0000"+
		"\u04ac\u04ad\u0005Y\u0000\u0000\u04ad\u04af\u0003\u00d0h\u0000\u04ae\u04ac"+
		"\u0001\u0000\u0000\u0000\u04af\u04b2\u0001\u0000\u0000\u0000\u04b0\u04ae"+
		"\u0001\u0000\u0000\u0000\u04b0\u04b1\u0001\u0000\u0000\u0000\u04b1\u00cf"+
		"\u0001\u0000\u0000\u0000\u04b2\u04b0\u0001\u0000\u0000\u0000\u04b3\u04b5"+
		"\u0003\u001a\r\u0000\u04b4\u04b6\u0003\u00d4j\u0000\u04b5\u04b4\u0001"+
		"\u0000\u0000\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6\u00d1\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b8\u0005f\u0000\u0000\u04b8\u04bd\u0003\u00cc"+
		"f\u0000\u04b9\u04ba\u0005U\u0000\u0000\u04ba\u04bc\u0003\u00ccf\u0000"+
		"\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bc\u04bf\u0001\u0000\u0000\u0000"+
		"\u04bd\u04bb\u0001\u0000\u0000\u0000\u04bd\u04be\u0001\u0000\u0000\u0000"+
		"\u04be\u04c0\u0001\u0000\u0000\u0000\u04bf\u04bd\u0001\u0000\u0000\u0000"+
		"\u04c0\u04c1\u0005g\u0000\u0000\u04c1\u00d3\u0001\u0000\u0000\u0000\u04c2"+
		"\u04c3\u0005f\u0000\u0000\u04c3\u04c8\u0003\u00d6k\u0000\u04c4\u04c5\u0005"+
		"U\u0000\u0000\u04c5\u04c7\u0003\u00d6k\u0000\u04c6\u04c4\u0001\u0000\u0000"+
		"\u0000\u04c7\u04ca\u0001\u0000\u0000\u0000\u04c8\u04c6\u0001\u0000\u0000"+
		"\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9\u04cb\u0001\u0000\u0000"+
		"\u0000\u04ca\u04c8\u0001\u0000\u0000\u0000\u04cb\u04cc\u0003\u00d8l\u0000"+
		"\u04cc\u00d5\u0001\u0000\u0000\u0000\u04cd\u04d0\u0003\u00b6[\u0000\u04ce"+
		"\u04d0\u0003\u0128\u0094\u0000\u04cf\u04cd\u0001\u0000\u0000\u0000\u04cf"+
		"\u04ce\u0001\u0000\u0000\u0000\u04d0\u00d7\u0001\u0000\u0000\u0000\u04d1"+
		"\u04d5\u0005g\u0000\u0000\u04d2\u04d3\u0005g\u0000\u0000\u04d3\u04d5\u0003"+
		"\u00d8l\u0000\u04d4\u04d1\u0001\u0000\u0000\u0000\u04d4\u04d2\u0001\u0000"+
		"\u0000\u0000\u04d5\u00d9\u0001\u0000\u0000\u0000\u04d6\u04d7\u0005R\u0000"+
		"\u0000\u04d7\u04da\u0003\u0126\u0093\u0000\u04d8\u04d9\u0005U\u0000\u0000"+
		"\u04d9\u04db\u0003\u0126\u0093\u0000\u04da\u04d8\u0001\u0000\u0000\u0000"+
		"\u04db\u04dc\u0001\u0000\u0000\u0000\u04dc\u04da\u0001\u0000\u0000\u0000"+
		"\u04dc\u04dd\u0001\u0000\u0000\u0000\u04dd\u04de\u0001\u0000\u0000\u0000"+
		"\u04de\u04df\u0005S\u0000\u0000\u04df\u04e6\u0001\u0000\u0000\u0000\u04e0"+
		"\u04e1\u0005R\u0000\u0000\u04e1\u04e2\u0003\u0126\u0093\u0000\u04e2\u04e3"+
		"\u0005U\u0000\u0000\u04e3\u04e4\u0005S\u0000\u0000\u04e4\u04e6\u0001\u0000"+
		"\u0000\u0000\u04e5\u04d6\u0001\u0000\u0000\u0000\u04e5\u04e0\u0001\u0000"+
		"\u0000\u0000\u04e6\u00db\u0001\u0000\u0000\u0000\u04e7\u04e8\u0005R\u0000"+
		"\u0000\u04e8\u04e9\u0003\u00e0p\u0000\u04e9\u04ea\u0005S\u0000\u0000\u04ea"+
		"\u00dd\u0001\u0000\u0000\u0000\u04eb\u04ec\u0003\u00e4r\u0000\u04ec\u00df"+
		"\u0001\u0000\u0000\u0000\u04ed\u04ee\u0003\u00e2q\u0000\u04ee\u00e1\u0001"+
		"\u0000\u0000\u0000\u04ef\u04f3\u0003\u00e4r\u0000\u04f0\u04f1\u0003\u00ec"+
		"v\u0000\u04f1\u04f2\u0003\u00e2q\u0000\u04f2\u04f4\u0001\u0000\u0000\u0000"+
		"\u04f3\u04f0\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000"+
		"\u04f4\u00e3\u0001\u0000\u0000\u0000\u04f5\u04f6\u0003\u00e6s\u0000\u04f6"+
		"\u04f7\u0005h\u0000\u0000\u04f7\u04f8\u0003\u00e0p\u0000\u04f8\u04f9\u0005"+
		"W\u0000\u0000\u04f9\u04fa\u0003\u00e4r\u0000\u04fa\u0500\u0001\u0000\u0000"+
		"\u0000\u04fb\u04fc\u0003\u00e6s\u0000\u04fc\u04fd\u0005h\u0000\u0000\u04fd"+
		"\u0500\u0001\u0000\u0000\u0000\u04fe\u0500\u0003\u00e6s\u0000\u04ff\u04f5"+
		"\u0001\u0000\u0000\u0000\u04ff\u04fb\u0001\u0000\u0000\u0000\u04ff\u04fe"+
		"\u0001\u0000\u0000\u0000\u0500\u00e5\u0001\u0000\u0000\u0000\u0501\u0504"+
		"\u0003\u00e8t\u0000\u0502\u0503\u0005i\u0000\u0000\u0503\u0505\u0003\u00e6"+
		"s\u0000\u0504\u0502\u0001\u0000\u0000\u0000\u0504\u0505\u0001\u0000\u0000"+
		"\u0000\u0505\u00e7\u0001\u0000\u0000\u0000\u0506\u050a\u0003\u00eew\u0000"+
		"\u0507\u0508\u0003\u00eau\u0000\u0508\u0509\u0003\u00eew\u0000\u0509\u050b"+
		"\u0001\u0000\u0000\u0000\u050a\u0507\u0001\u0000\u0000\u0000\u050a\u050b"+
		"\u0001\u0000\u0000\u0000\u050b\u00e9\u0001\u0000\u0000\u0000\u050c\u050d"+
		"\u0007\t\u0000\u0000\u050d\u00eb\u0001\u0000\u0000\u0000\u050e\u050f\u0007"+
		"\n\u0000\u0000\u050f\u00ed\u0001\u0000\u0000\u0000\u0510\u0515\u0003\u00f0"+
		"x\u0000\u0511\u0512\u0005n\u0000\u0000\u0512\u0514\u0003\u00f0x\u0000"+
		"\u0513\u0511\u0001\u0000\u0000\u0000\u0514\u0517\u0001\u0000\u0000\u0000"+
		"\u0515\u0513\u0001\u0000\u0000\u0000\u0515\u0516\u0001\u0000\u0000\u0000"+
		"\u0516\u00ef\u0001\u0000\u0000\u0000\u0517\u0515\u0001\u0000\u0000\u0000"+
		"\u0518\u051d\u0003\u00f2y\u0000\u0519\u051a\u0005m\u0000\u0000\u051a\u051c"+
		"\u0003\u00f2y\u0000\u051b\u0519\u0001\u0000\u0000\u0000\u051c\u051f\u0001"+
		"\u0000\u0000\u0000\u051d\u051b\u0001\u0000\u0000\u0000\u051d\u051e\u0001"+
		"\u0000\u0000\u0000\u051e\u00f1\u0001\u0000\u0000\u0000\u051f\u051d\u0001"+
		"\u0000\u0000\u0000\u0520\u0525\u0003\u00f4z\u0000\u0521\u0522\u0005`\u0000"+
		"\u0000\u0522\u0524\u0003\u00f4z\u0000\u0523\u0521\u0001\u0000\u0000\u0000"+
		"\u0524\u0527\u0001\u0000\u0000\u0000\u0525\u0523\u0001\u0000\u0000\u0000"+
		"\u0525\u0526\u0001\u0000\u0000\u0000\u0526\u00f3\u0001\u0000\u0000\u0000"+
		"\u0527\u0525\u0001\u0000\u0000\u0000\u0528\u052d\u0003\u00f6{\u0000\u0529"+
		"\u052a\u0005a\u0000\u0000\u052a\u052c\u0003\u00f6{\u0000\u052b\u0529\u0001"+
		"\u0000\u0000\u0000\u052c\u052f\u0001\u0000\u0000\u0000\u052d\u052b\u0001"+
		"\u0000\u0000\u0000\u052d\u052e\u0001\u0000\u0000\u0000\u052e\u00f5\u0001"+
		"\u0000\u0000\u0000\u052f\u052d\u0001\u0000\u0000\u0000\u0530\u0535\u0003"+
		"\u00f8|\u0000\u0531\u0532\u0005_\u0000\u0000\u0532\u0534\u0003\u00f8|"+
		"\u0000\u0533\u0531\u0001\u0000\u0000\u0000\u0534\u0537\u0001\u0000\u0000"+
		"\u0000\u0535\u0533\u0001\u0000\u0000\u0000\u0535\u0536\u0001\u0000\u0000"+
		"\u0000\u0536\u00f7\u0001\u0000\u0000\u0000\u0537\u0535\u0001\u0000\u0000"+
		"\u0000\u0538\u053d\u0003\u00fa}\u0000\u0539\u053a\u0007\u000b\u0000\u0000"+
		"\u053a\u053c\u0003\u00fa}\u0000\u053b\u0539\u0001\u0000\u0000\u0000\u053c"+
		"\u053f\u0001\u0000\u0000\u0000\u053d\u053b\u0001\u0000\u0000\u0000\u053d"+
		"\u053e\u0001\u0000\u0000\u0000\u053e\u00f9\u0001\u0000\u0000\u0000\u053f"+
		"\u053d\u0001\u0000\u0000\u0000\u0540\u0548\u0003\u00fc~\u0000\u0541\u0542"+
		"\u0007\f\u0000\u0000\u0542\u0549\u0003\u00fc~\u0000\u0543\u0544\u0005"+
		"\"\u0000\u0000\u0544\u0546\u0003\u00b6[\u0000\u0545\u0547\u0005C\u0000"+
		"\u0000\u0546\u0545\u0001\u0000\u0000\u0000\u0546\u0547\u0001\u0000\u0000"+
		"\u0000\u0547\u0549\u0001\u0000\u0000\u0000\u0548\u0541\u0001\u0000\u0000"+
		"\u0000\u0548\u0543\u0001\u0000\u0000\u0000\u0548\u0549\u0001\u0000\u0000"+
		"\u0000\u0549\u00fb\u0001\u0000\u0000\u0000\u054a\u0553\u0003\u0102\u0081"+
		"\u0000\u054b\u054e\u0003\u00fe\u007f\u0000\u054c\u054e\u0003\u0100\u0080"+
		"\u0000\u054d\u054b\u0001\u0000\u0000\u0000\u054d\u054c\u0001\u0000\u0000"+
		"\u0000\u054e\u054f\u0001\u0000\u0000\u0000\u054f\u0550\u0003\u0102\u0081"+
		"\u0000\u0550\u0552\u0001\u0000\u0000\u0000\u0551\u054d\u0001\u0000\u0000"+
		"\u0000\u0552\u0555\u0001\u0000\u0000\u0000\u0553\u0551\u0001\u0000\u0000"+
		"\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u00fd\u0001\u0000\u0000"+
		"\u0000\u0555\u0553\u0001\u0000\u0000\u0000\u0556\u0557\u0005f\u0000\u0000"+
		"\u0557\u0558\u0005f\u0000\u0000\u0558\u00ff\u0001\u0000\u0000\u0000\u0559"+
		"\u055a\u0005g\u0000\u0000\u055a\u055b\u0005g\u0000\u0000\u055b\u0101\u0001"+
		"\u0000\u0000\u0000\u055c\u0561\u0003\u0104\u0082\u0000\u055d\u055e\u0007"+
		"\r\u0000\u0000\u055e\u0560\u0003\u0104\u0082\u0000\u055f\u055d\u0001\u0000"+
		"\u0000\u0000\u0560\u0563\u0001\u0000\u0000\u0000\u0561\u055f\u0001\u0000"+
		"\u0000\u0000\u0561\u0562\u0001\u0000\u0000\u0000\u0562\u0103\u0001\u0000"+
		"\u0000\u0000\u0563\u0561\u0001\u0000\u0000\u0000\u0564\u0569\u0003\u0106"+
		"\u0083\u0000\u0565\u0566\u0007\u000e\u0000\u0000\u0566\u0568\u0003\u0106"+
		"\u0083\u0000\u0567\u0565\u0001\u0000\u0000\u0000\u0568\u056b\u0001\u0000"+
		"\u0000\u0000\u0569\u0567\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000"+
		"\u0000\u0000\u056a\u0105\u0001\u0000\u0000\u0000\u056b\u0569\u0001\u0000"+
		"\u0000\u0000\u056c\u056f\u0003\u0108\u0084\u0000\u056d\u056e\u0005\\\u0000"+
		"\u0000\u056e\u0570\u0003\u0106\u0083\u0000\u056f\u056d\u0001\u0000\u0000"+
		"\u0000\u056f\u0570\u0001\u0000\u0000\u0000\u0570\u0107\u0001\u0000\u0000"+
		"\u0000\u0571\u0578\u0003\u010a\u0085\u0000\u0572\u0573\u0007\u000f\u0000"+
		"\u0000\u0573\u0578\u0003\u0108\u0084\u0000\u0574\u0575\u0005_\u0000\u0000"+
		"\u0575\u0578\u0003\u0108\u0084\u0000\u0576\u0578\u0003\u010c\u0086\u0000"+
		"\u0577\u0571\u0001\u0000\u0000\u0000\u0577\u0572\u0001\u0000\u0000\u0000"+
		"\u0577\u0574\u0001\u0000\u0000\u0000\u0577\u0576\u0001\u0000\u0000\u0000"+
		"\u0578\u0109\u0001\u0000\u0000\u0000\u0579\u057a\u0005R\u0000\u0000\u057a"+
		"\u057b\u0003\u00b6[\u0000\u057b\u057c\u0005S\u0000\u0000\u057c\u057d\u0003"+
		"\u0108\u0084\u0000\u057d\u010b\u0001\u0000\u0000\u0000\u057e\u0582\u0003"+
		"\u010e\u0087\u0000\u057f\u0581\u0003\u0118\u008c\u0000\u0580\u057f\u0001"+
		"\u0000\u0000\u0000\u0581\u0584\u0001\u0000\u0000\u0000\u0582\u0580\u0001"+
		"\u0000\u0000\u0000\u0582\u0583\u0001\u0000\u0000\u0000\u0583\u010d\u0001"+
		"\u0000\u0000\u0000\u0584\u0582\u0001\u0000\u0000\u0000\u0585\u059b\u0003"+
		"\u0128\u0094\u0000\u0586\u059b\u0003\u00dcn\u0000\u0587\u059b\u0003\u00da"+
		"m\u0000\u0588\u059b\u0003@ \u0000\u0589\u059b\u0003D\"\u0000\u058a\u059b"+
		"\u0003:\u001d\u0000\u058b\u059b\u0003\u0114\u008a\u0000\u058c\u059b\u0003"+
		"\u0110\u0088\u0000\u058d\u059b\u0005-\u0000\u0000\u058e\u059b\u0005\u008c"+
		"\u0000\u0000\u058f\u059b\u0005\'\u0000\u0000\u0590\u059b\u0005>\u0000"+
		"\u0000\u0591\u059b\u0005\n\u0000\u0000\u0592\u059b\u0003\u011a\u008d\u0000"+
		"\u0593\u0594\u0005C\u0000\u0000\u0594\u059b\u0003\u00d4j\u0000\u0595\u0596"+
		"\u0003\u001a\r\u0000\u0596\u0597\u0003\u00d4j\u0000\u0597\u059b\u0001"+
		"\u0000\u0000\u0000\u0598\u059b\u0003(\u0014\u0000\u0599\u059b\u0003\u001a"+
		"\r\u0000\u059a\u0585\u0001\u0000\u0000\u0000\u059a\u0586\u0001\u0000\u0000"+
		"\u0000\u059a\u0587\u0001\u0000\u0000\u0000\u059a\u0588\u0001\u0000\u0000"+
		"\u0000\u059a\u0589\u0001\u0000\u0000\u0000\u059a\u058a\u0001\u0000\u0000"+
		"\u0000\u059a\u058b\u0001\u0000\u0000\u0000\u059a\u058c\u0001\u0000\u0000"+
		"\u0000\u059a\u058d\u0001\u0000\u0000\u0000\u059a\u058e\u0001\u0000\u0000"+
		"\u0000\u059a\u058f\u0001\u0000\u0000\u0000\u059a\u0590\u0001\u0000\u0000"+
		"\u0000\u059a\u0591\u0001\u0000\u0000\u0000\u059a\u0592\u0001\u0000\u0000"+
		"\u0000\u059a\u0593\u0001\u0000\u0000\u0000\u059a\u0595\u0001\u0000\u0000"+
		"\u0000\u059a\u0598\u0001\u0000\u0000\u0000\u059a\u0599\u0001\u0000\u0000"+
		"\u0000\u059b\u010f\u0001\u0000\u0000\u0000\u059c\u059d\u0003\u001a\r\u0000"+
		"\u059d\u059e\u0003\u00d4j\u0000\u059e\u05a1\u0001\u0000\u0000\u0000\u059f"+
		"\u05a1\u0003\u001a\r\u0000\u05a0\u059c\u0001\u0000\u0000\u0000\u05a0\u059f"+
		"\u0001\u0000\u0000\u0000\u05a1\u05a2\u0001\u0000\u0000\u0000\u05a2\u05ae"+
		"\u0005N\u0000\u0000\u05a3\u05a8\u0003\u0112\u0089\u0000\u05a4\u05a5\u0005"+
		"U\u0000\u0000\u05a5\u05a7\u0003\u0112\u0089\u0000\u05a6\u05a4\u0001\u0000"+
		"\u0000\u0000\u05a7\u05aa\u0001\u0000\u0000\u0000\u05a8\u05a6\u0001\u0000"+
		"\u0000\u0000\u05a8\u05a9\u0001\u0000\u0000\u0000\u05a9\u05ac\u0001\u0000"+
		"\u0000\u0000\u05aa\u05a8\u0001\u0000\u0000\u0000\u05ab\u05ad\u0005U\u0000"+
		"\u0000\u05ac\u05ab\u0001\u0000\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000"+
		"\u0000\u05ad\u05af\u0001\u0000\u0000\u0000\u05ae\u05a3\u0001\u0000\u0000"+
		"\u0000\u05ae\u05af\u0001\u0000\u0000\u0000\u05af\u05b0\u0001\u0000\u0000"+
		"\u0000\u05b0\u05b1\u0005O\u0000\u0000\u05b1\u0111\u0001\u0000\u0000\u0000"+
		"\u05b2\u05b3\u0003(\u0014\u0000\u05b3\u05b4\u0005W\u0000\u0000\u05b4\u05b5"+
		"\u0003\u00e0p\u0000\u05b5\u0113\u0001\u0000\u0000\u0000\u05b6\u05bf\u0005"+
		"`\u0000\u0000\u05b7\u05bc\u0003\u0116\u008b\u0000\u05b8\u05b9\u0005U\u0000"+
		"\u0000\u05b9\u05bb\u0003\u0116\u008b\u0000\u05ba\u05b8\u0001\u0000\u0000"+
		"\u0000\u05bb\u05be\u0001\u0000\u0000\u0000\u05bc\u05ba\u0001\u0000\u0000"+
		"\u0000\u05bc\u05bd\u0001\u0000\u0000\u0000\u05bd\u05c0\u0001\u0000\u0000"+
		"\u0000\u05be\u05bc\u0001\u0000\u0000\u0000\u05bf\u05b7\u0001\u0000\u0000"+
		"\u0000\u05bf\u05c0\u0001\u0000\u0000\u0000\u05c0\u05c1\u0001\u0000\u0000"+
		"\u0000\u05c1\u05c2\u0005`\u0000\u0000\u05c2\u05c3\u0003\u008eG\u0000\u05c3"+
		"\u0115\u0001\u0000\u0000\u0000\u05c4\u05c5\u0003\u00b6[\u0000\u05c5\u05c6"+
		"\u0005C\u0000\u0000\u05c6\u0117\u0001\u0000\u0000\u0000\u05c7\u05c8\u0005"+
		"T\u0000\u0000\u05c8\u05c9\u0003(\u0014\u0000\u05c9\u05ca\u0003\u00d4j"+
		"\u0000\u05ca\u05cc\u0005R\u0000\u0000\u05cb\u05cd\u0003\u0120\u0090\u0000"+
		"\u05cc\u05cb\u0001\u0000\u0000\u0000\u05cc\u05cd\u0001\u0000\u0000\u0000"+
		"\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05cf\u0005S\u0000\u0000\u05cf"+
		"\u05eb\u0001\u0000\u0000\u0000\u05d0\u05d1\u0005T\u0000\u0000\u05d1\u05eb"+
		"\u0003(\u0014\u0000\u05d2\u05d3\u0005T\u0000\u0000\u05d3\u05eb\u0005E"+
		"\u0000\u0000\u05d4\u05d5\u0005T\u0000\u0000\u05d5\u05eb\u0005H\u0000\u0000"+
		"\u05d6\u05d7\u0005j\u0000\u0000\u05d7\u05eb\u0003(\u0014\u0000\u05d8\u05d9"+
		"\u0005j\u0000\u0000\u05d9\u05db\u0005R\u0000\u0000\u05da\u05dc\u0003\u0120"+
		"\u0090\u0000\u05db\u05da\u0001\u0000\u0000\u0000\u05db\u05dc\u0001\u0000"+
		"\u0000\u0000\u05dc\u05dd\u0001\u0000\u0000\u0000\u05dd\u05eb\u0005S\u0000"+
		"\u0000\u05de\u05e0\u0005R\u0000\u0000\u05df\u05e1\u0003\u0120\u0090\u0000"+
		"\u05e0\u05df\u0001\u0000\u0000\u0000\u05e0\u05e1\u0001\u0000\u0000\u0000"+
		"\u05e1\u05e2\u0001\u0000\u0000\u0000\u05e2\u05eb\u0005S\u0000\u0000\u05e3"+
		"\u05e4\u0005P\u0000\u0000\u05e4\u05e5\u0003\u011c\u008e\u0000\u05e5\u05e6"+
		"\u0005Q\u0000\u0000\u05e6\u05eb\u0001\u0000\u0000\u0000\u05e7\u05eb\u0005"+
		"k\u0000\u0000\u05e8\u05eb\u0005l\u0000\u0000\u05e9\u05eb\u0005b\u0000"+
		"\u0000\u05ea\u05c7\u0001\u0000\u0000\u0000\u05ea\u05d0\u0001\u0000\u0000"+
		"\u0000\u05ea\u05d2\u0001\u0000\u0000\u0000\u05ea\u05d4\u0001\u0000\u0000"+
		"\u0000\u05ea\u05d6\u0001\u0000\u0000\u0000\u05ea\u05d8\u0001\u0000\u0000"+
		"\u0000\u05ea\u05de\u0001\u0000\u0000\u0000\u05ea\u05e3\u0001\u0000\u0000"+
		"\u0000\u05ea\u05e7\u0001\u0000\u0000\u0000\u05ea\u05e8\u0001\u0000\u0000"+
		"\u0000\u05ea\u05e9\u0001\u0000\u0000\u0000\u05eb\u0119\u0001\u0000\u0000"+
		"\u0000\u05ec\u05f8\u0005P\u0000\u0000\u05ed\u05f2\u0003\u00e0p\u0000\u05ee"+
		"\u05ef\u0005U\u0000\u0000\u05ef\u05f1\u0003\u00e0p\u0000\u05f0\u05ee\u0001"+
		"\u0000\u0000\u0000\u05f1\u05f4\u0001\u0000\u0000\u0000\u05f2\u05f0\u0001"+
		"\u0000\u0000\u0000\u05f2\u05f3\u0001\u0000\u0000\u0000\u05f3\u05f6\u0001"+
		"\u0000\u0000\u0000\u05f4\u05f2\u0001\u0000\u0000\u0000\u05f5\u05f7\u0005"+
		"U\u0000\u0000\u05f6\u05f5\u0001\u0000\u0000\u0000\u05f6\u05f7\u0001\u0000"+
		"\u0000\u0000\u05f7\u05f9\u0001\u0000\u0000\u0000\u05f8\u05ed\u0001\u0000"+
		"\u0000\u0000\u05f8\u05f9\u0001\u0000\u0000\u0000\u05f9\u05fa\u0001\u0000"+
		"\u0000\u0000\u05fa\u05fb\u0005Q\u0000\u0000\u05fb\u011b\u0001\u0000\u0000"+
		"\u0000\u05fc\u0601\u0003\u00e0p\u0000\u05fd\u05fe\u0005U\u0000\u0000\u05fe"+
		"\u0600\u0003\u00e0p\u0000\u05ff\u05fd\u0001\u0000\u0000\u0000\u0600\u0603"+
		"\u0001\u0000\u0000\u0000\u0601\u05ff\u0001\u0000\u0000\u0000\u0601\u0602"+
		"\u0001\u0000\u0000\u0000\u0602\u011d\u0001\u0000\u0000\u0000\u0603\u0601"+
		"\u0001\u0000\u0000\u0000\u0604\u0606\u0005R\u0000\u0000\u0605\u0607\u0003"+
		"\u0120\u0090\u0000\u0606\u0605\u0001\u0000\u0000\u0000\u0606\u0607\u0001"+
		"\u0000\u0000\u0000\u0607\u0608\u0001\u0000\u0000\u0000\u0608\u0609\u0005"+
		"S\u0000\u0000\u0609\u011f\u0001\u0000\u0000\u0000\u060a\u060f\u0003\u0126"+
		"\u0093\u0000\u060b\u060c\u0005U\u0000\u0000\u060c\u060e\u0003\u0126\u0093"+
		"\u0000\u060d\u060b\u0001\u0000\u0000\u0000\u060e\u0611\u0001\u0000\u0000"+
		"\u0000\u060f\u060d\u0001\u0000\u0000\u0000\u060f\u0610\u0001\u0000\u0000"+
		"\u0000\u0610\u0121\u0001\u0000\u0000\u0000\u0611\u060f\u0001\u0000\u0000"+
		"\u0000\u0612\u0613\u0003(\u0014\u0000\u0613\u0614\u0005W\u0000\u0000\u0614"+
		"\u0615\u0003\u00e0p\u0000\u0615\u0123\u0001\u0000\u0000\u0000\u0616\u0617"+
		"\u0003\u00deo\u0000\u0617\u0125\u0001\u0000\u0000\u0000\u0618\u061b\u0003"+
		"\u0122\u0091\u0000\u0619\u061b\u0003\u0124\u0092\u0000\u061a\u0618\u0001"+
		"\u0000\u0000\u0000\u061a\u0619\u0001\u0000\u0000\u0000\u061b\u0127\u0001"+
		"\u0000\u0000\u0000\u061c\u0626\u00054\u0000\u0000\u061d\u0626\u0005\u0015"+
		"\u0000\u0000\u061e\u0626\u0005E\u0000\u0000\u061f\u0626\u0005F\u0000\u0000"+
		"\u0620\u0626\u0005G\u0000\u0000\u0621\u0626\u0005H\u0000\u0000\u0622\u0626"+
		"\u0005I\u0000\u0000\u0623\u0626\u0003\u012a\u0095\u0000\u0624\u0626\u0005"+
		"D\u0000\u0000\u0625\u061c\u0001\u0000\u0000\u0000\u0625\u061d\u0001\u0000"+
		"\u0000\u0000\u0625\u061e\u0001\u0000\u0000\u0000\u0625\u061f\u0001\u0000"+
		"\u0000\u0000\u0625\u0620\u0001\u0000\u0000\u0000\u0625\u0621\u0001\u0000"+
		"\u0000\u0000\u0625\u0622\u0001\u0000\u0000\u0000\u0625\u0623\u0001\u0000"+
		"\u0000\u0000\u0625\u0624\u0001\u0000\u0000\u0000\u0626\u0129\u0001\u0000"+
		"\u0000\u0000\u0627\u062b\u0005J\u0000\u0000\u0628\u062b\u0005K\u0000\u0000"+
		"\u0629\u062b\u0003\u012c\u0096\u0000\u062a\u0627\u0001\u0000\u0000\u0000"+
		"\u062a\u0628\u0001\u0000\u0000\u0000\u062a\u0629\u0001\u0000\u0000\u0000"+
		"\u062b\u012b\u0001\u0000\u0000\u0000\u062c\u0630\u0005L\u0000\u0000\u062d"+
		"\u062f\u0003\u012e\u0097\u0000\u062e\u062d\u0001\u0000\u0000\u0000\u062f"+
		"\u0632\u0001\u0000\u0000\u0000\u0630\u062e\u0001\u0000\u0000\u0000\u0630"+
		"\u0631\u0001\u0000\u0000\u0000\u0631\u0633\u0001\u0000\u0000\u0000\u0632"+
		"\u0630\u0001\u0000\u0000\u0000\u0633\u0634\u0005\u0088\u0000\u0000\u0634"+
		"\u012d\u0001\u0000\u0000\u0000\u0635\u063a\u0003\u0130\u0098\u0000\u0636"+
		"\u063a\u0005\u0082\u0000\u0000\u0637\u063a\u0005\u0084\u0000\u0000\u0638"+
		"\u063a\u0005\u0085\u0000\u0000\u0639\u0635\u0001\u0000\u0000\u0000\u0639"+
		"\u0636\u0001\u0000\u0000\u0000\u0639\u0637\u0001\u0000\u0000\u0000\u0639"+
		"\u0638\u0001\u0000\u0000\u0000\u063a\u012f\u0001\u0000\u0000\u0000\u063b"+
		"\u0640\u0003\u00e0p\u0000\u063c\u063d\u0005U\u0000\u0000\u063d\u063f\u0003"+
		"\u00e0p\u0000\u063e\u063c\u0001\u0000\u0000\u0000\u063f\u0642\u0001\u0000"+
		"\u0000\u0000\u0640\u063e\u0001\u0000\u0000\u0000\u0640\u0641\u0001\u0000"+
		"\u0000\u0000\u0641\u0649\u0001\u0000\u0000\u0000\u0642\u0640\u0001\u0000"+
		"\u0000\u0000\u0643\u0645\u0005W\u0000\u0000\u0644\u0646\u0005\u008a\u0000"+
		"\u0000\u0645\u0644\u0001\u0000\u0000\u0000\u0646\u0647\u0001\u0000\u0000"+
		"\u0000\u0647\u0645\u0001\u0000\u0000\u0000\u0647\u0648\u0001\u0000\u0000"+
		"\u0000\u0648\u064a\u0001\u0000\u0000\u0000\u0649\u0643\u0001\u0000\u0000"+
		"\u0000\u0649\u064a\u0001\u0000\u0000\u0000\u064a\u0131\u0001\u0000\u0000"+
		"\u0000\u00b1\u0135\u0141\u014b\u0152\u0157\u015f\u0163\u0167\u016b\u016e"+
		"\u0174\u0185\u018c\u0197\u01a2\u01a4\u01ad\u01b2\u01b9\u01bf\u01c3\u01c8"+
		"\u01d2\u01d6\u01df\u01e6\u01fd\u0203\u0219\u021d\u0225\u022b\u0236\u023a"+
		"\u0245\u024b\u0252\u0259\u0262\u026a\u0273\u0276\u027a\u0280\u0295\u029e"+
		"\u02a2\u02a9\u02b3\u02b7\u02be\u02cf\u02d3\u02da\u02e3\u02ee\u02f5\u02fb"+
		"\u0304\u030a\u0312\u0315\u031e\u0327\u032a\u032f\u0334\u0337\u0344\u0346"+
		"\u034c\u0356\u035c\u0361\u0368\u0370\u0374\u037c\u0385\u0389\u038f\u0395"+
		"\u0398\u039d\u03b9\u03be\u03c2\u03c5\u03ca\u03d2\u03dc\u03e2\u03e5\u03ef"+
		"\u03f4\u03fa\u0404\u0408\u040d\u0417\u041b\u0425\u042c\u0431\u043c\u043f"+
		"\u0443\u0447\u044d\u0454\u0459\u045d\u0463\u0468\u046d\u0475\u047c\u0482"+
		"\u0484\u048b\u048f\u0497\u049c\u04a7\u04a9\u04b0\u04b5\u04bd\u04c8\u04cf"+
		"\u04d4\u04dc\u04e5\u04f3\u04ff\u0504\u050a\u0515\u051d\u0525\u052d\u0535"+
		"\u053d\u0546\u0548\u054d\u0553\u0561\u0569\u056f\u0577\u0582\u059a\u05a0"+
		"\u05a8\u05ac\u05ae\u05bc\u05bf\u05cc\u05db\u05e0\u05ea\u05f2\u05f6\u05f8"+
		"\u0601\u0606\u060f\u061a\u0625\u062a\u0630\u0639\u0640\u0647\u0649";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}