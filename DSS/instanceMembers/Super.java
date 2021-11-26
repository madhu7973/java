package instanceMembers;

public class Super {

	int i = 10;
	{
		m1();
		System.out.println("sup instance block");
	}

	Super() {
		System.out.println("sup constructor");
	}
 
	public static void main(String[] args) {
		Super sup = new Super();
		System.out.println("sup main method");
	}

	public void m1() {
		System.out.println(j);
	}
	int j = 20;
}
