package ru.shipov.patterns.creational.Factory_Method;

public class ConcreteCreatorA extends Creator {
    protected Product factoryMethod() {
        return new ConcreteProductA();
    }
}
