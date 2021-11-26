package collections;

import java.util.Comparator;

public class ArraysComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}

}
