package collections;

import java.util.TreeSet;

public class TreeSet_Heterogeneous {

	public static void main(String[] args) {

		TreeSet<Object> ts = new TreeSet<Object>(new Comparator_Heterogeneous());

		ts.add("A");
		ts.add(new StringBuffer("ABC"));
		ts.add(new StringBuffer("AA"));
		ts.add("XX");
		ts.add("ABCD");
		ts.add("A");

		System.out.println(ts);
	}

}
