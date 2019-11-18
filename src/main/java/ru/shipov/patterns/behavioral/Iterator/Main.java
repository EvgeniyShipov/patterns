package ru.shipov.patterns.behavioral.Iterator;

public class Main {

    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection();
        collection.add(new Object());
        collection.add(new Object());

        Iterator iterator = collection.iterator();

        while (iterator.hasMore()){
            System.out.println(iterator.getNext());
        }
    }
}
