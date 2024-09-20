package programmerce;
import java.util.*;

public class gymClothes 
{
	public int solution(int n, int[] lost, int[] reverse) 
	{
		int answer = 0;
		
		for(int i = 0; i < lost.length; i++)
		{
			for(int j = 0; j < reverse.length; j++)
			{
				if(lost[i] == reverse[j]) 
				{
					answer++;
					lost[i] = -1;
					reverse[j] = -1;
					break;
				}
			}
		}
		
		for (int i = 0; i < lost.length; i++)
		{
			for(int j = 0; j < reverse.length; j++)
			{
				if (lost[i] - 1 == reverse[j] || lost[i] + 1 == reverse[j]) {
					answer++;
					reverse[j] = -1;
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
