package com.jspider.task.account.operation;

import com.jspider.task.account.object.Account;

public class WithDraw{
	public double withDrawAmount;
	
	public WithDraw(double withDrawAmount) {
		this.withDrawAmount = withDrawAmount;
	}


	public void withDrawAmount(double withDrawAmount) {
		Account account=Account.getObject();
		if(account.accountBalance-withDrawAmount<0) {
			System.out.println("Insufficient Balance...");
			
		}else {
			account.accountBalance-=withDrawAmount;
			System.out.println("Total balance of Account is: "+account.accountBalance);
		}
	}
}
