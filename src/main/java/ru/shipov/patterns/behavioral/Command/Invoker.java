package ru.shipov.patterns.behavioral.Command;

class Invoker {
    private final Command concreteCommand1;
    private final Command concreteCommand2;

    Invoker(Command concreteCommand1, Command concreteCommand2) {
        this.concreteCommand1 = concreteCommand1;
        this.concreteCommand2 = concreteCommand2;
    }

    void command1() {
        concreteCommand1.execute();
    }

    void command2() {
        concreteCommand2.execute();
    }
}
