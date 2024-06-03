package practice;

import java.util.*;

public class codingTest 
{
	
	public static int Gpt_3(int[] nums, int total)
	{
		
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		int sum = 0;
		
		map.put(0, 1);
		
		for(int num : nums) 
		{
			sum += num;
			System.out.println("sum : " + sum);
			System.out.println("total : " + total);
			// key값이 존재하면 count에 값을 넣기 위한 함수
			if(map.containsKey(sum - total)) 
			{
				// 조건이 만족할 시 count에 값을 담아줌
				count += map.get(sum - total);
				System.out.println("count"+ count + " : " + count);
			}
			
			// 현재 누적 합을 map에 추가하거나 이미 존재하라 경우 1씩 증가
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		
		return count;
	}

	public static void main(String[] args) 
	{
		System.out.println("몇 개의 숫자를 입력할지 결정해주세요.");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] nums = new int[m];
		
		for(int i = 0; i < m; i++ ) 
		{
			System.out.println((i+1) + "번째 값을 입력해주세요");
			nums[i] = sc.nextInt();
		}
		
		System.out.println("합의 숫자를 입력해주세요.");
		int total = sc.nextInt();
		
		System.out.println("정답 : " + Gpt_3(nums, total));
	}

}
