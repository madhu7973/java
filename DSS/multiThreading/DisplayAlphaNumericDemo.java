package multiThreading;

public class DisplayAlphaNumericDemo {

	public static void main(String[] args) {
		DisplayAlphaNumeric d = new DisplayAlphaNumeric();
		MyDisplayNum num = new MyDisplayNum(d);
		MyDisplayAlpha alpha = new MyDisplayAlpha(d);
		num.start();
		alpha.start();

	}

}
