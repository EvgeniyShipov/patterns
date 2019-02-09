package ru.shipov.patterns.behavioral.Command;

public class ConcreteCommand2 implements Command {
    private final Receiver receiver;

    ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.doCommand2();
    }
}
