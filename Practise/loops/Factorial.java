package loops;

public class Factorial {

	public static void main(String[] args) {
//		int fact = 1;
//		for (int i = 5; i >= 1; i--) {
//			fact *= i;
//			System.out.println(fact);
//		}
//		System.out.println("factorial is " + fact);
//		double fact = Factorial.factorial(7);
//		System.out.println(fact);
		
		int factnum = 1; int num = 5;
		for (int i= 1; i <= num; i++)
			factnum = factnum *i;
		System.out.println(factnum);
	}

//	public static int factorial(int n) {
//		int fact = 1;
//		for (int i = 1; i <= n; i++) {
//			fact *= i;
//		}
//		return fact;
//	}
}
