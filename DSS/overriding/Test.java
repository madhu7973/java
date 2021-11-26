package overriding;

public class Test {
	public static void main(String[] args) {
		Super sup1 = new Super();
		//sup1.m8(10);
		System.out.println(sup1.x);

		Sub sub = new Sub();
		//sub.m8(10);
		System.out.println(sub.x);

		Super sup2 = new Sub();
		System.out.println(sup2.x);
	}
}
