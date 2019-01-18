package ru.shipov.patterns.creational.Prototype;

public class ConcretePrototype2 extends Prototype {

    ConcretePrototype2(String name) {
        this.name = name;
    }

    @Override
    protected ConcretePrototype2 clone() throws CloneNotSupportedException {
        return (ConcretePrototype2) super.clone();
    }
}
