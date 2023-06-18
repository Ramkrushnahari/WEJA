package com.jspiders.singletone.object;

public class SingletoneLazy {
	static SingletoneLazy object;
	private SingletoneLazy() {
		System.out.println("Constructor Access");
	}
	
	public static SingletoneLazy getObject() {
		System.out.println("Method Access");
		if(object==null) {
			object= new SingletoneLazy();
		}
		return object;
	}
}
