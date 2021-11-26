package collections;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap 
{

	public static void main(String[] args) 
	{
		TreeMap <Integer, String> tm = new TreeMap <Integer, String>();
		tm.put(1, "Ondu");
		tm.put(2, "Eradu");
		tm.put(4, "Nalku");
		tm.put(2, "Eradu");

		for(Map.Entry<Integer, String> x:tm.entrySet())
		{
			int i = x.getKey();
			String s = x.getValue();
			System.out.println("Value "+ s + "Key " + i);
		}

	}

}
