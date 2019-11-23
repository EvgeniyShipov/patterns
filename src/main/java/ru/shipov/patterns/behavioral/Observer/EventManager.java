package ru.shipov.patterns.behavioral.Observer;

import java.io.File;
import java.util.*;

public class EventManager {

    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        Arrays.stream(operations)
                .forEach(operation -> listeners.put(operation, new ArrayList<>()));
    }

    public void subscribe(String eventType, EventListener listener) {
        listeners.get(eventType).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        listeners.get(eventType).remove(listener);
    }

    public void notify(String eventType, File file) {
        listeners.get(eventType)
                .forEach(listener -> listener.update(eventType, file));
    }
}
