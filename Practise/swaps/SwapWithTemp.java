package swaps;

public class SwapWithTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;

		temp = b;
		b = a;
		a = temp;

		System.out.println("a: " + a + " b: " + b);

	}
}
