package ru.shipov.patterns.creational.Builder;

public class ConcreteBuilder implements Builder {
    private String PartA;
    private String PartB;
    private String PartC;

    public void buildPartA() {
        this.PartA = "PartA from ConcreteBuilder";
    }

    public void buildPartB() {
        this.PartB = "PartB from ConcreteBuilder";
    }

    public void buildPartC() {
        this.PartC = "PartB from ConcreteBuilder";
    }

    Product getResult() {
        return new Product(PartA, PartB, PartC);
    }
}
