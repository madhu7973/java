package multiThreading;

public class TargetThreadDemo {

	public static void main(String[] args) {
		
		TargetThread td = new TargetThread();
		td.start();
		td.interrupt();
		System.out.println("main thread ends");

	}

}
