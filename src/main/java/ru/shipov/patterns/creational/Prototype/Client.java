package ru.shipov.patterns.creational.Prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype1 = new ConcretePrototype1("prototype1");
        Prototype clone1 = prototype1.clone();
        System.out.println("Clone " + clone1.getName());

        Prototype prototype2 = new ConcretePrototype2("prototype2");
        Prototype clone2 = prototype2.clone();
        System.out.println("Clone " + clone2.getName());
    }
}
