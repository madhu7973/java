package overriding;

import java.io.FileNotFoundException;

public class Sub extends Super {
	
	int x = 999;

//	public static void main(String[] args) {
//		Sub sub = new Sub();
//		sub.m4();
//
//		Super sup = new Sub();
//		sub.m4();

//		Super sup1 = new Super();
//		sup1.m4();
//	}

//	public String m1() {
//		System.out.println("sub-m1()");
//		return null;
//	}

//	private Object m2() {
//		System.out.println("sub-m2()");
//		return null;
//	}
//	
//	final Object m3() {
//		System.out.println("sub-m3()");
//		return null;
//	}

//	@Override
//	public void m4() {
//		System.out.println("abstarct method of super");
//	}

//	private public Object m5() {
//		return null;
//		
//	}

//	public static void m7() {
//
//		System.out.println("sub-m7()");
//	}

	public void m8(int x) {
		System.out.println("sub-m8()");
	}

}