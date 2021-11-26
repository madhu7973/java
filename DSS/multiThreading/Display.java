package multiThreading;

public class Display {

	public static synchronized void m1(String name) {
		for (int i = 0; i < 3; i++) {
			System.out.print("GM: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
}
