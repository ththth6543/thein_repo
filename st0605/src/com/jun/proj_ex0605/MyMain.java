package com.jun.proj_ex0605;

public class MyMain {

	public static void main(String[] args) {
		Greeting greet = new Greeting() {
			public void sayHello() {
				System.out.println("hello world!");
			}
		};
		
		greet.sayHello();
	}

}
