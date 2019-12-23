package ru.shipov.patterns.behavioral.Template_Method;

public class Blackjack extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("init Blackjack");
    }

    @Override
    protected void playGame() {
        System.out.println("play Blackjack");
    }

    @Override
    protected void endGame() {
        System.out.println("end Blackjack");
    }

    @Override
    protected void printWinner() {
        System.out.println("print Blackjack");
    }
}
