package conditionalStatements;

public class SwitchWithincompatibleArgumenntAndCaseValues {

	public static void main(String[] args) {
		int x = 10;
		switch(x) {
		case 97: System.out.println("value of x is 90");
		break;
		case 95: System.out.println("value of x is 95");
		break;
		case 'a': System.out.println("value of x is a");
		}

	}

}