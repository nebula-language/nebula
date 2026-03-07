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
		CARET=101, BANG=102, TILDE=103, ASSIGNMENT=104, LT=105, GT=106, INTERR=107, 
		OP_COALESCING=108, OP_OPTIONAL_CHAIN=109, OP_INC=110, OP_DEC=111, OP_AND=112, 
		OP_OR=113, OP_EQ=114, OP_NE=115, OP_LE=116, OP_GE=117, OP_ADD_ASSIGNMENT=118, 
		OP_SUB_ASSIGNMENT=119, OP_MULT_ASSIGNMENT=120, OP_POW_ASSIGNMENT=121, 
		OP_DIV_ASSIGNMENT=122, OP_MOD_ASSIGNMENT=123, OP_AND_ASSIGNMENT=124, OP_OR_ASSIGNMENT=125, 
		OP_XOR_ASSIGNMENT=126, OP_LEFT_SHIFT_ASSIGNMENT=127, OP_RANGE=128, FAT_ARROW=129, 
		DOUBLE_CURLY_INSIDE=130, OPEN_BRACE_INSIDE=131, REGULAR_CHAR_INSIDE=132, 
		REGULAR_STRING_INSIDE=133, VERBATIUM_DOUBLE_QUOTE_INSIDE=134, VERBATIUM_INSIDE_STRING=135, 
		DOUBLE_QUOTE_INSIDE=136, CLOSE_BRACE_INSIDE=137, FORMAT_STRING=138, DOUBLE_CURLY_CLOSE_INSIDE=139;
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
		RULE_parenthesized_pattern = 44, RULE_const_declaration = 45, RULE_variable_declaration = 46, 
		RULE_visibility_modifier = 47, RULE_cvt_modifier = 48, RULE_backlink_modifier = 49, 
		RULE_modifiers = 50, RULE_field_declaration = 51, RULE_variable_declarators = 52, 
		RULE_variable_declarator = 53, RULE_method_declaration = 54, RULE_constructor_declaration = 55, 
		RULE_parameters = 56, RULE_parameter_list = 57, RULE_parameter = 58, RULE_method_body = 59, 
		RULE_operator_declaration = 60, RULE_overloadable_operator = 61, RULE_class_declaration = 62, 
		RULE_class_body = 63, RULE_class_member = 64, RULE_struct_declaration = 65, 
		RULE_struct_body = 66, RULE_struct_member = 67, RULE_inheritance_clause = 68, 
		RULE_trait_declaration = 69, RULE_trait_body = 70, RULE_trait_block = 71, 
		RULE_trait_member = 72, RULE_union_declaration = 73, RULE_union_body = 74, 
		RULE_union_payload = 75, RULE_union_variant = 76, RULE_impl_declaration = 77, 
		RULE_impl_block = 78, RULE_impl_member = 79, RULE_return_type = 80, RULE_type = 81, 
		RULE_type_suffix = 82, RULE_base_type = 83, RULE_tuple_type = 84, RULE_tuple_type_element = 85, 
		RULE_class_type = 86, RULE_predefined_type = 87, RULE_numeric_type = 88, 
		RULE_integral_type = 89, RULE_floating_point_type = 90, RULE_rank_specifier = 91, 
		RULE_generic_parameter = 92, RULE_constraint = 93, RULE_type_parameters = 94, 
		RULE_type_argument_list = 95, RULE_nested_gt = 96, RULE_tuple_literal = 97, 
		RULE_parenthesized_expression = 98, RULE_nonAssignmentExpression = 99, 
		RULE_expression = 100, RULE_assignment_expression = 101, RULE_null_coalescing_expression = 102, 
		RULE_new_expression = 103, RULE_assignment_operator = 104, RULE_binary_or_expression = 105, 
		RULE_binary_and_expression = 106, RULE_inclusive_or_expression = 107, 
		RULE_exclusive_or_expression = 108, RULE_and_expression = 109, RULE_equality_expression = 110, 
		RULE_relational_expression = 111, RULE_shift_expression = 112, RULE_left_shift = 113, 
		RULE_right_shift = 114, RULE_additive_expression = 115, RULE_multiplicative_expression = 116, 
		RULE_exponentiation_expression = 117, RULE_unary_expression = 118, RULE_cast_expression = 119, 
		RULE_primary_expression = 120, RULE_primary_expression_start = 121, RULE_postfix_operator = 122, 
		RULE_array_literal = 123, RULE_expression_list = 124, RULE_arguments = 125, 
		RULE_argument_list = 126, RULE_namedArgument = 127, RULE_positionalArgument = 128, 
		RULE_argument = 129, RULE_literal = 130, RULE_string_literal = 131, RULE_interpolated_regular_string = 132, 
		RULE_interpolated_regular_string_part = 133, RULE_interpolated_string_expression = 134;
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
			"binding_list", "tuple_pattern", "parenthesized_pattern", "const_declaration", 
			"variable_declaration", "visibility_modifier", "cvt_modifier", "backlink_modifier", 
			"modifiers", "field_declaration", "variable_declarators", "variable_declarator", 
			"method_declaration", "constructor_declaration", "parameters", "parameter_list", 
			"parameter", "method_body", "operator_declaration", "overloadable_operator", 
			"class_declaration", "class_body", "class_member", "struct_declaration", 
			"struct_body", "struct_member", "inheritance_clause", "trait_declaration", 
			"trait_body", "trait_block", "trait_member", "union_declaration", "union_body", 
			"union_payload", "union_variant", "impl_declaration", "impl_block", "impl_member", 
			"return_type", "type", "type_suffix", "base_type", "tuple_type", "tuple_type_element", 
			"class_type", "predefined_type", "numeric_type", "integral_type", "floating_point_type", 
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
			"'^'", "'!'", "'~'", "'='", "'<'", "'>'", "'?'", "'??'", "'?.'", "'++'", 
			"'--'", "'&&'", "'||'", "'=='", "'!='", "'<='", "'>='", "'+='", "'-='", 
			"'*='", "'**='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'..'", 
			"'=>'", "'{{'", null, null, null, null, null, null, null, null, "'}}'"
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
			"AMP", "PIPE", "CARET", "BANG", "TILDE", "ASSIGNMENT", "LT", "GT", "INTERR", 
			"OP_COALESCING", "OP_OPTIONAL_CHAIN", "OP_INC", "OP_DEC", "OP_AND", "OP_OR", 
			"OP_EQ", "OP_NE", "OP_LE", "OP_GE", "OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", 
			"OP_MULT_ASSIGNMENT", "OP_POW_ASSIGNMENT", "OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", 
			"OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", "OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT_ASSIGNMENT", 
			"OP_RANGE", "FAT_ARROW", "DOUBLE_CURLY_INSIDE", "OPEN_BRACE_INSIDE", 
			"REGULAR_CHAR_INSIDE", "REGULAR_STRING_INSIDE", "VERBATIUM_DOUBLE_QUOTE_INSIDE", 
			"VERBATIUM_INSIDE_STRING", "DOUBLE_QUOTE_INSIDE", "CLOSE_BRACE_INSIDE", 
			"FORMAT_STRING", "DOUBLE_CURLY_CLOSE_INSIDE"
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
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -739784376190646272L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4194475L) != 0)) {
				{
				{
				setState(270);
				top_level_declaration();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
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
			setState(278);
			modifiers();
			setState(279);
			match(EXTERN);
			setState(280);
			match(REGULAR_STRING);
			setState(281);
			match(OPEN_BRACE);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145110541689927680L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 524305L) != 0)) {
				{
				{
				setState(282);
				extern_member();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
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
			setState(290);
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
			setState(292);
			match(USE);
			setState(293);
			qualified_name();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==DOUBLE_COLON) {
				{
				setState(294);
				use_tail();
				}
			}

			setState(297);
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
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(DOUBLE_COLON);
				setState(300);
				use_selector();
				}
				break;
			case AS:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
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
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(STAR);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(IDENTIFIER);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(306);
					use_alias();
					}
				}

				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(OPEN_BRACE);
				setState(310);
				use_selector_item();
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(311);
						match(COMMA);
						setState(312);
						use_selector_item();
						}
						} 
					}
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(318);
					match(COMMA);
					}
				}

				setState(321);
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
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(IDENTIFIER);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(326);
					use_alias();
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
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
			setState(332);
			match(AS);
			setState(333);
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
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				setState(335);
				visibility_modifier();
				}
			}

			setState(338);
			match(TAG);
			setState(339);
			tag_declaration();
			setState(340);
			match(AS);
			setState(341);
			match(IDENTIFIER);
			setState(342);
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
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(OPEN_BRACE);
				setState(346);
				tag_enumeration();
				setState(347);
				match(CLOSE_BRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(OPEN_BRACE);
				setState(350);
				tag_expression(0);
				setState(351);
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
			setState(355);
			type();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356);
				match(COMMA);
				setState(357);
				type();
				}
				}
				setState(362);
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
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(364);
				match(OPEN_PARENS);
				setState(365);
				tag_expression(0);
				setState(366);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				{
				setState(368);
				match(BANG);
				setState(369);
				tag_expression(4);
				}
				break;
			case 3:
				{
				setState(370);
				type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(379);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Tag_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tag_expression);
						setState(373);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(374);
						match(AMP);
						}
						setState(375);
						tag_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Tag_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_tag_expression);
						setState(376);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(377);
						match(PIPE);
						}
						setState(378);
						tag_expression(3);
						}
						break;
					}
					} 
				}
				setState(383);
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
			setState(384);
			match(NAMESPACE);
			setState(385);
			qualified_name();
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(386);
				match(OPEN_BRACE);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -739784376190646272L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4194475L) != 0)) {
					{
					{
					setState(387);
					top_level_declaration();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
				match(CLOSE_BRACE);
				}
				break;
			case SEMICOLON:
				{
				setState(394);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(IDENTIFIER);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					match(DOUBLE_COLON);
					setState(399);
					match(IDENTIFIER);
					}
					} 
				}
				setState(404);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(ENUM);
			setState(406);
			match(IDENTIFIER);
			setState(407);
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
			setState(409);
			match(OPEN_BRACE);
			setState(410);
			match(IDENTIFIER);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(411);
				match(COMMA);
				setState(412);
				match(IDENTIFIER);
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
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
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				use_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				tag_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				enum_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				const_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				method_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(425);
				class_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(426);
				struct_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(427);
				trait_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(428);
				impl_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(429);
				union_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(430);
				namespace_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(431);
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
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				use_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				tag_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				const_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				variable_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				statement_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(439);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(440);
				for_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(441);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(442);
				foreach_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(443);
				return_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(444);
				break_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(445);
				continue_statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(446);
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
			setState(449);
			match(BREAK);
			setState(450);
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
			setState(452);
			match(CONTINUE);
			setState(453);
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
			setState(455);
			expression();
			setState(456);
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
			setState(458);
			match(OPEN_BRACE);
			setState(459);
			block_statements();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(460);
				block_tail();
				}
			}

			setState(463);
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
			setState(465);
			match(OPEN_BRACE);
			setState(466);
			block_statements();
			setState(467);
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
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(469);
					statement();
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(475);
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
			setState(477);
			match(IF);
			setState(478);
			parenthesized_expression();
			setState(479);
			expression_block();
			setState(480);
			match(ELSE);
			setState(481);
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
			setState(483);
			match(IF);
			setState(484);
			parenthesized_expression();
			setState(485);
			statement();
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(486);
				match(ELSE);
				setState(487);
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
			setState(490);
			match(MATCH);
			setState(491);
			parenthesized_expression();
			setState(492);
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
			setState(494);
			match(FOR);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(495);
				traditional_for_control();
				}
				break;
			case 2:
				{
				setState(496);
				parenthesized_expression();
				}
				break;
			}
			setState(499);
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
			setState(501);
			match(OPEN_PARENS);
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(502);
				for_initializer();
				}
				break;
			}
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(505);
				expression();
				}
			}

			setState(508);
			match(SEMICOLON);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(509);
				for_iterator();
				}
			}

			setState(512);
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
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
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
			setState(518);
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
			setState(520);
			match(WHILE);
			setState(521);
			parenthesized_expression();
			setState(522);
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
			setState(524);
			match(FOREACH);
			setState(525);
			foreach_control();
			setState(526);
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
			setState(528);
			match(OPEN_PARENS);
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(529);
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
				setState(530);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(533);
			match(IDENTIFIER);
			setState(534);
			match(IN);
			setState(535);
			expression();
			setState(536);
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
			setState(538);
			match(RETURN);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(539);
				expression();
				}
			}

			setState(542);
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
			setState(544);
			match(OPEN_BRACE);
			setState(545);
			match_arm();
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(546);
					match(COMMA);
					setState(547);
					match_arm();
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(553);
				match(COMMA);
				}
			}

			setState(556);
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
			setState(558);
			pattern();
			setState(559);
			match(FAT_ARROW);
			setState(560);
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
			setState(562);
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
			setState(564);
			pattern_atom();
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(565);
				match(PIPE);
				setState(566);
				pattern_atom();
				}
				}
				setState(571);
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
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(UNDERSCORE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				destructuring_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				qualified_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(576);
				tuple_pattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(577);
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
			setState(580);
			qualified_name();
			setState(581);
			match(OPEN_PARENS);
			setState(582);
			binding_list();
			setState(583);
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
			setState(585);
			match(IDENTIFIER);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(586);
				match(COMMA);
				setState(587);
				match(IDENTIFIER);
				}
				}
				setState(592);
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
			setState(593);
			match(OPEN_PARENS);
			setState(594);
			pattern_atom();
			setState(597); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(595);
				match(COMMA);
				setState(596);
				pattern_atom();
				}
				}
				setState(599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(601);
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
			setState(603);
			match(OPEN_PARENS);
			setState(604);
			pattern();
			setState(605);
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
	public static class Const_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(NebulaParser.CONST, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
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
		enterRule(_localctx, 90, RULE_const_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(CONST);
			setState(608);
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
		enterRule(_localctx, 92, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			modifiers();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(611);
				match(CONST);
				}
			}

			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKLINK) {
				{
				setState(614);
				backlink_modifier();
				}
			}

			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(617);
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
				setState(618);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(621);
			variable_declarators();
			setState(622);
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
		enterRule(_localctx, 94, RULE_visibility_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
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
		enterRule(_localctx, 96, RULE_cvt_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
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
		enterRule(_localctx, 98, RULE_backlink_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
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
		enterRule(_localctx, 100, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3307330976350208L) != 0)) {
				{
				setState(633);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
					{
					setState(630);
					visibility_modifier();
					}
					break;
				case STATIC:
					{
					setState(631);
					match(STATIC);
					}
					break;
				case OVERRIDE:
					{
					setState(632);
					match(OVERRIDE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(637);
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
		enterRule(_localctx, 102, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
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
		enterRule(_localctx, 104, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			variable_declarator();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(641);
				match(COMMA);
				setState(642);
				variable_declarator();
				}
				}
				setState(647);
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
		enterRule(_localctx, 106, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(IDENTIFIER);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(649);
				match(ASSIGNMENT);
				setState(650);
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
		enterRule(_localctx, 108, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			modifiers();
			setState(654);
			return_type();
			setState(655);
			match(IDENTIFIER);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(656);
				type_parameters();
				}
			}

			setState(659);
			parameters();
			setState(660);
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
		enterRule(_localctx, 110, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				setState(662);
				visibility_modifier();
				}
			}

			setState(665);
			match(IDENTIFIER);
			setState(666);
			parameters();
			setState(667);
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
		enterRule(_localctx, 112, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(OPEN_PARENS);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1148417048031508480L) != 0) || _la==IDENTIFIER || _la==OPEN_PARENS) {
				{
				setState(670);
				parameter_list();
				}
			}

			setState(673);
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
		enterRule(_localctx, 114, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			parameter();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(676);
				match(COMMA);
				setState(677);
				parameter();
				}
				}
				setState(682);
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
		enterRule(_localctx, 116, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824634769408L) != 0)) {
				{
				setState(683);
				cvt_modifier();
				}
			}

			setState(686);
			type();
			setState(687);
			match(IDENTIFIER);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(688);
				match(ASSIGNMENT);
				setState(689);
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
		enterRule(_localctx, 118, RULE_method_body);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				expression_block();
				}
				break;
			case FAT_ARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(FAT_ARROW);
				setState(694);
				expression();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
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
		enterRule(_localctx, 120, RULE_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(OPERATOR);
			setState(699);
			overloadable_operator();
			setState(700);
			parameters();
			setState(701);
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
		enterRule(_localctx, 122, RULE_overloadable_operator);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(MINUS);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(705);
				match(STAR);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(706);
				match(DIV);
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(707);
				match(PERCENT);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 6);
				{
				setState(708);
				match(CARET);
				}
				break;
			case AMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(709);
				match(AMP);
				}
				break;
			case PIPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(710);
				match(PIPE);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 9);
				{
				setState(711);
				match(LT);
				setState(712);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 10);
				{
				setState(713);
				match(GT);
				setState(714);
				match(GT);
				}
				break;
			case OP_EQ:
				enterOuterAlt(_localctx, 11);
				{
				setState(715);
				match(OP_EQ);
				}
				break;
			case OP_NE:
				enterOuterAlt(_localctx, 12);
				{
				setState(716);
				match(OP_NE);
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
	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(NebulaParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NebulaParser.IDENTIFIER, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
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
		enterRule(_localctx, 124, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(CLASS);
			setState(720);
			match(IDENTIFIER);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(721);
				type_parameters();
				}
			}

			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(724);
				inheritance_clause();
				}
			}

			setState(727);
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
		enterRule(_localctx, 126, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(OPEN_BRACE);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145074257806145536L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048611L) != 0)) {
				{
				{
				setState(730);
				class_member();
				}
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(736);
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
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
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
		enterRule(_localctx, 128, RULE_class_member);
		try {
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				field_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				operator_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
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
		enterRule(_localctx, 130, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(STRUCT);
			setState(745);
			match(IDENTIFIER);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(746);
				type_parameters();
				}
			}

			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(749);
				inheritance_clause();
				}
			}

			setState(752);
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
		enterRule(_localctx, 132, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(OPEN_BRACE);
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145074257806145536L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1048611L) != 0)) {
				{
				{
				setState(755);
				struct_member();
				}
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(761);
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
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
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
		enterRule(_localctx, 134, RULE_struct_member);
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				field_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				operator_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(766);
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
		enterRule(_localctx, 136, RULE_inheritance_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(COLON);
			setState(770);
			type();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(771);
				match(COMMA);
				setState(772);
				type();
				}
				}
				setState(777);
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
		enterRule(_localctx, 138, RULE_trait_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(TRAIT);
			setState(779);
			match(IDENTIFIER);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(780);
				type_parameters();
				}
			}

			setState(783);
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
		enterRule(_localctx, 140, RULE_trait_body);
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
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
		enterRule(_localctx, 142, RULE_trait_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(OPEN_BRACE);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145110541689927680L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 524305L) != 0)) {
				{
				{
				setState(790);
				trait_member();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
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
		enterRule(_localctx, 144, RULE_trait_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
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
		enterRule(_localctx, 146, RULE_union_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAGGED) {
				{
				setState(800);
				match(TAGGED);
				}
			}

			setState(803);
			match(UNION);
			setState(804);
			match(IDENTIFIER);
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(805);
				type_parameters();
				}
			}

			setState(808);
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
		enterRule(_localctx, 148, RULE_union_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(OPEN_BRACE);
			setState(811);
			union_variant();
			setState(816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(812);
					match(COMMA);
					setState(813);
					union_variant();
					}
					} 
				}
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(819);
				match(COMMA);
				}
			}

			setState(822);
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
		enterRule(_localctx, 150, RULE_union_payload);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(OPEN_PARENS);
			setState(825);
			parameter();
			setState(826);
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
		enterRule(_localctx, 152, RULE_union_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(IDENTIFIER);
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(829);
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
		enterRule(_localctx, 154, RULE_impl_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(IMPL);
			setState(833);
			type();
			setState(834);
			match(FOR);
			setState(835);
			type();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(836);
				match(COMMA);
				setState(837);
				type();
				}
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(843);
				impl_block();
				}
				break;
			case SEMICOLON:
				{
				setState(844);
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
		enterRule(_localctx, 156, RULE_impl_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(OPEN_BRACE);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1145110541689927680L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 524305L) != 0)) {
				{
				{
				setState(848);
				impl_member();
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854);
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
		enterRule(_localctx, 158, RULE_impl_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
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
		enterRule(_localctx, 160, RULE_return_type);
		try {
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
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
				setState(859);
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
		enterRule(_localctx, 162, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(862);
				match(IDENTIFIER);
				setState(863);
				match(COLON);
				}
				break;
			}
			setState(866);
			base_type();
			setState(870);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(867);
					type_suffix();
					}
					} 
				}
				setState(872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 164, RULE_type_suffix);
		try {
			setState(875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				rank_specifier();
				}
				break;
			case INTERR:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
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
		enterRule(_localctx, 166, RULE_base_type);
		try {
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
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
				setState(878);
				predefined_type();
				}
				break;
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
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
		enterRule(_localctx, 168, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(OPEN_PARENS);
			setState(883);
			tuple_type_element();
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(884);
				match(COMMA);
				setState(885);
				tuple_type_element();
				}
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(891);
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
		enterRule(_localctx, 170, RULE_tuple_type_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			type();
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(894);
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
		enterRule(_localctx, 172, RULE_class_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			qualified_name();
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(898);
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
		enterRule(_localctx, 174, RULE_predefined_type);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				match(BOOL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				match(CHAR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(903);
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
				setState(904);
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
		enterRule(_localctx, 176, RULE_numeric_type);
		try {
			setState(909);
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
				setState(907);
				integral_type();
				}
				break;
			case DECIMAL:
			case F32:
			case F64:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
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
		enterRule(_localctx, 178, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
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
		enterRule(_localctx, 180, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
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
		enterRule(_localctx, 182, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(OPEN_BRACKET);
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(916);
				expression();
				}
			}

			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(919);
				match(COMMA);
				}
				}
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(925);
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
		enterRule(_localctx, 184, RULE_generic_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(IDENTIFIER);
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(928);
				match(COLON);
				setState(929);
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
		enterRule(_localctx, 186, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
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
		enterRule(_localctx, 188, RULE_type_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(LT);
			setState(935);
			generic_parameter();
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(936);
				match(COMMA);
				setState(937);
				generic_parameter();
				}
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(943);
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
		enterRule(_localctx, 190, RULE_type_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(LT);
			setState(946);
			type();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(947);
				match(COMMA);
				setState(948);
				type();
				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(954);
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
		enterRule(_localctx, 192, RULE_nested_gt);
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				match(GT);
				setState(958);
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
		enterRule(_localctx, 194, RULE_tuple_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(OPEN_PARENS);
			setState(962);
			argument();
			setState(965); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(963);
				match(COMMA);
				setState(964);
				argument();
				}
				}
				setState(967); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(969);
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
		enterRule(_localctx, 196, RULE_parenthesized_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(OPEN_PARENS);
			setState(972);
			expression();
			setState(973);
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
		enterRule(_localctx, 198, RULE_nonAssignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
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
		enterRule(_localctx, 200, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
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
		enterRule(_localctx, 202, RULE_assignment_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			null_coalescing_expression();
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 16760833L) != 0)) {
				{
				setState(980);
				assignment_operator();
				setState(981);
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
		enterRule(_localctx, 204, RULE_null_coalescing_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			binary_or_expression();
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COALESCING) {
				{
				setState(986);
				match(OP_COALESCING);
				setState(987);
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
		enterRule(_localctx, 206, RULE_new_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(NEW);
			setState(991);
			type();
			setState(992);
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
		enterRule(_localctx, 208, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 16760833L) != 0)) ) {
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
		enterRule(_localctx, 210, RULE_binary_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			binary_and_expression();
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OR) {
				{
				{
				setState(997);
				match(OP_OR);
				setState(998);
				binary_and_expression();
				}
				}
				setState(1003);
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
		enterRule(_localctx, 212, RULE_binary_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			inclusive_or_expression();
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_AND) {
				{
				{
				setState(1005);
				match(OP_AND);
				setState(1006);
				inclusive_or_expression();
				}
				}
				setState(1011);
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
		enterRule(_localctx, 214, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			exclusive_or_expression();
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(1013);
				match(PIPE);
				setState(1014);
				exclusive_or_expression();
				}
				}
				setState(1019);
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
		enterRule(_localctx, 216, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			and_expression();
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1021);
				match(CARET);
				setState(1022);
				and_expression();
				}
				}
				setState(1027);
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
		enterRule(_localctx, 218, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			equality_expression();
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(1029);
				match(AMP);
				setState(1030);
				equality_expression();
				}
				}
				setState(1035);
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
		enterRule(_localctx, 220, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			relational_expression();
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_EQ || _la==OP_NE) {
				{
				{
				setState(1037);
				_la = _input.LA(1);
				if ( !(_la==OP_EQ || _la==OP_NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1038);
				relational_expression();
				}
				}
				setState(1043);
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
		enterRule(_localctx, 222, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			shift_expression();
			setState(1052);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case OP_LE:
			case OP_GE:
				{
				setState(1045);
				_la = _input.LA(1);
				if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 6147L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1046);
				shift_expression();
				}
				break;
			case IS:
				{
				setState(1047);
				match(IS);
				setState(1048);
				type();
				setState(1050);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1049);
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
			case OPERATOR:
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
		enterRule(_localctx, 224, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			additive_expression();
			setState(1063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1057);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
						{
						setState(1055);
						left_shift();
						}
						break;
					case GT:
						{
						setState(1056);
						right_shift();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1059);
					additive_expression();
					}
					} 
				}
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
		enterRule(_localctx, 226, RULE_left_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(LT);
			setState(1067);
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
		enterRule(_localctx, 228, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(GT);
			setState(1070);
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
		enterRule(_localctx, 230, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			multiplicative_expression();
			setState(1077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1073);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1074);
					multiplicative_expression();
					}
					} 
				}
				setState(1079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		enterRule(_localctx, 232, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			exponentiation_expression();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 13L) != 0)) {
				{
				{
				setState(1081);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 13L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1082);
				exponentiation_expression();
				}
				}
				setState(1087);
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
		enterRule(_localctx, 234, RULE_exponentiation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			unary_expression();
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(1089);
				match(POW);
				setState(1090);
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
		enterRule(_localctx, 236, RULE_unary_expression);
		int _la;
		try {
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093);
				cast_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				_la = _input.LA(1);
				if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1539L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1095);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
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
		enterRule(_localctx, 238, RULE_cast_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(OPEN_PARENS);
			setState(1100);
			type();
			setState(1101);
			match(CLOSE_PARENS);
			setState(1102);
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
		enterRule(_localctx, 240, RULE_primary_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			primary_expression_start();
			setState(1108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1105);
					postfix_operator();
					}
					} 
				}
				setState(1110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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
		enterRule(_localctx, 242, RULE_primary_expression_start);
		try {
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				parenthesized_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1113);
				tuple_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1114);
				if_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1115);
				match_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1116);
				expression_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1117);
				match(THIS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1118);
				match(NONE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1119);
				array_literal();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1120);
				new_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1121);
				match(IDENTIFIER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1122);
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
		enterRule(_localctx, 244, RULE_postfix_operator);
		int _la;
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				match(DOT);
				setState(1126);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				match(DOT);
				setState(1128);
				match(INTEGER_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1129);
				match(OP_OPTIONAL_CHAIN);
				setState(1130);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1131);
				match(OP_OPTIONAL_CHAIN);
				setState(1132);
				match(OPEN_PARENS);
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
					{
					setState(1133);
					argument_list();
					}
				}

				setState(1136);
				match(CLOSE_PARENS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1137);
				match(OPEN_PARENS);
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
					{
					setState(1138);
					argument_list();
					}
				}

				setState(1141);
				match(CLOSE_PARENS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1142);
				match(OPEN_BRACKET);
				setState(1143);
				expression_list();
				setState(1144);
				match(CLOSE_BRACKET);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1146);
				match(OP_INC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1147);
				match(OP_DEC);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1148);
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
		enterRule(_localctx, 246, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(OPEN_BRACKET);
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(1152);
				expression_list();
				}
			}

			setState(1155);
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
		enterRule(_localctx, 248, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			expression();
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1158);
				match(COMMA);
				setState(1159);
				expression();
				}
				}
				setState(1164);
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
		enterRule(_localctx, 250, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(OPEN_PARENS);
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 6455077887L) != 0)) {
				{
				setState(1166);
				argument_list();
				}
			}

			setState(1169);
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
		enterRule(_localctx, 252, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			argument();
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1172);
				match(COMMA);
				setState(1173);
				argument();
				}
				}
				setState(1178);
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
		enterRule(_localctx, 254, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(IDENTIFIER);
			setState(1180);
			match(COLON);
			setState(1181);
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
		enterRule(_localctx, 256, RULE_positionalArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
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
		enterRule(_localctx, 258, RULE_argument);
		try {
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				namedArgument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
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
		enterRule(_localctx, 260, RULE_literal);
		try {
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				match(FALSE);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1191);
				match(INTEGER_LITERAL);
				}
				break;
			case HEX_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case BIN_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1193);
				match(BIN_INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1194);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1195);
				match(CHARACTER_LITERAL);
				}
				break;
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 8);
				{
				setState(1196);
				string_literal();
				}
				break;
			case LITERAL_ACCESS:
				enterOuterAlt(_localctx, 9);
				{
				setState(1197);
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
		enterRule(_localctx, 262, RULE_string_literal);
		try {
			setState(1203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				match(REGULAR_STRING);
				}
				break;
			case VERBATIUM_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				match(VERBATIUM_STRING);
				}
				break;
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(1202);
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
		enterRule(_localctx, 264, RULE_interpolated_regular_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			match(INTERPOLATED_REGULAR_STRING_START);
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 720606727258505216L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 7493989786399583231L) != 0)) {
				{
				{
				setState(1206);
				interpolated_regular_string_part();
				}
				}
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1212);
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
		enterRule(_localctx, 266, RULE_interpolated_regular_string_part);
		try {
			setState(1218);
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
				setState(1214);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case REGULAR_CHAR_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1216);
				match(REGULAR_CHAR_INSIDE);
				}
				break;
			case REGULAR_STRING_INSIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1217);
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
		enterRule(_localctx, 268, RULE_interpolated_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			expression();
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1221);
				match(COMMA);
				setState(1222);
				expression();
				}
				}
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1228);
				match(COLON);
				setState(1230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1229);
					match(FORMAT_STRING);
					}
					}
					setState(1232); 
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
		"\u0004\u0001\u008b\u04d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0086\u0001\u0000\u0005\u0000\u0110\b\u0000\n\u0000\f\u0000\u0113\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u011c\b\u0001\n\u0001\f\u0001\u011f\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0128\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u012f\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0134\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u013a\b\u0005\n\u0005\f\u0005\u013d\t\u0005\u0001\u0005"+
		"\u0003\u0005\u0140\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0144\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0148\b\u0006\u0001\u0006\u0003"+
		"\u0006\u014b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003"+
		"\b\u0151\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0162"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u0167\b\n\n\n\f\n\u016a\t\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0174\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u017c\b\u000b\n"+
		"\u000b\f\u000b\u017f\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0185"+
		"\b\f\n\f\f\f\u0188\t\f\u0001\f\u0001\f\u0003\f\u018c\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0191\b\r\n\r\f\r\u0194\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u019e\b\u000f\n\u000f\f\u000f\u01a1\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u01b1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01c0\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01ce\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0005\u0017\u01d7\b\u0017\n\u0017\f\u0017"+
		"\u01da\t\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01e9\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01f2\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u01f8\b\u001d\u0001\u001d\u0003\u001d\u01fb\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u01ff\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0205\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u0214\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0003"+
		"#\u021d\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u0225\b$\n"+
		"$\f$\u0228\t$\u0001$\u0003$\u022b\b$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u0238\b\'\n\'\f"+
		"\'\u023b\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0243\b"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0005*\u024d"+
		"\b*\n*\f*\u0250\t*\u0001+\u0001+\u0001+\u0001+\u0004+\u0256\b+\u000b+"+
		"\f+\u0257\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0003.\u0265\b.\u0001.\u0003.\u0268\b.\u0001.\u0001.\u0003"+
		".\u026c\b.\u0001.\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00012\u00012\u00012\u00052\u027a\b2\n2\f2\u027d\t2\u00013\u00013\u0001"+
		"4\u00014\u00014\u00054\u0284\b4\n4\f4\u0287\t4\u00015\u00015\u00015\u0003"+
		"5\u028c\b5\u00016\u00016\u00016\u00016\u00036\u0292\b6\u00016\u00016\u0001"+
		"6\u00017\u00037\u0298\b7\u00017\u00017\u00017\u00017\u00018\u00018\u0003"+
		"8\u02a0\b8\u00018\u00018\u00019\u00019\u00019\u00059\u02a7\b9\n9\f9\u02aa"+
		"\t9\u0001:\u0003:\u02ad\b:\u0001:\u0001:\u0001:\u0001:\u0003:\u02b3\b"+
		":\u0001;\u0001;\u0001;\u0001;\u0003;\u02b9\b;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u02ce\b=\u0001>\u0001>\u0001"+
		">\u0003>\u02d3\b>\u0001>\u0003>\u02d6\b>\u0001>\u0001>\u0001?\u0001?\u0005"+
		"?\u02dc\b?\n?\f?\u02df\t?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0003"+
		"@\u02e7\b@\u0001A\u0001A\u0001A\u0003A\u02ec\bA\u0001A\u0003A\u02ef\b"+
		"A\u0001A\u0001A\u0001B\u0001B\u0005B\u02f5\bB\nB\fB\u02f8\tB\u0001B\u0001"+
		"B\u0001C\u0001C\u0001C\u0001C\u0003C\u0300\bC\u0001D\u0001D\u0001D\u0001"+
		"D\u0005D\u0306\bD\nD\fD\u0309\tD\u0001E\u0001E\u0001E\u0003E\u030e\bE"+
		"\u0001E\u0001E\u0001F\u0001F\u0003F\u0314\bF\u0001G\u0001G\u0005G\u0318"+
		"\bG\nG\fG\u031b\tG\u0001G\u0001G\u0001H\u0001H\u0001I\u0003I\u0322\bI"+
		"\u0001I\u0001I\u0001I\u0003I\u0327\bI\u0001I\u0001I\u0001J\u0001J\u0001"+
		"J\u0001J\u0005J\u032f\bJ\nJ\fJ\u0332\tJ\u0001J\u0003J\u0335\bJ\u0001J"+
		"\u0001J\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0003L\u033f\bL\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0005M\u0347\bM\nM\fM\u034a\tM\u0001"+
		"M\u0001M\u0003M\u034e\bM\u0001N\u0001N\u0005N\u0352\bN\nN\fN\u0355\tN"+
		"\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0003P\u035d\bP\u0001Q\u0001"+
		"Q\u0003Q\u0361\bQ\u0001Q\u0001Q\u0005Q\u0365\bQ\nQ\fQ\u0368\tQ\u0001R"+
		"\u0001R\u0003R\u036c\bR\u0001S\u0001S\u0001S\u0003S\u0371\bS\u0001T\u0001"+
		"T\u0001T\u0001T\u0005T\u0377\bT\nT\fT\u037a\tT\u0001T\u0001T\u0001U\u0001"+
		"U\u0003U\u0380\bU\u0001V\u0001V\u0003V\u0384\bV\u0001W\u0001W\u0001W\u0001"+
		"W\u0003W\u038a\bW\u0001X\u0001X\u0003X\u038e\bX\u0001Y\u0001Y\u0001Z\u0001"+
		"Z\u0001[\u0001[\u0003[\u0396\b[\u0001[\u0005[\u0399\b[\n[\f[\u039c\t["+
		"\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0003\\\u03a3\b\\\u0001]\u0001"+
		"]\u0001^\u0001^\u0001^\u0001^\u0005^\u03ab\b^\n^\f^\u03ae\t^\u0001^\u0001"+
		"^\u0001_\u0001_\u0001_\u0001_\u0005_\u03b6\b_\n_\f_\u03b9\t_\u0001_\u0001"+
		"_\u0001`\u0001`\u0001`\u0003`\u03c0\b`\u0001a\u0001a\u0001a\u0001a\u0004"+
		"a\u03c6\ba\u000ba\fa\u03c7\u0001a\u0001a\u0001b\u0001b\u0001b\u0001b\u0001"+
		"c\u0001c\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0003e\u03d8\be\u0001"+
		"f\u0001f\u0001f\u0003f\u03dd\bf\u0001g\u0001g\u0001g\u0001g\u0001h\u0001"+
		"h\u0001i\u0001i\u0001i\u0005i\u03e8\bi\ni\fi\u03eb\ti\u0001j\u0001j\u0001"+
		"j\u0005j\u03f0\bj\nj\fj\u03f3\tj\u0001k\u0001k\u0001k\u0005k\u03f8\bk"+
		"\nk\fk\u03fb\tk\u0001l\u0001l\u0001l\u0005l\u0400\bl\nl\fl\u0403\tl\u0001"+
		"m\u0001m\u0001m\u0005m\u0408\bm\nm\fm\u040b\tm\u0001n\u0001n\u0001n\u0005"+
		"n\u0410\bn\nn\fn\u0413\tn\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0003"+
		"o\u041b\bo\u0003o\u041d\bo\u0001p\u0001p\u0001p\u0003p\u0422\bp\u0001"+
		"p\u0001p\u0005p\u0426\bp\np\fp\u0429\tp\u0001q\u0001q\u0001q\u0001r\u0001"+
		"r\u0001r\u0001s\u0001s\u0001s\u0005s\u0434\bs\ns\fs\u0437\ts\u0001t\u0001"+
		"t\u0001t\u0005t\u043c\bt\nt\ft\u043f\tt\u0001u\u0001u\u0001u\u0003u\u0444"+
		"\bu\u0001v\u0001v\u0001v\u0001v\u0003v\u044a\bv\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001x\u0001x\u0005x\u0453\bx\nx\fx\u0456\tx\u0001y\u0001y\u0001"+
		"y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0003"+
		"y\u0464\by\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001"+
		"z\u0003z\u046f\bz\u0001z\u0001z\u0001z\u0003z\u0474\bz\u0001z\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0003z\u047e\bz\u0001{\u0001{\u0003"+
		"{\u0482\b{\u0001{\u0001{\u0001|\u0001|\u0001|\u0005|\u0489\b|\n|\f|\u048c"+
		"\t|\u0001}\u0001}\u0003}\u0490\b}\u0001}\u0001}\u0001~\u0001~\u0001~\u0005"+
		"~\u0497\b~\n~\f~\u049a\t~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0003\u0081\u04a4\b\u0081"+
		"\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082"+
		"\u0001\u0082\u0001\u0082\u0001\u0082\u0003\u0082\u04af\b\u0082\u0001\u0083"+
		"\u0001\u0083\u0001\u0083\u0003\u0083\u04b4\b\u0083\u0001\u0084\u0001\u0084"+
		"\u0005\u0084\u04b8\b\u0084\n\u0084\f\u0084\u04bb\t\u0084\u0001\u0084\u0001"+
		"\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0003\u0085\u04c3"+
		"\b\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0005\u0086\u04c8\b\u0086"+
		"\n\u0086\f\u0086\u04cb\t\u0086\u0001\u0086\u0001\u0086\u0004\u0086\u04cf"+
		"\b\u0086\u000b\u0086\f\u0086\u04d0\u0003\u0086\u04d3\b\u0086\u0001\u0086"+
		"\u0000\u0001\u0016\u0087\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u0000\n\u0001\u0000/1\u0002\u0000\u0014\u0014&\'\u0002\u0000"+
		"\u001f\"<?\u0002\u0000\u0012\u0012\u0019\u001a\u0002\u0000hhv\u007f\u0001"+
		"\u0000rs\u0002\u0000ijtu\u0001\u0000]^\u0002\u0000__ab\u0002\u0000]^f"+
		"g\u0514\u0000\u0111\u0001\u0000\u0000\u0000\u0002\u0116\u0001\u0000\u0000"+
		"\u0000\u0004\u0122\u0001\u0000\u0000\u0000\u0006\u0124\u0001\u0000\u0000"+
		"\u0000\b\u012e\u0001\u0000\u0000\u0000\n\u0143\u0001\u0000\u0000\u0000"+
		"\f\u014a\u0001\u0000\u0000\u0000\u000e\u014c\u0001\u0000\u0000\u0000\u0010"+
		"\u0150\u0001\u0000\u0000\u0000\u0012\u0161\u0001\u0000\u0000\u0000\u0014"+
		"\u0163\u0001\u0000\u0000\u0000\u0016\u0173\u0001\u0000\u0000\u0000\u0018"+
		"\u0180\u0001\u0000\u0000\u0000\u001a\u018d\u0001\u0000\u0000\u0000\u001c"+
		"\u0195\u0001\u0000\u0000\u0000\u001e\u0199\u0001\u0000\u0000\u0000 \u01b0"+
		"\u0001\u0000\u0000\u0000\"\u01bf\u0001\u0000\u0000\u0000$\u01c1\u0001"+
		"\u0000\u0000\u0000&\u01c4\u0001\u0000\u0000\u0000(\u01c7\u0001\u0000\u0000"+
		"\u0000*\u01ca\u0001\u0000\u0000\u0000,\u01d1\u0001\u0000\u0000\u0000."+
		"\u01d8\u0001\u0000\u0000\u00000\u01db\u0001\u0000\u0000\u00002\u01dd\u0001"+
		"\u0000\u0000\u00004\u01e3\u0001\u0000\u0000\u00006\u01ea\u0001\u0000\u0000"+
		"\u00008\u01ee\u0001\u0000\u0000\u0000:\u01f5\u0001\u0000\u0000\u0000<"+
		"\u0204\u0001\u0000\u0000\u0000>\u0206\u0001\u0000\u0000\u0000@\u0208\u0001"+
		"\u0000\u0000\u0000B\u020c\u0001\u0000\u0000\u0000D\u0210\u0001\u0000\u0000"+
		"\u0000F\u021a\u0001\u0000\u0000\u0000H\u0220\u0001\u0000\u0000\u0000J"+
		"\u022e\u0001\u0000\u0000\u0000L\u0232\u0001\u0000\u0000\u0000N\u0234\u0001"+
		"\u0000\u0000\u0000P\u0242\u0001\u0000\u0000\u0000R\u0244\u0001\u0000\u0000"+
		"\u0000T\u0249\u0001\u0000\u0000\u0000V\u0251\u0001\u0000\u0000\u0000X"+
		"\u025b\u0001\u0000\u0000\u0000Z\u025f\u0001\u0000\u0000\u0000\\\u0262"+
		"\u0001\u0000\u0000\u0000^\u0270\u0001\u0000\u0000\u0000`\u0272\u0001\u0000"+
		"\u0000\u0000b\u0274\u0001\u0000\u0000\u0000d\u027b\u0001\u0000\u0000\u0000"+
		"f\u027e\u0001\u0000\u0000\u0000h\u0280\u0001\u0000\u0000\u0000j\u0288"+
		"\u0001\u0000\u0000\u0000l\u028d\u0001\u0000\u0000\u0000n\u0297\u0001\u0000"+
		"\u0000\u0000p\u029d\u0001\u0000\u0000\u0000r\u02a3\u0001\u0000\u0000\u0000"+
		"t\u02ac\u0001\u0000\u0000\u0000v\u02b8\u0001\u0000\u0000\u0000x\u02ba"+
		"\u0001\u0000\u0000\u0000z\u02cd\u0001\u0000\u0000\u0000|\u02cf\u0001\u0000"+
		"\u0000\u0000~\u02d9\u0001\u0000\u0000\u0000\u0080\u02e6\u0001\u0000\u0000"+
		"\u0000\u0082\u02e8\u0001\u0000\u0000\u0000\u0084\u02f2\u0001\u0000\u0000"+
		"\u0000\u0086\u02ff\u0001\u0000\u0000\u0000\u0088\u0301\u0001\u0000\u0000"+
		"\u0000\u008a\u030a\u0001\u0000\u0000\u0000\u008c\u0313\u0001\u0000\u0000"+
		"\u0000\u008e\u0315\u0001\u0000\u0000\u0000\u0090\u031e\u0001\u0000\u0000"+
		"\u0000\u0092\u0321\u0001\u0000\u0000\u0000\u0094\u032a\u0001\u0000\u0000"+
		"\u0000\u0096\u0338\u0001\u0000\u0000\u0000\u0098\u033c\u0001\u0000\u0000"+
		"\u0000\u009a\u0340\u0001\u0000\u0000\u0000\u009c\u034f\u0001\u0000\u0000"+
		"\u0000\u009e\u0358\u0001\u0000\u0000\u0000\u00a0\u035c\u0001\u0000\u0000"+
		"\u0000\u00a2\u0360\u0001\u0000\u0000\u0000\u00a4\u036b\u0001\u0000\u0000"+
		"\u0000\u00a6\u0370\u0001\u0000\u0000\u0000\u00a8\u0372\u0001\u0000\u0000"+
		"\u0000\u00aa\u037d\u0001\u0000\u0000\u0000\u00ac\u0381\u0001\u0000\u0000"+
		"\u0000\u00ae\u0389\u0001\u0000\u0000\u0000\u00b0\u038d\u0001\u0000\u0000"+
		"\u0000\u00b2\u038f\u0001\u0000\u0000\u0000\u00b4\u0391\u0001\u0000\u0000"+
		"\u0000\u00b6\u0393\u0001\u0000\u0000\u0000\u00b8\u039f\u0001\u0000\u0000"+
		"\u0000\u00ba\u03a4\u0001\u0000\u0000\u0000\u00bc\u03a6\u0001\u0000\u0000"+
		"\u0000\u00be\u03b1\u0001\u0000\u0000\u0000\u00c0\u03bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u03c1\u0001\u0000\u0000\u0000\u00c4\u03cb\u0001\u0000\u0000"+
		"\u0000\u00c6\u03cf\u0001\u0000\u0000\u0000\u00c8\u03d1\u0001\u0000\u0000"+
		"\u0000\u00ca\u03d3\u0001\u0000\u0000\u0000\u00cc\u03d9\u0001\u0000\u0000"+
		"\u0000\u00ce\u03de\u0001\u0000\u0000\u0000\u00d0\u03e2\u0001\u0000\u0000"+
		"\u0000\u00d2\u03e4\u0001\u0000\u0000\u0000\u00d4\u03ec\u0001\u0000\u0000"+
		"\u0000\u00d6\u03f4\u0001\u0000\u0000\u0000\u00d8\u03fc\u0001\u0000\u0000"+
		"\u0000\u00da\u0404\u0001\u0000\u0000\u0000\u00dc\u040c\u0001\u0000\u0000"+
		"\u0000\u00de\u0414\u0001\u0000\u0000\u0000\u00e0\u041e\u0001\u0000\u0000"+
		"\u0000\u00e2\u042a\u0001\u0000\u0000\u0000\u00e4\u042d\u0001\u0000\u0000"+
		"\u0000\u00e6\u0430\u0001\u0000\u0000\u0000\u00e8\u0438\u0001\u0000\u0000"+
		"\u0000\u00ea\u0440\u0001\u0000\u0000\u0000\u00ec\u0449\u0001\u0000\u0000"+
		"\u0000\u00ee\u044b\u0001\u0000\u0000\u0000\u00f0\u0450\u0001\u0000\u0000"+
		"\u0000\u00f2\u0463\u0001\u0000\u0000\u0000\u00f4\u047d\u0001\u0000\u0000"+
		"\u0000\u00f6\u047f\u0001\u0000\u0000\u0000\u00f8\u0485\u0001\u0000\u0000"+
		"\u0000\u00fa\u048d\u0001\u0000\u0000\u0000\u00fc\u0493\u0001\u0000\u0000"+
		"\u0000\u00fe\u049b\u0001\u0000\u0000\u0000\u0100\u049f\u0001\u0000\u0000"+
		"\u0000\u0102\u04a3\u0001\u0000\u0000\u0000\u0104\u04ae\u0001\u0000\u0000"+
		"\u0000\u0106\u04b3\u0001\u0000\u0000\u0000\u0108\u04b5\u0001\u0000\u0000"+
		"\u0000\u010a\u04c2\u0001\u0000\u0000\u0000\u010c\u04c4\u0001\u0000\u0000"+
		"\u0000\u010e\u0110\u0003 \u0010\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0000\u0000\u0001"+
		"\u0115\u0001\u0001\u0000\u0000\u0000\u0116\u0117\u0003d2\u0000\u0117\u0118"+
		"\u0005\u0017\u0000\u0000\u0118\u0119\u0005N\u0000\u0000\u0119\u011d\u0005"+
		"R\u0000\u0000\u011a\u011c\u0003\u0004\u0002\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005S\u0000"+
		"\u0000\u0121\u0003\u0001\u0000\u0000\u0000\u0122\u0123\u0003l6\u0000\u0123"+
		"\u0005\u0001\u0000\u0000\u0000\u0124\u0125\u0005A\u0000\u0000\u0125\u0127"+
		"\u0003\u001a\r\u0000\u0126\u0128\u0003\b\u0004\u0000\u0127\u0126\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0005\\\u0000\u0000\u012a\u0007\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005Z\u0000\u0000\u012c\u012f\u0003\n\u0005"+
		"\u0000\u012d\u012f\u0003\u000e\u0007\u0000\u012e\u012b\u0001\u0000\u0000"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\t\u0001\u0000\u0000\u0000"+
		"\u0130\u0144\u0005_\u0000\u0000\u0131\u0133\u0005G\u0000\u0000\u0132\u0134"+
		"\u0003\u000e\u0007\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0001\u0000\u0000\u0000\u0134\u0144\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0005R\u0000\u0000\u0136\u013b\u0003\f\u0006\u0000\u0137\u0138\u0005"+
		"Y\u0000\u0000\u0138\u013a\u0003\f\u0006\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000"+
		"\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0140\u0005Y\u0000"+
		"\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0005S\u0000\u0000"+
		"\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0130\u0001\u0000\u0000\u0000"+
		"\u0143\u0131\u0001\u0000\u0000\u0000\u0143\u0135\u0001\u0000\u0000\u0000"+
		"\u0144\u000b\u0001\u0000\u0000\u0000\u0145\u0147\u0005G\u0000\u0000\u0146"+
		"\u0148\u0003\u000e\u0007\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149"+
		"\u014b\u0005_\u0000\u0000\u014a\u0145\u0001\u0000\u0000\u0000\u014a\u0149"+
		"\u0001\u0000\u0000\u0000\u014b\r\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		"\b\u0000\u0000\u014d\u014e\u0005G\u0000\u0000\u014e\u000f\u0001\u0000"+
		"\u0000\u0000\u014f\u0151\u0003^/\u0000\u0150\u014f\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u00057\u0000\u0000\u0153\u0154\u0003\u0012\t\u0000\u0154"+
		"\u0155\u0005\b\u0000\u0000\u0155\u0156\u0005G\u0000\u0000\u0156\u0157"+
		"\u0005\\\u0000\u0000\u0157\u0011\u0001\u0000\u0000\u0000\u0158\u0162\u0003"+
		"\u00a2Q\u0000\u0159\u015a\u0005R\u0000\u0000\u015a\u015b\u0003\u0014\n"+
		"\u0000\u015b\u015c\u0005S\u0000\u0000\u015c\u0162\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0005R\u0000\u0000\u015e\u015f\u0003\u0016\u000b\u0000\u015f"+
		"\u0160\u0005S\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u0158"+
		"\u0001\u0000\u0000\u0000\u0161\u0159\u0001\u0000\u0000\u0000\u0161\u015d"+
		"\u0001\u0000\u0000\u0000\u0162\u0013\u0001\u0000\u0000\u0000\u0163\u0168"+
		"\u0003\u00a2Q\u0000\u0164\u0165\u0005Y\u0000\u0000\u0165\u0167\u0003\u00a2"+
		"Q\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000"+
		"\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000"+
		"\u0000\u0169\u0015\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0006\u000b\uffff\uffff\u0000\u016c\u016d\u0005V\u0000"+
		"\u0000\u016d\u016e\u0003\u0016\u000b\u0000\u016e\u016f\u0005W\u0000\u0000"+
		"\u016f\u0174\u0001\u0000\u0000\u0000\u0170\u0171\u0005f\u0000\u0000\u0171"+
		"\u0174\u0003\u0016\u000b\u0004\u0172\u0174\u0003\u00a2Q\u0000\u0173\u016b"+
		"\u0001\u0000\u0000\u0000\u0173\u0170\u0001\u0000\u0000\u0000\u0173\u0172"+
		"\u0001\u0000\u0000\u0000\u0174\u017d\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\n\u0003\u0000\u0000\u0176\u0177\u0005c\u0000\u0000\u0177\u017c\u0003"+
		"\u0016\u000b\u0004\u0178\u0179\n\u0002\u0000\u0000\u0179\u017a\u0005d"+
		"\u0000\u0000\u017a\u017c\u0003\u0016\u000b\u0003\u017b\u0175\u0001\u0000"+
		"\u0000\u0000\u017b\u0178\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000"+
		"\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000"+
		"\u0000\u0000\u017e\u0017\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0005)\u0000\u0000\u0181\u018b\u0003\u001a\r"+
		"\u0000\u0182\u0186\u0005R\u0000\u0000\u0183\u0185\u0003 \u0010\u0000\u0184"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000\u0186"+
		"\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187"+
		"\u0189\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189"+
		"\u018c\u0005S\u0000\u0000\u018a\u018c\u0005\\\u0000\u0000\u018b\u0182"+
		"\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u0019"+
		"\u0001\u0000\u0000\u0000\u018d\u0192\u0005G\u0000\u0000\u018e\u018f\u0005"+
		"Z\u0000\u0000\u018f\u0191\u0005G\u0000\u0000\u0190\u018e\u0001\u0000\u0000"+
		"\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u001b\u0001\u0000\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0005\u0016\u0000"+
		"\u0000\u0196\u0197\u0005G\u0000\u0000\u0197\u0198\u0003\u001e\u000f\u0000"+
		"\u0198\u001d\u0001\u0000\u0000\u0000\u0199\u019a\u0005R\u0000\u0000\u019a"+
		"\u019f\u0005G\u0000\u0000\u019b\u019c\u0005Y\u0000\u0000\u019c\u019e\u0005"+
		"G\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0005S\u0000\u0000\u01a3\u001f\u0001\u0000\u0000"+
		"\u0000\u01a4\u01b1\u0003\u0006\u0003\u0000\u01a5\u01b1\u0003\u0010\b\u0000"+
		"\u01a6\u01b1\u0003\u001c\u000e\u0000\u01a7\u01b1\u0003Z-\u0000\u01a8\u01b1"+
		"\u0003l6\u0000\u01a9\u01b1\u0003|>\u0000\u01aa\u01b1\u0003\u0082A\u0000"+
		"\u01ab\u01b1\u0003\u008aE\u0000\u01ac\u01b1\u0003\u009aM\u0000\u01ad\u01b1"+
		"\u0003\u0092I\u0000\u01ae\u01b1\u0003\u0018\f\u0000\u01af\u01b1\u0003"+
		"\u0002\u0001\u0000\u01b0\u01a4\u0001\u0000\u0000\u0000\u01b0\u01a5\u0001"+
		"\u0000\u0000\u0000\u01b0\u01a6\u0001\u0000\u0000\u0000\u01b0\u01a7\u0001"+
		"\u0000\u0000\u0000\u01b0\u01a8\u0001\u0000\u0000\u0000\u01b0\u01a9\u0001"+
		"\u0000\u0000\u0000\u01b0\u01aa\u0001\u0000\u0000\u0000\u01b0\u01ab\u0001"+
		"\u0000\u0000\u0000\u01b0\u01ac\u0001\u0000\u0000\u0000\u01b0\u01ad\u0001"+
		"\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01af\u0001"+
		"\u0000\u0000\u0000\u01b1!\u0001\u0000\u0000\u0000\u01b2\u01c0\u0003\u0006"+
		"\u0003\u0000\u01b3\u01c0\u0003\u0010\b\u0000\u01b4\u01c0\u0003Z-\u0000"+
		"\u01b5\u01c0\u0003\\.\u0000\u01b6\u01c0\u0003,\u0016\u0000\u01b7\u01c0"+
		"\u00034\u001a\u0000\u01b8\u01c0\u00038\u001c\u0000\u01b9\u01c0\u0003@"+
		" \u0000\u01ba\u01c0\u0003B!\u0000\u01bb\u01c0\u0003F#\u0000\u01bc\u01c0"+
		"\u0003$\u0012\u0000\u01bd\u01c0\u0003&\u0013\u0000\u01be\u01c0\u0003("+
		"\u0014\u0000\u01bf\u01b2\u0001\u0000\u0000\u0000\u01bf\u01b3\u0001\u0000"+
		"\u0000\u0000\u01bf\u01b4\u0001\u0000\u0000\u0000\u01bf\u01b5\u0001\u0000"+
		"\u0000\u0000\u01bf\u01b6\u0001\u0000\u0000\u0000\u01bf\u01b7\u0001\u0000"+
		"\u0000\u0000\u01bf\u01b8\u0001\u0000\u0000\u0000\u01bf\u01b9\u0001\u0000"+
		"\u0000\u0000\u01bf\u01ba\u0001\u0000\u0000\u0000\u01bf\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0#\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0005\f\u0000\u0000\u01c2\u01c3\u0005\\\u0000\u0000"+
		"\u01c3%\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005\u0011\u0000\u0000\u01c5"+
		"\u01c6\u0005\\\u0000\u0000\u01c6\'\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0003\u00c8d\u0000\u01c8\u01c9\u0005\\\u0000\u0000\u01c9)\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0005R\u0000\u0000\u01cb\u01cd\u0003.\u0017\u0000"+
		"\u01cc\u01ce\u00030\u0018\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0005S\u0000\u0000\u01d0+\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005"+
		"R\u0000\u0000\u01d2\u01d3\u0003.\u0017\u0000\u01d3\u01d4\u0005S\u0000"+
		"\u0000\u01d4-\u0001\u0000\u0000\u0000\u01d5\u01d7\u0003\"\u0011\u0000"+
		"\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d9/\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0003\u00c8d\u0000\u01dc1\u0001\u0000\u0000\u0000\u01dd\u01de\u0005"+
		"\u001d\u0000\u0000\u01de\u01df\u0003\u00c4b\u0000\u01df\u01e0\u0003*\u0015"+
		"\u0000\u01e0\u01e1\u0005\u0015\u0000\u0000\u01e1\u01e2\u0003*\u0015\u0000"+
		"\u01e23\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u001d\u0000\u0000\u01e4"+
		"\u01e5\u0003\u00c4b\u0000\u01e5\u01e8\u0003\"\u0011\u0000\u01e6\u01e7"+
		"\u0005\u0015\u0000\u0000\u01e7\u01e9\u0003\"\u0011\u0000\u01e8\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e95\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0005,\u0000\u0000\u01eb\u01ec\u0003\u00c4b\u0000"+
		"\u01ec\u01ed\u0003H$\u0000\u01ed7\u0001\u0000\u0000\u0000\u01ee\u01f1"+
		"\u0005\u001b\u0000\u0000\u01ef\u01f2\u0003:\u001d\u0000\u01f0\u01f2\u0003"+
		"\u00c4b\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4\u0003\"\u0011"+
		"\u0000\u01f49\u0001\u0000\u0000\u0000\u01f5\u01f7\u0005V\u0000\u0000\u01f6"+
		"\u01f8\u0003<\u001e\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01fb"+
		"\u0003\u00c8d\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0005"+
		"\\\u0000\u0000\u01fd\u01ff\u0003>\u001f\u0000\u01fe\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0005W\u0000\u0000\u0201;\u0001\u0000\u0000\u0000"+
		"\u0202\u0205\u0003\\.\u0000\u0203\u0205\u0003\u00f8|\u0000\u0204\u0202"+
		"\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205=\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0003\u00f8|\u0000\u0207?\u0001\u0000\u0000"+
		"\u0000\u0208\u0209\u0005D\u0000\u0000\u0209\u020a\u0003\u00c4b\u0000\u020a"+
		"\u020b\u0003\"\u0011\u0000\u020bA\u0001\u0000\u0000\u0000\u020c\u020d"+
		"\u0005\u001c\u0000\u0000\u020d\u020e\u0003D\"\u0000\u020e\u020f\u0003"+
		",\u0016\u0000\u020fC\u0001\u0000\u0000\u0000\u0210\u0213\u0005V\u0000"+
		"\u0000\u0211\u0214\u0005B\u0000\u0000\u0212\u0214\u0003\u00a2Q\u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0005G\u0000\u0000\u0216\u0217"+
		"\u0005\u001e\u0000\u0000\u0217\u0218\u0003\u00c8d\u0000\u0218\u0219\u0005"+
		"W\u0000\u0000\u0219E\u0001\u0000\u0000\u0000\u021a\u021c\u00052\u0000"+
		"\u0000\u021b\u021d\u0003\u00c8d\u0000\u021c\u021b\u0001\u0000\u0000\u0000"+
		"\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0005\\\u0000\u0000\u021fG\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0005R\u0000\u0000\u0221\u0226\u0003J%\u0000\u0222\u0223\u0005"+
		"Y\u0000\u0000\u0223\u0225\u0003J%\u0000\u0224\u0222\u0001\u0000\u0000"+
		"\u0000\u0225\u0228\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000"+
		"\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000"+
		"\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0229\u022b\u0005Y\u0000\u0000"+
		"\u022a\u0229\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0005S\u0000\u0000\u022d"+
		"I\u0001\u0000\u0000\u0000\u022e\u022f\u0003L&\u0000\u022f\u0230\u0005"+
		"\u0081\u0000\u0000\u0230\u0231\u0003\u00c8d\u0000\u0231K\u0001\u0000\u0000"+
		"\u0000\u0232\u0233\u0003N\'\u0000\u0233M\u0001\u0000\u0000\u0000\u0234"+
		"\u0239\u0003P(\u0000\u0235\u0236\u0005d\u0000\u0000\u0236\u0238\u0003"+
		"P(\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u023b\u0001\u0000\u0000"+
		"\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000"+
		"\u0000\u023aO\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000"+
		"\u023c\u0243\u0003\u0104\u0082\u0000\u023d\u0243\u0005F\u0000\u0000\u023e"+
		"\u0243\u0003R)\u0000\u023f\u0243\u0003\u001a\r\u0000\u0240\u0243\u0003"+
		"V+\u0000\u0241\u0243\u0003X,\u0000\u0242\u023c\u0001\u0000\u0000\u0000"+
		"\u0242\u023d\u0001\u0000\u0000\u0000\u0242\u023e\u0001\u0000\u0000\u0000"+
		"\u0242\u023f\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000"+
		"\u0242\u0241\u0001\u0000\u0000\u0000\u0243Q\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0003\u001a\r\u0000\u0245\u0246\u0005V\u0000\u0000\u0246\u0247"+
		"\u0003T*\u0000\u0247\u0248\u0005W\u0000\u0000\u0248S\u0001\u0000\u0000"+
		"\u0000\u0249\u024e\u0005G\u0000\u0000\u024a\u024b\u0005Y\u0000\u0000\u024b"+
		"\u024d\u0005G\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024d\u0250"+
		"\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024f"+
		"\u0001\u0000\u0000\u0000\u024fU\u0001\u0000\u0000\u0000\u0250\u024e\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0005V\u0000\u0000\u0252\u0255\u0003P("+
		"\u0000\u0253\u0254\u0005Y\u0000\u0000\u0254\u0256\u0003P(\u0000\u0255"+
		"\u0253\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257"+
		"\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0005W\u0000\u0000\u025aW\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0005V\u0000\u0000\u025c\u025d\u0003L&"+
		"\u0000\u025d\u025e\u0005W\u0000\u0000\u025eY\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0005\u0010\u0000\u0000\u0260\u0261\u0003\\.\u0000\u0261[\u0001"+
		"\u0000\u0000\u0000\u0262\u0264\u0003d2\u0000\u0263\u0265\u0005\u0010\u0000"+
		"\u0000\u0264\u0263\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000"+
		"\u0000\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u0268\u0003b1\u0000\u0267"+
		"\u0266\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268"+
		"\u026b\u0001\u0000\u0000\u0000\u0269\u026c\u0005B\u0000\u0000\u026a\u026c"+
		"\u0003\u00a2Q\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026b\u026a\u0001"+
		"\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0003"+
		"h4\u0000\u026e\u026f\u0005\\\u0000\u0000\u026f]\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0007\u0000\u0000\u0000\u0271_\u0001\u0000\u0000\u0000\u0272"+
		"\u0273\u0007\u0001\u0000\u0000\u0273a\u0001\u0000\u0000\u0000\u0274\u0275"+
		"\u0005(\u0000\u0000\u0275c\u0001\u0000\u0000\u0000\u0276\u027a\u0003^"+
		"/\u0000\u0277\u027a\u00053\u0000\u0000\u0278\u027a\u0005.\u0000\u0000"+
		"\u0279\u0276\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000"+
		"\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000"+
		"\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000"+
		"\u027ce\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0003\\.\u0000\u027fg\u0001\u0000\u0000\u0000\u0280\u0285\u0003"+
		"j5\u0000\u0281\u0282\u0005Y\u0000\u0000\u0282\u0284\u0003j5\u0000\u0283"+
		"\u0281\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285"+
		"\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286"+
		"i\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288\u028b"+
		"\u0005G\u0000\u0000\u0289\u028a\u0005h\u0000\u0000\u028a\u028c\u0003\u00c6"+
		"c\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000"+
		"\u0000\u028ck\u0001\u0000\u0000\u0000\u028d\u028e\u0003d2\u0000\u028e"+
		"\u028f\u0003\u00a0P\u0000\u028f\u0291\u0005G\u0000\u0000\u0290\u0292\u0003"+
		"\u00bc^\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294\u0003p8\u0000"+
		"\u0294\u0295\u0003v;\u0000\u0295m\u0001\u0000\u0000\u0000\u0296\u0298"+
		"\u0003^/\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000"+
		"\u0000\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0005G\u0000"+
		"\u0000\u029a\u029b\u0003p8\u0000\u029b\u029c\u0003,\u0016\u0000\u029c"+
		"o\u0001\u0000\u0000\u0000\u029d\u029f\u0005V\u0000\u0000\u029e\u02a0\u0003"+
		"r9\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005W\u0000\u0000"+
		"\u02a2q\u0001\u0000\u0000\u0000\u02a3\u02a8\u0003t:\u0000\u02a4\u02a5"+
		"\u0005Y\u0000\u0000\u02a5\u02a7\u0003t:\u0000\u02a6\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9s\u0001\u0000\u0000"+
		"\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ad\u0003`0\u0000\u02ac"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0001\u0000\u0000\u0000\u02ae\u02af\u0003\u00a2Q\u0000\u02af\u02b2"+
		"\u0005G\u0000\u0000\u02b0\u02b1\u0005h\u0000\u0000\u02b1\u02b3\u0003\u00c8"+
		"d\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b3u\u0001\u0000\u0000\u0000\u02b4\u02b9\u0003*\u0015\u0000\u02b5"+
		"\u02b6\u0005\u0081\u0000\u0000\u02b6\u02b9\u0003\u00c8d\u0000\u02b7\u02b9"+
		"\u0005\\\u0000\u0000\u02b8\u02b4\u0001\u0000\u0000\u0000\u02b8\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b9w\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bb\u0005-\u0000\u0000\u02bb\u02bc\u0003z=\u0000"+
		"\u02bc\u02bd\u0003p8\u0000\u02bd\u02be\u0003v;\u0000\u02bey\u0001\u0000"+
		"\u0000\u0000\u02bf\u02ce\u0005]\u0000\u0000\u02c0\u02ce\u0005^\u0000\u0000"+
		"\u02c1\u02ce\u0005_\u0000\u0000\u02c2\u02ce\u0005a\u0000\u0000\u02c3\u02ce"+
		"\u0005b\u0000\u0000\u02c4\u02ce\u0005e\u0000\u0000\u02c5\u02ce\u0005c"+
		"\u0000\u0000\u02c6\u02ce\u0005d\u0000\u0000\u02c7\u02c8\u0005i\u0000\u0000"+
		"\u02c8\u02ce\u0005i\u0000\u0000\u02c9\u02ca\u0005j\u0000\u0000\u02ca\u02ce"+
		"\u0005j\u0000\u0000\u02cb\u02ce\u0005r\u0000\u0000\u02cc\u02ce\u0005s"+
		"\u0000\u0000\u02cd\u02bf\u0001\u0000\u0000\u0000\u02cd\u02c0\u0001\u0000"+
		"\u0000\u0000\u02cd\u02c1\u0001\u0000\u0000\u0000\u02cd\u02c2\u0001\u0000"+
		"\u0000\u0000\u02cd\u02c3\u0001\u0000\u0000\u0000\u02cd\u02c4\u0001\u0000"+
		"\u0000\u0000\u02cd\u02c5\u0001\u0000\u0000\u0000\u02cd\u02c6\u0001\u0000"+
		"\u0000\u0000\u02cd\u02c7\u0001\u0000\u0000\u0000\u02cd\u02c9\u0001\u0000"+
		"\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02cc\u0001\u0000"+
		"\u0000\u0000\u02ce{\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u000f\u0000"+
		"\u0000\u02d0\u02d2\u0005G\u0000\u0000\u02d1\u02d3\u0003\u00bc^\u0000\u02d2"+
		"\u02d1\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d4\u02d6\u0003\u0088D\u0000\u02d5\u02d4"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d8\u0003~?\u0000\u02d8}\u0001\u0000"+
		"\u0000\u0000\u02d9\u02dd\u0005R\u0000\u0000\u02da\u02dc\u0003\u0080@\u0000"+
		"\u02db\u02da\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000"+
		"\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000"+
		"\u02de\u02e0\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000"+
		"\u02e0\u02e1\u0005S\u0000\u0000\u02e1\u007f\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e7\u0003f3\u0000\u02e3\u02e7\u0003l6\u0000\u02e4\u02e7\u0003x<\u0000"+
		"\u02e5\u02e7\u0003n7\u0000\u02e6\u02e2\u0001\u0000\u0000\u0000\u02e6\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e7\u0081\u0001\u0000\u0000\u0000\u02e8\u02e9"+
		"\u00055\u0000\u0000\u02e9\u02eb\u0005G\u0000\u0000\u02ea\u02ec\u0003\u00bc"+
		"^\u0000\u02eb\u02ea\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed\u02ef\u0003\u0088D\u0000"+
		"\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0003\u0084B\u0000\u02f1"+
		"\u0083\u0001\u0000\u0000\u0000\u02f2\u02f6\u0005R\u0000\u0000\u02f3\u02f5"+
		"\u0003\u0086C\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f9\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0005S\u0000\u0000\u02fa\u0085\u0001\u0000"+
		"\u0000\u0000\u02fb\u0300\u0003f3\u0000\u02fc\u0300\u0003l6\u0000\u02fd"+
		"\u0300\u0003x<\u0000\u02fe\u0300\u0003n7\u0000\u02ff\u02fb\u0001\u0000"+
		"\u0000\u0000\u02ff\u02fc\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000"+
		"\u0000\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u0300\u0087\u0001\u0000"+
		"\u0000\u0000\u0301\u0302\u0005[\u0000\u0000\u0302\u0307\u0003\u00a2Q\u0000"+
		"\u0303\u0304\u0005Y\u0000\u0000\u0304\u0306\u0003\u00a2Q\u0000\u0305\u0303"+
		"\u0001\u0000\u0000\u0000\u0306\u0309\u0001\u0000\u0000\u0000\u0307\u0305"+
		"\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u0089"+
		"\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u030a\u030b"+
		"\u0005:\u0000\u0000\u030b\u030d\u0005G\u0000\u0000\u030c\u030e\u0003\u00bc"+
		"^\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000"+
		"\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0310\u0003\u008cF\u0000"+
		"\u0310\u008b\u0001\u0000\u0000\u0000\u0311\u0314\u0003\u008eG\u0000\u0312"+
		"\u0314\u0003l6\u0000\u0313\u0311\u0001\u0000\u0000\u0000\u0313\u0312\u0001"+
		"\u0000\u0000\u0000\u0314\u008d\u0001\u0000\u0000\u0000\u0315\u0319\u0005"+
		"R\u0000\u0000\u0316\u0318\u0003\u0090H\u0000\u0317\u0316\u0001\u0000\u0000"+
		"\u0000\u0318\u031b\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000"+
		"\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031c\u0001\u0000\u0000"+
		"\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031c\u031d\u0005S\u0000\u0000"+
		"\u031d\u008f\u0001\u0000\u0000\u0000\u031e\u031f\u0003l6\u0000\u031f\u0091"+
		"\u0001\u0000\u0000\u0000\u0320\u0322\u00058\u0000\u0000\u0321\u0320\u0001"+
		"\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0323\u0001"+
		"\u0000\u0000\u0000\u0323\u0324\u0005@\u0000\u0000\u0324\u0326\u0005G\u0000"+
		"\u0000\u0325\u0327\u0003\u00bc^\u0000\u0326\u0325\u0001\u0000\u0000\u0000"+
		"\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000\u0000\u0000"+
		"\u0328\u0329\u0003\u0094J\u0000\u0329\u0093\u0001\u0000\u0000\u0000\u032a"+
		"\u032b\u0005R\u0000\u0000\u032b\u0330\u0003\u0098L\u0000\u032c\u032d\u0005"+
		"Y\u0000\u0000\u032d\u032f\u0003\u0098L\u0000\u032e\u032c\u0001\u0000\u0000"+
		"\u0000\u032f\u0332\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000"+
		"\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0334\u0001\u0000\u0000"+
		"\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0333\u0335\u0005Y\u0000\u0000"+
		"\u0334\u0333\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000"+
		"\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0337\u0005S\u0000\u0000\u0337"+
		"\u0095\u0001\u0000\u0000\u0000\u0338\u0339\u0005V\u0000\u0000\u0339\u033a"+
		"\u0003t:\u0000\u033a\u033b\u0005W\u0000\u0000\u033b\u0097\u0001\u0000"+
		"\u0000\u0000\u033c\u033e\u0005G\u0000\u0000\u033d\u033f\u0003\u0096K\u0000"+
		"\u033e\u033d\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000"+
		"\u033f\u0099\u0001\u0000\u0000\u0000\u0340\u0341\u0005E\u0000\u0000\u0341"+
		"\u0342\u0003\u00a2Q\u0000\u0342\u0343\u0005\u001b\u0000\u0000\u0343\u0348"+
		"\u0003\u00a2Q\u0000\u0344\u0345\u0005Y\u0000\u0000\u0345\u0347\u0003\u00a2"+
		"Q\u0000\u0346\u0344\u0001\u0000\u0000\u0000\u0347\u034a\u0001\u0000\u0000"+
		"\u0000\u0348\u0346\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000"+
		"\u0000\u0349\u034d\u0001\u0000\u0000\u0000\u034a\u0348\u0001\u0000\u0000"+
		"\u0000\u034b\u034e\u0003\u009cN\u0000\u034c\u034e\u0005\\\u0000\u0000"+
		"\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034c\u0001\u0000\u0000\u0000"+
		"\u034e\u009b\u0001\u0000\u0000\u0000\u034f\u0353\u0005R\u0000\u0000\u0350"+
		"\u0352\u0003\u009eO\u0000\u0351\u0350\u0001\u0000\u0000\u0000\u0352\u0355"+
		"\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353\u0354"+
		"\u0001\u0000\u0000\u0000\u0354\u0356\u0001\u0000\u0000\u0000\u0355\u0353"+
		"\u0001\u0000\u0000\u0000\u0356\u0357\u0005S\u0000\u0000\u0357\u009d\u0001"+
		"\u0000\u0000\u0000\u0358\u0359\u0003l6\u0000\u0359\u009f\u0001\u0000\u0000"+
		"\u0000\u035a\u035d\u0005C\u0000\u0000\u035b\u035d\u0003\u00a2Q\u0000\u035c"+
		"\u035a\u0001\u0000\u0000\u0000\u035c\u035b\u0001\u0000\u0000\u0000\u035d"+
		"\u00a1\u0001\u0000\u0000\u0000\u035e\u035f\u0005G\u0000\u0000\u035f\u0361"+
		"\u0005[\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0360\u0361\u0001"+
		"\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0366\u0003"+
		"\u00a6S\u0000\u0363\u0365\u0003\u00a4R\u0000\u0364\u0363\u0001\u0000\u0000"+
		"\u0000\u0365\u0368\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000"+
		"\u0000\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u00a3\u0001\u0000\u0000"+
		"\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0369\u036c\u0003\u00b6[\u0000"+
		"\u036a\u036c\u0005k\u0000\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036b"+
		"\u036a\u0001\u0000\u0000\u0000\u036c\u00a5\u0001\u0000\u0000\u0000\u036d"+
		"\u0371\u0003\u00acV\u0000\u036e\u0371\u0003\u00aeW\u0000\u036f\u0371\u0003"+
		"\u00a8T\u0000\u0370\u036d\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000"+
		"\u0000\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0371\u00a7\u0001\u0000"+
		"\u0000\u0000\u0372\u0373\u0005V\u0000\u0000\u0373\u0378\u0003\u00aaU\u0000"+
		"\u0374\u0375\u0005Y\u0000\u0000\u0375\u0377\u0003\u00aaU\u0000\u0376\u0374"+
		"\u0001\u0000\u0000\u0000\u0377\u037a\u0001\u0000\u0000\u0000\u0378\u0376"+
		"\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037b"+
		"\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000\u0000\u0000\u037b\u037c"+
		"\u0005W\u0000\u0000\u037c\u00a9\u0001\u0000\u0000\u0000\u037d\u037f\u0003"+
		"\u00a2Q\u0000\u037e\u0380\u0005G\u0000\u0000\u037f\u037e\u0001\u0000\u0000"+
		"\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u00ab\u0001\u0000\u0000"+
		"\u0000\u0381\u0383\u0003\u001a\r\u0000\u0382\u0384\u0003\u00be_\u0000"+
		"\u0383\u0382\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000"+
		"\u0384\u00ad\u0001\u0000\u0000\u0000\u0385\u038a\u0005\u000b\u0000\u0000"+
		"\u0386\u038a\u0005\u000e\u0000\u0000\u0387\u038a\u00054\u0000\u0000\u0388"+
		"\u038a\u0003\u00b0X\u0000\u0389\u0385\u0001\u0000\u0000\u0000\u0389\u0386"+
		"\u0001\u0000\u0000\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u0389\u0388"+
		"\u0001\u0000\u0000\u0000\u038a\u00af\u0001\u0000\u0000\u0000\u038b\u038e"+
		"\u0003\u00b2Y\u0000\u038c\u038e\u0003\u00b4Z\u0000\u038d\u038b\u0001\u0000"+
		"\u0000\u0000\u038d\u038c\u0001\u0000\u0000\u0000\u038e\u00b1\u0001\u0000"+
		"\u0000\u0000\u038f\u0390\u0007\u0002\u0000\u0000\u0390\u00b3\u0001\u0000"+
		"\u0000\u0000\u0391\u0392\u0007\u0003\u0000\u0000\u0392\u00b5\u0001\u0000"+
		"\u0000\u0000\u0393\u0395\u0005T\u0000\u0000\u0394\u0396\u0003\u00c8d\u0000"+
		"\u0395\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000"+
		"\u0396\u039a\u0001\u0000\u0000\u0000\u0397\u0399\u0005Y\u0000\u0000\u0398"+
		"\u0397\u0001\u0000\u0000\u0000\u0399\u039c\u0001\u0000\u0000\u0000\u039a"+
		"\u0398\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b"+
		"\u039d\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039d"+
		"\u039e\u0005U\u0000\u0000\u039e\u00b7\u0001\u0000\u0000\u0000\u039f\u03a2"+
		"\u0005G\u0000\u0000\u03a0\u03a1\u0005[\u0000\u0000\u03a1\u03a3\u0003\u00ba"+
		"]\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a3\u00b9\u0001\u0000\u0000\u0000\u03a4\u03a5\u0005G\u0000\u0000"+
		"\u03a5\u00bb\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005i\u0000\u0000\u03a7"+
		"\u03ac\u0003\u00b8\\\u0000\u03a8\u03a9\u0005Y\u0000\u0000\u03a9\u03ab"+
		"\u0003\u00b8\\\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03ab\u03ae\u0001"+
		"\u0000\u0000\u0000\u03ac\u03aa\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001"+
		"\u0000\u0000\u0000\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae\u03ac\u0001"+
		"\u0000\u0000\u0000\u03af\u03b0\u0005j\u0000\u0000\u03b0\u00bd\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b2\u0005i\u0000\u0000\u03b2\u03b7\u0003\u00a2Q\u0000"+
		"\u03b3\u03b4\u0005Y\u0000\u0000\u03b4\u03b6\u0003\u00a2Q\u0000\u03b5\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b9\u0001\u0000\u0000\u0000\u03b7\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03ba"+
		"\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000\u03ba\u03bb"+
		"\u0003\u00c0`\u0000\u03bb\u00bf\u0001\u0000\u0000\u0000\u03bc\u03c0\u0005"+
		"j\u0000\u0000\u03bd\u03be\u0005j\u0000\u0000\u03be\u03c0\u0003\u00c0`"+
		"\u0000\u03bf\u03bc\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000"+
		"\u0000\u03c0\u00c1\u0001\u0000\u0000\u0000\u03c1\u03c2\u0005V\u0000\u0000"+
		"\u03c2\u03c5\u0003\u0102\u0081\u0000\u03c3\u03c4\u0005Y\u0000\u0000\u03c4"+
		"\u03c6\u0003\u0102\u0081\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c6"+
		"\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000\u03c7"+
		"\u03c8\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9"+
		"\u03ca\u0005W\u0000\u0000\u03ca\u00c3\u0001\u0000\u0000\u0000\u03cb\u03cc"+
		"\u0005V\u0000\u0000\u03cc\u03cd\u0003\u00c8d\u0000\u03cd\u03ce\u0005W"+
		"\u0000\u0000\u03ce\u00c5\u0001\u0000\u0000\u0000\u03cf\u03d0\u0003\u00cc"+
		"f\u0000\u03d0\u00c7\u0001\u0000\u0000\u0000\u03d1\u03d2\u0003\u00cae\u0000"+
		"\u03d2\u00c9\u0001\u0000\u0000\u0000\u03d3\u03d7\u0003\u00ccf\u0000\u03d4"+
		"\u03d5\u0003\u00d0h\u0000\u03d5\u03d6\u0003\u00cae\u0000\u03d6\u03d8\u0001"+
		"\u0000\u0000\u0000\u03d7\u03d4\u0001\u0000\u0000\u0000\u03d7\u03d8\u0001"+
		"\u0000\u0000\u0000\u03d8\u00cb\u0001\u0000\u0000\u0000\u03d9\u03dc\u0003"+
		"\u00d2i\u0000\u03da\u03db\u0005l\u0000\u0000\u03db\u03dd\u0003\u00ccf"+
		"\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000"+
		"\u0000\u03dd\u00cd\u0001\u0000\u0000\u0000\u03de\u03df\u0005+\u0000\u0000"+
		"\u03df\u03e0\u0003\u00a2Q\u0000\u03e0\u03e1\u0003\u00fa}\u0000\u03e1\u00cf"+
		"\u0001\u0000\u0000\u0000\u03e2\u03e3\u0007\u0004\u0000\u0000\u03e3\u00d1"+
		"\u0001\u0000\u0000\u0000\u03e4\u03e9\u0003\u00d4j\u0000\u03e5\u03e6\u0005"+
		"q\u0000\u0000\u03e6\u03e8\u0003\u00d4j\u0000\u03e7\u03e5\u0001\u0000\u0000"+
		"\u0000\u03e8\u03eb\u0001\u0000\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000"+
		"\u0000\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u00d3\u0001\u0000\u0000"+
		"\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03ec\u03f1\u0003\u00d6k\u0000"+
		"\u03ed\u03ee\u0005p\u0000\u0000\u03ee\u03f0\u0003\u00d6k\u0000\u03ef\u03ed"+
		"\u0001\u0000\u0000\u0000\u03f0\u03f3\u0001\u0000\u0000\u0000\u03f1\u03ef"+
		"\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2\u00d5"+
		"\u0001\u0000\u0000\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f4\u03f9"+
		"\u0003\u00d8l\u0000\u03f5\u03f6\u0005d\u0000\u0000\u03f6\u03f8\u0003\u00d8"+
		"l\u0000\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f8\u03fb\u0001\u0000\u0000"+
		"\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fa\u00d7\u0001\u0000\u0000\u0000\u03fb\u03f9\u0001\u0000\u0000"+
		"\u0000\u03fc\u0401\u0003\u00dam\u0000\u03fd\u03fe\u0005e\u0000\u0000\u03fe"+
		"\u0400\u0003\u00dam\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u0400\u0403"+
		"\u0001\u0000\u0000\u0000\u0401\u03ff\u0001\u0000\u0000\u0000\u0401\u0402"+
		"\u0001\u0000\u0000\u0000\u0402\u00d9\u0001\u0000\u0000\u0000\u0403\u0401"+
		"\u0001\u0000\u0000\u0000\u0404\u0409\u0003\u00dcn\u0000\u0405\u0406\u0005"+
		"c\u0000\u0000\u0406\u0408\u0003\u00dcn\u0000\u0407\u0405\u0001\u0000\u0000"+
		"\u0000\u0408\u040b\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000"+
		"\u0000\u0409\u040a\u0001\u0000\u0000\u0000\u040a\u00db\u0001\u0000\u0000"+
		"\u0000\u040b\u0409\u0001\u0000\u0000\u0000\u040c\u0411\u0003\u00deo\u0000"+
		"\u040d\u040e\u0007\u0005\u0000\u0000\u040e\u0410\u0003\u00deo\u0000\u040f"+
		"\u040d\u0001\u0000\u0000\u0000\u0410\u0413\u0001\u0000\u0000\u0000\u0411"+
		"\u040f\u0001\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412"+
		"\u00dd\u0001\u0000\u0000\u0000\u0413\u0411\u0001\u0000\u0000\u0000\u0414"+
		"\u041c\u0003\u00e0p\u0000\u0415\u0416\u0007\u0006\u0000\u0000\u0416\u041d"+
		"\u0003\u00e0p\u0000\u0417\u0418\u0005%\u0000\u0000\u0418\u041a\u0003\u00a2"+
		"Q\u0000\u0419\u041b\u0005G\u0000\u0000\u041a\u0419\u0001\u0000\u0000\u0000"+
		"\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u041d\u0001\u0000\u0000\u0000"+
		"\u041c\u0415\u0001\u0000\u0000\u0000\u041c\u0417\u0001\u0000\u0000\u0000"+
		"\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u00df\u0001\u0000\u0000\u0000"+
		"\u041e\u0427\u0003\u00e6s\u0000\u041f\u0422\u0003\u00e2q\u0000\u0420\u0422"+
		"\u0003\u00e4r\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0421\u0420\u0001"+
		"\u0000\u0000\u0000\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0424\u0003"+
		"\u00e6s\u0000\u0424\u0426\u0001\u0000\u0000\u0000\u0425\u0421\u0001\u0000"+
		"\u0000\u0000\u0426\u0429\u0001\u0000\u0000\u0000\u0427\u0425\u0001\u0000"+
		"\u0000\u0000\u0427\u0428\u0001\u0000\u0000\u0000\u0428\u00e1\u0001\u0000"+
		"\u0000\u0000\u0429\u0427\u0001\u0000\u0000\u0000\u042a\u042b\u0005i\u0000"+
		"\u0000\u042b\u042c\u0005i\u0000\u0000\u042c\u00e3\u0001\u0000\u0000\u0000"+
		"\u042d\u042e\u0005j\u0000\u0000\u042e\u042f\u0005j\u0000\u0000\u042f\u00e5"+
		"\u0001\u0000\u0000\u0000\u0430\u0435\u0003\u00e8t\u0000\u0431\u0432\u0007"+
		"\u0007\u0000\u0000\u0432\u0434\u0003\u00e8t\u0000\u0433\u0431\u0001\u0000"+
		"\u0000\u0000\u0434\u0437\u0001\u0000\u0000\u0000\u0435\u0433\u0001\u0000"+
		"\u0000\u0000\u0435\u0436\u0001\u0000\u0000\u0000\u0436\u00e7\u0001\u0000"+
		"\u0000\u0000\u0437\u0435\u0001\u0000\u0000\u0000\u0438\u043d\u0003\u00ea"+
		"u\u0000\u0439\u043a\u0007\b\u0000\u0000\u043a\u043c\u0003\u00eau\u0000"+
		"\u043b\u0439\u0001\u0000\u0000\u0000\u043c\u043f\u0001\u0000\u0000\u0000"+
		"\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000\u0000\u0000"+
		"\u043e\u00e9\u0001\u0000\u0000\u0000\u043f\u043d\u0001\u0000\u0000\u0000"+
		"\u0440\u0443\u0003\u00ecv\u0000\u0441\u0442\u0005`\u0000\u0000\u0442\u0444"+
		"\u0003\u00eau\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0443\u0444\u0001"+
		"\u0000\u0000\u0000\u0444\u00eb\u0001\u0000\u0000\u0000\u0445\u044a\u0003"+
		"\u00eew\u0000\u0446\u0447\u0007\t\u0000\u0000\u0447\u044a\u0003\u00ec"+
		"v\u0000\u0448\u044a\u0003\u00f0x\u0000\u0449\u0445\u0001\u0000\u0000\u0000"+
		"\u0449\u0446\u0001\u0000\u0000\u0000\u0449\u0448\u0001\u0000\u0000\u0000"+
		"\u044a\u00ed\u0001\u0000\u0000\u0000\u044b\u044c\u0005V\u0000\u0000\u044c"+
		"\u044d\u0003\u00a2Q\u0000\u044d\u044e\u0005W\u0000\u0000\u044e\u044f\u0003"+
		"\u00ecv\u0000\u044f\u00ef\u0001\u0000\u0000\u0000\u0450\u0454\u0003\u00f2"+
		"y\u0000\u0451\u0453\u0003\u00f4z\u0000\u0452\u0451\u0001\u0000\u0000\u0000"+
		"\u0453\u0456\u0001\u0000\u0000\u0000\u0454\u0452\u0001\u0000\u0000\u0000"+
		"\u0454\u0455\u0001\u0000\u0000\u0000\u0455\u00f1\u0001\u0000\u0000\u0000"+
		"\u0456\u0454\u0001\u0000\u0000\u0000\u0457\u0464\u0003\u0104\u0082\u0000"+
		"\u0458\u0464\u0003\u00c4b\u0000\u0459\u0464\u0003\u00c2a\u0000\u045a\u0464"+
		"\u00032\u0019\u0000\u045b\u0464\u00036\u001b\u0000\u045c\u0464\u0003*"+
		"\u0015\u0000\u045d\u0464\u00059\u0000\u0000\u045e\u0464\u0005*\u0000\u0000"+
		"\u045f\u0464\u0003\u00f6{\u0000\u0460\u0464\u0003\u00ceg\u0000\u0461\u0464"+
		"\u0005G\u0000\u0000\u0462\u0464\u0003\u001a\r\u0000\u0463\u0457\u0001"+
		"\u0000\u0000\u0000\u0463\u0458\u0001\u0000\u0000\u0000\u0463\u0459\u0001"+
		"\u0000\u0000\u0000\u0463\u045a\u0001\u0000\u0000\u0000\u0463\u045b\u0001"+
		"\u0000\u0000\u0000\u0463\u045c\u0001\u0000\u0000\u0000\u0463\u045d\u0001"+
		"\u0000\u0000\u0000\u0463\u045e\u0001\u0000\u0000\u0000\u0463\u045f\u0001"+
		"\u0000\u0000\u0000\u0463\u0460\u0001\u0000\u0000\u0000\u0463\u0461\u0001"+
		"\u0000\u0000\u0000\u0463\u0462\u0001\u0000\u0000\u0000\u0464\u00f3\u0001"+
		"\u0000\u0000\u0000\u0465\u0466\u0005X\u0000\u0000\u0466\u047e\u0005G\u0000"+
		"\u0000\u0467\u0468\u0005X\u0000\u0000\u0468\u047e\u0005I\u0000\u0000\u0469"+
		"\u046a\u0005m\u0000\u0000\u046a\u047e\u0005G\u0000\u0000\u046b\u046c\u0005"+
		"m\u0000\u0000\u046c\u046e\u0005V\u0000\u0000\u046d\u046f\u0003\u00fc~"+
		"\u0000\u046e\u046d\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000\u0000"+
		"\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u047e\u0005W\u0000\u0000"+
		"\u0471\u0473\u0005V\u0000\u0000\u0472\u0474\u0003\u00fc~\u0000\u0473\u0472"+
		"\u0001\u0000\u0000\u0000\u0473\u0474\u0001\u0000\u0000\u0000\u0474\u0475"+
		"\u0001\u0000\u0000\u0000\u0475\u047e\u0005W\u0000\u0000\u0476\u0477\u0005"+
		"T\u0000\u0000\u0477\u0478\u0003\u00f8|\u0000\u0478\u0479\u0005U\u0000"+
		"\u0000\u0479\u047e\u0001\u0000\u0000\u0000\u047a\u047e\u0005n\u0000\u0000"+
		"\u047b\u047e\u0005o\u0000\u0000\u047c\u047e\u0005f\u0000\u0000\u047d\u0465"+
		"\u0001\u0000\u0000\u0000\u047d\u0467\u0001\u0000\u0000\u0000\u047d\u0469"+
		"\u0001\u0000\u0000\u0000\u047d\u046b\u0001\u0000\u0000\u0000\u047d\u0471"+
		"\u0001\u0000\u0000\u0000\u047d\u0476\u0001\u0000\u0000\u0000\u047d\u047a"+
		"\u0001\u0000\u0000\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047d\u047c"+
		"\u0001\u0000\u0000\u0000\u047e\u00f5\u0001\u0000\u0000\u0000\u047f\u0481"+
		"\u0005T\u0000\u0000\u0480\u0482\u0003\u00f8|\u0000\u0481\u0480\u0001\u0000"+
		"\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000"+
		"\u0000\u0000\u0483\u0484\u0005U\u0000\u0000\u0484\u00f7\u0001\u0000\u0000"+
		"\u0000\u0485\u048a\u0003\u00c8d\u0000\u0486\u0487\u0005Y\u0000\u0000\u0487"+
		"\u0489\u0003\u00c8d\u0000\u0488\u0486\u0001\u0000\u0000\u0000\u0489\u048c"+
		"\u0001\u0000\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048a\u048b"+
		"\u0001\u0000\u0000\u0000\u048b\u00f9\u0001\u0000\u0000\u0000\u048c\u048a"+
		"\u0001\u0000\u0000\u0000\u048d\u048f\u0005V\u0000\u0000\u048e\u0490\u0003"+
		"\u00fc~\u0000\u048f\u048e\u0001\u0000\u0000\u0000\u048f\u0490\u0001\u0000"+
		"\u0000\u0000\u0490\u0491\u0001\u0000\u0000\u0000\u0491\u0492\u0005W\u0000"+
		"\u0000\u0492\u00fb\u0001\u0000\u0000\u0000\u0493\u0498\u0003\u0102\u0081"+
		"\u0000\u0494\u0495\u0005Y\u0000\u0000\u0495\u0497\u0003\u0102\u0081\u0000"+
		"\u0496\u0494\u0001\u0000\u0000\u0000\u0497\u049a\u0001\u0000\u0000\u0000"+
		"\u0498\u0496\u0001\u0000\u0000\u0000\u0498\u0499\u0001\u0000\u0000\u0000"+
		"\u0499\u00fd\u0001\u0000\u0000\u0000\u049a\u0498\u0001\u0000\u0000\u0000"+
		"\u049b\u049c\u0005G\u0000\u0000\u049c\u049d\u0005[\u0000\u0000\u049d\u049e"+
		"\u0003\u00c8d\u0000\u049e\u00ff\u0001\u0000\u0000\u0000\u049f\u04a0\u0003"+
		"\u00c6c\u0000\u04a0\u0101\u0001\u0000\u0000\u0000\u04a1\u04a4\u0003\u00fe"+
		"\u007f\u0000\u04a2\u04a4\u0003\u0100\u0080\u0000\u04a3\u04a1\u0001\u0000"+
		"\u0000\u0000\u04a3\u04a2\u0001\u0000\u0000\u0000\u04a4\u0103\u0001\u0000"+
		"\u0000\u0000\u04a5\u04af\u0005;\u0000\u0000\u04a6\u04af\u0005\u0018\u0000"+
		"\u0000\u04a7\u04af\u0005I\u0000\u0000\u04a8\u04af\u0005J\u0000\u0000\u04a9"+
		"\u04af\u0005K\u0000\u0000\u04aa\u04af\u0005L\u0000\u0000\u04ab\u04af\u0005"+
		"M\u0000\u0000\u04ac\u04af\u0003\u0106\u0083\u0000\u04ad\u04af\u0005H\u0000"+
		"\u0000\u04ae\u04a5\u0001\u0000\u0000\u0000\u04ae\u04a6\u0001\u0000\u0000"+
		"\u0000\u04ae\u04a7\u0001\u0000\u0000\u0000\u04ae\u04a8\u0001\u0000\u0000"+
		"\u0000\u04ae\u04a9\u0001\u0000\u0000\u0000\u04ae\u04aa\u0001\u0000\u0000"+
		"\u0000\u04ae\u04ab\u0001\u0000\u0000\u0000\u04ae\u04ac\u0001\u0000\u0000"+
		"\u0000\u04ae\u04ad\u0001\u0000\u0000\u0000\u04af\u0105\u0001\u0000\u0000"+
		"\u0000\u04b0\u04b4\u0005N\u0000\u0000\u04b1\u04b4\u0005O\u0000\u0000\u04b2"+
		"\u04b4\u0003\u0108\u0084\u0000\u04b3\u04b0\u0001\u0000\u0000\u0000\u04b3"+
		"\u04b1\u0001\u0000\u0000\u0000\u04b3\u04b2\u0001\u0000\u0000\u0000\u04b4"+
		"\u0107\u0001\u0000\u0000\u0000\u04b5\u04b9\u0005P\u0000\u0000\u04b6\u04b8"+
		"\u0003\u010a\u0085\u0000\u04b7\u04b6\u0001\u0000\u0000\u0000\u04b8\u04bb"+
		"\u0001\u0000\u0000\u0000\u04b9\u04b7\u0001\u0000\u0000\u0000\u04b9\u04ba"+
		"\u0001\u0000\u0000\u0000\u04ba\u04bc\u0001\u0000\u0000\u0000\u04bb\u04b9"+
		"\u0001\u0000\u0000\u0000\u04bc\u04bd\u0005\u0088\u0000\u0000\u04bd\u0109"+
		"\u0001\u0000\u0000\u0000\u04be\u04c3\u0003\u010c\u0086\u0000\u04bf\u04c3"+
		"\u0005\u0082\u0000\u0000\u04c0\u04c3\u0005\u0084\u0000\u0000\u04c1\u04c3"+
		"\u0005\u0085\u0000\u0000\u04c2\u04be\u0001\u0000\u0000\u0000\u04c2\u04bf"+
		"\u0001\u0000\u0000\u0000\u04c2\u04c0\u0001\u0000\u0000\u0000\u04c2\u04c1"+
		"\u0001\u0000\u0000\u0000\u04c3\u010b\u0001\u0000\u0000\u0000\u04c4\u04c9"+
		"\u0003\u00c8d\u0000\u04c5\u04c6\u0005Y\u0000\u0000\u04c6\u04c8\u0003\u00c8"+
		"d\u0000\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c8\u04cb\u0001\u0000\u0000"+
		"\u0000\u04c9\u04c7\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000"+
		"\u0000\u04ca\u04d2\u0001\u0000\u0000\u0000\u04cb\u04c9\u0001\u0000\u0000"+
		"\u0000\u04cc\u04ce\u0005[\u0000\u0000\u04cd\u04cf\u0005\u008a\u0000\u0000"+
		"\u04ce\u04cd\u0001\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000"+
		"\u04d0\u04ce\u0001\u0000\u0000\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000"+
		"\u04d1\u04d3\u0001\u0000\u0000\u0000\u04d2\u04cc\u0001\u0000\u0000\u0000"+
		"\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3\u010d\u0001\u0000\u0000\u0000"+
		"{\u0111\u011d\u0127\u012e\u0133\u013b\u013f\u0143\u0147\u014a\u0150\u0161"+
		"\u0168\u0173\u017b\u017d\u0186\u018b\u0192\u019f\u01b0\u01bf\u01cd\u01d8"+
		"\u01e8\u01f1\u01f7\u01fa\u01fe\u0204\u0213\u021c\u0226\u022a\u0239\u0242"+
		"\u024e\u0257\u0264\u0267\u026b\u0279\u027b\u0285\u028b\u0291\u0297\u029f"+
		"\u02a8\u02ac\u02b2\u02b8\u02cd\u02d2\u02d5\u02dd\u02e6\u02eb\u02ee\u02f6"+
		"\u02ff\u0307\u030d\u0313\u0319\u0321\u0326\u0330\u0334\u033e\u0348\u034d"+
		"\u0353\u035c\u0360\u0366\u036b\u0370\u0378\u037f\u0383\u0389\u038d\u0395"+
		"\u039a\u03a2\u03ac\u03b7\u03bf\u03c7\u03d7\u03dc\u03e9\u03f1\u03f9\u0401"+
		"\u0409\u0411\u041a\u041c\u0421\u0427\u0435\u043d\u0443\u0449\u0454\u0463"+
		"\u046e\u0473\u047d\u0481\u048a\u048f\u0498\u04a3\u04ae\u04b3\u04b9\u04c2"+
		"\u04c9\u04d0\u04d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}