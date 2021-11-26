package conditionalStatements;

public class WhileWithUnreachableStatements3 {

	public static void main(String[] args) {
		while (false)
		{
			System.out.println("Hello");
		}
		System.out.println("Hi");

	}

}
