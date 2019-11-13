package ru.shipov.patterns.structural.Decorator;

public class SeniorCitizen extends AccountDecorator {
    private Account account;

    public SeniorCitizen(Account account) {
        this.account = account;
    }

    @Override
    public String getTotalBenefits() {
        return account.getTotalBenefits() + " others benefits are" + applyOtherBenefits();
    }

    public String applyOtherBenefits() {
        return " an medical insurance of up to $1000 for Senoir Citizen";
    }
}
