package dataTypesAndVariables;

public class SwapTwoNumbers_UsingTempVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Value of a:" + " "+ a +" " + "Value of b:"+ b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Value of a:" + " "+ a + " "+ "Value of b:"+ b);
	}

}
