package has_aRelationship;

public class Student extends Person{

//	String name;
//	int age;

	public static void m1(int i) {
		System.out.println("m1(int)");

	}

	public static void m1(int... x) {
		System.out.println("m1(varag)");
	}
	
	public void m3() {
		System.out.println("sub m3()");
	}
}
