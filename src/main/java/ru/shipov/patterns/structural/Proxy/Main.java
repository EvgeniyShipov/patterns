package ru.shipov.patterns.structural.Proxy;

public class Main {
    public static void main(String[] args) {
        ProxySavingAccount proxy = new ProxySavingAccount();

        proxy.accountType();
        proxy.accountType();
    }
}
