package com.jose.study;

public class Consumer implements Runnable {

	final private C c;
	
	public Consumer(final C c){
		this.c = c;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		while(true){
			c.get();
		}
		
	}
	
	
}
