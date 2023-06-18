package com.jspider.designpatterntask.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.jspider.designpatterntask.bank.CheckBalance;
import com.jspider.designpatterntask.bank.Deposit;
import com.jspider.designpatterntask.bank.Withdraw;

public class AccountMain {
	static boolean stop=true;
	public static void main(String[] args) {
		
		System.out.println("Welcome To Bank Of India");
		
		while (stop) {
			Scanner scanner=new Scanner(System.in);
			try {
				System.out.println("\nChoose Your Transaction");
				System.out.println("1.Withdraw Money"
									+"\n2.Deposit Money"
									+"\n3.Check Balance"
									+"\n4.Exit");
				int choice=scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter Amount to be withdraw : ");
					double withdrawAmount=scanner.nextDouble();
					Withdraw withdraw=new Withdraw(withdrawAmount);
					withdraw.WithdrawAmount();
					break;
				case 2:
					System.out.print("Enter Amount to be Deposit : ");
					double depositAmount=scanner.nextDouble();
					Deposit deposit=new Deposit(depositAmount);
					deposit.depositAmount();
					break;
				case 3:
					CheckBalance checkBalance=new CheckBalance();
					checkBalance.checkBalance();
					break;
				case 4:
					System.out.println("\nThank You");
					stop=false;
					scanner.close();
					break;

				default:
					System.out.println("Invalid Choice");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please Press Valid Keys");
			}
			
		}
		
		
		
		
		
	}
}
