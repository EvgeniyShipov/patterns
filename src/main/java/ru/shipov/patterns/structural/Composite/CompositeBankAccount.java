package ru.shipov.patterns.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeBankAccount implements Account {

    private List<Account> accounts = new ArrayList<>();

    public void accountType() {
        accounts.forEach(Account::accountType);
    }

    public void add(Account account) {
        accounts.add(account);
    }

    public void remove(Account account) {
        accounts.remove(account);
    }
}
