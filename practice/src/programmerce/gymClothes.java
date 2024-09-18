package programmerce;
import java.util.*;

public class gymClothes 
{
	public int solution(int n, int[] lost, int[] reverse) 
	{
		int answer = 0;
		
		System.out.println(Arrays.toString(lost));
		System.out.println(Arrays.toString(reverse));
		
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
