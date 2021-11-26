package constructor;

public class Singleton {

//	private static Singleton st = new Singleton1();
	private static Singleton st = null;

	private Singleton() {

	}

	public static Singleton getObject() {
		if (st == null)
			st = new Singleton();
		return st;

	}
}
