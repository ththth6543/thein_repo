package com.jun.st0602;

public class Car {

	String modelName;
	int modelYear;

	public Car() {
		System.out.println("기본 생성자");
	}

	public Car(String carName) {
		this.modelName = carName;
		System.out.println("modelNAme: " + this.modelName);
	}

	public Car(int year, String carName) {
		this.modelYear = year;
		this.modelName = carName;

		System.out.println("modelYear: " + this.modelYear);
		System.out.println("modelName: " + this.modelName);
	}

	public void printInfo() {
		System.out.println(this.modelYear + " -- " + this.modelName);
	}

}
