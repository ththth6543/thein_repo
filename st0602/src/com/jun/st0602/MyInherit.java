package com.jun.st0602;

public class MyInherit {

	public static void main(String[] args) {
		Pig pig = new Pig();
		Dog dog = new Dog();
		
		//create cat object
		Cat cat = new Cat();
		System.out.println("pig: "+pig.getColor());
		System.out.println("dog: "+dog.getColor());
		System.out.println("cat: "+cat.getColor());
	}

}
