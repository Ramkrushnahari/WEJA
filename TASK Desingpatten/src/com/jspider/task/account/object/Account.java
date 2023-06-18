package com.jspider.task.account.object;

public class Account {
	
	public double accountBalance;
	
	private Account(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	static Account account;
	
	public static Account getObject() {
		if(account==null) {
			account=new Account(10000);	
		}
		return account;
	}

}
