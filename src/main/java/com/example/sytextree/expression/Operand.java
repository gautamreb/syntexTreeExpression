package com.example.sytextree.expression;

public class Operand implements Expression{
    private final double value;
    public Operand(double value){ this.value = value; }

    public double getValue(){ return value; }

    @Override
    public double accept(ExpressionVisitor visitor){
        return visitor.visitOperand(this);
    }
}
