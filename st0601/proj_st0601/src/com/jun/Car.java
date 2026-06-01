package com.jun;

public class Car {
	private String owner;
	private String modelName;
	private String carNumber;
	private String brand;

	public Car(String owner, String modelName, String carNumber, String brand) {
		this.owner = owner;
		this.modelName = modelName;
		this.carNumber = carNumber;
		this.brand = brand;

	}

	// 차에 대한 모든 정보 출
	public void printCarInfo() {
		System.out.println("소유주: " + owner);
		System.out.println("모델 이름: " + modelName);
		System.out.println("차 번호: " + carNumber);
		System.out.println("브랜드: " + brand);
	}
	
	public void changeCar(String modelName, String brand) {
		this.modelName = modelName;
		this.brand = brand;
	}

	// getter
	public String getBrand() {
		return brand;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public String getOwner() {
		return owner;
	}

	// setter
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
