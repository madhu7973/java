package accessModifiers2;

import accessModifiers1.A;

public class C extends A {
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();

		A a2 = new C();
		a2.m1();

		C c = new C();
		c.m1();
	}
}
