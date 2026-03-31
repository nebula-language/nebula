parser grammar NebulaParser;

options {
    tokenVocab = NebulaLexer;
}

@header {
    package org.nebula.nebc.frontend.parser.generated;
}

// The entry point, now including directives and namespace declarations
compilation_unit
    : top_level_declaration* EOF
    ;

// ------------------------------
// Extern Declarations
// ------------------------------

extern_declaration
    : modifiers EXTERN REGULAR_STRING OPEN_BRACE extern_member* CLOSE_BRACE
    ;

extern_member
    : method_declaration
    ;

//=============================================================================
// Namespace Directives (Use, Namespace)
// =============================================================================

use_statement
    : USE qualified_name use_tail? SEMICOLON
    ;

use_tail
    : DOUBLE_COLON use_selector
    | use_alias
    ;

use_selector
    : STAR                                                                     // use foo::*
    | IDENTIFIER use_alias?                                                    // use foo::bar (as baz)?
    | OPEN_BRACE use_selector_item (COMMA use_selector_item)* COMMA? CLOSE_BRACE  // use foo::{a, b}
    ;

use_selector_item
    : IDENTIFIER use_alias?
    | STAR
    ;

use_alias
    : AS IDENTIFIER
    ;

// -----------------------------------------------------------------------------
// Tag System
// -----------------------------------------------------------------------------
tag_statement
    : visibility_modifier? TAG tag_declaration AS IDENTIFIER SEMICOLON
    ;

tag_declaration
    : type
    | OPEN_BRACE tag_enumeration CLOSE_BRACE
    | OPEN_BRACE tag_expression CLOSE_BRACE
    ;

tag_enumeration
    : type (COMMA type)*
    ;

tag_expression
    : OPEN_PARENS tag_expression CLOSE_PARENS
    | BANG tag_expression
    | tag_expression (AMP) tag_expression
    | tag_expression (PIPE) tag_expression
    | tag_expression (MINUS) tag_expression
    | type
    ;

namespace_declaration
    : NAMESPACE qualified_name (
        OPEN_BRACE top_level_declaration* CLOSE_BRACE
        | SEMICOLON
    )
    ;

qualified_name
    : IDENTIFIER ((DOUBLE_COLON | DOT) IDENTIFIER)*
    ;

enum_declaration
    : attribute* visibility_modifier? ENUM IDENTIFIER type_parameters? enum_body
    ;

enum_body
    : OPEN_BRACE enum_variant (COMMA enum_variant)* COMMA? CLOSE_BRACE
    ;

enum_variant
    : IDENTIFIER (OPEN_PARENS enum_payload_list CLOSE_PARENS)?
    ;

enum_payload_list
    : enum_payload_item (COMMA enum_payload_item)*
    ;

enum_payload_item
    : type field_ident
    ;

// Identifiers that can be keywords in field-name positions (soft keywords)
field_ident
    : IDENTIFIER
    | VALUE
    | LET
    | STR
    ;

// Wider set: any identifier-like token including control-flow and type keywords used as member names
plain_ident
    : IDENTIFIER
    | VALUE
    | LET
    | STR
    | SELF
    | KEEPS
    | DROPS
    | MUTATES
    | INOUT
    | UNION
    | MATCH
    | BOX_KW
    ;

//=============================================================================
// Top-Level Declarations
// =============================================================================

top_level_declaration
    : use_statement
    | tag_statement
    | enum_declaration
    | let_declaration
    | const_declaration
    | variable_declaration
    | method_declaration
    | type_declaration
    | trait_declaration
    | impl_declaration
    | union_declaration
    | namespace_declaration
    | extern_declaration
    ;

// let IDENTIFIER : type = expr;  (compile-time constant / immutable binding)
let_declaration
    : LET IDENTIFIER (COLON type)? ASSIGNMENT expression SEMICOLON
    ;

//=============================================================================
// Statements
// =============================================================================

statement
    : use_statement
    | tag_statement
    | const_declaration
    | let_declaration
    | variable_declaration
    | statement_block
    | labeled_statement
    | if_statement
    | for_statement
    | while_statement
    | foreach_statement
    | return_statement
    | break_statement
    | continue_statement
    | match_statement
    | expression_statement
    ;

// Match used as a statement (no semicolon needed after closing brace)
match_statement
    : match_expression SEMICOLON?
    ;

