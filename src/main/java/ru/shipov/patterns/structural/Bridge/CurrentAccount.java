package ru.shipov.patterns.structural.Bridge;

public class CurrentAccount implements Account {
    public Account openAccount() {
        System.out.println("OPENED: CURRENT ACCOUNT");
        return new CurrentAccount();
    }

    public void accountType() {
        System.out.println("IT is a CURRENT Account");
    }
}
