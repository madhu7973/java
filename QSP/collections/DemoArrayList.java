package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArrayList {

	public static void main(String[] args) {

//		  ArrayList has following properties 
//		  1. It can contain duplicate values. 
//		  2. It maintains insertion order. 
//		  3. It stores the values on the basis of indexes.

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("one");
		al1.add("two");
		al1.add("three");
		al1.add("four");
		al1.add("five");

		System.out.println("=====Using For Loop=====");
		for (int i = 0; i < al1.size(); i++) {
			String r = al1.get(i);
			System.out.println(r);
		}

		System.out.println("=====Using Enhanced For Loop=====");
		for (String r : al1) {
			System.out.println(r);
		}

		System.out.println("=====Using Iterator=====");
		Iterator<String> it = al1.iterator();
		while (it.hasNext()) {
			String r = it.next();
			System.out.println(r);
		}

		ListIterator<String> lit = al1.listIterator();
		System.out.println("=====Using List Iterator - hasNext()=====");
		while (lit.hasNext()) {
			String r = lit.next();
			System.out.println(r);
		}

		System.out.println("=====Using List Iterator - hasPrevious()=====");
		while (lit.hasPrevious()) {
			String r = lit.previous();
			System.out.println(r);
		}

		System.out.println("=====Using lambda expression=====");
		al1.forEach(action -> {
			System.out.println(action);
		});

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("six");
		al2.add("seven");
		al2.add("three");

		System.out.println("=====el2 elements added with el1=====");
		al1.addAll(al2);
		for (String s : al1)
			System.out.println(s);

		al1.removeAll(al2);

		System.out.println("=====common elements amoung al1 and al2=====");
		al1.retainAll(al2);

		for (String s : al1)
			System.out.println(s);

		Iterator<String> it1 = al1.iterator();
		it1.forEachRemaining(ele -> {
			System.out.println(ele);

		});

	}

}