package org.nebula.nebc.ast;

public enum BinaryOperator
{
	ADD, SUB, MUL, DIV, MOD, POW,
	BIT_AND, BIT_OR, BIT_XOR, SHL, SHR,
	LOGICAL_AND, LOGICAL_OR,
	EQ, NE, LT, GT, LE, GE,
	RANGE, RANGE_INC, RANGE_DESC_EX, RANGE_DESC_INC
}