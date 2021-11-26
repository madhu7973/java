package multiThreading;

public class LazyThreadDemo {

	public static void main(String[] args) {
		LazyThread lt = new LazyThread();
		lt.start();
	//	lt.interrupt();
		System.out.println("main thread ends");
	}
}
