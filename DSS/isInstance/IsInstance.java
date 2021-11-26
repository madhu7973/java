package isInstance;

public class IsInstance {

	public static void main(String[] args) throws ClassNotFoundException {

		Thread t = new Thread();		
		System.out.println(Class.forName(args[0]).isInstance(t));

	}
}
