package ru.shipov.patterns.behavioral.State;

class GaseousState implements State {

    private static final String NAME = "gaseous";

    public String getName() {
        return NAME;
    }

    public void freeze(StateContext context) {
        context.setState(new LiquidState());
    }

    public void heat(StateContext context) {
        System.out.println("Nothing happens.");
    }

}
