package multiThreading;

public class ChildWaitsMain extends Thread {
	static Thread mt;

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {

		}
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
