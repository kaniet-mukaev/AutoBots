package com.autobots.java.lambda.bankApplication;

public interface Bank {

    double getBalance();
    void deposit(double amount);
    void withDrow(double amount);

    static void transferFunds(Bank sender, Bank recipient, double transferAmount) {
        sender.withDrow(transferAmount);
        recipient.deposit(transferAmount);
    }
}
