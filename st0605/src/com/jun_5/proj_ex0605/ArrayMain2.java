package com.jun_5.proj_ex0605;

import java.util.ArrayList;
import java.util.Random;

public class ArrayMain2 {

	public static void main(String[] args) {

		ArrayList<Integer> scores = new ArrayList<Integer>();
		Random random = new Random();
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int j = random.nextInt(101);
			scores.add(j);
			sum += j;
		}
		System.out.println(scores);
		double avg = (double) sum / scores.size();
		System.out.println("총 점수: " + sum);
		System.out.println("평균: " + avg);
	}

}
