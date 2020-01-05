package ru.shipov.patterns.behavioral.Interpreter;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        NonterminalExpression nonterminal = new NonterminalExpression();
        TerminalExpression terminal = new TerminalExpression();

        Stream.of(nonterminal, terminal).forEach(expression ->
                expression.interpret(context));
    }
}
