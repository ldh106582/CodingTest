package practice;
import java.util.*;

public class codingTest_4 
{
	public static int gpt_4(int[] nums) 
	{
		// 배열의 변수 선언 어떤 index값을 넣어도 상관없음__2024.06.05
		int max = nums[0];
		int currentMax = nums[0];
		int currentMin = nums[0];
		
		// 길이만큼 반복진행_2024.06.05
		for(int i = 1; i < nums.length; i++) 
		{
			// 음수일 경우 진행하지 않도록 해야 최대값을 구할 수있음_2024.06.05
			if(nums[i] < 0) 
			{
				// 최대의 값을 변수에 담아줌_2024.06.05
				int temp = currentMax;
				System.out.println("if 안에 temp " + i + " : " + temp);
				
				// 빈 변수에 min값을 다시 담아줌_2024.06.05
				currentMax = currentMin;
				System.out.println("if 안에 currentMax " + i + " : " + currentMax);
				
				// temp변수의 값을 min변수 값을 담아줌_2024.06.05
				currentMin = temp;
				System.out.println("if 안에 currentMax : " + currentMin);
			}
			//Math의 최대값을 반환_2024.06.05
			currentMax = Math.max(currentMax * nums[i], nums[i]);
			System.out.println("currentMax : " + currentMax);
			// math의 최대 값을 min에 반환_2024.06.05
			currentMin = Math.max(currentMin * nums[i], nums[i]);
			System.out.println("currentMin : " + currentMin);
			// 최대 값을 max변수에 담음_2024.06.05
			max = Math.max(max, currentMax);
			System.out.println("max : " + max);	
		}
		
		return max;
	}

	public static void main(String[] args) 
	{
		// 배열의 변수 선언_2024.06.05
		int[] nums1 = {2,3,-2,4};
		int[] nums2 = {-2,0,-1};
	
		// 함수호출_2024.06.05
		System.out.println("최대 부분 배열 곱 (num1) : " + gpt_4(nums1));
		System.out.println("최대 부분 배열 곱 (num2) : " + gpt_4(nums2));
	}

}
