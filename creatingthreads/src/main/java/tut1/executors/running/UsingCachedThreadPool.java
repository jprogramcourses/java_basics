package tut1.executors.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {

	public static void main(String[] args) {
		long timeInit;
		long timeEnd;
		
		System.out.println("Main thread start here...");
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		timeInit = System.currentTimeMillis();
		
		for(int i = 0; i < 6; i++) {
			executorService.execute(new LoopTaskA());
		}
		
		timeEnd = System.currentTimeMillis();
		
		System.out.println("Time " + (timeEnd - timeInit));
		
		executorService.shutdown();
		
		System.out.println("Main thread ends here...");

	}

}
