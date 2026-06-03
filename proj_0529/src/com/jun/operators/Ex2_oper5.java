package com.jun.operators;

public class Ex2_oper5 {

	public static void main(String[] args) {
		// 연산자
		System.out.println("비트연산자 \n ----------");

		int a = 10; // 2진수: 1010
		int b = 12; // 2진수: 1100

		// 1. 비트 논리 연산
		System.out.println("a & b : " + (a & b)); // 8 (1000)
		System.out.println("a | b : " + (a | b)); // 14 (1110)
		System.out.println("a ^ b : " + (a ^ b)); // 6 (0110)
		System.out.println("~a    : " + (~a)); // -11 (보수 관계로 인해 부호가 바뀜)

		// 2. 비트 시프트 연산
		int x = 8; // 2진수: 1000
		System.out.println("x << 2 : " + (x << 2)); // 32 (8 * (2^2))
		System.out.println("x >> 2 : " + (x >> 2)); // 2 (8 / (2^2))
	}

}
