package com.autobots.java.lambda.bankApplication;

import java.util.*;

public abstract class BankBase implements Bank {

    private String bankName;
    private long accountNumber;
    private long routingNumber;
    public static Map<String, Integer> allBankUsersCount = new HashMap<>();
    public static Set<String> listOfBanksName =
            new HashSet<>(List.of(Banks.MBANK.getDescription(), Banks.DEMIRBANK.getDescription(),
                    Banks.OBANK.getDescription(), Banks.OPTIMABANK.getDescription()));

    // сделать у каждого банка отдельную базу и положить эти базы в общую базу allBankRecords
    // реализовать логику проверки названия банка, чтобы название банка соответствовало названию класса банка

    public BankBase(String bankName, long accountNumber, long routingNumber) {
        if (!listOfBanksName.contains(bankName)) {
            throw new IllegalArgumentException("Invalid bank name");
        } else {
            this.bankName = bankName;
        }
        if (Long.toString(accountNumber).length() != 12) {
            throw new IllegalArgumentException("Account number must be 12 digits");
        } else if (Long.toString(routingNumber).length() != 9) {
            throw new IllegalArgumentException("Routing number must be 9 digits");
        } else {
            this.accountNumber = accountNumber;
            this.routingNumber = routingNumber;
        }
    }

    protected static void printAllBankUsersCount() {
       for (Map.Entry<String, Integer> entry : allBankUsersCount.entrySet()) {
           System.out.printf("%s -> %d cl.%n", entry.getKey(), entry.getValue());
       }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankBase bankBase = (BankBase) o;
        return accountNumber == bankBase.accountNumber && routingNumber == bankBase.routingNumber && Objects.equals(bankName, bankBase.bankName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, accountNumber, routingNumber);
    }

    @Override
    public String toString() {
        return '{' + bankName +
                ", accountNumber=" + accountNumber +
                ", routingNumber=" + routingNumber +
                '}';
    }
}
