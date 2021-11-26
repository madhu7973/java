package multiThreading;

public class ChildWaitsMainDemo {

	public static void main(String[] args) throws InterruptedException {

//		ChildWaitsMain.mt = Thread.currentThread().join();
		ChildWaitsMain cwm = new ChildWaitsMain();
		cwm.start();
		cwm.join();
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
