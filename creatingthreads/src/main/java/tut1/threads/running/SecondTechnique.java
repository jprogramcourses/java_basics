package tut1.threads.running;

import java.util.concurrent.TimeUnit;

public class SecondTechnique {

	public static void main(String[] args) {
		System.out.println("Main thread starts here...");
		
		new SecondTask().start();
		Thread t = new SecondTask();
		t.start();
		
		System.out.println("Main thread starts here...");
	}

}

class SecondTask extends Thread{
	
	private static int count = 0;
	private int id; 

	@Override
	public void run() {
		for(int i = 10; i>0; i--) {
			System.out.println("<" + id + "> Tick " + i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public SecondTask() {
		this.id = count++;
	}
	
}
