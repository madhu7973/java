package conditionalStatements;

public class SwitchWithDefaultBlockAtTop {

	public static void main(String[] args) {
		int x = 2;
		switch (x) {
		default: System.out.println("None of the values matched");
		case 1: System.out.println("value of x is 1");
		break;
		case 0: System.out.println("value of x is 0");
		case 2: System.out.println("value of x is 2");
		}

	}

}
