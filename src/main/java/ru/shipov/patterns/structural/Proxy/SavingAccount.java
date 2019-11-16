package ru.shipov.patterns.structural.Proxy;

public class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("SavingAccount");
    }
}
