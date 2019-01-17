package ru.shipov.patterns.creational.Abstract_Factory.factories;

import ru.shipov.patterns.creational.Abstract_Factory.products.AbstractProductA;
import ru.shipov.patterns.creational.Abstract_Factory.products.AbstractProductB;
import ru.shipov.patterns.creational.Abstract_Factory.products.ProductA1;
import ru.shipov.patterns.creational.Abstract_Factory.products.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA1("ProductA1 from ConcreteFactory1");
    }

    public AbstractProductB createProductB() {
        return new ProductB1("ProductB1 from ConcreteFactory1");
    }
}
