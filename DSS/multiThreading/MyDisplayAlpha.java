package multiThreading;

public class MyDisplayAlpha extends Thread {

	DisplayAlphaNumeric d;

	public MyDisplayAlpha(DisplayAlphaNumeric d) {
		this.d = d;
	}

	public void run() {
		d.dispAlpha();
	}
}
