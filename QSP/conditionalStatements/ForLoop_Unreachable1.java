package conditionalStatements;

public class ForLoop_Unreachable1 {

	public static void main(String[] args) {
		
		for (int i = 0; true ; i++)
			System.out.println("loop body");
		System.out.println("unreachable statement");

	}

}
