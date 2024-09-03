package com.example.sytextree.expression;

public class DivisionByZeroDetection implements ExpressionVisitor{

    @Override
    public double visitOperand(Operand op) {
        return op.getValue();
    }

    @Override
    public double visitAddition(Addition addition) {
        addition.getLeft().accept(this);
        addition.getRight().accept(this);
        return 0;
    }

    @Override
    public double visitSubtraction(Subtraction subtraction) {
        subtraction.getLeft().accept(this);
        subtraction.getRight().accept(this);
        return 0;
    }

    @Override
    public double visitMultiplication(Multiplication multiplication) {
        multiplication.getLeft().accept(this) ;
        multiplication.getRight().accept(this);
        return  0;
    }

    @Override
    public double visitDivision(Division division) {
        double rightValue = division.getRight().accept(this);
        if(rightValue == 0) {
            System.out.println("Division by zero detected in expression :"+ division);
        }
        division.getLeft().accept(this);
        return 0;
    }
}
