package ru.shipov.patterns.behavioral.Iterator;

public class ConcreteIterator implements Iterator {

    private ConcreteCollection collection;
    private int currentPosition;

    public ConcreteIterator(ConcreteCollection collection) {
        this.collection = collection;
    }

    @Override
    public Object getNext() {
        if (hasMore()) {
            return collection.elementData.get(currentPosition++);
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < collection.elementData.size();
    }
}
