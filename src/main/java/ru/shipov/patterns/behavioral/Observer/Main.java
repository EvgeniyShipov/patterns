package ru.shipov.patterns.behavioral.Observer;

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.getEvents().subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.getEvents().subscribe("save", new EmailNotificationListener("admin@example.com"));

        editor.openFile("test.txt");
        editor.saveFile();
    }
}
