package multiThreading;

public class TargetThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("lazy thread " + i);
		}
		System.out.println("entering sleep");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("lazy thread interrupted");
		}
	}
}
