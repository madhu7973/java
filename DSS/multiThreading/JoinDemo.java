package multiThreading;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyJoin mj = new MyJoin();
		mj.start();
		mj.join();
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

}
