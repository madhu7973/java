package collections;

import java.util.Comparator;

public class Comparator_Heterogeneous implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {

		// Here we need to convert both the objects to Strings because String buffer
		// can't be type casted to strings since Strings are immutable in nature.

		String s1 = obj1.toString();
		String s2 = obj2.toString();

//		int l1 = s1.length();
//		int l2 = s2.length();

		if (s1.length() < s2.length())
			return -1;

		else if (s1.length() > s2.length())
			return +1;
		else
			return s1.compareTo(s2);
	}

}
