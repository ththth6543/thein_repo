package com.jun.operators;

public class Ex2_oper2 {

	public static void main(String[] args) {
		// 연산자
		System.out.println("할당연산자 \n ----------");

		// 9800이라는 가격정보를 price 변수에 할당(대입)
		int price = 9800;
		int discount = 100;

		// final로 선언되면 값을 바꿀 수 없음.
		final int value = 50;

		System.out.println(price);
		System.out.println(discount);

		System.out.println("-------복합 대입 연산자-------");
		price += discount;
		System.out.println(price); // 9900
		price -= discount;
		System.out.println(price); // 9800;
		price *= discount;
		System.out.println(price); // 980000;
		price /= discount;
		System.out.println(price); // 9800;
	}

}
