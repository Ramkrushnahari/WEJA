package com.jspider.MultiThreadingWait_Notify.main;

import com.jspider.MultiThreadingWait_Notify.resourse.Showroom;
import com.jspider.MultiThreadingWait_Notify.thread.CarCompany;
import com.jspider.MultiThreadingWait_Notify.thread.Customer;

public class CarMain {

	public static void main(String[] args) {
		Showroom showroom = new Showroom();
		Customer customer = new Customer(showroom);
		CarCompany carcompany = new CarCompany(showroom);
		
		carcompany.setName("BMW");
		customer.start();
		carcompany.start();

	}

}
