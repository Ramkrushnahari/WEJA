package com.jspider.factor.object;

import com.jspider.factory.beverage.Beverage;

public class LemonTea implements Beverage{

	@Override
	public void order() {
		System.out.println("Order Lemon Tea...");
	}
	
	
}
