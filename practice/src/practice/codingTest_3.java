package practice;
import java.util.*;

public class codingTest_3 
{
	public static int Gpt_4(int[] nums) 
	{
		// ㅂ
		int maxSum = nums[0];
		int current = nums[0];
		
		for(int i = 0; i < nums.length; i++) 
		{
			current = Math.max(nums[i], current + nums[i]);
			System.out.println("current" + " " + i + " : " + current);
			maxSum = Math.max(maxSum, current);
			System.out.println("maxSum" + " " + i + " : " + maxSum);
		}
		return maxSum;
	}
	
	
	public static void main(String[] args) 
	{
		// 파라미터로 전달할 값을 변수로 선언
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println("최대 부분 배열의 합 : " + codingTest_3.Gpt_4(nums));

	}

}
