package multiThreading;

public class Priorities {

	public static void main(String[] args) {

//		System.out.println(Thread.currentThread().getPriority());
//		int min = Thread.MIN_PRIORITY;
//		int norm = Thread.NORM_PRIORITY;
//		int max = Thread.MAX_PRIORITY;

//		public final int getPriority();
//		public final void setPriority();
//		Thread.currentThread().setPriority(7);
		MyPriority mp = new MyPriority();
		mp.setPriority(10);
		mp.start();
		System.out.println("Thread name is " + Thread.currentThread().getName());
		
		mp.yield();

//		System.out.println(mp.getPriority());
	}

}
