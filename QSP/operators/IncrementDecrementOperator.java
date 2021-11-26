package operators;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		int c = a++;
		System.out.println("Value of c:"+" "+c);
		int d = ++c;
		System.out.println("Value of d:"+" "+d);
		int e = b--;
		System.out.println("Value of e:"+" "+e);
		int f = --e;
		System.out.println("Value of f:"+" "+f);

	}

}
