package ru.shipov.patterns.structural.Proxy;

public class ProxySavingAccount implements Account {

    private Account account;

    @Override
    public void accountType() {
        if (account == null) {
            account = new SavingAccount();
        }
        account.accountType();
    }
}
