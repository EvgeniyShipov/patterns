package ru.shipov.patterns.creational.Abstract_Factory.products;

public class ProductB implements AbstractProductB {
    private final String name;

    public ProductB(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
