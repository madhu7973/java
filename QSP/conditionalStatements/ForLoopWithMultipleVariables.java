package conditionalStatements;

public class ForLoopWithMultipleVariables {

	public static void main(String[] args) 
	{
		for (int i = 0, j = 2; i < 3 && j < 4  ; i++, j--)
		{
			System.out.println("value of i and j are:" + " " + i + " " + j);
			
		}

	}
}