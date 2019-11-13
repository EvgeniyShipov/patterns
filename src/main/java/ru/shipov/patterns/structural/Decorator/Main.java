package ru.shipov.patterns.structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Account basicSavingAccount = new SavingAccount();
        System.out.println(basicSavingAccount.getTotalBenefits());

        Account seniorCitizenSavingAccount = new SeniorCitizen(new SavingAccount());
        System.out.println(seniorCitizenSavingAccount.getTotalBenefits());

        Privilege privilegeSavingAccount = new Privilege(new SavingAccount());
        System.out.println(privilegeSavingAccount.getTotalBenefits());
    }
}
