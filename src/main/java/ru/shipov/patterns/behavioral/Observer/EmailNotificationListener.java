package ru.shipov.patterns.behavioral.Observer;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String message = "Email to %s: Someone has performed %s operation with the following file: %s\n";
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.printf(message, email, eventType, file.getName());
    }
}
