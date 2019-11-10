package ru.shipov.patterns.structural.Bridge;

public class IciciBank extends Bank {
    public IciciBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("Open account with ICICI Bank");
        return account.openAccount();
    }
}
