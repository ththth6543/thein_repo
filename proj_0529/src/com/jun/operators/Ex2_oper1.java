package com.jun.operators;

public class Ex2_oper1 {

	public static void main(String[] args) {
		System.out.println("산술 연산자 -------");
		int x = 10;
		int y = 3;

		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		// '/' 연산자는 정수끼리 나누면 몫만 남는다.
		System.out.println(x + " / " + y + " = " + (x / y));
		// 나머지를 구하는 연산자
		System.out.println(x + " % " + y + " = " + (x % y));

		System.out.println();

		int a = 10; // 1. 전위 연산자 (++a) : "먼저 더하고, 그 다음에 사용한다"
		System.out.println("--- 전위 연산자 ---");
		System.out.println("++a 실행 중인 값: " + (++a)); // 11 (먼저 1을 더하고 출력)
		System.out.println("실행 후 a의 값: " + a); // 11

		System.out.println(); // 줄바꿈

		// 2. 후위 연산자 (b++) : "먼저 사용하고, 그 다음에 더한다"
		int b = 10;
		System.out.println("--- 후위 연산자 ---");
		System.out.println("b++ 실행 중인 값: " + (b++)); // 10 (기존 10을 먼저 출력하고 내부적으로 1 더함)
		System.out.println("실행 후 b의 값: " + b); // 11
	}

}
