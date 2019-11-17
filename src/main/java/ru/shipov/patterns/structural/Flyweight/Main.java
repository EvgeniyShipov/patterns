package ru.shipov.patterns.structural.Flyweight;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Stream.iterate(1, n -> n + 1).limit(3)
                .map(factory::getCharacter)
                .forEach(Character::printCharacter);
    }
}
