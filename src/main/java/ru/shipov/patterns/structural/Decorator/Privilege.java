package ru.shipov.patterns.structural.Decorator;

public class Privilege extends AccountDecorator {
    private Account account;

    public Privilege(Account account) {
        this.account = account;
    }

    public String getTotalBenefits() {
        return account.getTotalBenefits() + " others benefits are" + applyOtherBenefits();
    }

    public String applyOtherBenefits() {
        return " an accident insurance of up to $1600 and an overdraft facility of $84";
    }
}
