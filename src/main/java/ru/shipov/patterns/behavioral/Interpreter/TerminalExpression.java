package ru.shipov.patterns.behavioral.Interpreter;

public class TerminalExpression implements Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("Terminal expression with context " + context.toString());
    }
}
