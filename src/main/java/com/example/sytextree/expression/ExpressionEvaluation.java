package com.example.sytextree.expression;

public class ExpressionEvaluation implements ExpressionVisitor{
    @Override
    public double visitOperand(Operand op) {
        return op.getValue();
    }

    @Override
    public double visitAddition(Addition addition) {
        return addition.getLeft().accept(this) + addition.getRight().accept(this);
    }

    @Override
    public double visitSubtraction(Subtraction subtraction) {
        return subtraction.getLeft().accept(this) - subtraction.getRight().accept(this);
    }

    @Override
    public double visitMultiplication(Multiplication multiplication) {
        return multiplication.getLeft().accept(this) * multiplication.getRight().accept(this);
    }

    @Override
    public double visitDivision(Division division) {
        double rightValue = division.getRight().accept(this);
        if(rightValue == 0) {
            throw new ArithmeticException("Division by zero Error");
        }
        return division.getLeft().accept(this) / rightValue;
    }
}
