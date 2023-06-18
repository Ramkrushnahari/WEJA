package com.jspider.MultiThreadingWait_Notify.thread;

import com.jspider.MultiThreadingWait_Notify.resourse.Pizza;

public class Dominoz extends Thread{
	private Pizza pizza;

	public Dominoz(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public void run() {
		pizza.makePizza(20);
	}

}
