package operators;

import java.util.ArrayList;

public class InstanceOf {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();
		al.add("one");
		al.add(2);
		al.add(true);

		if (al.get(0) instanceof String) {
			System.out.println("its a string");
		}

		else if (al.get(1) instanceof Integer) {
			System.out.println("its a integer");
		}

		else {
			System.out.println("its a boolean");

		}
	}
}
