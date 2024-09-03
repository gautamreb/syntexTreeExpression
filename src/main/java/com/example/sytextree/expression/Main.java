package com.example.sytextree.expression;

public class Main {
    public static void main(String[] args) {
        String expression = "3 5 + 4 2 - /";
        Expression syntaxTree = ExpressionFactory.buildExpressionTree(expression);

        ExpressionEvaluation evaluation = new ExpressionEvaluation();
        try {
            double result =syntaxTree.accept(evaluation);
            System.out.println("Evaluation result: " + result);

        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        DivisionByZeroDetection detector = new DivisionByZeroDetection();
        syntaxTree.accept(detector);
    }
}