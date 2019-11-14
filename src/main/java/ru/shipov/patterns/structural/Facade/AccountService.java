package ru.shipov.patterns.structural.Facade;

public class AccountService {

    public static Account getAccount(String accountId) {
        return new SavingAccount();
    }
}
