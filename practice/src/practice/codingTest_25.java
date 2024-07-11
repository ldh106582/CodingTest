package practice;

public class codingTest_25 
{

	public static double gpt_25(int[] arr) 
	{
		double answer = 0;
		double sum = 0;
				
		for(int i = 0; i < arr.length; i++) 
		{
			sum += arr[i];
			System.out.println("arr[i] : " + arr[i]);
			System.out.println("sum : " + sum);
			answer = sum/arr.length;
			System.out.println("answer : " + answer);

		}
		
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) 
	{
		// 5,5 를 선언함
		int[] arr = new int[] {1,2,3,4};
		
		System.out.println(gpt_25(arr));
	}

}
