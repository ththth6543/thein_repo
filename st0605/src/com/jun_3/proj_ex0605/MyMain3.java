package com.jun_3.proj_ex0605;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class MyMain3 {

	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj + "\n");

		LocalTime myObj2 = LocalTime.now();
		System.out.println(myObj2 + "\n");

		LocalDateTime myObj3 = LocalDateTime.now();
		System.out.println(myObj3 + "\n");

		LocalDateTime myDataObj = LocalDateTime.now();
		System.out.println("before: " + myDataObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = myDataObj.format(myFormatObj);
		System.out.println("after: " + formattedDate);
	}

}
