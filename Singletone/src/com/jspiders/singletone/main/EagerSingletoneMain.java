package com.jspiders.singletone.main;

import com.jspiders.singletone.object.EagerSingletone;

public class EagerSingletoneMain {

	public static void main(String[] args) {
		EagerSingletone object1=EagerSingletone.getObject();
		EagerSingletone object2=EagerSingletone.getObject();
		EagerSingletone object3=EagerSingletone.getObject();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);

	}

}
