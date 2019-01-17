package ru.shipov.patterns.creational.Abstract_Factory.products;

public class ProductB1 implements AbstractProductB {
    private final String name;

    public ProductB1(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
