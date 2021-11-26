package mixedControlFlow;

public class StaticInstanceFlow {

	{
		System.out.println("first instance block");
	}

	static {
		System.out.println("first static block");
	}

	StaticInstanceFlow() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		StaticInstanceFlow sif1 = new StaticInstanceFlow();
		System.out.println("main method");
		StaticInstanceFlow sif2 = new StaticInstanceFlow();
	}

	static {

		System.out.println("second static block");
	}

	{
		System.out.println("second instance block");
	}
}