// Labeled statement for labeled break: outer: for (...) { ... }
labeled_statement
    : IDENTIFIER COLON statement
    ;

break_statement
    : BREAK IDENTIFIER? SEMICOLON
    ;

continue_statement
    : CONTINUE IDENTIFIER? SEMICOLON
    ;


expression_statement
    : expression SEMICOLON
    ;

expression_block
    : OPEN_BRACE statement* expression? CLOSE_BRACE
    ;

// Used for loops, if-statements (when used as statements), etc.
statement_block
    : OPEN_BRACE block_statements CLOSE_BRACE
    ;

block_statements
    : statement*
    ;

if_expression
    : IF (parenthesized_expression | expression) expression_block (ELSE if_expression | ELSE expression_block)?
    ;

if_statement
    : IF parenthesized_expression statement (ELSE statement)?
    ;

match_expression
    : MATCH expression match_body
    ;

for_statement
    : FOR (traditional_for_control | range_for_control) statement
    ;

// for (type id in range_expr) stmt  — range-based for
range_for_control
    : OPEN_PARENS (VAR | LET | type) (IDENTIFIER | UNDERSCORE) IN expression CLOSE_PARENS
    ;

traditional_for_control
    : OPEN_PARENS for_initializer? expression? SEMICOLON for_iterator? CLOSE_PARENS
    ;

for_initializer
    : variable_declaration
    | expression_list
    ;

for_iterator
    : expression_list
    ;

while_statement
    : WHILE parenthesized_expression statement
    ;

foreach_statement
    : FOREACH foreach_control statement
    ;

foreach_control
    : OPEN_PARENS foreach_binding IN expression CLOSE_PARENS
    ;

foreach_binding
    : (VAR | LET | type) (IDENTIFIER | UNDERSCORE)                                                      // simple
    | OPEN_PARENS foreach_tuple_elem (COMMA foreach_tuple_elem)+ CLOSE_PARENS  // tuple destructure
    ;

foreach_tuple_elem
    : type (IDENTIFIER | UNDERSCORE)
    ;

return_statement
    : RETURN expression? SEMICOLON
    ;

match_body
    : OPEN_BRACE match_arm (COMMA match_arm)* COMMA? CLOSE_BRACE
    ;

match_arm
    : pattern (IF expression)? FAT_ARROW expression
    ;

// Pattern: typed binding, enum-variant destructure, literal, wildcard, tuple, or none
pattern
    : NONE                                                                         // none pattern
    | UNDERSCORE                                                                    // wildcard
    | literal                                                                       // literal value
    | type_binding_pattern                                                          // type + name: e.g. "str s", "i32 n", "UserRecord u"
    | variant_pattern                                                               // EnumName.Variant(args)
    | qualified_name                                                                // bare variant ref: Color.Red
    | OPEN_PARENS tuple_pattern_elem (COMMA tuple_pattern_elem)+ CLOSE_PARENS      // tuple pattern
    ;

// typed binding: predefined_type or single-identifier user type, followed by binding name
type_binding_pattern
    : simple_pattern_type (IDENTIFIER | UNDERSCORE)
    ;

// Types that can appear in a binding pattern (no ambiguity with qualified_name)
simple_pattern_type
    : predefined_type
    | IDENTIFIER                  // single user-defined type name (two-identifier lookahead)
    ;

// Enum/union variant with destructuring: Enum.Variant(typed_args...)
variant_pattern
    : qualified_name OPEN_PARENS variant_pattern_arg (COMMA variant_pattern_arg)* CLOSE_PARENS
    ;

variant_pattern_arg
    : variant_pattern                        // nested variant: Result.Err(Inner.Variant(_))
    | type (IDENTIFIER | UNDERSCORE)    // typed binding in variant
    | UNDERSCORE                         // plain wildcard
    | literal                            // literal in variant
    ;

tuple_pattern_elem
    : type (IDENTIFIER | UNDERSCORE)    // typed binding
    | literal                            // literal value
    | UNDERSCORE                         // wildcard
    ;

//=============================================================================
// Member Declarations
//=============================================================================

// -----------------------------------------------------------------------------
// Attributes
// -----------------------------------------------------------------------------

/**
 * A compile-time attribute annotation attached to a declaration.
 * Syntax: #[path] or #[path(args)]
 * Examples: #[test], #[doc("Hello")], #[std::derive(Eq, Hash)]
 */
