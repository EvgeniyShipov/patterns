package ru.shipov.patterns.behavioral.State;

public class Main {

    public static void main(String[] args) {

        StateContext context = new StateContext();
        context.heat();
        context.heat();
        context.heat();
        context.freeze();
        context.freeze();
        context.freeze();
    }
}
