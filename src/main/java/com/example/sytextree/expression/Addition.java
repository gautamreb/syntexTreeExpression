package com.example.sytextree.expression;

public class Addition extends Operator{
     public Addition(Expression left, Expression right){
         super(left, right);
     }

    @Override
    public double accept(ExpressionVisitor visitor) {
        return visitor.visitAddition(this);
    }
}
