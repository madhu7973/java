package conditionalStatements;

public class ForLoop_Unreachable5 {

	public static void main(String[] args) {
		final int a = 10, b = 20;
		 
		 for (int i = 0 ; a < b ; i++)
			 System.out.println("loop body");
		 
		 System.out.println("unreachable statement");

	}

}
