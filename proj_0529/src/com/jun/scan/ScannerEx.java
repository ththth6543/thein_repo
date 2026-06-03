package com.jun.scan;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("== 두 숫자 합을 구하기 ==");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자: ");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자: ");
		int b = sc.nextInt();
		System.out.print("두 숫자의 합: ");
		System.out.println(a + b);
	}

}
