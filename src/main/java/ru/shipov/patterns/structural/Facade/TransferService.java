package ru.shipov.patterns.structural.Facade;

public class TransferService {

    public static void transfer(int amount, Account fromAccount, Account toAccount) {
        System.out.println("Transfering money");
    }
}
