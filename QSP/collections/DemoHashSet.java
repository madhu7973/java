package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class DemoHashSet {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<Object>();

		hs.add("a");
		hs.add("c");
		hs.add("b");
		hs.add(3);
		hs.add(19);
		hs.add(null);
		hs.add("");

		System.out.println("=====Enhanced for loop=====");
		for (Object obj : hs)
			System.out.println(obj);

		System.out.println("=====Itrator=====");
		Iterator<Object> it1 = hs.iterator();
		while (it1.hasNext())
			System.out.println(it1.next());

		System.out.println("=====Iterator - forEachRemaining=====");
		Iterator<Object> it2 = hs.iterator();
		it2.forEachRemaining((itr) -> System.out.println(itr));

		System.out.println("=====Spliterator, forEachRemaining and lambda=====");
		Spliterator<Object> si1 = hs.spliterator();
		si1.forEachRemaining((hse) -> System.out.println(hse));

		System.out.println("=====forEach with lambda=====");
		hs.forEach((hse) -> System.out.println(hse));

		System.out.println("=====Spliterator-tryAdvance and lambda=====");
		Spliterator<Object> si2 = hs.spliterator();
		while (si2.tryAdvance((ta) -> System.out.println(ta)))
			;

	}

}
