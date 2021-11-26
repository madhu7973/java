package constructor;

public class SubClass extends SuperClass {
	int x = 200;

	SubClass() {
		System.out.println("subclass constructor");
	}

	public void m1() {
		System.out.println(super.x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.m1();
	}

}
