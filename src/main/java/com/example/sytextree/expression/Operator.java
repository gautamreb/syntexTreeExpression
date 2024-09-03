package com.example.sytextree.expression;

public abstract class Operator implements Expression{
    protected Expression left;
    protected Expression right;
    public Operator(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    public Expression getLeft(){return left;}
    public Expression getRight(){return right;}

    @Override
    public abstract double accept(ExpressionVisitor visitor);

}
