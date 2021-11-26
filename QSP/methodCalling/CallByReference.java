package methodCalling;

public class CallByReference 
{
	int x =10;
	public int callByReference(CallByReference r)
	{
		return r.x = r.x + 10;
	}

	public static void main(String[] args) 
	{
		CallByReference r = new CallByReference();
		System.out.println(r.callByReference(r));
	}

}
