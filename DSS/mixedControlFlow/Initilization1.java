package mixedControlFlow;

public class Initilization1 {

	private static String m1(String msg) {
		System.out.println(msg);
		return msg;
	}

	Initilization1() {
		m = m1("1");
	}

	{
		m = m1("2");
	}

	String m = m1("3");

	public static void main(String[] args) {
		Object o = new Initilization1();
	}
}
