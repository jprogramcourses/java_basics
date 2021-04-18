package javase14concurrency;

public class Pract1Concurrency {

    public static void getNumberHardwareThreads() {

	// Find out how many hardware threads the JVM has access to.
	Runtime r = Runtime.getRuntime();
	int numOfHardwareThreads = r.availableProcessors();

    }

}
