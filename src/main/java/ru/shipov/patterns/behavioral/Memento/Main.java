package ru.shipov.patterns.behavioral.Memento;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("on");
        System.out.println(originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("off");
        System.out.println(originator.getState());

        originator.restoreState(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
