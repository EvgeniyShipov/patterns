package ru.shipov.patterns.creational.Abstract_Factory.factories;

import ru.shipov.patterns.creational.Abstract_Factory.products.*;

public class ConcreteFactory2 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA2("ProductA2 from ConcreteFactory2");
    }

    public AbstractProductB createProductB() {
        return new ProductB2("ProductB2 from ConcreteFactory2");
    }
}
