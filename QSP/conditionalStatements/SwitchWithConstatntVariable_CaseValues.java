package conditionalStatements;

public class SwitchWithConstatntVariable_CaseValues {

	public static void main(String[] args) {
		int a = 10;
		final int b = 20;
		
		switch (20) {
		case 11: System.out.println("value of a is" +" " + a);
		break;
		
		case b: System.out.println("value of b is" + " " + b);
		break;
		}
		

	}

}
