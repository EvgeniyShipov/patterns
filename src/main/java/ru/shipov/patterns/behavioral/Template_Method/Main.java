package ru.shipov.patterns.behavioral.Template_Method;

public class Main {

    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.startGame();

        Blackjack blackjack = new Blackjack();
        blackjack.startGame();
    }

}
