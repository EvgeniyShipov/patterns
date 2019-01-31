package ru.shipov.patterns.behavioral.Chain_of_Responsibility;

public class ConcreteHandler2 implements Handler {

    private Handler nextHandler;

    public ConcreteHandler2(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleMessage() {
        System.out.println("ConcreteHandler2");
        if (nextHandler != null) {
            nextHandler.handleMessage();
        }
    }
}
