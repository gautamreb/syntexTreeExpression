package com.example.sytextree.expression;

public interface Expression {
    double accept(ExpressionVisitor visitor);
}
