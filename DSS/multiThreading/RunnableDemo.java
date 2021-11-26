package multiThreading;

public class RunnableDemo {
	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 3; i++)
			System.out.println("main thread");

//		r.start;
		r.run();

	}
}
