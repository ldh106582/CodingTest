package programmerce;
import java.util.*;

public class gymClothes 
{
	public int solution(int n, int[] lost, int[] reserve) 
	{
		int answer = 0;
		
        Arrays.sort(reserve);
        Arrays.sort(lost);
		
		// lostlength = 2
		for(int i = 0; i < lost.length; i++)
		{
			// reverselength = 3
			for(int j = 0; j < reserve.length; j++)
			{
				if(lost[i] == reserve[j]) 
				{
					System.out.println("dh");
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					
					System.out.println(lost[i]);
					System.out.println(reserve[j]);
					break;
				}
			}
		}
		
		for (int i = 0; i < lost.length; i++)
		{
			for(int j = 0; j < reserve.length; j++)
			{
				if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) 
				{
					answer++;
					reserve[j] = -1;
					System.out.println(reserve[j]);
					break;
				}
			}
		}
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
