package conditionalStatements;

public class If_Else_If_Ladder {
	public static void main(String[] args) {
		double marks = 70.11;
		
		if (marks >= 35 && marks <= 45) System.out.println("Just pass");
		else if (marks >= 45 && marks < 60) System.out.println("Second class");
		else if (marks >= 60 && marks < 70) System.out.println("First class");
		else if (marks >= 70 && marks <= 100) System.out.println("Distinction");
		
		else System.out.println("fail");
	}

}
