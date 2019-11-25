package ru.shipov.patterns.behavioral.State;

import static ru.shipov.patterns.behavioral.State.State.SOLID;

public class StateContext {

    private State state = SOLID;

    public void freeze() {
        System.out.println("Freezing " + state.getName() + " substance...");
        state.freeze(this);
    }

    public void heat() {
        System.out.println("Heating " + state.getName() + " substance...");
        state.heat(this);
    }

    public void setState(State state) {
        System.out.println("Changing state to " + state.getName() + "...");
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
