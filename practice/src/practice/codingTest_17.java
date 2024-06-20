package practice;

public class codingTest_17 
{

	public static int gpt_17(int n) 
	{
		int answer = 0;

		while(n > 0) 
		{
			answer += n%10;
			System.out.println("answer : " + answer);
			n /= 10;
			System.out.println("n : " + n);
		}
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		int n = 123;
		
		gpt_17(n);

	}

}
