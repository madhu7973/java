package multiThreading;

public class MyThread extends Thread {

//	public void run() {
//		for (int i = 0; i < 3; i++)
//			System.out.println("child thread");
//	}

//	public void start() {
//		super.start();
//		System.out.println("start method");
//	}
//
	public void run() {
		System.out.println("run method is executed by " + Thread.currentThread().getName());
	}
}
