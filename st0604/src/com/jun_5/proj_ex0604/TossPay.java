package com.jun_5.proj_ex0604;

class TossPay extends Payment {
	@Override
	void pay(int amount) {
		System.out.println("토스 페이로 결제: " + amount + "원");
	}

}
