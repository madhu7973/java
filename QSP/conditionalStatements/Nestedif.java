package conditionalStatements;

public class Nestedif {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 1;
		int z = 1;
//	
//		if (x < 1) {
//			if (x != y)
//				if ( y != z) System.err.println("x is zero, y and z are one");
//				else System.out.println("condition is false as y = z");
//		}
//		
//		else System.out.println("condition is false as x != 1");
		
		if (x==0 && x!=y || y !=z) System.out.println("x is zero, y and z are one");
		else System.out.println("condition is false as y = z");
		
	}

}
