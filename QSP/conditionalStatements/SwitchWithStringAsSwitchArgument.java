package conditionalStatements;

public class SwitchWithStringAsSwitchArgument {
	
	public static void main (String args []) {
		String s = "three";
		switch (s) {
		case "one": System.out.println("value of s is one");
		break;
		case "two": System.out.println("value of s is two");
		break;
		case "three": System.out.println("value of s is three");
		break;
		default: System.out.println("switch argument didn't match with any of the case values");
		}
	}

}