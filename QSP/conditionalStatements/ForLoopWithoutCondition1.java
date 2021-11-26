package conditionalStatements;

public class ForLoopWithoutCondition1 {

	public static void main(String[] args) {
		
		for (int i = 1; ; ++i) 
		{
			System.out.println("no condition");
			if (i == 3)
			{
			System.out.println("loop terminated");
			break;
			}
		}
			
	}

}
