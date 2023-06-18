package com.jspider.task.account.operation;

import com.jspider.task.account.object.Account;

public class Deposite {
	
	public double depositeAmount;
	
	public Deposite(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public void depositAmount(double depositeAmount) {
		Account account=Account.getObject();
		account.accountBalance+=depositeAmount;
		System.out.println("Total balance of Account is: "+account.accountBalance);
		
	}
	

}
