package accessModifiers1;

public class B extends A {

	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();

		B b = new B();
		b.m1();

		A a2 = new B();
		a2.m1();

	}
}
