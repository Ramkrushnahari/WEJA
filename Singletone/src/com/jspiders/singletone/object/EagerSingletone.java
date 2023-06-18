package com.jspiders.singletone.object;

public class EagerSingletone {
	static EagerSingletone object= new EagerSingletone();
	
	private EagerSingletone() {
		System.out.println("CONSTRUCTOR CREATED OR ACCESSED....");
	}

	public static EagerSingletone getObject() {
		System.out.println("Method Accessed....");
		return object;
	}
	
}
