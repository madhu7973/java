package finalConstants;

public class FinalMethodSub extends FinalMethodSup 
{
	Double d = 3.14;

	public static void main(String[] args) 
	{
		FinalMethodSub sub = new FinalMethodSub();
		sub.m1();//final method can be inherited.
		sub.m1(1);//Overloaded final methods can also be inherited.
		sub.m1(3, 4);
	}

}