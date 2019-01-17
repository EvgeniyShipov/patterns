package ru.shipov.patterns.creational.Abstract_Factory.factories;

import ru.shipov.patterns.creational.Abstract_Factory.products.AbstractProductA;
import ru.shipov.patterns.creational.Abstract_Factory.products.AbstractProductB;

public interface AbstractFactory {

    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
