package com.jspider.MultiThreadingWait_Notify.resourse;

public class Pizza {
	int noOfPizza;
	public synchronized void orderPizza(int orderdPizza) {
		System.out.println("Ordering "+orderdPizza+" pizzas");
		if(orderdPizza> noOfPizza) {
			System.out.println(orderdPizza+" Orderd pizzas not Available..");
			System.out.println("please wait...!!!");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
			noOfPizza -= orderdPizza;
			System.out.println("Order of "+orderdPizza+" pizza are successfully..");
			System.out.println("total pizza "+noOfPizza+"  are avialable ");
			
		
	}
	public synchronized void makePizza(int bakePizza) {
		System.out.println("making "+bakePizza+" pizza Available..");
		noOfPizza+=bakePizza;
		System.out.println(noOfPizza+" Pizza Available");
		this.notify();
		this.notifyAll();//create multiple object of friend class
		
	}
}
