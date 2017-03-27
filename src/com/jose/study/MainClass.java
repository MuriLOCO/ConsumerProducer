package com.jose.study;

public class MainClass {

	public static void main(String[] args) {
		final C c = new C();
		
		new Producer(c);
		new Consumer(c);
		
		System.out.println("Press Control-C to stop.");

	}

}
