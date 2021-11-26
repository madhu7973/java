package varArgs;

public class VarArg {

	public static final synchronized strictfp void main(String[] args) {
//		m1();
//		m1(10);
//		m1(10, 20);
//		m1(10, 20, 30);
//		m1(1);
//		m1(new int[] { 1, 2, 3 });

		int[] a = { 10, 20, 30 };
		int[] b = { 40, 50, 60 };
		m1(a, b);

	}

//	public static void m1(int... x) {
//		int total = 0;
//
//		for (int x1 : x) {
//			total = total + x1;
//		}
//		System.out.println(total);
//	}

//	public static void m1(int[] x) {
//		int total = 0;
//
//		for (int x1 : x) {
//			total = total + x1;
//		}
//		System.out.println(total);
//	}
//	public static void m1(int x) {
//
//		System.out.println("inside m1(int x)");
//	}

	public static void m1(int[]... x) {

		for (int[] x1 : x) {
			System.out.println(x1[0]);
		}

	}

}
