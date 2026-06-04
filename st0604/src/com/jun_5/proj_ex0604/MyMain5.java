package com.jun_5.proj_ex0604;

class MyMain5 {

	public static void main(String[] args) {
		
		CardPayment p1 = new CardPayment();
		TossPay p2 = new TossPay();
		
		p1.cardBrand = "VISA";
		
		p1.pay(2000);
		p2.pay(4000);
		
	}

}
