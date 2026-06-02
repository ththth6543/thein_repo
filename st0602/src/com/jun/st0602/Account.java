package com.jun.st0602;

public class Account {
	String accountNumber;
	String owner;
	int balance;

	public Account(String accountNumber, String owner, int balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	// 입금
	void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원 입금 완료");
		System.out.println("입금 후 남은 잔액: " + balance);
	}

	// 출금
	void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("잔액 부족");
			return;
		}
		balance -= amount;
		System.out.println(amount + "원 출금 완료");
		System.out.println("입금 후 남은 잔액: " + balance);
	}

	void showInfo() {
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("예금주: " + owner);
		System.out.println("잔액: " + balance);
	}
}
