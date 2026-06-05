package com.jun_5.proj_ex0605;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMain4 {

	public static void main(String[] args) {

		ArrayList<String> products = new ArrayList<String>();
		products.add("노트북");
		products.add("마우스");
		products.add("키보드");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색 입력: ");
		String keyword = sc.nextLine();
		
		if (products.contains(keyword)) {
			System.out.println("상품이 존재");
		} else {
			System.out.println("상품이 없음");
		}
		sc.close();

	}

}
