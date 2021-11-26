package multiThreading;

public class ThreadDemo {

	public static void main(String[] args) {

//		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("MAIN");
		MyThread mt = new MyThread();
//		System.out.println(Thread.currentThread().getName());
		mt.setName("MADHU");
		mt.start();
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setName("MADHU");
//		System.out.println(mt.getName());
		// Thread t = new Thread(mt);
		// t.start();
		// System.out.println(t.getName());

//		System.out.println(Thread.currentThread().getName());
//		t.start();

//		mt.start();

//		Thread t1 = new Thread();
//		Thread t2 = new Thread(Runnable r1);
//		Thread t3 = new Thread(String name1);
//		Thread t4 = new Thread(Runnable r2, String name2);
//		Thread t5 = new Thread(ThreadGroup g1, String name3);
//		Thread t6 = new Thread(ThreadGroup g2, Runnable r3);
//		Thread t7 = new Thread(ThreadGroup g3, Runnable r4, String name4);
//		Thread t8 = new Thread(ThreadGroup g4, Runnable r5, String name5, long stacksize);

		System.out.println("main method is executed by " + Thread.currentThread().getName());
//		for (int i = 0; i < 3; i++)
//			System.out.println("main thread");

	}

}
