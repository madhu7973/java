package multiThreading;

public class SyncDemo {

	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MySync ms1 = new MySync(d1, "madhu");
		MySync ms2 = new MySync(d2, "sudan");
		ms1.start();
		ms2.start();

	}
}
