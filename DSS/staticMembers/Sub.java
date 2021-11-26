package staticMembers;

public class Sub extends Super {

	static int x = 20;
	static {
		m2();
		System.out.println("sub's first static block");
	}

	public static void main(String[] args) {
		m2();
		System.out.println("sub's main method");
	}

	public static void m2() {
		System.out.println(y);
	}

	static {
		System.out.println("sub's second static block");
	}

	static int y = 30;

}
