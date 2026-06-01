package com.jun;

public class MyCar {
	int modelYear;
	int num1;
	int num2;

	String modelName;

	public MyCar() {

	}

	public MyCar(int i) {

	}

	public MyCar(int year, String name) {
		modelYear = year;
		modelName = name;
		System.out.println(year + " " + name);
	}
}
