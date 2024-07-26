package practice;

public class c_03 
{
	
	public static int isPrime(int number) 
	{
		int i;
		for(i = 2; i < number; i++) 
		{
			if(number % i == 0) 
			{
				// System.out.println("isPrime if : " + number);
				return 0;
			}

		}
		return 1;
	}

	public static void main(String[] args) 
	{
		int number = 13195;
		int max_div = 0;
		
		for(int i = 2; i < number; i++) 
		{

			if(isPrime(i) == 1 && number % i == 0)
			{
				System.out.println("mian : " + i);
				max_div = i;
			}
		}
		System.out.println(max_div);

	}

}
