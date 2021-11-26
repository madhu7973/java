package cla;

import static java.lang.System.out;

public class CommLineArgs {

	public static void main(int[] args) {

		out.println("The square of " + args[0] + " is " + args[0] * args[0]);
	}

	public static void main(String[] args) {
		main(new int[] { 3 });
	}
	
	
}
