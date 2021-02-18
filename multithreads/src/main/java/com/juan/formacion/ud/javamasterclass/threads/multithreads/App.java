package com.juan.formacion.ud.javamasterclass.threads.multithreads;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//		lectionZero();

		lectionMultipleThreads();

	}

	private static void lectionMultipleThreads() {
		Countdown countdown = new Countdown();

		CountdownThread thread1 = new CountdownThread(countdown);
		thread1.setName("Thread 1");
		CountdownThread thread2 = new CountdownThread(countdown);
		thread2.setName("Thread 2");

		thread1.start();
		thread2.start();
	}

	private static void lectionZero() {

		System.out.println("Hello from Main");

		final Thread anotherThread = new AnotherThread();
		anotherThread.setName("Thread 1");
		anotherThread.start();

		new Thread() {
			public void run() {
				System.out.println("Hello from anonymous class");
			}
		}.start();

		Thread myRunnableThread = new Thread(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("Hello from anonymous class`s implementation of run");
				try {
					anotherThread.join();
					System.out.println("Another thread terminated. So I'm running again");
				} catch (InterruptedException e) {
					System.out.println("I couldn't wait after all. I was interrupted");
				}
			}

		});

		myRunnableThread.start();

//        anotherThread.interrupt();

		System.out.println("Fin Main");

	}
}

class Countdown {

	public void doCountdown() {
		String thread = null;
		String currentThreadName = Thread.currentThread().getName();

		switch (currentThreadName) {
			case "Thread 1":
				thread = ThreadName.MAIN_THREAD;
				break;
			case "Thread 2":
				thread = ThreadName.SECOND_THREAD;
				break;
			case "Thread 3":
				thread = ThreadName.THIRD_THREAD;
				break;
		}

		synchronized (this) {
			for (int i = 10; i >= 0; i--) {
				System.out.println(thread + " " + currentThreadName + ": " + i);
			}
			
		}
	}
}

class CountdownThread extends Thread {
	private Countdown threadCountdown;

	public CountdownThread(Countdown countdownTread) {
		this.threadCountdown = countdownTread;
	}

	public void run() {
		threadCountdown.doCountdown();
	}
}
