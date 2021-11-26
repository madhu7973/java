package multiThreading;

public class LazyThread extends Thread{

	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("lazy thread");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			System.out.println("lazy thread interrupted");
		}
	}
}
