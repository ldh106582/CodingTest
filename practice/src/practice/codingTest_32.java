package practice;
import java.util.*;

public class codingTest_32 
{
	
	public static int gpt_32(int[] d, int budget) 
	{
		int answer = 0;
		
		Arrays.sort(d);
		
		for(int i = 0; i < d.length; i++)
		{
			if(d[i] <= answer) 
			{
				answer++;
				budget -= d[i];
			}
			
			if(budget <= 0) 
			{
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) 
	{
		int [] d = new int[] {1,3,2,5,4};
		int budget = 9;
		
		gpt_32(d, budget);
	}

}
