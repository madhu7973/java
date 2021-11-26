package conditionalStatements;

public class ForLoop_FindingPrimeNumber 
{

	public static void main(String[] args) 
	{
		int num;
		boolean isPrime;
		num = 37;
		if(num < 2) isPrime = false;
		 else isPrime = true;
		for(int i=2; i <= num/i; i++) 
		{
			 if((num % i) == 0) 
			 {
				 isPrime = false;
				 break;
			 }

		 }
		if (isPrime)
			System.out.println(num + " " + "is prime");
		else System.out.println(num + " " + "is not prime");
	}
}
