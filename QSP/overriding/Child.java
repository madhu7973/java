package overriding;

public class Child extends Parent 

{
	@Override
	public void add(int a, int b, int c)
	{
		int d = a*b*c;
		System.out.println("product is "+ d);
	} 

	public static void main(String[] args) 
	{
		Parent p = new Child();	
		p.add(3, 2, 4);
	}

}