package staticMembers;

public class Super {
	static int i = 10;
	static {
		m1();
		System.out.println("super's static block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("super's main method");
	}

	public static void m1() {
		System.out.println(j);
	}

	static int j = 20;
}
