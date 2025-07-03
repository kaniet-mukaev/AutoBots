package com.autobots.java.bankApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankProApp {

    private static final Map<String, Client> clients = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Client asan = new Client("Asan Uson", "123");

        DepositAccount asanDepositAccount = new DepositAccount(asan, Currency.USD);
        CreditAccount asanCreditAccount = new CreditAccount(asan, Currency.EUR);

        asan.addAccount(asanDepositAccount);
        asan.addAccount(asanCreditAccount);

        clients.put(asan.getClientID(), asan);

        while (true) {
            System.out.print("Please enter your pin here -> ");
            String inputPin = scanner.nextLine();
            if (asan.authenticate(inputPin)) {
                System.out.println(asan.getFullName() +
                        ", welcome to Online Banking!\n" +
                        "Please choose operation type:\n" +
                        "1. View accounts\n" +
                        "2. Transfer from account\n" +
                        "3. Show the check (the history of operations)\n" +
                        "0. Exit");
                break;
            }
        }
            String change = scanner.nextLine();
            if (change.equals("0")) {
                System.out.println("You got out of the system");

            } else if (change.equals("1")) {
                asan.printAllAccounts();
                System.out.println(asan.getAccounts());

            } else if (change.equals("2")) {
                System.out.println("Please fill out the obligatory fields for transfer");
                BankService.transfer(asanDepositAccount, asanCreditAccount, 200);
            } else if (change.equals("3")) {
//                for (Transaction transaction : asanDepositAccount.getTransactions()) {
//                    System.out.println(transaction);
//                }
//                asanDepositAccount.getTransactions().stream().forEach(System.out::println);
//                System.out.println(asanDepositAccount.getTransactions());
            }


    }

}
