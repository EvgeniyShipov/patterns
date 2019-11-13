package ru.shipov.patterns.structural.Decorator;


public class CurrentAccount implements Account {

    @Override
    public String getTotalBenefits() {
        return "There is no withdrawal limit for current account";
    }
}
