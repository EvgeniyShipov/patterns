package ru.shipov.patterns.behavioral.Template_Method;

public class Poker extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("init Poker");
    }

    @Override
    protected void playGame() {
        System.out.println("play Poker");
    }

    @Override
    protected void endGame() {
        System.out.println("end Poker");
    }

    @Override
    protected void printWinner() {
        System.out.println("print Poker");
    }
}
