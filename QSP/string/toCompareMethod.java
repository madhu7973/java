package string;

public class toCompareMethod {

	public static void main(String[] args) {

		String s1 = "Appale";
		String s2 = new String("Zebra");
		String s3 = "";
		String s4 = "1Appale";
		String s5 = " Appale";
		String s6 = "_Appale";
		String s7 = "appale";
		String s8 = "Zebra";
		String s9 = new String("Yak");
		String s10 = "App";

		/*
		 * compareTo() method returns -ve number if the string in the parameter if less
		 * than this string other wise it returns +ve number
		 * 
		 * It returns 0 if both the string are equal.
		 * 
		 * The comparisons are made in terms of unicode values.
		 * 
		 * if this string is small in length with the string in parameter, then number
		 * is returned which represents the chars which are more extra in the string
		 * which is in the parameter.
		 * 
		 * If the given two strings have different length, then the number of words that
		 * are extra in the given string is printed
		 * 
		 */

		System.out.println("*****compare Appale with object Zebra*****");
		System.out.println(s1.compareTo(s2));

		System.out.println("*****compare Appale with empty string *****");
		System.out.println(s1.compareTo(s3));

		System.out.println("*****compare Appale with string starting with number*****");
		System.out.println(s1.compareTo(s4));

		System.out.println("*****compare Appale with string starting with special symbol*****");
		System.out.println(s1.compareTo(s6));

		System.out.println("*****compare Appale with string appale*****");
		System.out.println(s1.compareTo(s7));

		System.out.println("*****compare Appale with stirng Zebra*****");
		System.out.println(s1.compareTo(s8));

		System.out.println("*****compare Appale with string starting with space*****");
		System.out.println(s1.compareTo(s5));

		System.out.println("*****compare two string objects*****");
		System.out.println(s2.compareTo(s9));

		System.out.println("*****comparing words havinh different lengths*****");
		System.out.println(s1.compareTo(s10));
	}

}
