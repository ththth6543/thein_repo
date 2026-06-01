package com.jun;

public class MyCalc {
	String operator;
	int num1;
	int num2;

	public void calculate() {
		if (operator.equals("+")) {
			System.out.println("계산한 결과: " + num1 + " + " + num2 + " = " + (num1 + num2));
		} else if (operator.equals("-")) {
			System.out.println("계산한 결과: " + num1 + " - " + num2 + " = " + (num1 - num2));
		} else if (operator.equals("*")) {
			System.out.println("계산한 결과: " + num1 + " * " + num2 + " = " + (num1 * num2));
		} else if (operator.equals("/")) {
			System.out.println("계산한 결과: " + num1 + " / " + num2 + " = " + (num1 / num2));
		}
	}
}