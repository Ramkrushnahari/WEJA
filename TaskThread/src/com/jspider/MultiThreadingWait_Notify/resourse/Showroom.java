package com.jspider.MultiThreadingWait_Notify.resourse;

public class Showroom {
	int noOfCar;
	public synchronized void custOrder(int orderCar) {
		System.out.println("Total Order of cars is  "+orderCar);
		if(orderCar> noOfCar) {
			System.out.println(orderCar+" Cars not Available in stock..");
			System.out.println("please wait...!!!");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
			noOfCar -= orderCar;
			System.out.println("Order of "+orderCar+" Car are successfully..");
			System.out.println("Please visit again....ThankYoU!!!");
			//System.out.println("total "+noOfCar+" cars are avialables... ");
			
		
	}
	public synchronized void BuildCar(int buildCar) {
		System.out.println("Total "+buildCar+" Numbers of Cars Available in godown..");
		noOfCar+=buildCar;
		System.out.println(noOfCar+" Cars Available in Godown");
		this.notify();
		//this.notifyAll();
	}
}
