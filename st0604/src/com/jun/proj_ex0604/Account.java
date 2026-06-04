package com.jun.proj_ex0604;

class Account {

	private String accountNum;
	private String owner;
	private int balance;

	Account(String accountNum, String owner, int balance) {
		this.accountNum = accountNum;
		this.owner = owner;
		this.balance = balance;

		myprint();
	}

	private void myprint() {
		System.out.println("accountNum: " + accountNum);
		System.out.println("owner: " + owner);
		System.out.println("balance: " + balance);
		System.out.println();
	}

	void deposit(int amount) {
		this.balance += amount;
		System.out.println(amount + "원 입금");
		System.out.println("현재 잔액: " + balance);
		System.out.println();
	}

	void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.balance -= amount;
		System.out.println(amount + "원 출금");
		System.out.println("현재 잔액: " + balance);
		System.out.println();
	}

}
