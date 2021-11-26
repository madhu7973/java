package dataTypesAndVariables;

public class VariableScope {

	public static void main(String[] args) {
		//x is known through out the class
		int x = 10;
		
		if (x==10)
		{
			//y is known within the the if block
			int y = 20;
			System.out.println("x:y" + " " + x + " " + y);
			x = y*2;
		}
		
		//Y is an unknown variable outside the if block
		//y= 100;
		System.out.println("Value of x is" + " " + x);
		

	}

}
