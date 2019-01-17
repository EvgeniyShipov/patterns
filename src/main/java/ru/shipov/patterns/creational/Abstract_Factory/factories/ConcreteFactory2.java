package ru.shipov.patterns.creational.Abstract_Factory.factories;

import ru.shipov.patterns.creational.Abstract_Factory.products.AbstractProductA;
import ru.shipov.patterns.creational.Abstract_Factory.products.AbstractProductB;
import ru.shipov.patterns.creational.Abstract_Factory.products.ProductA;
import ru.shipov.patterns.creational.Abstract_Factory.products.ProductB;

public class ConcreteFactory2 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA("ProductA from ConcreteFactory2");
    }

    public AbstractProductB createProductB() {
        return new ProductB("ProductB from ConcreteFactory2");
    }
}
