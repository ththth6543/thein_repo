package com.jun_2.proj_ex0604;

public class MyMain2 {

	public static void main(String[] args) {
		Pig pig1 = new Pig();
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		Bird bird1 = new Bird();

		pig1.animalSound();
		cat1.animalSound();
		dog1.animalSound();
		bird1.animalSound();

		pig1.name = "피그";
		cat1.name = "톰";
		dog1.name = "퍼피";
		bird1.name = "트위터";
		
		pig1.printAnimal();
		cat1.printAnimal();
		dog1.printAnimal();
		bird1.printAnimal();
	}

}
