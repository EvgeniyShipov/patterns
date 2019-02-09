package ru.shipov.patterns.behavioral.Command;

public class ConcreteCommand1 implements Command {
    private final Receiver receiver;

    ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.doCommand1();
    }
}
