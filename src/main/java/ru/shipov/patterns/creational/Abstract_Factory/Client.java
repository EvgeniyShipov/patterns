package ru.shipov.patterns.creational.Abstract_Factory;

import ru.shipov.patterns.creational.Abstract_Factory.factories.AbstractFactory;
import ru.shipov.patterns.creational.Abstract_Factory.factories.ConcreteFactory1;
import ru.shipov.patterns.creational.Abstract_Factory.factories.ConcreteFactory2;
import ru.shipov.patterns.creational.Abstract_Factory.products.AbstractProductA;
import ru.shipov.patterns.creational.Abstract_Factory.products.AbstractProductB;

public class Client {

    private final AbstractProductA productA;
    private final AbstractProductB productB;

    private Client(AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public static void main(String[] args) {
        Client client1 = new Client(new ConcreteFactory1());
        client1.productA.printName();
        client1.productB.printName();

        Client client2 = new Client(new ConcreteFactory2());
        client2.productA.printName();
        client2.productB.printName();
    }
}
