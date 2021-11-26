package inheritance;

public class Sub extends Super
{
	public void m3()
	{
		System.out.println("Non static metod of sub class");
	}
	
	static void m4()
	{
		System.out.println("static method of subclass");
	}

	public static void main(String[] args) 
	{
		Sub s = new Sub();
		s.m1();//we can also access the static method of parent class using the child class object but we get a warning.
		Super.m2();
		s.m3();
		Sub.m4();
	}

}
