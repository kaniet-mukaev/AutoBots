package com.autobots.java.lambda.bankApplication;

import java.util.HashSet;
import java.util.Set;

public class OptimaBank extends BankBase{
    private double balance = 0;
    public static Set<BankBase> recordsOfOptima = new HashSet<>();

    public OptimaBank(String bankName, long accountNumber, long routingNumber) throws Exception {
        super(bankName, accountNumber, routingNumber);
        addToRecords(this);
        allBankUsersCount.put(this.getBankName(), allBankUsersCount.getOrDefault(this.getBankName(), 0) + 1);
    }

    public void addToRecords(BankBase bank) throws Exception {
        for (BankBase bankBase : recordsOfOptima) {
            if (bankBase.getAccountNumber() == bank.getAccountNumber()) {
                throw new Exception(bank.getAccountNumber() + ": account number already exist");
            }
            if (bankBase.getRoutingNumber() == bank.getRoutingNumber()) {
                throw new Exception(bank.getRoutingNumber() + ": routing number already exist");
            }
        }
        recordsOfOptima.add(bank);
    }

    public static void printAllRecords() {
        System.out.println("Optima Bank: ");
        for (BankBase bank : recordsOfOptima) {
            System.out.println("Account number: " + bank.getAccountNumber() + "\nRouting number: " + bank.getRoutingNumber());
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount > 300000) {
            throw new IllegalArgumentException("Invalid amount, can not be deposit");
        } else {
            balance += amount;
        }
    }

    @Override
    public void withDrow(double amount) {
        if (amount < 0 || amount > 250000) {
            throw new IllegalArgumentException("Invalid amount, can not be withDrow");
        } else {
            if (balance < amount) {
                throw new IllegalArgumentException("Insufficient funds");
            } else {
                balance -= amount;
            }
        }
    }
}