attribute
    : HASH OPEN_BRACKET attribute_path arguments? CLOSE_BRACKET
    ;

attribute_path
    : IDENTIFIER (DOUBLE_COLON IDENTIFIER)*
    ;

// -----------------------------------------------------------------------------
// Constants & Variables
// -----------------------------------------------------------------------------
const_declaration
    : attribute* CONST variable_declaration
    ;

variable_declaration
    : modifiers CONST? backlink_modifier? (VAR | LET) OPEN_PARENS tuple_decl_elem (COMMA tuple_decl_elem)+ CLOSE_PARENS ASSIGNMENT expression SEMICOLON  // var (x, y) = ...
    | modifiers CONST? backlink_modifier? (VAR | LET | type) variable_declarators SEMICOLON
    ;

tuple_decl_elem
    : type? plain_ident
    ;

visibility_modifier
    : PUB
    | PRIV
    | PRIVATE
    ;

cvt_modifier
    : KEEPS
    | DROPS
    | MUTATES
    | INOUT
    ;

backlink_modifier
    : BACKLINK
    ;

modifiers
    : (visibility_modifier | STATIC | VALUE)*
    ;

field_declaration
    : attribute* variable_declaration
    ;

variable_declarators
    : variable_declarator (COMMA variable_declarator)*
    ;

variable_declarator
    : plain_ident (ASSIGNMENT nonAssignmentExpression)?
    ;

method_declaration
    : attribute* modifiers return_type plain_ident type_parameters? parameters method_body
    ;

constructor_declaration
    : attribute* visibility_modifier? IDENTIFIER parameters statement_block
    ;

parameters
    : OPEN_PARENS parameter_list? CLOSE_PARENS
    ;

parameter_list
    : parameter (COMMA parameter)*
    ;

parameter
    : cvt_modifier? type field_ident (ASSIGNMENT expression)?
    ;

method_body
    : expression_block
    | FAT_ARROW expression SEMICOLON?
    | SEMICOLON
    ;

operator_declaration
    : attribute* return_type OPERATOR overloadable_operator parameters method_body
    ;

overloadable_operator
    : PLUS
    | MINUS
    | STAR
    | '/'
    | PERCENT
    | '^'
    | AMP
    | '|'
    | LT LT
    | GT GT
    | OP_EQ
    | OP_NE
    | OPEN_BRACKET CLOSE_BRACKET
    | OPEN_BRACKET CLOSE_BRACKET ASSIGNMENT
    ;

//=============================================================================
// Type Definition Declarations
// =============================================================================

type_declaration
    : attribute* visibility_modifier? VALUE? TYPE IDENTIFIER type_parameters? type_body
    ;

type_body
    : OPEN_BRACE type_member* CLOSE_BRACE
    ;

type_member
    : field_declaration
    ;

trait_declaration
    : attribute* TRAIT IDENTIFIER type_parameters? trait_supers? trait_body
    ;

trait_supers
    : COLON type (PLUS type)*
    ;

trait_body
    : trait_block
    | method_declaration
    ;

trait_block
    : OPEN_BRACE trait_member* CLOSE_BRACE
    ;

trait_member
    : method_declaration
    ;

union_declaration
    : attribute* TAGGED? UNION IDENTIFIER type_parameters? union_body
    ;

union_body
    : OPEN_BRACE union_variant (COMMA union_variant)* COMMA? CLOSE_BRACE
    ;

union_payload
    : OPEN_PARENS parameter (COMMA parameter)* CLOSE_PARENS
    ;

union_variant
    : IDENTIFIER union_payload?
    ;

impl_declaration
    : attribute* IMPL type_with_params (FOR type (COMMA type)*)? (impl_block | SEMICOLON)
    ;

// Type optionally followed by type parameters for generic impl: Pair<A, B>
type_with_params
    : type type_parameters?
    ;

impl_block
    : OPEN_BRACE impl_member* CLOSE_BRACE
    ;

impl_member
    : method_declaration
    | operator_declaration
    ;

//=============================================================================
// Core Types and Generics
// =============================================================================

return_type
    : VOID
    | SELF
    | type
    ;

type
    : (IDENTIFIER COLON)? base_type type_suffix*
    ;

type_suffix
    : rank_specifier
    | INTERR
    ;

