package ru.shipov.patterns.behavioral.Chain_of_Responsibility;

public class ConcreteHandler1 implements Handler {

    private Handler nextHandler;

    public ConcreteHandler1(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleMessage() {
        System.out.println("ConcreteHandler1");
        if (nextHandler != null) {
            nextHandler.handleMessage();
        }
    }
}
