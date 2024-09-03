package com.example.sytextree.expression;

public class Subtraction extends Operator{
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double accept(ExpressionVisitor visitor) {
        return visitor.visitSubtraction(this);
    }
}
