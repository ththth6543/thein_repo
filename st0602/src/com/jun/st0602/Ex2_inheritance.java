package com.jun.st0602;

public class Ex2_inheritance extends Vehicle {

	private String modelName = "Mustang";

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();

		Ex2_inheritance ex2_inheritance = new Ex2_inheritance();

		ex2_inheritance.honk();

		System.out.println(ex2_inheritance.modelName);
	}

}
