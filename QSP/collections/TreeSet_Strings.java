package collections;

import java.util.TreeSet;

public class TreeSet_Strings {
	
	public static void main(String[] args) {
		
		TreeSet<Object> ts = new TreeSet<Object>(new Comparator_Strings());
		
		ts.add("Queue");
		ts.add("Sweet");
		ts.add("Rat");
		ts.add("Tank");
		ts.add("Run");
		
		System.out.println(ts);
		
	}

}
