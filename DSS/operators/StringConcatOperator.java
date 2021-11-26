package operators;

public class StringConcatOperator {

	public static void main(String[] args) {

		String str = "appale";
		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println(str + a + b + c);
		System.out.println(a + str + b + c);
		System.out.println(a + b + str + c);
		System.out.println(a + b + c + str);
		System.out.println((a + b + c) + str);
		System.out.println((str) + a + b + c);
		System.out.println(a + b + c + (str));

	}
}
