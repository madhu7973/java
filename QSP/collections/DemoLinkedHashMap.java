package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		lhm.put(101, "Java");
		lhm.put(109, "Python");
		lhm.put(103, "C++");
		lhm.put(107, "Js");
		lhm.put(105, "PHP");

		System.out.println();

		for (Map.Entry<Integer, String> x : lhm.entrySet()) {
			Integer i = x.getKey();
			String s = x.getValue();
			System.out.println(i + " : " + s);
		}

	}

}