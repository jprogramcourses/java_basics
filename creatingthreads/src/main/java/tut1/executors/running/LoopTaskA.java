package tut1.executors.running;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable{
	
	private static int count;
	private int id;

	public void run() {
		System.out.println("<TASK" + id + "> STARTING ######");
		
		for(int i = 10; i >0 ; i--) {
			System.out.println("<" + id + ">TICK TICK - " + i);
			
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("***** <TASK-" + id + "> COMPLETED ************");
	}
	
	public LoopTaskA() {
		this.id = ++count;
	}

}
