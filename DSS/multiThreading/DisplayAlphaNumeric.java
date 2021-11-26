package multiThreading;

public class DisplayAlphaNumeric {
	public synchronized void dispNum() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
	}

	public synchronized void dispAlpha() {
		for (int i = 65; i < 70; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
