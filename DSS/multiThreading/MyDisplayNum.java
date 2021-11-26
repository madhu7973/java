package multiThreading;

public class MyDisplayNum extends Thread {

	DisplayAlphaNumeric d;

	public MyDisplayNum(DisplayAlphaNumeric d) {
		this.d = d;
	}

	public void run() {
		d.dispNum();
	}
}
