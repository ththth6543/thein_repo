package com.jun.st0602;

public class Car2 extends Vehicle2 {
	String modelName = "XM3";

	public void honk() {
		System.out.println("빵빵");
		System.out.println("super: " + super.brand);
	}

}
