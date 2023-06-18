package com.jspider.designpatterntask.bank;

public class Account {
	private double accountBalance;
	private Account(double accountBalace) {
		this.accountBalance=accountBalace;
	}
	static Account account=new Account(10000);
	
	public static Account getAccount() {
		return account;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance=accountBalance;
	}

	
}
