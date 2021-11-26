package conditionalStatements;

public class ForLoop_Unreachable2 {

	public static void main(String[] args) {
		
		for (int i = 0 ; false ; i++ )
			System.out.println("unreachable loop body");
		System.out.println("statement 1");

	}

}
