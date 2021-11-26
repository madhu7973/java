package dataTypesAndVariables;

public class FinalVaraiables1 {

	public static void main(String[] args) {
		final int a = 10;
		final int b = 20;
		int c = 30;
	System.out.println(a + b); //this operation will be done at compile time itself i.e., 30
	System.out.println(a + c); //value of a is assigned at compile time (10 + c)
	System.out.println(a < b); //this operation will be done at compile time itself i.e., true
	System.out.println(a > c); //value of a is assigned at compile time (10 > c)
	}

}