base_type
    : class_type
    | predefined_type
    | tuple_type
    ;

tuple_type
    : OPEN_PARENS tuple_type_element (COMMA tuple_type_element)* CLOSE_PARENS
    ;

tuple_type_element
    : type IDENTIFIER?
    ;

class_type
    : BOX_KW type_argument_list
    | qualified_name type_argument_list?
    ;

predefined_type
    : BOOL
    | CHAR
    | STR
    | VOID
    | numeric_type
    ;

numeric_type
    : integral_type
    | floating_point_type
    ;

integral_type
    : INT8
    | INT16
    | INT32
    | INT64
    | INT128
    | UINT8
    | UINT16
    | UINT32
    | UINT64
    | UINT128
    ;

floating_point_type
    : F32
    | F64
    | DECIMAL
    ;

rank_specifier
    : OPEN_BRACKET (expression)? COMMA* CLOSE_BRACKET
    ;

generic_parameter
    : type IDENTIFIER         // const generic param: i32 N
    | IDENTIFIER (COLON constraint_list)?   // type param: T or T: Bound1 + Bound2
    ;

constraint_list
    : constraint (PLUS constraint)*
    ;

constraint
    : qualified_name type_argument_list?   // trait name, possibly generic
    ;

type_parameters
    : LT generic_parameter (COMMA generic_parameter)* GT  // same as type_argument_list
    ;
type_argument_list
    : LT type_or_const_arg (COMMA type_or_const_arg)* nested_gt
    ;

type_or_const_arg
    : type
    | literal
    ;

nested_gt
    : GT          // Closes one level
    | GT nested_gt // Recursively closes multiple levels
    ;

//=============================================================================
// Expression Hierarchy
// =============================================================================

tuple_literal
    : OPEN_PARENS argument (COMMA argument)+ CLOSE_PARENS
    | OPEN_PARENS argument COMMA CLOSE_PARENS
    ;

parenthesized_expression
    : OPEN_PARENS expression CLOSE_PARENS
    ;

nonAssignmentExpression
    : ternary_expression
    ;

expression
    : assignment_expression
    ;

assignment_expression
    : ternary_expression (assignment_operator assignment_expression)?
    ;

ternary_expression
    : null_coalescing_expression INTERR expression COLON ternary_expression  // ternary: cond ? true : false
    | null_coalescing_expression INTERR                                      // result propagation: expr?
    | null_coalescing_expression
    ;

null_coalescing_expression
    : range_expression (OP_COALESCING null_coalescing_expression)?
    ;

range_expression
    : binary_or_expression (range_operator binary_or_expression)?
    ;

range_operator
    : OP_RANGE
    | OP_RANGE_INC
    | OP_RANGE_DESC_EX
    | OP_RANGE_DESC_INC
    ;


assignment_operator
    : ASSIGNMENT
    | OP_ADD_ASSIGNMENT
    | OP_SUB_ASSIGNMENT
    | OP_MULT_ASSIGNMENT
    | OP_POW_ASSIGNMENT
    | OP_DIV_ASSIGNMENT
    | OP_MOD_ASSIGNMENT
    | OP_AND_ASSIGNMENT
    | OP_OR_ASSIGNMENT
    | OP_XOR_ASSIGNMENT
    | OP_LEFT_SHIFT_ASSIGNMENT
    ;

binary_or_expression
    : binary_and_expression (OP_OR binary_and_expression)*
    ;

binary_and_expression
    : inclusive_or_expression (OP_AND inclusive_or_expression)*
    ;

inclusive_or_expression
    : exclusive_or_expression ('|' exclusive_or_expression)*
    ;

exclusive_or_expression
    : and_expression ('^' and_expression)*
    ;

and_expression
    : equality_expression ('&' equality_expression)*
    ;

equality_expression
    : relational_expression ((OP_EQ | OP_NE) relational_expression)*
    ;

relational_expression
    : shift_expression (
        (LT | GT | OP_LE | OP_GE) shift_expression
        | IS type (IDENTIFIER)?
    )?
    ;

shift_expression
    : additive_expression (
        (left_shift | right_shift) additive_expression
    )*
    ;

left_shift: LT LT;
right_shift: GT GT;

additive_expression
    : multiplicative_expression (('+' | '-') multiplicative_expression)*
    ;

