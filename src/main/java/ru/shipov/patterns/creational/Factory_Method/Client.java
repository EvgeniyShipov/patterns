package ru.shipov.patterns.creational.Factory_Method;

public class Client {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        System.out.println("Created " + productA.getClass().getSimpleName());

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        System.out.println("Created " + productB.getClass().getSimpleName());
    }
}
