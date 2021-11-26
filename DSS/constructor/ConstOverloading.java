package constructor;

public class ConstOverloading {

	ConstOverloading() {
		this(10);
		System.out.println("no-arg const");
	}

	ConstOverloading(int i) {
		this(10.5);
		System.out.println("int const");
	}

	ConstOverloading(double d) {
		System.out.println("double const");
	}

	public static void main(String[] args) {
//		ConstOverloading co1 = new ConstOverloading();
//		ConstOverloading co2 = new ConstOverloading(10);
//		ConstOverloading co3 = new ConstOverloading(10.5);
		ConstOverloading co4 = new ConstOverloading(10l);

	}
}
