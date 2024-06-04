package practice;
import java.util.*;

public class codingTest_3 
{
	public static int Gpt_4(int[] nums) 
	{
		// 변수를 선언하여 기준 값을 정해줌 어떤 index를 넣어도 값은 동일_2024.06.04
		int maxSum = nums[0];
		int current = nums[0];
		
		// 반복문을 이용하여 길이만큼 반복 진행_2024.06.04
		for(int i = 0; i < nums.length; i++) 
		{
			// current 변수에 최대 값을 담아줌_2024.06.04
			current = Math.max(nums[i], current + nums[i]);
			System.out.println("current" + " " + i + " : " + current);
			// 최고 큰 숫자를 변수에 담아줌_2024.06.04
			maxSum = Math.max(maxSum, current);
			System.out.println("maxSum" + " " + i + " : " + maxSum);
		}
		return maxSum;
	}
	
	
	public static void main(String[] args) 
	{
		// 파라미터로 전달할 값을 변수로 선언_2024.06.04
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println("최대 부분 배열의 합 : " + codingTest_3.Gpt_4(nums));

	}

}
