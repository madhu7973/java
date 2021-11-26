package objectCreation;

public class Test implements Cloneable {
	int x = 10;
	public static void main(String[] args) throws Exception {
		Test test1 = new Test();
		System.out.println("new: " + test1.x);

		Test test2 = Test.class.getDeclaredConstructor().newInstance();
		System.out.println("newInstance(): " + test2.x);

		Test test3 = new Test();
		Test test4 = (Test) test3.clone();
		System.out.println("clone: " + test4.x);
		
	}
}
