package com.jspider.multithreadingAccount.Resource;

import com.jspider.multithreadingAccount.thread.Account;

public class Sun extends Thread {
	Account account;

	public Sun(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		account.deposit(500);
		account.withdraw(5000);
	}
	

}
