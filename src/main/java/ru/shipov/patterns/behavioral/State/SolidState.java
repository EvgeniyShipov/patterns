package ru.shipov.patterns.behavioral.State;

class SolidState implements State {

    private static final String NAME = "solid";

    public String getName() {
        return NAME;
    }

    public void freeze(StateContext context) {
        System.out.println("Nothing happens.");
    }

    public void heat(StateContext context) {
        context.setState(new LiquidState());
    }

}
