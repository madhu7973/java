package conditionalStatements;

public class ElseIf {

	public static void main(String[] args) {

		int marks = 99;

		if (marks < 35)
			System.out.println("fail");
		else if (marks == 35)
			System.out.println("just pass");
		else if (marks > 35 && marks < 60)
			System.out.println("second class");
		else if (marks >= 60 && marks < 70)
			System.out.println("first class");
		else if (marks >= 70)
			System.out.println("distinction");

		int a = 110;
		int b = 200;
		int c = 300;

		if (a > b && a > c)
			System.out.println("a is largest");
		else if (b > c)
			System.out.println("b is largest");
		else
			System.out.println("c is largest");
	}
}
