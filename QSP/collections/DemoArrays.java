package collections;

import java.util.Arrays;
import java.util.Collections;

import com.sun.tools.sjavac.server.SysInfo;

public class DemoArrays {

	public static void main(String[] args) {

		int[] a = { 3, 9, 5, 1, 7 };

		System.out.println("=====Integer Array elements before sorting=====");
		for (int i : a)
			System.out.println(i);

		Arrays.sort(a);

		System.out.println("=====Integer Array elements after sorting=====");
		for (int i : a)
			System.out.println(i);

		String[] s = { "E", "C", "A", "D", "B" };

		System.out.println("=====String Array elements before sorting=====");
		for (String x : s)
			System.out.println(x);

		Arrays.sort(s);

		System.out.println("=====String Array elements after sorting=====");
		for (String x : s)
			System.out.println(x);

		System.out.println("=====String Array elements sorted according to comparator=====");

		// Sorts in the alphabetical descending order.
		Arrays.sort(s, new ArraysComparator());
		for (String c : s)
			System.out.println(c);
	}
}
