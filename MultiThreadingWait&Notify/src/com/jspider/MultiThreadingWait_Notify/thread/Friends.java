package com.jspider.MultiThreadingWait_Notify.thread;

import com.jspider.MultiThreadingWait_Notify.resourse.Pizza;

public class Friends extends Thread{
	private Pizza pizza;

	public Friends(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public void run() {
		pizza.orderPizza(15);
	}
	

}
