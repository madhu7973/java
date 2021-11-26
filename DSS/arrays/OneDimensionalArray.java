package arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {
		
		int[] x1;
		int []x2;
		int x3[];
		
		int[] a = new int[3];
		
		int[] m = new int[3];
		System.out.println(m);
		System.out.println(m[0]);
//		m[3.3] = 30; //Type mismatch: cannot convert from double to int
		m[-5] = 50; // Index -5 out of bounds for length 3
		
		int[] n ;
		n = new int[3];
		n[0] = 11;
		n[1] = 13;
		n[2] = 15;

//		int[] n = {11, 13, 15};
		char[] ch = {'a', 'e', 'i', 'o', 'u'};
		String[] str = {"abc", "def", "ghi"};
		
		
		String[] strArr = {"a", "aa", "aaa"};
		System.out.println(strArr.length);
//		System.out.println(strArr.length()); //length() not applicable to arrays 
//		System.out.println(strArr[0].length); //"a" is a string so length variable not applicable to string. 
		System.out.println(strArr[0].length());
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 'a'; //a will be converted to unicode 97
		short s = 13;
		arr[2] = s;
		byte b = 19;
		arr[3] = b;
//		x[4] = 99l; // x cannot be resolved to a variable
		
		/*
		 * int can take type short byte and char. When char or byte or short is assigned to int array
		 * they will be implicitly promoted to int type.
		 */
		Object[] obj = new Object[10];
		obj[0] = new Object();
		obj[1] = new String("durga");
		obj[2] = new Double(10.5);
		
		Number[] num = new Number[3];
		num[0] = new Integer(15);
		num[1] = new Double(19.5);
//		num[2] = new String("durga"); // Type mismatch: cannot convert from String to Number
		
		Runnable[] run = new Runnable[3];
		run[0] = new Thread();
//		run[1] = new String("durga"); //Type mismatch: cannot convert from String to Runnable
		
	}

}
