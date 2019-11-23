package ru.shipov.patterns.behavioral.Observer;

import java.io.File;

public class Editor {
    private EventManager events;
    private File file;

    public Editor() {
        events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() {
        if (file != null) {
            events.notify("save", file);
        } else {
            throw new NullPointerException("Please open a file first.");
        }
    }

    public EventManager getEvents() {
        return events;
    }
}
