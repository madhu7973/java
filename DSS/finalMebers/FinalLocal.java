package finalMebers;

public class FinalLocal {

	public static void main(String[] args) {
//		final int x;
//		System.out.println("hello");
		m1(5, 10);
	}

	public static void m1(final int a, final int b) {
//		a = 10;
//		b = 100;

		System.out.println(a + b);
	}
}
