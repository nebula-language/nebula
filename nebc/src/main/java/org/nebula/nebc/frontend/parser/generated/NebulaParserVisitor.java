// Generated from NebulaParser.g4 by ANTLR 4.13.1

    package org.nebula.nebc.frontend.parser.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NebulaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NebulaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NebulaParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(NebulaParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#extern_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_declaration(NebulaParser.Extern_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#extern_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern_member(NebulaParser.Extern_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(NebulaParser.Use_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#use_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_tail(NebulaParser.Use_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#use_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_selector(NebulaParser.Use_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#use_selector_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_selector_item(NebulaParser.Use_selector_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#use_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_alias(NebulaParser.Use_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#tag_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_statement(NebulaParser.Tag_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#tag_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_declaration(NebulaParser.Tag_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#tag_enumeration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_enumeration(NebulaParser.Tag_enumerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#tag_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_expression(NebulaParser.Tag_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#namespace_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_declaration(NebulaParser.Namespace_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(NebulaParser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(NebulaParser.Enum_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#enum_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_body(NebulaParser.Enum_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#enum_variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_variant(NebulaParser.Enum_variantContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#enum_payload_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_payload_list(NebulaParser.Enum_payload_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#enum_payload_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_payload_item(NebulaParser.Enum_payload_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#field_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_ident(NebulaParser.Field_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#plain_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlain_ident(NebulaParser.Plain_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#top_level_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level_declaration(NebulaParser.Top_level_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#let_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_declaration(NebulaParser.Let_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NebulaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#match_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_statement(NebulaParser.Match_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(NebulaParser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(NebulaParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(NebulaParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(NebulaParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#expression_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_block(NebulaParser.Expression_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(NebulaParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#block_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statements(NebulaParser.Block_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#if_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_expression(NebulaParser.If_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(NebulaParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#match_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_expression(NebulaParser.Match_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(NebulaParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#range_for_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_for_control(NebulaParser.Range_for_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#traditional_for_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraditional_for_control(NebulaParser.Traditional_for_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#for_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_initializer(NebulaParser.For_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#for_iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_iterator(NebulaParser.For_iteratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(NebulaParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#foreach_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_statement(NebulaParser.Foreach_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#foreach_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_control(NebulaParser.Foreach_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#foreach_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_binding(NebulaParser.Foreach_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#foreach_tuple_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_tuple_elem(NebulaParser.Foreach_tuple_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(NebulaParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#match_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_body(NebulaParser.Match_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#match_arm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_arm(NebulaParser.Match_armContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(NebulaParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type_binding_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_binding_pattern(NebulaParser.Type_binding_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#simple_pattern_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_pattern_type(NebulaParser.Simple_pattern_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#variant_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant_pattern(NebulaParser.Variant_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#variant_pattern_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant_pattern_arg(NebulaParser.Variant_pattern_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#tuple_pattern_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_elem(NebulaParser.Tuple_pattern_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(NebulaParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#attribute_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_path(NebulaParser.Attribute_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#const_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_declaration(NebulaParser.Const_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(NebulaParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#tuple_decl_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_decl_elem(NebulaParser.Tuple_decl_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#visibility_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility_modifier(NebulaParser.Visibility_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#cvt_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvt_modifier(NebulaParser.Cvt_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#backlink_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBacklink_modifier(NebulaParser.Backlink_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(NebulaParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#field_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_declaration(NebulaParser.Field_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#variable_declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declarators(NebulaParser.Variable_declaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#variable_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declarator(NebulaParser.Variable_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(NebulaParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(NebulaParser.Constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(NebulaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(NebulaParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(NebulaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(NebulaParser.Method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration(NebulaParser.Operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#overloadable_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverloadable_operator(NebulaParser.Overloadable_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(NebulaParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body(NebulaParser.Type_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_member(NebulaParser.Type_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#trait_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrait_declaration(NebulaParser.Trait_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#trait_supers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrait_supers(NebulaParser.Trait_supersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#trait_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrait_body(NebulaParser.Trait_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#trait_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrait_block(NebulaParser.Trait_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#trait_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrait_member(NebulaParser.Trait_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#union_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_declaration(NebulaParser.Union_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#union_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_body(NebulaParser.Union_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#union_payload}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_payload(NebulaParser.Union_payloadContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#union_variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_variant(NebulaParser.Union_variantContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#impl_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpl_declaration(NebulaParser.Impl_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type_with_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_with_params(NebulaParser.Type_with_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#impl_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpl_block(NebulaParser.Impl_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#impl_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpl_member(NebulaParser.Impl_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(NebulaParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(NebulaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_suffix(NebulaParser.Type_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#base_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(NebulaParser.Base_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#tuple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type(NebulaParser.Tuple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#tuple_type_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element(NebulaParser.Tuple_type_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(NebulaParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#predefined_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined_type(NebulaParser.Predefined_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#numeric_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type(NebulaParser.Numeric_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#integral_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegral_type(NebulaParser.Integral_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#floating_point_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_point_type(NebulaParser.Floating_point_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#rank_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRank_specifier(NebulaParser.Rank_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#generic_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter(NebulaParser.Generic_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#constraint_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_list(NebulaParser.Constraint_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(NebulaParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_parameters(NebulaParser.Type_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_argument_list(NebulaParser.Type_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#type_or_const_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_or_const_arg(NebulaParser.Type_or_const_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#nested_gt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_gt(NebulaParser.Nested_gtContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#tuple_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_literal(NebulaParser.Tuple_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(NebulaParser.Parenthesized_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#nonAssignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonAssignmentExpression(NebulaParser.NonAssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(NebulaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(NebulaParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#ternary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_expression(NebulaParser.Ternary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_coalescing_expression(NebulaParser.Null_coalescing_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_expression(NebulaParser.Range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#range_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_operator(NebulaParser.Range_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(NebulaParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#binary_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_or_expression(NebulaParser.Binary_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#binary_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_and_expression(NebulaParser.Binary_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(NebulaParser.Inclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(NebulaParser.Exclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(NebulaParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(NebulaParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(NebulaParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(NebulaParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#left_shift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_shift(NebulaParser.Left_shiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#right_shift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_shift(NebulaParser.Right_shiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(NebulaParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(NebulaParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#exponentiation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiation_expression(NebulaParser.Exponentiation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(NebulaParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(NebulaParser.Cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(NebulaParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#primary_expression_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression_start(NebulaParser.Primary_expression_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#struct_literal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_literal_expression(NebulaParser.Struct_literal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#struct_field_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_field_init(NebulaParser.Struct_field_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#lambda_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(NebulaParser.Lambda_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#lambda_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_param(NebulaParser.Lambda_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator(NebulaParser.Postfix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(NebulaParser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(NebulaParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(NebulaParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(NebulaParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#namedArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArgument(NebulaParser.NamedArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#positionalArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgument(NebulaParser.PositionalArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(NebulaParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(NebulaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(NebulaParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#interpolated_regular_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolated_regular_string(NebulaParser.Interpolated_regular_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#interpolated_regular_string_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolated_regular_string_part(NebulaParser.Interpolated_regular_string_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link NebulaParser#interpolated_string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolated_string_expression(NebulaParser.Interpolated_string_expressionContext ctx);
}