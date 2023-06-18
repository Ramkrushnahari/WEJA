package com.jspider.designpatterntask.bank;

public class Withdraw {
	
	private double withdrawAmount;
	
	public Withdraw(Double withdrawAmount) {
		this.withdrawAmount=withdrawAmount;
	}
	
	public void WithdrawAmount() {
		Account withdraw=Account.getAccount();
		if (withdrawAmount>withdraw.getAccountBalance()) {
			System.out.println("Insufficiant Balance");
		}
		else {
			withdraw.setAccountBalance(withdraw.getAccountBalance()-withdrawAmount);
			System.out.println("Withdraw Amount is "+withdrawAmount);
			System.out.println("Available Balance is "+withdraw.getAccountBalance());
		}
	}
}
