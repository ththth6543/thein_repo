package com.jun;

public class Ex1_datatype {

	public static void main(String[] args) {
		int myIntNum = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		double myDouble = 20.000;
		String myText = "hello";

		System.out.println("--- 정수형 타입 크기 ---");
		System.out.println("byte   : " + Byte.SIZE + " bits (" + Byte.BYTES + " bytes)");
		System.out.println("short  : " + Short.SIZE + " bits (" + Short.BYTES + " bytes)");
		System.out.println("int    : " + Integer.SIZE + " bits (" + Integer.BYTES + " bytes)");
		System.out.println("long   : " + Long.SIZE + " bits (" + Long.BYTES + " bytes)");

		System.out.println("\n--- 실수형 타입 크기 ---");
		System.out.println("float  : " + Float.SIZE + " bits (" + Float.BYTES + " bytes)");
		System.out.println("double : " + Double.SIZE + " bits (" + Double.BYTES + " bytes)");

		System.out.println("\n--- 문자형 타입 크기 ---");
		System.out.println("char   : " + Character.SIZE + " bits (" + Character.BYTES + " bytes)");

		System.out.println("Widening Casting (automatic) - converting a smaller type to a larger type size\n"
				+ "byte -> short -> char -> int -> long -> float -> double");
		System.out.println("Narrowing Casting (manual) - converting a larger type to a smaller type size\n"
				+ "double -> float -> long -> int -> char -> short -> byte");

		double resultDouble = myIntNum;
		System.out.println("int타입의 값을 double타입의 변수에 대입 " + resultDouble);

		int resultInt = (int) myDouble;
		System.out.println("double 타입의 값을 int타입의 변에 대입하려면 \n 타입캐스팅 필요 " + resultInt);
	}

}
