package ru.shipov.patterns.creational.Abstract_Factory.products;

public class ProductB2 implements AbstractProductB {
    private final String name;

    public ProductB2(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}