package com.jose.study;

public class Producer implements Runnable {

	private final C c;
	
	public Producer(final C c) {
		this.c = c;
		new Thread(this, "Producer").start();
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true){
			c.put(i++);
		}
		
	}

}
