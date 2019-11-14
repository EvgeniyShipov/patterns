package ru.shipov.patterns.structural.Facade;

public class BankingServiceFacadeImpl implements BankingServiceFacade {
    @Override
    public void moneyTransfer() {
        if (PaymentService.doPayment()) {
            Account fronAccount = AccountService.getAccount("1");
            Account toAccount = AccountService.getAccount("2");
            TransferService.transfer(1000,fronAccount, toAccount);
        }
    }
}
