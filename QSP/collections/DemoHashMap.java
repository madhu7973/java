package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.Map.Entry;
import java.util.Set;
//import java.util.Spliterator;

public class DemoHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(101,"Java");
		hm.put(109,"Python");
		hm.put(103, "C++");
		hm.put(107, "Js");
		hm.put(105, "PHP");

//1.		
		// Output in form of map and in curly braces.
		System.out.println("=====printing the object of hash map=====");
		System.out.println(hm);

//2.	
		// Replaces the java value with 105 and returns 101
		System.out.println("=====Replacing java's value=====");
		System.out.println(hm.put(105, "java"));

//3.    
		// Prints all the keys of the map in the form of set in square brackets.
		System.out.println("=====keySet()=====");
		Set<Integer>  s = hm.keySet();
		System.out.println(s);

//4.    
		// Here we call the keys hm.get(str) - to get the respective values
		System.out.println("=====keySet() in forEach loop=====");
		for (Integer str : hm.keySet())
			System.out.println("key: " + str + " value: " + hm.get(str));

//5.    
		// Prints all the values in the map in the form of collections.
		// Here we use collections type because the values can be heterogeneous
		// or duplicate or null.
		System.out.println("=====values()=====");
		Collection<String> c = hm.values();
		System.out.println(c);

//6.	
		// Prints the key value pair in the form of set in square braces.
		// This is similar to syso(hm) as above but here its in the form of set.
		System.out.println("=====entrySet()=====");
		Set<Map.Entry<Integer, String>> es = hm.entrySet();
		System.out.println(es);

//7.		
		System.out.println("=====entrySet() in forEach loop=====");
		for (Map.Entry<Integer, String> esFe : hm.entrySet())
			System.out.println(esFe.getKey() + " : " + esFe.getValue());

		System.out.println("=====Foreach with lambda=====");
		hm.forEach((k, v) -> System.out.println(k + " : " + (v)));

//8.
		System.out.println("=====Iterator=====");
		Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> kv = it.next();
			System.out.println(kv.getKey() + " : " + kv.getValue());
		}

//		System.out.println("=====Iterator=====");
//		Iterator hmit = hm.entrySet().iterator();
//		while (hmit.hasNext()) {
//			Map.Entry kv = (Map.Entry) hmit.next();
//			System.out.println(kv.getKey() + " ----- " + kv.getValue());
//		}

//9.
		System.out.println("=====enhanced for loop=====");
		for (Map.Entry<Integer, String> entry : hm.entrySet())
			System.out.println(entry.getKey() + " : " + entry.getValue());

//10.		
		System.out.println("=====streams().forEach()=====");
		hm.entrySet().stream().forEach(sfe -> System.out.println(sfe.getKey() + " : " + sfe.getValue()));

		// ***** We can not use Spliterator for Map*****

//		System.out.println("=====Spliterator - tryAdvance()=====");	

//		System.out.println("=====using keySet()=====");
//		Set <String> ks = hm.keySet();
//		System.out.println(hm.get(ks));
	}

}
