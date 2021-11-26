package conditionalStatements;

public class IfElse {

	public static void main(String[] args) {
		int age = 25;
		if (age == 15)
			System.out.println("teenage");
		else
			System.out.println("not teenage");

		String pwd = "madhu";

		if (pwd.equalsIgnoreCase("madhu"))
			System.out.println("valid pwd");
		else
			System.out.println("invalid pwd");
	}

}
