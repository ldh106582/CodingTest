package practice;
import java.util.*;

public class codingTest_29 
{
	public static long[] gpt_29(int x, int n) {
		long[] answer = new long[n];
		
		for(int i = 0; i < n; i++) 
		{
			answer[i] = (long) (i + 1) * x;
			System.out.println(Arrays.toString(answer));
		}
		
		return answer;
	}

	public static void main(String[] args) 
	{
		// 문제풀이
		int x = 2;
		int n = 5;
		
		gpt_29(x, n);
	}

}
