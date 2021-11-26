package basics;

public class Arrays {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5 };
		int length = a.length;
		System.out.println(length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
			System.out.println(a[i]);// gives the same result

		}

		Object[] o = { 0, 1.5, 's', "asdf", true };

		for (int j = 0; j < o.length; j++) {
			System.out.println(o[j]);

		}
	}

}
