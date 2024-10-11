package practice;

public class jtest01 
{
	
	public int Obnumber(int a) 
	{
		int ab = 0;

		System.out.println(a);
		if (a > 1) {
			Obnumber(a - 1);
			ab = a % 2;
			System.out.println("값 : " + a + " 답 : " +  ab);
		}
		
		return ab;
	}

	public static void main(String[] args) 
	{
		int a = 10;
		
		jtest01 ob = new jtest01();
		ob.Obnumber(a);
		System.out.println("end");
		

	}

}
