package conditionalStatements;

public class SwitchWithCharAsArgument {

	public static void main(String[] args) {
		char  x = 'a';
		
		switch (x) {
		case 'b': System.out.println("x value is b");
		break;
		case 'c': System.out.println("x value is c");
		break;
		case 'a': System.out.println("x value is a");
		break;
		default: System.out.println("No case value matched with the switch argumnet");
		}
	}

}
