package com.jspider.MultiThreadingWait_Notify.thread;


import com.jspider.MultiThreadingWait_Notify.resourse.Showroom;

public class Customer extends Thread{
	private Showroom Showroom;
	
	public Customer(Showroom Showroom) {
		this.Showroom = Showroom;
	}

	@Override
	public void run() {
		Showroom.custOrder(20);
	}
	

}
