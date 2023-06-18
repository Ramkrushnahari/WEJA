package com.jspiders.singletone.main;

import com.jspiders.singletone.object.SingletoneLazy;

public class SingletoneLazyMain {

	public static void main(String[] args) {
		SingletoneLazy object1 = SingletoneLazy.getObject();
		SingletoneLazy object2 = SingletoneLazy.getObject();
		SingletoneLazy object3 = SingletoneLazy.getObject();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		System.out.println("===== BY USING HASHCODE() ====");
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		System.out.println(object3.hashCode());
	}

}
