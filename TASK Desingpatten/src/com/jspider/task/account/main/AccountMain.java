package com.jspider.task.account.main;

import java.util.Scanner;

import com.jspider.task.account.object.Account;
import com.jspider.task.account.operation.CheckBalance;
import com.jspider.task.account.operation.Deposite;
import com.jspider.task.account.operation.WithDraw;

public class AccountMain {
	private static CheckBalance account4;
	private static WithDraw account1;
	private static Deposite account3;
	static boolean loop = true;
	static Account account = Account.getObject();
	static boolean start =true;
	public static void main(String[] args) {
		try {
			
				account=factory();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Account factory() {
		
		System.out.println("== ACCOUNT INFORMATION ==\n" + "  1.WITHDRAW AMOUNT \n" + "  2.Deposit Amount \n"
				+ "  3.Check Balance \n" + "  4.EXIT.");
		System.out.println("======================");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("ENTER THE WITHDRAW AMOUNT:\t");
			double withDrawAmount = sc.nextDouble();
			account1 = new WithDraw(withDrawAmount);
			account1.withDrawAmount(withDrawAmount);
			// return account1;
			break;
		case 2:
			System.out.println("ENTER THE DIPOSITED AMOUNT:\t");
			double depositeAmount = sc.nextDouble();
			account3 = new Deposite(depositeAmount);
			account3.depositAmount(depositeAmount);
			break;

		case 3:
			account4 = new CheckBalance();
			account4.checkBal();
			break;
		default:
			System.out.println("Thank You...");
			
			// System.out.println("Invalid choice.....Please Check");

		}
		sc.close();
		return null;
	}
}
