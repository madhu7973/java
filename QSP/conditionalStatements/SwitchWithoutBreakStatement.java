package conditionalStatements;

public class SwitchWithoutBreakStatement {

	public static void main(String[] args) {
		for (int x = 0; x <= 5; x++)
		switch(x) {
		case 0:
		case 1:
			System.out.println("x value lesser than 3");
		break;
		case 3:
		case 4:
			System.out.println("x value lesser than 5");
		break;
		default: System.out.println("value of x is:" + " "+ x);
		
		}

	}

}
