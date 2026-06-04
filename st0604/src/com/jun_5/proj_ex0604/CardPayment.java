package com.jun_5.proj_ex0604;

class CardPayment extends Payment {
	String cardBrand;

	@Override
	void pay(int amount) {
		System.out.println(cardBrand + "카드로 " + amount + "원 결제");
	}
}
