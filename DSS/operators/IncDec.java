package operators;

public class IncDec {

	public static void main(String[] args) {
		int x=5;
		int y = ++(x);
		
		System.out.println(y);
		
		char char1 = 'B';
		char char2 = --char1;
		System.out.println(char2);
		
		double d = 9.5;
		d++;
		System.out.println(d);
		
		byte a=11;
		byte b=21;
		byte c=(byte) (a+b);
		//System.out.println(c=a+b);
		
		byte k = 9;
		k++;
	}
}
