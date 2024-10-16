package practice;

public class j_02 
{

	public static void main(String[] args) 
	{
//		int a = 20, b = 100;
//		System.out.printf("%d %d\n", a, b);
//		System.out.printf("%b\n", a >= 20 || ++b == 100);
//		System.out.printf("%d %d\n", a, b);
//		System.out.printf("%b\n", a==b);
//		System.out.println(b);
//		
		int c = 4;
		switch(++c) 
		{
			case 5 : c+=1;
			break;
			case 3 : c++;
			case 4 : c++;
			break;
			default : System.out.println("default");;
		}
		System.out.println(c);
	}

}
