package com.example.sytextree.expression;

public class Division extends Operator{
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double accept(ExpressionVisitor visitor) {
        return visitor.visitDivision(this);
    }
}
