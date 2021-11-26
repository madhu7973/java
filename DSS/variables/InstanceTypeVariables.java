package variables;

public class InstanceTypeVariables {

//	int rollNum;
//	String id;
//	int x = 10;

	public static void main(String[] args) {
		InstanceTypeVariables itv = new InstanceTypeVariables();
//		itv.m1();
//		itv.m2();
//		itv.m3();

//		System.out.println(x); //can't access non static variable from static method.
//		System.out.println(itv.x);

		itv.m4();
	}

//	public void m1() {
//		InstanceTypeVariables itv1 = new InstanceTypeVariables();
//		itv1.rollNum = 100;
//		itv1.id = "std1";
//		System.out.println("m1---" + itv1.rollNum + ", " + itv1.id );
//	}
//
//	public void m2() {
//		InstanceTypeVariables itv2 = new InstanceTypeVariables();
//		itv2.rollNum = 101;
//		itv2.id = "std2";
//		System.out.println("m2---" + itv2.rollNum + ", " + itv2.id );
//	}

//	public void m3() {
//		System.out.println(x);
//	}

	int i;
	byte by;
	short shr;
	boolean bo;
	String str;

	public static void m4() {
		InstanceTypeVariables itv4 = new InstanceTypeVariables();
		System.out.println(itv4.bo);
		System.out.println(itv4.by);
		System.out.println(itv4.i);
		System.out.println(itv4.str);
		System.out.println(itv4.shr);
	}
}
