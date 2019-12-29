package ru.shipov.patterns.behavioral.Visitor;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        AutoVisitor autoVisitor = new AutoVisitor();

        Stream.of(new Car("ВАЗ"), new Bus("ПАЗ"))
                .forEach(auto -> auto.accept(autoVisitor));
    }
}
