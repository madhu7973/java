package finalMebers;

public class FinalStatic {

	final static char c = 'a';
	static int x;

	public static void main(String[] args) {
		System.out.println(x);
	}

	final static boolean b;
//	static {
//		b = true;
//	}
	
	public void m1() {
		b = true;
	}
}
