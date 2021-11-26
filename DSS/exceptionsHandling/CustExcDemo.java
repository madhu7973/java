package exceptionsHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CustExcDemo {

//	public static void m1() {
//		m2();
//	}

//	public static void m2() {
//		m1();
//	}

//	static int x = 10 / 0;

//	static {
//		String s = null;
//		System.out.println(s.length());
//	}

	public static void main(String[] args) throws IOException {

		try {

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aioub) {
			aioub.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}

		try {
			System.out.println(10 / 0);

		} catch (ArithmeticException npe) {
			throw new NullPointerException();
		}

//		Thread t = new Thread();
//		t.start();
//		t.start();

//		try (FileWriter fw = new FileWriter("output file"); FileReader fr = new FileReader("output file")) {
//				
//		};

//		try (BufferedReader br = new BufferedReader(new FileReader("input file"))) {
//			br = new BufferedReader(new FileReader("output file"));
//
//		}
//		;
//		int i = Integer.parseInt("10");
//		int j = Integer.parseInt("ten");
//		System.out.println(i + j);
//		Thread t = new Thread();
//		t.setPriority(9);
//		t.setPriority(15);

//		m1();

//		int age = 15;

//		if (age >= 18 && age < 60)
//			System.out.println("will find the match soon");

//		else if (age >= 60)
//			throw new CustException2("you are too old");

//		else
//			throw new CustException2("you are too young");

//		int arr[] = new int[4];

//		System.out.println(arr[0]);
//		System.out.println(arr[10]);

//		String s = null;
//		System.out.println(s.length());

//		Object obj1 = new Object();
//		String str1 = (String) obj1;
//		str1 = "java1";
//		System.out.println(str1);

//		Object obj2 = new String("java2");
//		String str2 = (String) obj2;
//		System.out.println(str2);
	}
}