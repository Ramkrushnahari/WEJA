package com.jspider.multithreadingAccount.Resource;

import com.jspider.multithreadingAccount.thread.Account;

public class Father extends Thread {
	Account account;

	public Father(Account account) {
		
		this.account = account;
	}
	@Override
	public void run() {
		account.deposit(1000);
		account.withdraw(500);
		
	}
	
}
