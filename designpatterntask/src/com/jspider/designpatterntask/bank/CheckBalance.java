package com.jspider.designpatterntask.bank;

public class CheckBalance {

	public void checkBalance() {
		Account checkBalance=Account.getAccount();
		System.out.println("Available Balance is "+checkBalance.getAccountBalance());
	}
}
