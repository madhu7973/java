package conditionalStatements;

public class IfStatement_WithSingleAndMultiStatements {

	public static void main(String[] args) {
		
		int a,b;
		a = 0;
		b = 1;
		
		if(a < b) 
		{
			System.out.println("first statement");
			System.out.println("second statement");
			System.out.println("Condition true"); 
			System.out.println("third statement");
			System.out.println("fourth statement");
		}
			else 
				if (a>b)System.out.println("condition if false");
		if(a > b)
		{
			//System.out.println("fifth statement"); 
			//System.out.println("sixth statement");
			System.out.println("Condition true");
			//System.out.println("seventh statement");
			//System.out.println("eighth statement");
		}
		
			else 
				if (a>b)System.out.println("condition is true");
				else System.out.println("condition is false");

	}

}
