package exceptionsHandling;

public class ThrowCase1 extends RuntimeException{

	static ArithmeticException ae1 = new ArithmeticException();
	public static void main(String[] args) {
		throw new ThrowCase1();
	}
}
