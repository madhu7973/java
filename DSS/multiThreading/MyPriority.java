package multiThreading;

public class MyPriority extends Thread {

	public void run() {
		System.out.println("Thread name is " + Thread.currentThread().getName());
	}
}
