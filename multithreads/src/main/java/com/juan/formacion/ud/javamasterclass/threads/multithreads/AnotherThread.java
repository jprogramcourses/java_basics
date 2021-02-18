package com.juan.formacion.ud.javamasterclass.threads.multithreads;

public class AnotherThread extends Thread {

	@Override
	public void run() {
		
		System.out.println("Hello from " + currentThread().getName());
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println("Another thread woke me up");
			return;
		}
		
		System.out.println("Three seconds passed and I'm awake");
	}

}
