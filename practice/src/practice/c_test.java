package practice;

public class c_test 
{

	public static void main(String[] args) 
	{
		int a = 5;
		int[] b = new int[] {3,5,7,9,11};
		int temp;
		
		for (int i = 0; i < b.length; i++) 
		{
			temp = b[i];
			if (temp == 3) 
			{
				a += b[i];
			}

			System.out.println(b[i]);
		}
		System.out.println(a);
	}

}
