package ru.shipov.patterns.behavioral.State;

public enum State {

    SOLID("solid"),
    LIQUID("liquid"),
    GASEOUS("gaseous");

    private final String name;

    State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void freeze(StateContext context) {
        if (ordinal() == 0) {
            System.out.println("Nothing happens.");
        } else {
            context.setState(State.values()[ordinal() - 1]);
        }
    }

    void heat(StateContext context) {
        if (ordinal() == State.values().length - 1) {
            System.out.println("Nothing happens.");
        } else {
            context.setState(State.values()[ordinal() + 1]);
        }
    }
}
