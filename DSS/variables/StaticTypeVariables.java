package variables;

public class StaticTypeVariables {

	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		StaticTypeVariables stv1 = new StaticTypeVariables();
//		System.out.println(stv.x);
//		System.out.println(x);

		stv1.x = 99;
		stv1.y = 33;

		StaticTypeVariables stv2 = new StaticTypeVariables();
		System.out.println(stv2.x + " " + stv2.y);

	}

//	public void m1() {
//		System.out.println(x);
//	}

}
