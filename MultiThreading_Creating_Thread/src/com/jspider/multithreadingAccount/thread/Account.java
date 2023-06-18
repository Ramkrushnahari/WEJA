package com.jspider.multithreadingAccount.thread;

public class Account {
	double AccountBalance;

	public Account(double accountBalance) {
		this.AccountBalance = accountBalance;
	}
	
	//Check Account Balance....
	public double checkBal() {
		
		return this.AccountBalance; 
		
	}
	//Deposit money....
	public void deposit(double amount) {
		System.out.println("The deposited ammount is "+amount);
		AccountBalance+=amount;
		System.out.println("Totalbalance is"+checkBal());
		//return checkBal();
		
	}
	public void withdraw(double amount) {
		System.out.println("The Withdrawal ammount is "+amount);
		AccountBalance-=amount;
		System.out.println("Total balace is ="+checkBal());
		//return amount;
	}

}
