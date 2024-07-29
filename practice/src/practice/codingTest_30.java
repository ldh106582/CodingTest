package practice;
import java.util.*;

public class codingTest_30 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("a숫자를 입력해주세요");
		int a = sc.nextInt();
		System.out.println("b숫자를 입력해주세요");
		int b = sc.nextInt();
		
		for(int i = 0; i < b ; i++) 
		{
			for(int j = 0; j < a; j++) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
