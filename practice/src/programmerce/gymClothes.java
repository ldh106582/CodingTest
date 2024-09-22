package programmerce;
import java.util.*;

public class gymClothes 
{
	public int solution(int n, int[] lost, int[] reverse) 
	{
		int answer = 0;
		
		// lostlength = 2
		for(int i = 0; i < lost.length; i++)
		{
			// reverselength = 3
			for(int j = 0; j < reverse.length; j++)
			{
				if(lost[i] == reverse[j]) 
				{
					System.out.println("dh");
					answer++;
					lost[i] = -1;
					reverse[j] = -1;
					
					System.out.println(lost[i]);
					System.out.println(reverse[j]);
					break;
				}
			}
		}
		
		for (int i = 0; i < lost.length; i++)
		{
			for(int j = 0; j < reverse.length; j++)
			{
				if (lost[i] - 1 == reverse[j] || lost[i] + 1 == reverse[j]) 
				{
					answer++;
					reverse[j] = -1;
					System.out.println(reverse[j]);
					break;
				}
			}
		}
//		System.out.println(answer);
		return answer;
	}
	

	public static void main(String[] args) 
	{
		int n = 5;
		int[] lost = new int[] {2,4};
		int[] reverse = new int[] {1,3,5};		
		gymClothes gym = new gymClothes();
		
		gym.solution(n ,  lost, reverse);
	}

}
