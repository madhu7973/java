package conditionalStatements;

public class ForLoopWithout_Init_IT_Parameters {

	public static void main(String[] args) 
	{
		boolean done = false;
		int i = 1;
		for ( ; !done ; )
		{
			System.out.println("Only condition parameter");
			i++;
			if (i == 3)
			{
				done = true;
				System.out.println("terminated the for loop");
				break;
			}
		}
	}

}
