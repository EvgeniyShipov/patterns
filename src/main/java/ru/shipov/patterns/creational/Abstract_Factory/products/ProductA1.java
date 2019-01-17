package ru.shipov.patterns.creational.Abstract_Factory.products;

public class ProductA1 implements AbstractProductA {
    private final String name;

    public ProductA1(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
