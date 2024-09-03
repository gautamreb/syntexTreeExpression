package com.example.sytextree.expression;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ExpressionTests {
    @Test
    void testAddition() {
        Expression left = new Operand(3);
        Expression right = new Operand(5);
        Expression  addition = new Addition(left, right);
        ExpressionEvaluation evaluation = new ExpressionEvaluation();
        assertEquals(8, addition.accept(evaluation));
    }

    @Test
    void testDivisionByZero(){
        Expression left = new Operand(3);
        Expression right = new Operand(0);
        Expression division = new Division(left, right);
        ExpressionEvaluation evaluation = new ExpressionEvaluation();
        assertThrows(ArithmeticException.class, () -> division.accept(evaluation));
    }

    @Test
    void testDivisionByZeroDetection(){
        Expression left = new Operand(3);
        Expression right = new Operand(0);
        Expression division = new Division(left, right);
        DivisionByZeroDetection detection = new DivisionByZeroDetection();
        assertDoesNotThrow(() -> division.accept(detection));
    }

    @Test
    void tesExpressionFactory(){
        Expression expression = ExpressionFactory.buildExpressionTree("3 5 + 2 0 /");
        assertNotNull(expression);
    }
}
