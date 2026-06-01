package com.jun;

public class Ex1 {

	public static void main(String[] args) {
		MyObj myobj_1 = new MyObj();
		MyObj myobj_2 = new MyObj();
		MyObj myobj_3 = new MyObj();
		System.out.println(myobj_1.x);
		System.out.println(myobj_2.x);
		System.out.println(myobj_3.x);
		myobj_3.x = 10;
		myobj_3.name = "youjun";
		System.out.println(myobj_3.x);
		System.out.println(myobj_3.name);
		System.out.println(myobj_2.x);
		System.out.println(myobj_2.name);

		myobj_1.myMethod();
		myobj_2.myMethod();
		myobj_3.myMethod();
		
		myobj_1.myMethod(1);
		myobj_1.myMethod(2);
		myobj_1.myMethod(3);
		System.out.println();
		myobj_1.myMethod("myobj_1");
		myobj_2.myMethod("myobj_2");
		myobj_3.myMethod("myobj_3");
	}
}
