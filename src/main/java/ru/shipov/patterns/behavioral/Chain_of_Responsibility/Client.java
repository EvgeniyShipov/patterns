package ru.shipov.patterns.behavioral.Chain_of_Responsibility;

public class Client {

    public static void main(String[] args) {
        ConcreteHandler1 handler = new ConcreteHandler1(new ConcreteHandler2(null));
        handler.handleMessage();
    }
}
