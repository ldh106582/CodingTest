package practice;

public class javaTest 
{

	public static void main(String[] args) 
	{
		String base = "Hello EunWoo";
		char ch = 'o';
		for (int i = 0; i < base.length(); i++) 
		{
			if(ch == base.charAt(i))
			{
				base = base.substring(0,i) + '*' + base.substring(i+1);
			System.out.println(base.substring(0,i));
//			System.out.println(base.substring(i + 1));
			}
			else 
				base = base.substring(0,i) + '-' + base.substring(i+1);
		}
//		System.out.println(base);
	}

}
