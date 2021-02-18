package tut1.threads.running;

import java.util.concurrent.TimeUnit;

public class FourdTechnique {

	public static void main(String[] args) {
		System.out.println("Main thread starts here...");
		
		new Thread(new FourdTask()).start();
		Thread t = new Thread(new FourdTask());
		t.start();
		
		System.out.println("Main thread starts here...");
	}

}

class FourdTask implements Runnable{
	
	private static int count = 0;
	private int id;

	
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
	
	public FourdTask() {
		this.id = count++;
	}
	
}
