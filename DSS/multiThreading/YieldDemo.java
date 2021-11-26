package multiThreading;

public class YieldDemo {

	public static void main(String[] args) {
		MyYield my = new MyYield();
		my.start();
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
