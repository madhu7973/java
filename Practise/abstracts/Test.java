package abstracts;

public class Test extends Demo {

	static int k = 5;
	static boolean b;

//	Test t = new Test ();

	/*
	 * public Test() { super (Demo.j, Demo.s); }
	 */

	public static void main(String[] args) {
		Test t = new Test();
		if (t.j > k)
			b = true;
		else
			b = false;

		System.out.println(b);

		t.concMethod();
		t.absMethod();

		/*
		 * Demo d = new Demo() {
		 * 
		 * @Override public void absMethod() { // TODO Auto-generated method stub
		 * 
		 * } };
		 */
	}

	@Override
	public void absMethod() {
		System.out.println("abstract method implemented in test class");
	}

}
