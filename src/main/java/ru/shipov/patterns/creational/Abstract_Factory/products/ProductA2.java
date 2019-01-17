package ru.shipov.patterns.creational.Abstract_Factory.products;

public class ProductA2 implements AbstractProductA {
    private final String name;

    public ProductA2(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
