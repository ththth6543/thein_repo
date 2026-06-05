package com.jun_5.proj_ex0605;

public class MyMain6 {

	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - 안돼요.");
		} else {
			System.out.println("Access granted - 성인 입장 가능");
		}
	}

	public static void main(String[] args) {

// 	try ~catch
//		try {
//			int[] myNumbers = { 1, 2, 3 };
//			System.out.println(myNumbers[10]);
//		} catch (Exception e) {
//			System.out.println("문제가 생김: " + e);
//		} finally {
//			System.out.println("try ~ catch가 끝남");
//		}
//		checkAge(15);

		try {
			int[] numbers = { 1, 2, 3 };
//			System.out.println(numbers[10]);
			int result = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스가 존재하지 않음: " + e);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 불가: " + e);
		} catch (Exception e) {
			System.out.println("뭔가 오류가 생김");
		}
	}

}
