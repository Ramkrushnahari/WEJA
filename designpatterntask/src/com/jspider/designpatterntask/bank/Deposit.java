package com.jspider.designpatterntask.bank;

public class Deposit {

private double depositAmount;
	
	public Deposit(Double depositAmount) {
		this.depositAmount=depositAmount;
	}
	
	public void depositAmount() {
		Account deposit=Account.getAccount();
		if (depositAmount<0) {
			System.out.println("Please Add Proper Balance");
		}
		else {
			deposit.setAccountBalance(deposit.getAccountBalance()+depositAmount);
			System.out.println("Deposited Amount is "+depositAmount);
			System.out.println("Available Balance is "+deposit.getAccountBalance());
		}
	}
}
