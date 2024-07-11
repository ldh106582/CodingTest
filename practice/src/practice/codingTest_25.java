package practice;

public class codingTest_25 
{

	public static double gpt_25(int[] arr) 
	{
		double answer = 0;
		int sum = 0;
				
		for(int i = 0; i < arr.length; i++) 
		{
			sum += arr[i];
			answer = sum/arr.length;

		}
		
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) 
	{
		// 5,5 를 선언함
		int[] arr = new int[] {5,5};
		
		System.out.println(gpt_25(arr));
	}

}
