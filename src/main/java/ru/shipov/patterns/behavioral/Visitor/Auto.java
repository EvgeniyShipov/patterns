package ru.shipov.patterns.behavioral.Visitor;

public abstract class Auto {

    private final String model;

    public Auto(String model) {
        this.model = model;
    }

    public abstract void accept(Visitor visitor);

    public String getModel() {
        return model;
    }
}
