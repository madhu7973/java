package conditionalStatements;

public class NestedSwitch {

	public static void main(String[] args) {
		int x = 1;
		switch (x) {
		case 0: System.out.println("Fan is off");
		break;
		case 1:
			System.out.print("Fan is on and" + " ");
			int y = 3; 
			switch (y) {
			case 1: System.out.println("fan speed is 1");
			break;
			case 2: System.out.println("fan speed is 2");
			break;
			case 3: System.out.println("fan speed is 3");
			break;
			
			}
		}
		

	}

}
