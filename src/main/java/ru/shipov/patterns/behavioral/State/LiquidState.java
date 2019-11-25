package ru.shipov.patterns.behavioral.State;

class LiquidState implements State {

    private static final String NAME = "liquid";

    public String getName() {
        return NAME;
    }

    public void freeze(StateContext context) {
        context.setState(new SolidState());
    }

    public void heat(StateContext context) {
        context.setState(new GaseousState());
    }

}
