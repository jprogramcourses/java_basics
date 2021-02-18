package tut1.threads.running;

import java.util.concurrent.TimeUnit;

public class FifthTechnique {

	public static void main(String[] args) {
		System.out.println("Main thread starts here...");
		
		Thread t = new Thread(new Runnable() {

			public void run() {
				
				for(int i = 10; i>0; i--) {
					System.out.println("Tick " + i);
					
					try {
						TimeUnit.MILLISECONDS.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		
		t.start();
		
		System.out.println("Main thread end here...");

	}

}
