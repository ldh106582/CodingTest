package practice;

public class b_test 
{

	public static void main(String[] args) 
	{
		int a = 3; int c = 1;
		int z = 0;
		switch(a) 
		{
			case 1: 
				c += 10;
			case 2:
				c += -11;
			case 3:
				c = 1;
				break;
			case 4:
				c = 1;
				break;
			case 5:
				z = 8;
			default: c++;
		}
		
		System.out.println(c);

	}

}
