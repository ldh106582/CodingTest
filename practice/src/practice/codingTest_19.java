package practice;
import java.util.Arrays;

public class codingTest_19 
{
	
	public static long gpt_19(long n) 
	{
		long answer = 0;
		
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(String list : arr) sb.append(list);
		
		return Long.parseLong(sb.reverse().toString());
	}
	
	public static void main(String[] args) 
	{
		long n = 118372;
		gpt_19(n);
	}
}
