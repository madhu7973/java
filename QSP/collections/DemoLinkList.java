package collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class DemoLinkList {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.addFirst("start");
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.addLast("end");

		System.out.println("first element :" + ll.getFirst());
		System.out.println(ll.get(3));
		System.out.println("last element :" + ll.getLast());
		System.out.println(ll.size());

		System.out.println("=====for loop=====");
		System.out.println("size :" + ll.size());
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("=====for each loop=====");
		for (String s : ll)
			System.out.println(s);

		System.out.println("=====iterator=====");
		Iterator<String> it1 = ll.iterator();
		while (it1.hasNext())
			System.out.println(it1.next());

		System.out.println("=====ListIterator - next=====");
		ListIterator<String> lit = ll.listIterator();
		while (lit.hasNext())
			System.out.println(lit.next());
		System.out.println("=====ListIterator - previous=====");
		while (lit.hasPrevious())
			System.out.println(lit.previous());

		System.out.println("=====lambda expression=====");
		ll.forEach(num -> {
			System.out.println(num);
		});

		System.out.println("=====for each remaining=====");
		Iterator<String> it2 = ll.iterator();
		it2.forEachRemaining((num) -> System.out.println(num));

	}
}
