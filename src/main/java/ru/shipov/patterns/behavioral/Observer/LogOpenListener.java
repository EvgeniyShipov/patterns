package ru.shipov.patterns.behavioral.Observer;

import java.io.File;

public class LogOpenListener implements EventListener {
    private String message = "Save to log %s: Someone has performed %s operation with the following file: %s\n";
    private File log;

    public LogOpenListener(String fileName) {
        log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.printf(message, log, eventType, file.getName());
    }
}
