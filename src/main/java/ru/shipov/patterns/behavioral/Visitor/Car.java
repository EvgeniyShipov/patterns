package ru.shipov.patterns.behavioral.Visitor;

public class Car extends Auto {

    public Car(String model) {
        super(model);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
