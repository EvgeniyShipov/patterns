package ru.shipov.patterns.behavioral.Visitor;

public interface Visitor {

    void visit(Car car);

    void visit(Bus bus);
}
