package com.jspider.task.account;

public class App {

}
//class Account {
//    private static Account instance = null;
//    private int accountBalance;
//
//    private Account() {
//        this.accountBalance = 10000;
//    }
//
//    public static Account getInstance() {
//        if (instance == null) {
//            instance = new Account();
//        }
//        return instance;
//    }
//
//    public int getAccountBalance() {
//        return this.accountBalance;
//    }
//
//    public void setAccountBalance(int accountBalance) {
//        this.accountBalance = accountBalance;
//    }
//}
//
//class Withdraw {
//    private int withdrawAmount;
//
//    public Withdraw(int withdrawAmount) {
//        this.withdrawAmount = withdrawAmount;
//        Account account = Account.getInstance();
//        int currentBalance = account.getAccountBalance();
//        if (currentBalance - this.withdrawAmount < 0) {
//            System.out.println("Insufficient balance.");
//        } else {
//            account.setAccountBalance(currentBalance - this.withdrawAmount);
//            System.out.println("Withdrawn: " + this.withdrawAmount);
//            System.out.println("Remaining balance: " + account.getAccountBalance());
//        }
//    }
//}
//
//class Deposit {
//    private int depositAmount;
//
//    public Deposit(int depositAmount) {
//        this.depositAmount = depositAmount;
//        Account account = Account.getInstance();
//        int currentBalance = account.getAccountBalance();
//        account.setAccountBalance(currentBalance + this.depositAmount);
//        System.out.println("Deposited: " + this.depositAmount);
//        System.out.println("Updated balance: " + account.getAccountBalance());
//    }
//}
//
//class CheckBalance {
//    public CheckBalance() {
//        Account account = Account.getInstance();
//        System.out.println("Current balance: " + account.getAccountBalance());
//    }
//}
