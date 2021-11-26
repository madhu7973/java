package exceptionsHandling;

import java.io.PrintWriter;

public class Throws {
	public static void main(String[] args) throws InterruptedException {
//		PrintWriter pw = new PrintWriter("abc.text");
//		pw.println("hello");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		doStuff();
	}

	private static void doStuff() throws InterruptedException {
		doMoreStuff();
	}

	private static void doMoreStuff() throws InterruptedException {
		Thread.sleep(1000);
	}
}
