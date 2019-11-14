package ru.shipov.patterns.structural.Facade;

public class Main {

    public static void main(String[] args) {
        BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
        serviceFacade.moneyTransfer();
    }
}
