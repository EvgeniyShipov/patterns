package ru.shipov.patterns.behavioral.Command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand1 command1 = new ConcreteCommand1(receiver);
        ConcreteCommand2 command2 = new ConcreteCommand2(receiver);

        Invoker invoker = new Invoker(command1, command2);
        invoker.command1();
        invoker.command2();
    }
}
