package com.juan.formacion.ud.javamasterclass.threads.javautilproducerconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class MainJavaUtilProducerConsumer {

	public static final String EOF = "EOF";

	public static void main(String[] args) {
		List<String> buffer = new ArrayList<>();

		ReentrantLock bufferLock = new ReentrantLock();
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		MyProducer myProducer = new MyProducer(buffer, ThreadColor.YELLOW, bufferLock);
		MyConsumer myConsumer1 = new MyConsumer(buffer, ThreadColor.BLACK, bufferLock);
		MyConsumer myConsumer2 = new MyConsumer(buffer, ThreadColor.BLUE, bufferLock);

		executorService.execute(myProducer);
		executorService.execute(myConsumer1);
		executorService.execute(myConsumer2);
		
		Future<String> future = executorService.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("I've been printed for the Callable class");
				return "This is the callable result";
			}
		});
		
		try {
			System.out.println(future.get());
		}catch(ExecutionException e) {
			System.out.println("Something went wrong");
		} catch (InterruptedException e) {
			System.out.println("Thread running the task was interrupted");
		}

		executorService.shutdown();
	}

}

class MyProducer implements Runnable {

	private List<String> buffer;
	private String color;
	private ReentrantLock bufferLock;

	public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
		this.buffer = buffer;
		this.color = color;
		this.bufferLock = bufferLock;
	}

	@Override
	public void run() {
		Random random = new Random();

		String[] nums = { "1", "2", "3", "4", "5" };

		for (String num : nums) {
			try {
				System.out.println(color + " Adding..." + num);

//				synchronized(buffer) {
//					buffer.add(num);
//				}
				bufferLock.lock();
				try {
					buffer.add(num);					
				}finally {					
					bufferLock.unlock();
				}

				Thread.sleep(random.nextInt(2000));
			} catch (InterruptedException e) {
				System.out.println("Producer was interrupted.");
			}
		}

		System.out.println(color + " Adding EOF and exiting...");
		bufferLock.lock();
		try {
			buffer.add(MainJavaUtilProducerConsumer.EOF);			
		}finally {
			bufferLock.unlock();			
		}
	}

}

class MyConsumer implements Runnable {
	private List<String> buffer;
	private String color;
	private ReentrantLock bufferLock;

	public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock) {
		this.buffer = buffer;
		this.color = color;
		this.bufferLock = bufferLock;
	}

	@Override
	public void run() {
		int counter = 0;
		
		while (true) {
			if(bufferLock.tryLock()) {
				try {
					if (buffer.isEmpty()) {
						continue;
					}
					System.out.println(color + " The counter is " + counter);
					counter = 0;
					if (buffer.get(0).equals(MainJavaUtilProducerConsumer.EOF)) {
						System.out.println(color + " Exiting");
						break;
					} else {
						System.out.println(color + " Removed " + buffer.remove(0));
					}				
				}finally {
					bufferLock.unlock();				
				}
			}else {
				counter++;
			}
		}
	}

}
