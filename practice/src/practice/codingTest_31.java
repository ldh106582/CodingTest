package practice;

public class codingTest_31 
{
	
	public static int gpt_31(int[] nums) 
	{
		int answer = 0;
		int sum = 0;
		
		for(int i = 0; i < nums.length-2; i++) 
		{
			for(int j = i+1; j < nums.length-1; j++) 
			{
				for(int k = j+1; k < nums.length; k++) 
				{// 가각의 값 추출하여 sum 변수에 저장
					sum = nums[i]+nums[j]+nums[k];
					
					if(isPrime(sum)) 
					{
						answer++;
					}
				}
			}
		}
		
		return answer;
	}

	public static boolean isPrime(int num) 
	{
      if (num < 2) 
      {
            return false;
       }
		for(int i = 2; i < num; i++)
		{
			if(num%i ==0) 
			{
				return false;				
			}

		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		int[] nums = new int[] {1,2,3,4};
		
		int result = gpt_31(nums);
        System.out.println("Number of prime sums: " + result);
		
	}

}
