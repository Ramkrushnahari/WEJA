package com.jspider.designtask.operation;


import java.util.Scanner;

import com.jspider.designtask.resource.Account;

public class WithDraw {
	
	
	

	
	

	public  void withDraw() {
		System.out.println("Enter amount to withdraw");
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextDouble();

		Account account=Account.getObject();
		account.accountBalance-=amount;
		System.out.println("amount withdraw available balance:"+account.accountBalance);
		

	}

}
