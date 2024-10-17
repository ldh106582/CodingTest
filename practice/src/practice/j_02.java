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
			case 5 : c+=1; System.out.println("1 번 케이스");
			break;
			case 3 : c++; System.out.println("3 번 케이스");
			case 4 : c--; System.out.println("4 번 케이스");
			break;
			default : System.out.println("default");;
		}
		System.out.println(c);
	}

}
