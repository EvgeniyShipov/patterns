package ru.shipov.patterns.behavioral.Mediator;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("How are you?");
        colleague2.send("Fine, thanks");
    }
}
