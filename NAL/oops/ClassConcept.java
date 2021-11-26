package oops;

public class ClassConcept {

	int i;
	String s;

	void func() {
		System.out.println("member functions");
	}

	public static void main(String[] args) {

		ClassConcept cc1 = new ClassConcept();

		System.out.println(cc1.i = 10);
		System.out.println(cc1.s = "one");
		cc1.func();

		ClassConcept cc2 = new ClassConcept();

		System.out.println(cc2.i = 20);
		System.out.println(cc2.s = "two");
		cc2.func();

	}

}
