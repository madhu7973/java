package exceptionsHandling;

public class StackMechanism {

	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();
	}

	private static void doMoreStuff() {
		System.out.println(10/0);
		System.out.println("hello");
	}
}
