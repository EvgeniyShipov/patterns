package ru.shipov.patterns.structural.Composite;

public class Main {
    public static void main(String[] args) {
        CompositeBankAccount compositeBankAccount1 = new CompositeBankAccount();
        compositeBankAccount1.add(new SavingAccount());
        compositeBankAccount1.add(new CurrentAccount());

        CompositeBankAccount compositeBankAccount2 = new CompositeBankAccount();
        compositeBankAccount2.add(new SavingAccount());
        compositeBankAccount2.add(new CurrentAccount());

        CompositeBankAccount compositeBankAccount = new CompositeBankAccount();
        compositeBankAccount.add(compositeBankAccount1);
        compositeBankAccount.add(compositeBankAccount2);

        compositeBankAccount.accountType();
    }
}
