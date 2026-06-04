package com.jun.proj_ex0604;

public class MyMain1 {

	public static void main(String[] args) {
		Account acc = new Account("100-200", "jun", 10000);

		acc.deposit(8000);
		acc.withdraw(10000);
	}

}
