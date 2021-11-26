package variables;

public class LocalTypeVariables {
//	static int[] x;
//	static int[] y = new int[3];

	public static void main(String[] args) {
//		int[] x;
		int[] y = new int[3];

		LocalTypeVariables ltv = new LocalTypeVariables();
//		System.out.println(x); //x cannot be resolved or is not a field
//		System.out.println(x[0]); //x cannot be resolved or is not a field

		System.out.println(y);
		System.out.println(y[1]);

//		try {
//			int j = Integer.parseInt("ten");
//		} catch (NumberFormatException e) {
//			j = 10;
//
//		}
//
//		System.out.println(j);

//		int x = 0;
//		System.out.println("hello");
//		System.out.println(x);

//		if (args.length > 0)
//			x = 10;
//		System.out.println(x);

	}

}
