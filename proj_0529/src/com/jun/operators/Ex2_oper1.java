package com.jun.operators;

import javax.sound.midi.Soundbank;

public class Ex2_oper1 {

	public static void main(String[] args) {
		System.out.println("산술 연산자 -------");
		int x = 10;
		int y = 10;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		int z = 5;
		++z;
		System.out.println(z);
		--z;
		--z;
		--z;
		System.out.println(z);

	}

}
