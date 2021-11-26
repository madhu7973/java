package conditionalStatements;

public class WhileWithUnreachableStatements1 {

	public static void main(String[] args) {
		int a = 10; int b = 20;
		while (a < b)
		{
			System.out.println("a is less than b");
		}
		System.out.println("a is greater than b");
	}

}
