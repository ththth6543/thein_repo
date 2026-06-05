package com.jun_5.proj_ex0605;

import java.util.ArrayList;

public class MyMain5 {

	public static void main(String[] args) {
		
		ArrayList<String> cars;
		
		cars = new ArrayList<String>();
		System.out.println(cars);
		
		cars.add("volvo");
		cars.add("BMW");
		cars.add("ford");
		cars.add("mazuda");
		
		System.out.println(cars);
		
		cars.add(0, "추가된 자동차");
		System.out.println(cars);
		
		System.out.println(cars.get(0));
		
		cars.set(0, "현대");
		System.out.println(cars);
		
		cars.remove(4);
		System.out.println(cars);
		
		cars.clear();
		System.out.println(cars);

	}

}
