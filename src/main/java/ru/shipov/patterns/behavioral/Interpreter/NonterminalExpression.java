package ru.shipov.patterns.behavioral.Interpreter;

public class NonterminalExpression implements Expression {
    @Override
    public void interpret(Context context) {
        System.out.println("Nonterminal expression with context " + context.toString());
    }
}
