package com.jun_5.proj_ex0605;

import java.util.ArrayList;

public class ArrayMain3 {

	public static void main(String[] args) {

		ArrayList<String> members = new ArrayList<String>();

		members.add("김철수");
		members.add("이영희");
		members.add("박민수");
		members.add("peter");
		members.add("jesus");
		members.add("yudas");
		
		System.out.println(members);
		
		members.remove("yudas");
		System.out.println(members);
	}

}