multiplicative_expression
    : exponentiation_expression (('*' | '/' | '%') exponentiation_expression)*
    ;

exponentiation_expression
    : unary_expression ('**' exponentiation_expression)?
    ;

unary_expression
    : cast_expression
    | ('+' | '-' | '!' | '~') unary_expression
    | AMP unary_expression         // address-of for inout arguments: &x
    | primary_expression
    ;

cast_expression
    : OPEN_PARENS type CLOSE_PARENS unary_expression
    ;

primary_expression
    : primary_expression_start (postfix_operator)*
    ;

primary_expression_start
    : literal
    | parenthesized_expression
    | tuple_literal
    | if_expression
    | match_expression
    | expression_block
    | lambda_expression
    | struct_literal_expression
    | SELF
    | THIS
    | NONE
    | VOID                         // void as a value in expression context (e.g. Result.Ok(void))
    | BOX_KW                      // Box used as expression start (e.g. Box.of(x))
    | array_literal
    | IDENTIFIER type_argument_list    // generic type reference: ArrayList<T>
    | qualified_name type_argument_list  // qualified generic: std::HashMap<K, V>
    | plain_ident
    | qualified_name
    ;

// Struct literal: TypeName { field1: val1, field2: val2 }
// Also handles generic struct literals: Pair<A, B> { ... }
struct_literal_expression
    : (qualified_name type_argument_list | qualified_name) OPEN_BRACE (struct_field_init (COMMA struct_field_init)* COMMA?)? CLOSE_BRACE
    ;

struct_field_init
    : plain_ident COLON expression
    ;

// Lambda expression: |param, param| => expr  or  |param, param| { body }
lambda_expression
    : PIPE (lambda_param (COMMA lambda_param)*)? PIPE method_body
    ;

lambda_param
    : type IDENTIFIER
    ;

postfix_operator
    : DOT plain_ident type_argument_list OPEN_PARENS argument_list? CLOSE_PARENS  // generic method call: .tryCast<i32>()
    | DOT plain_ident                                                  // field/method access
    | DOT INTEGER_LITERAL                                              // tuple element access: .0 .1
    | DOT REAL_LITERAL                                                 // nested tuple: .0.0 (lexer bonds 0.0)
    | OP_OPTIONAL_CHAIN plain_ident                                    // optional chain: ?.field
    | OP_OPTIONAL_CHAIN OPEN_PARENS argument_list? CLOSE_PARENS       // optional call: ?.method()
    | OPEN_PARENS argument_list? CLOSE_PARENS                          // call: foo()
    | OPEN_BRACKET expression_list CLOSE_BRACKET                      // index: arr[i]
    | OP_INC                                                           // post-increment
    | OP_DEC                                                           // post-decrement
    | BANG                                                             // force unwrap: val!
    ;

array_literal
    : OPEN_BRACKET (expression (COMMA expression)* COMMA?)? CLOSE_BRACKET
    ;

expression_list
    : expression (COMMA expression)*
    ;

arguments
    : OPEN_PARENS argument_list? CLOSE_PARENS
    ;

argument_list
    : argument (COMMA argument)*
    ;

// =============================================================================
// Argument Forms
// =============================================================================

namedArgument
    : plain_ident COLON expression
    ;

positionalArgument
    : nonAssignmentExpression
    ;

argument
    : namedArgument
    | positionalArgument
    ;

// =============================================================================
// Literals
// =============================================================================

literal
    : TRUE
    | FALSE
    | INTEGER_LITERAL
    | HEX_INTEGER_LITERAL
    | BIN_INTEGER_LITERAL
    | REAL_LITERAL
    | CHARACTER_LITERAL
    | string_literal
    | LITERAL_ACCESS
    ;

string_literal
    : REGULAR_STRING
    | VERBATIUM_STRING
    | interpolated_regular_string
    ;

interpolated_regular_string
    : INTERPOLATED_REGULAR_STRING_START interpolated_regular_string_part* DOUBLE_QUOTE_INSIDE
    ;

interpolated_regular_string_part
    : interpolated_string_expression
    | DOUBLE_CURLY_INSIDE
    | REGULAR_CHAR_INSIDE
    | REGULAR_STRING_INSIDE
    ;

interpolated_string_expression
    : expression (COMMA expression)* (COLON FORMAT_STRING+)?
    ;