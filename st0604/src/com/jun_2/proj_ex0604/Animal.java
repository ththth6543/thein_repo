package com.jun_2.proj_ex0604;

class Animal {
	String name;
	int animalAge;

	public void animalSound() {
		System.out.println("The animal sound!");
	}

	public void printAnimal() {
		System.out.println();
		System.out.println("이름: "+this.name+", 나이: "+this.animalAge);
		animalSound();
		animalEating();
		animalSleeping();
	}

	public void animalEating() {
		System.out.println("쩝쩝");
	}

	public void animalSleeping() {
		System.out.println("쿨쿨");
	}
	
	public void setAge(int age) {
		this.animalAge = age;
	}
	
	public void addAge(int age) {
		this.animalAge += age;
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("꿀꿀꿀");
	}
	public void animalEating() {
		System.out.println("돼지: 쩝쩝");
	}

	public void animalSleeping() {
		System.out.println("돼지: 쿨쿨");
	}
}

class Cat extends Animal {
	public void animalSound() {
		System.out.println("야옹 야옹");
	}
	public void animalEating() {
		System.out.println("고양이: 쩝쩝");
	}

	public void animalSleeping() {
		System.out.println("고양이: 쿨쿨");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("멍멍");
	}
	public void animalEating() {
		System.out.println("개: 쩝쩝");
	}

	public void animalSleeping() {
		System.out.println("개: 쿨쿨");
	}
}

class Bird extends Animal {
	public void animalSound() {
		System.out.println("짹 짹");
	}
	public void animalEating() {
		System.out.println("새: 쩝쩝");
	}

	public void animalSleeping() {
		System.out.println("새: 쿨쿨");
	}

	public void babing() {
		System.out.println("알을 낳습니다");
	}
}