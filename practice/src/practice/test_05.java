package practice;

public class test_05 
{

	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		for(int i = 0; i < 100; i *= 2) 
		{
			System.out.println("i : " + i);
			System.out.println(i + b);
			if((++i)%3 == 0) 
			{
				System.out.println((++i)%3);
				System.out.println(i);
				System.out.println(a + i);
			}
		}

	}

}
