package conditionalStatements;

public class WhileWithUnreachableStatements6 {

	public static void main(String[] args) {
		
		final int a = 10;
		final int b = 20;
		
		while (a > b)
		{
			System.out.println("a is greater than b");
		}
		System.out.println("a is less than b");

	}

}
