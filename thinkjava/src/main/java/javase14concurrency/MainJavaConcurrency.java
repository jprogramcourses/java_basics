package javase14concurrency;

public class MainJavaConcurrency {

    public static void main(String[] args) {
	Lateral lateral = new Lateral();
	new Thread(lateral).start();
	new Thread(lateral).start();
	new Thread(lateral).start();
	new Thread(lateral).start();
	new Thread(lateral).start();
    }

}

class Lateral implements Runnable {

    @Override
    public void run() {

	System.out.println("Run");

    }

}
