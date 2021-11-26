package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class DemoLinkedHashSet {

	// We go for linked hash set if the requirement is
	// not to insert duplicates and preserve insertion order

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add("hello");
		lhs.add("hello"); // the duplicate values gets printed only once
		lhs.add(12);
		lhs.add(null);
		lhs.add('a');
		lhs.add(13.3);
		lhs.add(true);

		System.out.println("====enhanced for loop=====");
		for (Object r : lhs)
			System.out.println(r);

		System.out.println("=====iterator=====");
		Iterator<Object> it1 = lhs.iterator();
		while (it1.hasNext())
			System.out.println(it1.next());

		System.out.println("=====Itrator - forEachRemaining=====");
		Iterator<Object> it2 = lhs.iterator();
		it2.forEachRemaining((fer) -> System.out.println(fer));

		System.out.println("=====forEach=====");
		lhs.forEach((lhsfe) -> System.out.println(lhsfe));

		System.out.println("=====splitrator - forEachRemaining=====");
		Spliterator<Object> si1 = lhs.spliterator();
		si1.forEachRemaining((sifer) -> System.out.println(sifer));

		System.out.println("=====splitrator - tryAdvance=====");
		Spliterator<Object> si2 = lhs.spliterator();
		while (si2.tryAdvance((sita) -> System.out.println(sita)))
			;

		// Since the Sets do not maintain the elements in order, they can't be iterated
		// through traditional for loop

	}

}
