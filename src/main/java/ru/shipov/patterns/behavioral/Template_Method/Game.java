package ru.shipov.patterns.behavioral.Template_Method;

public abstract class Game {

    protected abstract void initializeGame();

    protected abstract void playGame();

    protected abstract void endGame();

    protected abstract void printWinner();

    public final void startGame(){
        initializeGame();
        playGame();
        endGame();

        printWinner();
    }
}
