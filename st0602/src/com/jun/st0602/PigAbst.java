package com.jun.st0602;

public class PigAbst extends AnimalAbst {

	@Override
	void animalSound() {
	System.out.println("abs에서 구현 완");
		
	}

	@Override
	void sleep() {
		System.out.println("good night");
	}

}
