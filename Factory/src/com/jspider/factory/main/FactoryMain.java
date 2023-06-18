package com.jspider.factory.main;

import java.util.Scanner;

import com.jspider.factor.object.BlackTea;
import com.jspider.factor.object.LemonTea;
import com.jspider.factor.object.MasalaTea;
import com.jspider.factor.object.Tea;
import com.jspider.factory.beverage.Beverage;

public class FactoryMain {
	static Beverage beverage;
	public static void main(String[] args) {
		try {
			factory().order();
		}catch(NullPointerException e) {
			System.out.println("Tea Not Available...");
		}
	}
	private static Beverage factory() {
		System.out.println("== ENTER THE CHOICE ==\n"
				+"  1.Tea \n"
				+"  2.Black Tea \n"
				+"  3.Masala Tea \n" 
				+"  4.Lemon tea");
		System.out.println("======================");
		Scanner sc = new Scanner(System.in);
		
		int order = sc.nextInt();
		sc.close();
			switch (order) {
			case 1:
				beverage = new Tea();
				return beverage;
			case 2:
				beverage = new BlackTea(); 
				return beverage;
			case 3:
				beverage = new MasalaTea();
				return beverage;
			case 4:
				beverage = new LemonTea();
				return beverage;
			
			default:
				System.out.println("Invalid choice.....Please Check");
				
				return beverage;
			
			}
		}
		
	}

