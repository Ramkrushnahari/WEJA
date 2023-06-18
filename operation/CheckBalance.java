package com.jspider.designtask.operation;

import com.jspider.designtask.resource.Account;

public class CheckBalance {
	
	Account account=Account.getObject();
	public void checkBalance() {
		System.out.println("Total available balance of Account is: "+ account.accountBalance);
	}

}
