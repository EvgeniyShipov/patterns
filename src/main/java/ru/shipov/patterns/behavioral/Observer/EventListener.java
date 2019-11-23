package ru.shipov.patterns.behavioral.Observer;

import java.io.File;

public interface EventListener {

    void update(String eventType, File file);
}
