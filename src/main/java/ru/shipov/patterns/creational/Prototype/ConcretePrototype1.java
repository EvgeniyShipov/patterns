package ru.shipov.patterns.creational.Prototype;

public class ConcretePrototype1 extends Prototype {

    ConcretePrototype1(String name) {
        this.name = name;
    }

    @Override
    protected ConcretePrototype1 clone() throws CloneNotSupportedException {
        return (ConcretePrototype1) super.clone();
    }
}
