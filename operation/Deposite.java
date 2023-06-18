package com.jspider.designtask.operation;




import java.util.Scanner;

import com.jspider.designtask.resource.Account;

public class Deposite {
	

	
	
	public void deposite() {

	System.out.println("Enter amount to deposite");
	Scanner scanner=new Scanner(System.in);
	double amount=scanner.nextDouble();
	Account account=Account.getObject();
	account.accountBalance+=amount;
	}

}
