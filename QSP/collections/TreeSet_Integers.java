package collections;

import java.util.TreeSet;

public class TreeSet_Integers {
	

	public static void main(String[] args) {
		
		TreeSet <Object> ts = new TreeSet<Object>(new Comparator_Integers());
		
		ts.add(10);
		ts.add(0);
		ts.add(15);
		ts.add(5);
		ts.add(20);
		ts.add(20);
		
		System.out.println(ts);
		
	}
	
	
	
}
