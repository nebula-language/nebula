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
    : attribute* ENUM IDENTIFIER enum_block
    ;

enum_block
    : OPEN_BRACE IDENTIFIER (COMMA IDENTIFIER)* CLOSE_BRACE
    ;

//=============================================================================
// Top-Level Declarations
// =============================================================================

top_level_declaration
    : use_statement
    | tag_statement
    | enum_declaration
    | const_declaration
    | method_declaration
    | type_declaration
    | trait_declaration
    | impl_declaration
    | union_declaration
    | namespace_declaration
    | extern_declaration
    ;

//=============================================================================
// Statements
// =============================================================================

statement
    : use_statement
    | tag_statement
    | const_declaration
    | variable_declaration
    | statement_block
    | if_statement
    | for_statement
    | while_statement
    | foreach_statement
    | return_statement
    | break_statement
    | continue_statement
    | expression_statement
    ;

break_statement
    : BREAK SEMICOLON
    ;

continue_statement
    : CONTINUE SEMICOLON
    ;


expression_statement
    : expression SEMICOLON
    ;

expression_block
    : OPEN_BRACE block_statements block_tail? CLOSE_BRACE
    ;

// Used for loops, if-statements (when used as statements), etc.
statement_block
    : OPEN_BRACE block_statements CLOSE_BRACE
    ;

block_statements
    : statement*
    ;

block_tail
    : expression    // expression block
    ;

if_expression
    : IF parenthesized_expression expression_block ELSE expression_block
    ;

if_statement
    : IF parenthesized_expression statement (ELSE statement)?
    ;

match_expression
    : MATCH parenthesized_expression match_body
    ;

for_statement
    : FOR (traditional_for_control | parenthesized_expression) statement
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
    : FOREACH foreach_control statement_block
    ;

foreach_control
    : OPEN_PARENS (VAR | type) IDENTIFIER IN expression CLOSE_PARENS
    ;

return_statement
    : RETURN expression? SEMICOLON
    ;

match_body
    : OPEN_BRACE match_arm (COMMA match_arm)* COMMA? CLOSE_BRACE
    ;

match_arm
    : pattern FAT_ARROW expression
    ;

pattern
    : pattern_or
    ;

pattern_or
    : pattern_atom (PIPE pattern_atom)*
    ;

pattern_atom
    : literal
    | UNDERSCORE
    | destructuring_pattern
    | qualified_name
    | tuple_pattern
    | parenthesized_pattern
    ;

destructuring_pattern
    : qualified_name OPEN_PARENS binding_list CLOSE_PARENS
    ;

binding_list
    : (IDENTIFIER | UNDERSCORE) (COMMA (IDENTIFIER | UNDERSCORE))*
    ;

tuple_pattern
    : OPEN_PARENS pattern_atom (COMMA pattern_atom)+ CLOSE_PARENS
    ;

parenthesized_pattern
    : OPEN_PARENS pattern CLOSE_PARENS
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
    : modifiers CONST? backlink_modifier? (VAR | type) variable_declarators SEMICOLON
    ;

visibility_modifier
    : PUBLIC
    | PRIVATE
    | PROTECTED
    ;

cvt_modifier
    : KEEPS
    | DROPS
    | MUTATES
    ;

backlink_modifier
    : BACKLINK
    ;

modifiers
    : (visibility_modifier | STATIC)*
    ;

field_declaration
    : attribute* variable_declaration
    ;

variable_declarators
    : variable_declarator (COMMA variable_declarator)*
    ;

variable_declarator
    : IDENTIFIER (ASSIGNMENT nonAssignmentExpression)?
    ;

method_declaration
    : attribute* modifiers return_type IDENTIFIER type_parameters? parameters method_body
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
    : cvt_modifier? type IDENTIFIER (ASSIGNMENT expression)?
    ;

method_body
    : expression_block
    | FAT_ARROW expression
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
    : attribute* visibility_modifier? TYPE IDENTIFIER type_parameters? type_body
    ;

type_body
    : OPEN_BRACE type_member* CLOSE_BRACE
    ;

type_member
    : field_declaration
    ;

trait_declaration
    : attribute* TRAIT IDENTIFIER type_parameters? trait_body
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
    : OPEN_PARENS parameter CLOSE_PARENS
    ;

union_variant
    : IDENTIFIER union_payload?
    ;

impl_declaration
    : attribute* IMPL type (FOR type (COMMA type)*)? (impl_block | SEMICOLON)
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
    : qualified_name type_argument_list?
    ;

predefined_type
    : BOOL
    | CHAR
    | STRING
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
    | UINT8
    | UINT16
    | UINT32
    | UINT64
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
    : IDENTIFIER (COLON constraint)?
    ;

constraint
    : IDENTIFIER
    ;

type_parameters
    : LT generic_parameter (COMMA generic_parameter)* GT  // same as type_argument_list
    ;
type_argument_list
    : LT type (COMMA type)* nested_gt
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
    : null_coalescing_expression
    ;

expression
    : assignment_expression
    ;

assignment_expression
    : null_coalescing_expression (assignment_operator assignment_expression)?
    ;

null_coalescing_expression
    : binary_or_expression (OP_COALESCING null_coalescing_expression)?
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
    | THIS
    | NONE
    | array_literal
    | IDENTIFIER type_argument_list    // generic type reference: ArrayList<T>
    | qualified_name type_argument_list  // qualified generic: std::HashMap<K, V>
    | IDENTIFIER
    | qualified_name
    ;

postfix_operator
    : DOT IDENTIFIER
    | DOT INTEGER_LITERAL
    | OP_OPTIONAL_CHAIN IDENTIFIER
    | OP_OPTIONAL_CHAIN OPEN_PARENS argument_list? CLOSE_PARENS
    | OPEN_PARENS argument_list? CLOSE_PARENS
    | OPEN_BRACKET expression_list CLOSE_BRACKET
    | OP_INC
    | OP_DEC
    | BANG
    ;

array_literal
    : OPEN_BRACKET expression_list? CLOSE_BRACKET
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
    : IDENTIFIER COLON expression
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