package ru.shipov.patterns.behavioral.Visitor;

public class Bus extends Auto {

    public Bus(String model) {
        super(model);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
