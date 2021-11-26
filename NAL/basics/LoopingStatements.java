package basics;

import java.util.ArrayList;

public class LoopingStatements {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		while (list.size() != 0) {
			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));
			break;
		}

		for (int j = 0; j <= 5; j++) {
			System.out.println(j);
		}
		
		
		for (char c='a'; c <= 'e'; c++)
			System.out.println(c);
		
		for (char ch = 'i'; ch >= 'a'; ch-- )
			System.out.println(ch);
	}

}
