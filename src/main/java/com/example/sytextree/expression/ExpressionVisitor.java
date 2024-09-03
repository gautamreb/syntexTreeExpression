package com.example.sytextree.expression;

public interface ExpressionVisitor {
    double visitOperand(Operand op);
    double visitAddition(Addition addition);
    double visitSubtraction(Subtraction subtraction);

    double visitMultiplication(Multiplication multiplication);

    double visitDivision(Division division);
}
