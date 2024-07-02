package practice;
import java.util.*;

public class codingTest_23 
{
	
	public static int[] gpt_23(int n, int m) 
	{
		int[] answer = new int[2];
		
		int a = Math.max(n, m);
		int b = Math.min(n, m);
		
		while(b != 0) 
		{
			int r= a%b;
			a = b;
			b = r;
		}
		
		return new int[] { a, n * m / a };
	}

	public static void main(String[] args) 
	{
		// 두 가의 값을 파라미터로 넘김
		int n = 3;
		int m = 12;
		
		gpt_23(n,m);

	}

}
