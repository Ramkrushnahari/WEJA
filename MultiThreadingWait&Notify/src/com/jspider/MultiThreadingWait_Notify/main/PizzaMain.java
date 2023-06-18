package com.jspider.MultiThreadingWait_Notify.main;

import com.jspider.MultiThreadingWait_Notify.resourse.Pizza;
import com.jspider.MultiThreadingWait_Notify.thread.Dominoz;
import com.jspider.MultiThreadingWait_Notify.thread.Friends;

public class PizzaMain {

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		
		Friends friends= new Friends(pizza);
		Friends friends1= new Friends(pizza);
		Friends friends2= new Friends(pizza);
		Dominoz dominoz = new Dominoz(pizza);
		friends.start();
		dominoz.start();

	}

}
