package javase14concurrency;

// Extend class Thread, not flexible design and not recommended
//public class Lateral extends Thread {

// Common practice
public class Lateral implements Runnable {

    @Override
    public void run() {

	System.out.println("Run in Lateral");

    }

}
