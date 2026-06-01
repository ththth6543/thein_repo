package com.jun;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		MyCar myCar2 = new MyCar(2);
		MyCar myCar3 = new MyCar(1969, "Mustang");
		Scanner sc = new Scanner(System.in);
		MyCalc calc = new MyCalc();
		String[] opers = { "+", "-", "*", "/" };

		while (true) {
			System.out.println("'q' 입력시 종료");
			System.out.println("연산자를 입력(+ - * /)");
			calc.operator = sc.next();
			for (String op : opers) {
				if (calc.operator.equals(op)) {
					System.out.print("계산할 첫번째 문자 입력: ");
					calc.num1 = sc.nextInt();
					System.out.print("계산할 두번째 문자 입력: ");
					calc.num2 = sc.nextInt();
					if (calc.num2 == 0 && calc.operator.equals("/")) {
						while (true) {
							System.out.println("0으로 나눌 수 없습니다! 다시 입력");
							System.out.print("계산할 두번째 문자 입력: ");
							calc.num2 = sc.nextInt();
							if (calc.num2 != 0) {
								break;
							}
						}
					}
					calc.calculate();
					System.out.println();
				}
			}

			if (calc.operator.equals("q")) {
				System.out.println("계산기를 종료");
				break;
			} else {
				System.out.println("옳바른 연산자를 입력");
			}
		}
	}
}
