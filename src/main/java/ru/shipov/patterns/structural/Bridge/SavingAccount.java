package ru.shipov.patterns.structural.Bridge;

public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("OPENED: SAVING ACCOUNT");
        return new SavingAccount();
    }

    public void accountType() {
        System.out.println("IT is a SAVING Account");
    }
}
