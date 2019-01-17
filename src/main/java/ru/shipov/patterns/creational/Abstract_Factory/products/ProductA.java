package ru.shipov.patterns.creational.Abstract_Factory.products;

public class ProductA implements AbstractProductA {
    private final String name;

    public ProductA(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
