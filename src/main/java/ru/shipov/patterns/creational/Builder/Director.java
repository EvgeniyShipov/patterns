package ru.shipov.patterns.creational.Builder;

public class Director {

    private Director() {
    }

    private void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder concreteBuilder1 = new ConcreteBuilder();
        director.construct(concreteBuilder1);
        Product result1 = concreteBuilder1.getResult();

        System.out.println(result1);
    }
}
