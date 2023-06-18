package com.jspider.MultiThreadingWait_Notify.thread;

import com.jspider.MultiThreadingWait_Notify.resourse.Showroom;

public class CarCompany extends Thread{
	private Showroom Showroom;

	public CarCompany(Showroom showroom) {
		Showroom = showroom;
	}

	@Override
	public void run() {
		System.out.println("Name of company is "+this.getName());
		Showroom.BuildCar(50);
		
	}

}
