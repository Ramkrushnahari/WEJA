package com.jspider.task.account.operation;

import com.jspider.task.account.object.Account;

public class CheckBalance {
	
	Account account=Account.getObject();
	public void checkBal() {
		System.out.println("Total available balance of Account is: "+ account.accountBalance);
	}
}
