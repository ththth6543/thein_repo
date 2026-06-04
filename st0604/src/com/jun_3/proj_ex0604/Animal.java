package com.jun_3.proj_ex0604;

abstract class Animal {
	String nickname;
	String gender;
	int age;

	void Eat() {
		System.out.println("동물이 밥을 먹습니다.");
	}

	void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}

	abstract void cry();
	
	void printAnimal() {
		System.out.println(
				"\n이름: "+nickname+
				"\n성별: "+gender+
				"\n나이: "+age);
		Eat();
		sleep();
		cry();
	}
}
