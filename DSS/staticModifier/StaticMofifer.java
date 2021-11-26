package staticModifier;

public class StaticMofifer {

	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		StaticMofifer sm = new StaticMofifer();
//		StaticMofifer.x = 30;
//		sm1.y = 40;
//		System.out.println("sm1: " + x + " " + sm1.y);
//		StaticMofifer sm2 = new StaticMofifer();
//		System.out.println("sm2: " + x + " " + sm2.y);
		sm.m1();
		StaticMofifer.m2();
		
	}

	public void m1() {
		System.out.println(y);
		System.out.println(x);
	}

	public static void m2() {
		System.out.println(x);
		System.out.println(y);
	}

}
