package com.jun;

public class MyObj {
	int x = 5;
	String name = "jun";

	public void myMethod() {
		System.out.println("myMethod 실행됨.");

	}

	public void myMethod(int i) {
//		System.out.println("myobj_" + i);
		
		String result = "myobj_" + i;
		System.out.println(result);
	}

	public void myMethod(String name) {
		System.out.println(name);
	}
}
