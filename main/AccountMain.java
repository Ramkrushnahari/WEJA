package com.jspider.designtask.main;

import java.util.Scanner;

import com.jspider.designtask.operation.CheckBalance;
import com.jspider.designtask.operation.Deposite;
import com.jspider.designtask.operation.WithDraw;

public class AccountMain {
	static boolean start=true;

	public static void main(String[] args) {
		while (start) {
			operation();
		}
		
			
		

	}
	public static void operation() {
		System.out.println("Select option");
		System.out.println("1.WithDrawAmount\n 2.Deposite\n 3.Check Balance\n 4.Exit");
		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();
		
		
			switch (choice) {
			case 1:
				WithDraw withDraw=new WithDraw();
				withDraw.withDraw();
				
				break;
			case 2:
				Deposite deposite=new Deposite();
				deposite.deposite();
			case 3:
				CheckBalance checkBalance=new CheckBalance();
				checkBalance.checkBalance();
			case 4:
				System.out.println("thank you..");
				start=false;
				
				

			default:
				System.out.println("enter valid input");
				break;
			}
	}

}
