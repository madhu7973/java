package staticMembers;

public class RIWO_RW {

	static int i = 10;
	static {
		m1();
		System.out.println(i);
	}

	public static void m1() {
		System.out.println(i);
	}
}
