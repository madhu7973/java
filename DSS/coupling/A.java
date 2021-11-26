package coupling;

public class A {

	public static void main(String[] args) {
		B b = new B();
		int a = b.b;
		System.out.println(a);
	}

}
