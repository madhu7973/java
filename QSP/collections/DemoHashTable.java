package collections;

import java.util.Hashtable;

public class DemoHashTable {

	public static void main(String[] args) {
//		Hashtable<Object, Object> ht1 = new Hashtable<Object, Object>();
		Hashtable<Object, Object> ht1 = new Hashtable<Object, Object>(24);

		ht1.put(new HashTable_Temp(5), "A");
		ht1.put(new HashTable_Temp(2), "B");
		ht1.put(new HashTable_Temp(6), "C");
		ht1.put(new HashTable_Temp(15), "D");
		ht1.put(new HashTable_Temp(23), "E");
		ht1.put(new HashTable_Temp(16), "F");

		System.out.println(ht1);
	}
}
