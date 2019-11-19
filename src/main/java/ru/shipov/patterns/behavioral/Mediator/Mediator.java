package ru.shipov.patterns.behavioral.Mediator;

public abstract class Mediator {

    public abstract void send(String message, Colleague sender);
}
