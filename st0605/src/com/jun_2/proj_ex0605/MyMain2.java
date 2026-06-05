package com.jun_2.proj_ex0605;

import java.util.Iterator;

public class MyMain2 {

	public static void main(String[] args) {
//		Level myVar = Level.MEDIUM;
//		System.out.println(myVar);
//
//		switch (myVar) {
//		case LOW: {
//
//			System.out.println("low temperature");
//			break;
//		}
//		case MEDIUM: {
//
//			System.out.println("medium temperature");
//			break;
//		}
//		case HIGH: {
//
//			System.out.println("high temperature");
//			break;
//		}
//
//		}

		System.out.println("=== level 2====");

		Level2 myVar2 = Level2.MEDIUM;
		System.out.println(myVar2);

		System.out.println("---------------");

		for (Level2 v2 : Level2.values()) {
			System.out.println(v2 + " : " + v2.getDescription());
		}

	}
}