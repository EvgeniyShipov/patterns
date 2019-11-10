package ru.shipov.patterns.structural.Bridge;

public class HdfcBank extends Bank {
    public HdfcBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("Open account with HDFC Bank");
        return account.openAccount();
    }
}
