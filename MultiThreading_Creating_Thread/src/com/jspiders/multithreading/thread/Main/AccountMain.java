package com.jspiders.multithreading.thread.Main;

import com.jspider.multithreadingAccount.Resource.Father;
import com.jspider.multithreadingAccount.Resource.Sun;
import com.jspider.multithreadingAccount.thread.Account;

public class AccountMain {

	public static void main(String[] args) {
		Account ACC= new Account(10000);
		Father Father=new Father(ACC);
		Sun Sun = new Sun(ACC);
		Father.start();
		Sun.start();

	}

}
