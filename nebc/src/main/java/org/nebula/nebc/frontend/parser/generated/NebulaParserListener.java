// Generated from NebulaParser.g4 by ANTLR 4.13.1

    package org.nebula.nebc.frontend.parser.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NebulaParser}.
 */
public interface NebulaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NebulaParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(NebulaParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(NebulaParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#extern_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtern_declaration(NebulaParser.Extern_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#extern_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtern_declaration(NebulaParser.Extern_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#extern_member}.
	 * @param ctx the parse tree
	 */
	void enterExtern_member(NebulaParser.Extern_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#extern_member}.
	 * @param ctx the parse tree
	 */
	void exitExtern_member(NebulaParser.Extern_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_statement(NebulaParser.Use_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_statement(NebulaParser.Use_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#use_tail}.
	 * @param ctx the parse tree
	 */
	void enterUse_tail(NebulaParser.Use_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#use_tail}.
	 * @param ctx the parse tree
	 */
	void exitUse_tail(NebulaParser.Use_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#use_selector}.
	 * @param ctx the parse tree
	 */
	void enterUse_selector(NebulaParser.Use_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#use_selector}.
	 * @param ctx the parse tree
	 */
	void exitUse_selector(NebulaParser.Use_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#use_selector_item}.
	 * @param ctx the parse tree
	 */
	void enterUse_selector_item(NebulaParser.Use_selector_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#use_selector_item}.
	 * @param ctx the parse tree
	 */
	void exitUse_selector_item(NebulaParser.Use_selector_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#use_alias}.
	 * @param ctx the parse tree
	 */
	void enterUse_alias(NebulaParser.Use_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#use_alias}.
	 * @param ctx the parse tree
	 */
	void exitUse_alias(NebulaParser.Use_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#tag_statement}.
	 * @param ctx the parse tree
	 */
	void enterTag_statement(NebulaParser.Tag_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#tag_statement}.
	 * @param ctx the parse tree
	 */
	void exitTag_statement(NebulaParser.Tag_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#tag_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTag_declaration(NebulaParser.Tag_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#tag_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTag_declaration(NebulaParser.Tag_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#tag_enumeration}.
	 * @param ctx the parse tree
	 */
	void enterTag_enumeration(NebulaParser.Tag_enumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#tag_enumeration}.
	 * @param ctx the parse tree
	 */
	void exitTag_enumeration(NebulaParser.Tag_enumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#tag_expression}.
	 * @param ctx the parse tree
	 */
	void enterTag_expression(NebulaParser.Tag_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#tag_expression}.
	 * @param ctx the parse tree
	 */
	void exitTag_expression(NebulaParser.Tag_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_declaration(NebulaParser.Namespace_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_declaration(NebulaParser.Namespace_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name(NebulaParser.Qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name(NebulaParser.Qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(NebulaParser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(NebulaParser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void enterEnum_body(NebulaParser.Enum_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#enum_body}.
	 * @param ctx the parse tree
	 */
	void exitEnum_body(NebulaParser.Enum_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#enum_variant}.
	 * @param ctx the parse tree
	 */
	void enterEnum_variant(NebulaParser.Enum_variantContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#enum_variant}.
	 * @param ctx the parse tree
	 */
	void exitEnum_variant(NebulaParser.Enum_variantContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#enum_payload_list}.
	 * @param ctx the parse tree
	 */
	void enterEnum_payload_list(NebulaParser.Enum_payload_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#enum_payload_list}.
	 * @param ctx the parse tree
	 */
	void exitEnum_payload_list(NebulaParser.Enum_payload_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#enum_payload_item}.
	 * @param ctx the parse tree
	 */
	void enterEnum_payload_item(NebulaParser.Enum_payload_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#enum_payload_item}.
	 * @param ctx the parse tree
	 */
	void exitEnum_payload_item(NebulaParser.Enum_payload_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#field_ident}.
	 * @param ctx the parse tree
	 */
	void enterField_ident(NebulaParser.Field_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#field_ident}.
	 * @param ctx the parse tree
	 */
	void exitField_ident(NebulaParser.Field_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#plain_ident}.
	 * @param ctx the parse tree
	 */
	void enterPlain_ident(NebulaParser.Plain_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#plain_ident}.
	 * @param ctx the parse tree
	 */
	void exitPlain_ident(NebulaParser.Plain_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTop_level_declaration(NebulaParser.Top_level_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#top_level_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTop_level_declaration(NebulaParser.Top_level_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#let_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLet_declaration(NebulaParser.Let_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#let_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLet_declaration(NebulaParser.Let_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NebulaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NebulaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#match_statement}.
	 * @param ctx the parse tree
	 */
	void enterMatch_statement(NebulaParser.Match_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#match_statement}.
	 * @param ctx the parse tree
	 */
	void exitMatch_statement(NebulaParser.Match_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(NebulaParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(NebulaParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(NebulaParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(NebulaParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(NebulaParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(NebulaParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(NebulaParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(NebulaParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#expression_block}.
	 * @param ctx the parse tree
	 */
	void enterExpression_block(NebulaParser.Expression_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#expression_block}.
	 * @param ctx the parse tree
	 */
	void exitExpression_block(NebulaParser.Expression_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(NebulaParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(NebulaParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#block_statements}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statements(NebulaParser.Block_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#block_statements}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statements(NebulaParser.Block_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(NebulaParser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(NebulaParser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(NebulaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(NebulaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#match_expression}.
	 * @param ctx the parse tree
	 */
	void enterMatch_expression(NebulaParser.Match_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#match_expression}.
	 * @param ctx the parse tree
	 */
	void exitMatch_expression(NebulaParser.Match_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(NebulaParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(NebulaParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#range_for_control}.
	 * @param ctx the parse tree
	 */
	void enterRange_for_control(NebulaParser.Range_for_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#range_for_control}.
	 * @param ctx the parse tree
	 */
	void exitRange_for_control(NebulaParser.Range_for_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#traditional_for_control}.
	 * @param ctx the parse tree
	 */
	void enterTraditional_for_control(NebulaParser.Traditional_for_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#traditional_for_control}.
	 * @param ctx the parse tree
	 */
	void exitTraditional_for_control(NebulaParser.Traditional_for_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFor_initializer(NebulaParser.For_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFor_initializer(NebulaParser.For_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void enterFor_iterator(NebulaParser.For_iteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void exitFor_iterator(NebulaParser.For_iteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(NebulaParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(NebulaParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void enterForeach_statement(NebulaParser.Foreach_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void exitForeach_statement(NebulaParser.Foreach_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#foreach_control}.
	 * @param ctx the parse tree
	 */
	void enterForeach_control(NebulaParser.Foreach_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#foreach_control}.
	 * @param ctx the parse tree
	 */
	void exitForeach_control(NebulaParser.Foreach_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#foreach_binding}.
	 * @param ctx the parse tree
	 */
	void enterForeach_binding(NebulaParser.Foreach_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#foreach_binding}.
	 * @param ctx the parse tree
	 */
	void exitForeach_binding(NebulaParser.Foreach_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#foreach_tuple_elem}.
	 * @param ctx the parse tree
	 */
	void enterForeach_tuple_elem(NebulaParser.Foreach_tuple_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#foreach_tuple_elem}.
	 * @param ctx the parse tree
	 */
	void exitForeach_tuple_elem(NebulaParser.Foreach_tuple_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(NebulaParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(NebulaParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#match_body}.
	 * @param ctx the parse tree
	 */
	void enterMatch_body(NebulaParser.Match_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#match_body}.
	 * @param ctx the parse tree
	 */
	void exitMatch_body(NebulaParser.Match_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#match_arm}.
	 * @param ctx the parse tree
	 */
	void enterMatch_arm(NebulaParser.Match_armContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#match_arm}.
	 * @param ctx the parse tree
	 */
	void exitMatch_arm(NebulaParser.Match_armContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(NebulaParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(NebulaParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void enterType_binding_pattern(NebulaParser.Type_binding_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type_binding_pattern}.
	 * @param ctx the parse tree
	 */
	void exitType_binding_pattern(NebulaParser.Type_binding_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#simple_pattern_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_pattern_type(NebulaParser.Simple_pattern_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#simple_pattern_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_pattern_type(NebulaParser.Simple_pattern_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#variant_pattern}.
	 * @param ctx the parse tree
	 */
	void enterVariant_pattern(NebulaParser.Variant_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#variant_pattern}.
	 * @param ctx the parse tree
	 */
	void exitVariant_pattern(NebulaParser.Variant_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#variant_pattern_arg}.
	 * @param ctx the parse tree
	 */
	void enterVariant_pattern_arg(NebulaParser.Variant_pattern_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#variant_pattern_arg}.
	 * @param ctx the parse tree
	 */
	void exitVariant_pattern_arg(NebulaParser.Variant_pattern_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#tuple_pattern_elem}.
	 * @param ctx the parse tree
	 */
	void enterTuple_pattern_elem(NebulaParser.Tuple_pattern_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#tuple_pattern_elem}.
	 * @param ctx the parse tree
	 */
	void exitTuple_pattern_elem(NebulaParser.Tuple_pattern_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(NebulaParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(NebulaParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#attribute_path}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_path(NebulaParser.Attribute_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#attribute_path}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_path(NebulaParser.Attribute_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConst_declaration(NebulaParser.Const_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConst_declaration(NebulaParser.Const_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(NebulaParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(NebulaParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#tuple_decl_elem}.
	 * @param ctx the parse tree
	 */
	void enterTuple_decl_elem(NebulaParser.Tuple_decl_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#tuple_decl_elem}.
	 * @param ctx the parse tree
	 */
	void exitTuple_decl_elem(NebulaParser.Tuple_decl_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#visibility_modifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibility_modifier(NebulaParser.Visibility_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#visibility_modifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibility_modifier(NebulaParser.Visibility_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#cvt_modifier}.
	 * @param ctx the parse tree
	 */
	void enterCvt_modifier(NebulaParser.Cvt_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#cvt_modifier}.
	 * @param ctx the parse tree
	 */
	void exitCvt_modifier(NebulaParser.Cvt_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#backlink_modifier}.
	 * @param ctx the parse tree
	 */
	void enterBacklink_modifier(NebulaParser.Backlink_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#backlink_modifier}.
	 * @param ctx the parse tree
	 */
	void exitBacklink_modifier(NebulaParser.Backlink_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(NebulaParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(NebulaParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration(NebulaParser.Field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration(NebulaParser.Field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarators(NebulaParser.Variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarators(NebulaParser.Variable_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarator(NebulaParser.Variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarator(NebulaParser.Variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(NebulaParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(NebulaParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(NebulaParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(NebulaParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(NebulaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(NebulaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(NebulaParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(NebulaParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(NebulaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(NebulaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(NebulaParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(NebulaParser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(NebulaParser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(NebulaParser.Operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_operator(NebulaParser.Overloadable_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_operator(NebulaParser.Overloadable_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(NebulaParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(NebulaParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type_body}.
	 * @param ctx the parse tree
	 */
	void enterType_body(NebulaParser.Type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type_body}.
	 * @param ctx the parse tree
	 */
	void exitType_body(NebulaParser.Type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type_member}.
	 * @param ctx the parse tree
	 */
	void enterType_member(NebulaParser.Type_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type_member}.
	 * @param ctx the parse tree
	 */
	void exitType_member(NebulaParser.Type_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#trait_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTrait_declaration(NebulaParser.Trait_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#trait_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTrait_declaration(NebulaParser.Trait_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#trait_supers}.
	 * @param ctx the parse tree
	 */
	void enterTrait_supers(NebulaParser.Trait_supersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#trait_supers}.
	 * @param ctx the parse tree
	 */
	void exitTrait_supers(NebulaParser.Trait_supersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#trait_body}.
	 * @param ctx the parse tree
	 */
	void enterTrait_body(NebulaParser.Trait_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#trait_body}.
	 * @param ctx the parse tree
	 */
	void exitTrait_body(NebulaParser.Trait_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#trait_block}.
	 * @param ctx the parse tree
	 */
	void enterTrait_block(NebulaParser.Trait_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#trait_block}.
	 * @param ctx the parse tree
	 */
	void exitTrait_block(NebulaParser.Trait_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#trait_member}.
	 * @param ctx the parse tree
	 */
	void enterTrait_member(NebulaParser.Trait_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#trait_member}.
	 * @param ctx the parse tree
	 */
	void exitTrait_member(NebulaParser.Trait_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#union_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUnion_declaration(NebulaParser.Union_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#union_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUnion_declaration(NebulaParser.Union_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#union_body}.
	 * @param ctx the parse tree
	 */
	void enterUnion_body(NebulaParser.Union_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#union_body}.
	 * @param ctx the parse tree
	 */
	void exitUnion_body(NebulaParser.Union_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#union_payload}.
	 * @param ctx the parse tree
	 */
	void enterUnion_payload(NebulaParser.Union_payloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#union_payload}.
	 * @param ctx the parse tree
	 */
	void exitUnion_payload(NebulaParser.Union_payloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#union_variant}.
	 * @param ctx the parse tree
	 */
	void enterUnion_variant(NebulaParser.Union_variantContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#union_variant}.
	 * @param ctx the parse tree
	 */
	void exitUnion_variant(NebulaParser.Union_variantContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#impl_declaration}.
	 * @param ctx the parse tree
	 */
	void enterImpl_declaration(NebulaParser.Impl_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#impl_declaration}.
	 * @param ctx the parse tree
	 */
	void exitImpl_declaration(NebulaParser.Impl_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type_with_params}.
	 * @param ctx the parse tree
	 */
	void enterType_with_params(NebulaParser.Type_with_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type_with_params}.
	 * @param ctx the parse tree
	 */
	void exitType_with_params(NebulaParser.Type_with_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#impl_block}.
	 * @param ctx the parse tree
	 */
	void enterImpl_block(NebulaParser.Impl_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#impl_block}.
	 * @param ctx the parse tree
	 */
	void exitImpl_block(NebulaParser.Impl_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#impl_member}.
	 * @param ctx the parse tree
	 */
	void enterImpl_member(NebulaParser.Impl_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#impl_member}.
	 * @param ctx the parse tree
	 */
	void exitImpl_member(NebulaParser.Impl_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(NebulaParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(NebulaParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(NebulaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(NebulaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void enterType_suffix(NebulaParser.Type_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void exitType_suffix(NebulaParser.Type_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(NebulaParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(NebulaParser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(NebulaParser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(NebulaParser.Tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type_element(NebulaParser.Tuple_type_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#tuple_type_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type_element(NebulaParser.Tuple_type_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(NebulaParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(NebulaParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type(NebulaParser.Predefined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type(NebulaParser.Predefined_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type(NebulaParser.Numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type(NebulaParser.Numeric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegral_type(NebulaParser.Integral_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#integral_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegral_type(NebulaParser.Integral_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_type(NebulaParser.Floating_point_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_type(NebulaParser.Floating_point_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifier(NebulaParser.Rank_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifier(NebulaParser.Rank_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_parameter(NebulaParser.Generic_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#generic_parameter}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_parameter(NebulaParser.Generic_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#constraint_list}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_list(NebulaParser.Constraint_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#constraint_list}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_list(NebulaParser.Constraint_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(NebulaParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(NebulaParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterType_parameters(NebulaParser.Type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitType_parameters(NebulaParser.Type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list(NebulaParser.Type_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list(NebulaParser.Type_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#type_or_const_arg}.
	 * @param ctx the parse tree
	 */
	void enterType_or_const_arg(NebulaParser.Type_or_const_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#type_or_const_arg}.
	 * @param ctx the parse tree
	 */
	void exitType_or_const_arg(NebulaParser.Type_or_const_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#nested_gt}.
	 * @param ctx the parse tree
	 */
	void enterNested_gt(NebulaParser.Nested_gtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#nested_gt}.
	 * @param ctx the parse tree
	 */
	void exitNested_gt(NebulaParser.Nested_gtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void enterTuple_literal(NebulaParser.Tuple_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#tuple_literal}.
	 * @param ctx the parse tree
	 */
	void exitTuple_literal(NebulaParser.Tuple_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(NebulaParser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(NebulaParser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#nonAssignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterNonAssignmentExpression(NebulaParser.NonAssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#nonAssignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitNonAssignmentExpression(NebulaParser.NonAssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NebulaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NebulaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(NebulaParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(NebulaParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary_expression(NebulaParser.Ternary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary_expression(NebulaParser.Ternary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_coalescing_expression(NebulaParser.Null_coalescing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_coalescing_expression(NebulaParser.Null_coalescing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void enterRange_expression(NebulaParser.Range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void exitRange_expression(NebulaParser.Range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#range_operator}.
	 * @param ctx the parse tree
	 */
	void enterRange_operator(NebulaParser.Range_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#range_operator}.
	 * @param ctx the parse tree
	 */
	void exitRange_operator(NebulaParser.Range_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(NebulaParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(NebulaParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#binary_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_or_expression(NebulaParser.Binary_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#binary_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_or_expression(NebulaParser.Binary_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#binary_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_and_expression(NebulaParser.Binary_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#binary_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_and_expression(NebulaParser.Binary_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(NebulaParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(NebulaParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(NebulaParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(NebulaParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(NebulaParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(NebulaParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(NebulaParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(NebulaParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(NebulaParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(NebulaParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(NebulaParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(NebulaParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#left_shift}.
	 * @param ctx the parse tree
	 */
	void enterLeft_shift(NebulaParser.Left_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#left_shift}.
	 * @param ctx the parse tree
	 */
	void exitLeft_shift(NebulaParser.Left_shiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift(NebulaParser.Right_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#right_shift}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift(NebulaParser.Right_shiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(NebulaParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(NebulaParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(NebulaParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(NebulaParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#exponentiation_expression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiation_expression(NebulaParser.Exponentiation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#exponentiation_expression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiation_expression(NebulaParser.Exponentiation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(NebulaParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(NebulaParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(NebulaParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(NebulaParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(NebulaParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(NebulaParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression_start(NebulaParser.Primary_expression_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression_start(NebulaParser.Primary_expression_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#struct_literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterStruct_literal_expression(NebulaParser.Struct_literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#struct_literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitStruct_literal_expression(NebulaParser.Struct_literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#struct_field_init}.
	 * @param ctx the parse tree
	 */
	void enterStruct_field_init(NebulaParser.Struct_field_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#struct_field_init}.
	 * @param ctx the parse tree
	 */
	void exitStruct_field_init(NebulaParser.Struct_field_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(NebulaParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(NebulaParser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#lambda_param}.
	 * @param ctx the parse tree
	 */
	void enterLambda_param(NebulaParser.Lambda_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#lambda_param}.
	 * @param ctx the parse tree
	 */
	void exitLambda_param(NebulaParser.Lambda_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_operator(NebulaParser.Postfix_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_operator(NebulaParser.Postfix_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(NebulaParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(NebulaParser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(NebulaParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(NebulaParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(NebulaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(NebulaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(NebulaParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(NebulaParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void enterNamedArgument(NebulaParser.NamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#namedArgument}.
	 * @param ctx the parse tree
	 */
	void exitNamedArgument(NebulaParser.NamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#positionalArgument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgument(NebulaParser.PositionalArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#positionalArgument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgument(NebulaParser.PositionalArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(NebulaParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(NebulaParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(NebulaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(NebulaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(NebulaParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(NebulaParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#interpolated_regular_string}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_regular_string(NebulaParser.Interpolated_regular_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#interpolated_regular_string}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_regular_string(NebulaParser.Interpolated_regular_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#interpolated_regular_string_part}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_regular_string_part(NebulaParser.Interpolated_regular_string_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#interpolated_regular_string_part}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_regular_string_part(NebulaParser.Interpolated_regular_string_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link NebulaParser#interpolated_string_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterpolated_string_expression(NebulaParser.Interpolated_string_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NebulaParser#interpolated_string_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterpolated_string_expression(NebulaParser.Interpolated_string_expressionContext ctx);
}