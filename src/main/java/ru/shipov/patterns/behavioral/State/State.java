package ru.shipov.patterns.behavioral.State;

interface State {
    String getName();
    void freeze(StateContext context);
    void heat(StateContext context);
}