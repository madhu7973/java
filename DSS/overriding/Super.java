package overriding;

import java.io.IOException;

public class Super {
	
	int x = 777;
//	public Object m1() {
//		System.out.println("super-m1()");
//		return null;
//	}

//	private Object m2() {
//		System.out.println("super-m2()");
//		return null;
//	}
//	
//	final Object m3() {
//		System.out.println("super-m2()");
//		return null;
//	}

//	public abstract void m4();
//	public Object m5() {
//		System.out.println("super-m5()");
//		return null;
//	}
//	public Object m6() throws IOException{
//		return null;

//	}

//	public static void m7() {
//		System.out.println("super-m7()");
//
//	}
	
	public void m8(int... x) {
		System.out.println("super-m8()");
	}
}
