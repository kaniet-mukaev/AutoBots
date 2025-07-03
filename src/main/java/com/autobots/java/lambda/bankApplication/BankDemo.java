package com.autobots.java.lambda.bankApplication;

public class BankDemo {
    public static void main(String[] args) throws Exception {

        MBank aliyaMbank = new MBank("MBank",123456789123L, 333333311);
        MBank asanMbank = new MBank("MBank",442156789123L, 333333360);
        MBank usonMbank = new MBank("MBank",999512437624L, 333333330);
        MBank akylaiMbank = new MBank("MBank",661523401726L, 333333312);

        OptimaBank ulugbekOptimabank = new OptimaBank("OptimaBank",123456781123L, 555555505);
        OptimaBank nataliyaOptimabank = new OptimaBank("OptimaBank",123015481663L, 555555500);
        OptimaBank sergeyOptimabank = new OptimaBank("OptimaBank",123099341112L, 555555510);

        DemirBank zinaidaDemirBank = new DemirBank("DemirBank",554142430125L, 888888891);
        DemirBank samatDemirBank = new DemirBank("DemirBank",951242430125L, 888888822);
        DemirBank azamatDemirBank = new DemirBank("DemirBank",789122430125L, 888888840);
        DemirBank elizaDemirBank = new DemirBank("DemirBank",124342993410L, 888888833);

        aliyaMbank.deposit(100000);
        Bank.transferFunds(aliyaMbank, ulugbekOptimabank, 500);

        BankBase.printAllBankUsersCount();
        System.out.println("_______________________");
        OptimaBank.printAllRecords();
        System.out.println("_______________________");
        MBank.printAllRecords();
        System.out.println("_______________________");
        DemirBank.printAllRecords();
    }
}
