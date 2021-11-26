package methodCalling;

public class CallByValue 
{
	int x =10;

	public int callByValue(int y)
	{
		return y = x+y;
	}

	public static void main(String[] args) 
	{
		CallByValue c= new CallByValue();
		System.out.println(c.callByValue(20));
	}

}
