package com.example.sytextree.expression;

public class Multiplication extends Operator{
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double accept(ExpressionVisitor visitor) {
        return visitor.visitMultiplication(this);
    }
}
