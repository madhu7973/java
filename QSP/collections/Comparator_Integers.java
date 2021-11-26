package collections;

import java.util.Comparator;

public class Comparator_Integers implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {

		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;

//		if (i1 > i2)
//			return -1;
//
//		else if (i1 < i2)
//			return +1;
//		else

		// We can implement the above logic as shown below

		 return -(i1.compareTo(i2)); // Descending order

		// return i1.compareTo(i2); // Default JVM ascending order

		// In the above logic we are just negating the function of JVM.
		// Where the JVM calls the compareTo method if TreeSet constructor -
		// do not have the comparator object

		// The above logic can also be achieved by swapping the parameters of the
		// compare method. This is as shown below.

		// return i2.compareTo(i1); // Descending order

		// return -(i2.compareTo(i1)); // Ascending order

		// return +1; // Insertion order - with duplicates

		// return -1; //Reverse of insertion order - with duplicates

		// return 0; // Only first element will be inserted as all other insertions are considered as
					// duplicates since the returned value is 0.
	}

}
