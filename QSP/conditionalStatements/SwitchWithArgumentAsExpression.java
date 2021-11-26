package conditionalStatements;

public class SwitchWithArgumentAsExpression {

	public static void main(String[] args) {
		int x = 10;
		switch (x+1) {
		case 10: System.out.println("Value of x as a constant:"+ " "+ x);
		break;
		case 10+1: System.out.println("Value of x as an expression:"+ " " + x);
		}

	}

}
