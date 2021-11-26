package conditionalStatements;

public class DoWhileWithFinalVariables1 {

	public static void main(String[] args) {
		final int a = 10; final int b = 20;
		do
			System.out.println("a is lesser than b");
		while(a < b);
			System.out.println(" a is greater than b");

	}

}