package com.jun.st0602;

public class Ex8_Account {

	public static void main(String[] args) {
		Account acc = new Account("100-200", "유준열", 100000);
				
		acc.deposit(50000);
		acc.withdraw(30000);
		acc.showInfo();
		acc.withdraw(1000000);
	}

}
