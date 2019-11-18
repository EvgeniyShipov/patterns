package ru.shipov.patterns.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements IterableCollection {

    List<Object> elementData = new ArrayList<>();

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    void add(Object object) {
        elementData.add(object);
    }
}
