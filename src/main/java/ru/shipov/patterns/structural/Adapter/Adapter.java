package ru.shipov.patterns.structural.Adapter;

public class Adapter implements Target {
    private Adaptee adaptee;

    public void request() {
        adaptee.specificRequest();
    }
}
