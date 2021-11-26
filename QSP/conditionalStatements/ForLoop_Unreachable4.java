package conditionalStatements;

public class ForLoop_Unreachable4 
{

	public static void main(String[] args) 
	{
			 int a = 10, b = 20;
			 
			 for (int i = 0 ; a > b ; i++)
				 System.out.println("loop body");
			 
			 System.out.println("unreachable statement");

	}

}
