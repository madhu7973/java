package operators;

public class EqualityOperators {

	public static void main(String[] args) {

//		System.out.println(10 == 20);
//		System.out.println('a' == 'b');
//		System.out.println('a' == 97.0);
//		System.out.println(false == false);
//		System.out.println(false == true);

//		Thread t = new Thread();
//		Object o = new Object();
//		String s = new String("str");
//		System.out.println(t == o);
//		System.out.println(o == s);
//		System.out.println(t == s);

		String s1 = new String("str");
		String s2 = new String("str");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}
}
