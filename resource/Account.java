package com.jspider.designtask.resource;

public class Account {

	public double accountBalance;

	public Account(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	static Account account;

	public static Account getObject() {
		if (account == null) {
			account = new Account(10000);

		}
		return account;
	}

}
