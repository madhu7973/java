package instanceMembers;

public class InstanceControlFlow {

	int i = 10;
	{
		m1();
		System.out.println("first instance block");
	}

	InstanceControlFlow() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		//InstanceControlFlow icf = new InstanceControlFlow();
		System.out.println("main method");
	}

	public void m1() {
		System.out.println(j);
	}

	{
		System.out.println("second instance block");
	}
	int j = 20;
}
