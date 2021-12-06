package javase14concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class MainJavaConcurrency {

    private static final Logger LOGGER = Logger.getLogger(MainJavaConcurrency.class);

    public static void main(String[] args) {
	Lateral lateral = new Lateral();
	new Thread(lateral).start();
	new Thread(lateral).start();
	new Thread(lateral).start();
	new Thread(lateral).start();
	new Thread(lateral).start();

	Pract1Concurrency.getNumberHardwareThreads();

	// Common practice of implementation of threads
	Thread tCommon = new Thread(new Lateral());
	// Schedule thread to run
	tCommon.start();

	// Good for small amount of actions: Implement Runnable using a Lambda
	// expression
	Runnable rLambda = () -> {
	    System.out.println("Run in Lambda expression");
	};
	Thread tLambda = new Thread(rLambda);
	tLambda.start();

	Thread.State phaseTLambda = tLambda.getState();
	System.out.println("Phase TLambda 1: " + phaseTLambda);

	exampleThreadLifeCycleBad(tCommon, tLambda);

	exampleThreadLifeCycle();

	exampleInterruptThread();

	exampleCommonThreadProperties();

	exampleCreateExecutorServiceObjects();
    }

    private static void exampleThreadLifeCycleBad(Thread... threads) {
	System.out.println("************** Thread Life Cycle Bad ****************");
	Thread.State phaseTCommon = threads[0].getState();
	Thread.State phaseTLambda = threads[1].getState();
	System.out.println("Phase TCommon: " + phaseTCommon);
	System.out.println("Phase TLambda 2: " + phaseTLambda);
    }

    private static void exampleThreadLifeCycle() {
	System.out.println("************** Thread Life Cycle ****************");
	Runnable rLambda = () -> {
	    System.out.println("Run in Lambda expression");
	};
	Thread tLambda1 = new Thread(rLambda);
	Thread tLambda2 = new Thread(rLambda);
	tLambda1.start();
	Thread.State phaseTLambda1 = tLambda1.getState();
	System.out.println("Phase TLambda 1_1: " + phaseTLambda1);
	tLambda2.start();

	Thread.State phaseTLambda2 = tLambda2.getState();
	System.out.println("Phase TLambda 1_2: " + phaseTLambda1);
	System.out.println("Phase TLambda 2: " + phaseTLambda2);
    }

    private static void exampleInterruptThread() {
	System.out.println("************** Thread Interrupt ****************");

	Runnable rInterrupt = () -> {
	    System.out.println("Thread example interruption");
	    Thread ct = Thread.currentThread();
	    System.out.println("Current thread: " + ct.toString());
	    while (!ct.isInterrupted()) {
		try {
		    System.out.println("Thread is not interrupted");
		    Thread.sleep(1000);
		    System.out.println("End thread sleep");
		} catch (InterruptedException ex) {
		    System.out.println("Interrupted exception");
		    return;
		}
	    }
	    System.out.println("End thread");
	};

	Thread tInterrupt = new Thread(rInterrupt);
	tInterrupt.start();
	tInterrupt.interrupt();
    }

    private static void exampleBlockThread() {

    }

    private static void exampleCommonThreadProperties() {
	System.out.println("************** Thread Common Properties ****************");
	Runnable rCommonProperties = () -> {
	    System.out.println("Thread common properties");
	};
	Thread tCommonProperties = new Thread(rCommonProperties, "ThreadProperties");
	tCommonProperties.setDaemon(true);
	tCommonProperties.start();

	long id = tCommonProperties.getId();
	String name = tCommonProperties.getName();
	LOGGER.info("Thread name: " + name);
	LOGGER.info("Thread id: " + id);
	if (tCommonProperties.isDaemon()) {
	    LOGGER.info("Log info: Thread is daemon");
	    LOGGER.debug("Log debug: Thread is daemon");
	    LOGGER.error("Log error: Thread is daemon");
	}
	tCommonProperties.setPriority(3);
	try {
	    tCommonProperties.join(); // wait for the thread to terminate
	} catch (InterruptedException ex) {
	    System.out.println("Catch Interrupted exception");
	    LOGGER.error("Catch Interrupted exception", ex);
	}
    }

    private static void exampleCreateExecutorServiceObjects() {
	Runnable task = () -> {
	    LOGGER.info("Task");
	};
	ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
	ses.scheduleAtFixedRate(task, 10, 5, TimeUnit.SECONDS);
	ExecutorService es = Executors.unconfigurableExecutorService(ses);
    }

}
