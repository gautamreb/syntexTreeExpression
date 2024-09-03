package com.example.sytextree.expression;

import java.util.Stack;

public class ExpressionFactory {
    public static Expression buildExpressionTree(String expression){
        Stack<Expression> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        for(String token : tokens){
            if(isOperator(token)) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(createOperator(token, left, right));
            }else{
                stack.push(new Operand(Double.parseDouble(token)));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    private static Operator createOperator(String token, Expression left, Expression right){
        switch(token){
            case "+": return new Addition(left, right);
            case "-": return new Subtraction(left,right);
            case "*": return new Multiplication(left,right);
            case "/": return new Division(left, right);
            default: throw new IllegalArgumentException ("Unknown Operator: " + token);
        }
    }
}
