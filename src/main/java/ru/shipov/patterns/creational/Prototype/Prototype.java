package ru.shipov.patterns.creational.Prototype;

abstract class Prototype implements Cloneable {

    String name;

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    String getName() {
        return name;
    }
}
