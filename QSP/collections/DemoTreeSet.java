package collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class DemoTreeSet {

	// In TreeSet and TreeMap we can't insert heterogeneous elements
	// This is because all the elements inserted must implement comparable interface
	// Since heterogeneous elements can't be compared we get ClassCastException

	// The output of Sorted set depends on the type of elements inserted.
	// Integers are sorted in ascending order - which is their natural sorting order
	// and Strings are sorted in alphabetical order

	public static void main(String[] args) {
		SortedSet<String> ts = new TreeSet<String>();
//
//		ts.add("first");
//		ts.add("second");
//		ts.add("third");
//		ts.add("third");
//		ts.add("fifth");
//
//		System.out.println("=====enhanced for loop=====");
//		for (Object obj : ts) {
//			System.out.println(obj);
//		}
//
//		System.out.println("=====iterator=====");
//		Iterator<String> it = ts.iterator();
//		while (it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
//
//		System.out.println("=====forEach=====");
//		ts.forEach((fe) -> System.out.println(fe));
//
//		System.out.println("=====iterator - foEachremaining=====");
//		Iterator<String> it1 = ts.iterator();
//		it1.forEachRemaining((fer) -> System.out.println(fer));
//
//		System.out.println("=====spliterator - forEachRemaining=====");
//		Spliterator<String> si1 = ts.spliterator();
//		si1.forEachRemaining((fer) -> System.out.println(fer));
//
		System.out.println("=====spliterator - tryAdvance=====");
		Spliterator<String> si2 = ts.spliterator();
		while (si2.tryAdvance((ta) -> System.out.println(ta)))
			;
//
//	}
	
	SortedSet<Object> ts1 = new TreeSet<Object>();
	
	ts1.add("M");
	ts1.add("A");
	ts1.add("Z");
	ts1.add("A");
	ts1.add("J");
	ts1.add("B");
	ts1.add("L");
	ts1.add("Y");
	
	System.out.println(ts);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
