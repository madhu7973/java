package variables;

public class Demo {

	public static void main(String[] args) {
		StaticGlobal sg1 = new StaticGlobal();
		StaticGlobal sg2 = new StaticGlobal();
		sg1.y = 9.99;
		StaticGlobal.x = 10;
		sg1.x = 77;
//		StaticGlobal.CURR = "USD";

		sg2.y = 9.77;
		StaticGlobal.x = 11;
		sg2.x = 99;

		System.out.println(
				"instance variable first value: " + sg1.y + " static variable first values: " + StaticGlobal.x);

		System.out.println(
				"instance variable first value: " + sg2.y + " static variable first values: " + StaticGlobal.x);
	}
}
