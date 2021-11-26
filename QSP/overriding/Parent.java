package overriding;

public class Parent 
{
	int a;
	int b;
	int c;

	public void add(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		int d = a+b+c;
		System.out.println("Sum  of a, b and c is "+ d);
	}

}
