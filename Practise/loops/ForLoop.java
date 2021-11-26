package loops;

public class ForLoop {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 7 == 0)
				System.out.println(i);
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int i : arr) {
			if (i % 3 == 0)
				System.out.println(i);
		}

//		outerloop:
//		for (int i=0; i<15; i++) {
//			if(i% 3 == 0) {
//				for (int j: i)
//					System.out.println();
//			}
//		}

		int fact = 1;
		for (int i = 1; i <= 5; i++)
			fact = fact * i;

		System.out.println(fact);

	}
}
