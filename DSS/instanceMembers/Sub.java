package instanceMembers;

public class Sub extends Super{
	
	int x = 20;
	{
		m1();
		System.out.println("sub first instance block");
	}

	Sub() {
		System.out.println("sub constructor");
	}

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println("sub main method");
	}

	public void m1() {
		System.out.println(y);
	}

	{
		System.out.println("sub second instance block");
	}
	int y = 30;

}
