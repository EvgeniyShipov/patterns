package ru.shipov.patterns.creational.Factory_Method;

public class ConcreteCreatorB extends Creator {
    protected Product factoryMethod() {
        return new ConcreteProductB();
    }
}
