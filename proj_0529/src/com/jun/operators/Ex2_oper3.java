package com.jun.operators;

public class Ex2_oper3 {

	public static void main(String[] args) {
		// 연산자
		System.out.println("비교연산자 \n ----------");

		int x = 5;
		int y = 10;

		System.out.println("x == y : " + (x == y)); // false
		System.out.println("x != y : " + (x != y)); // true
		System.out.println("x < y  : " + (x < y)); // true
		System.out.println("x >= y : " + (x >= y)); // false

		// 조건문에서의 활용
		if (x < y) {
			System.out.println("x는 y보다 작습니다.");
		}
		System.out.println();

		String str1 = "hello";
		String str2 = new String("hello");

		// 메모리 주소값을 비교하기에 false
		System.out.println(str1 == str2);
		// 문자열내용 자체를 비교
		System.out.println(str1.equals(str2));
	}

}
