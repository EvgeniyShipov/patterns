package ru.shipov.patterns.behavioral.Visitor;

public class AutoVisitor implements Visitor {
    @Override
    public void visit(Car car) {
        System.out.println("Легковой автомобиль модели: " + car.getModel());
    }

    @Override
    public void visit(Bus bus) {
        System.out.println("Автобус модели: " + bus.getModel());
    }
}
