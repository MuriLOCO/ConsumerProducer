package com.jose.study;

public class C {

	private int n;
	private boolean value = false;
	
	public synchronized int get(){
		while(!value){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.print("Interrupted Exception caught.");
			}					
		}
		System.out.println("Got: " + n);
		value = false;
		notify();
		return n;
	}
	
	public synchronized void put(final int n){
		while(value){
			try{
				wait();
			}catch (InterruptedException e) {
				System.out.println("Interrupted Exception caught.");
			}
		}
		
		this.n = n;
		value = true;
		System.out.println("Put: " + n);
		notify();
	}
	
}


