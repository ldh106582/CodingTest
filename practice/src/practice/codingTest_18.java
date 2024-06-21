package practice;

public class codingTest_18 
{
	public static int[] gpt_18(long n) 
	{
		String a = String.valueOf(n);
		int[] answer = new int[a.length()];
		
		for(int i = 0; i < answer.length; i++) 
		{
			answer[i] += Integer.parseInt(a.substring(answer.length-1-i, answer.length-i));
		}
		
		System.out.println(answer);
		
		return answer;
	}

	public static void main(String[] args) 
	{
		int n = 1234;
		
		gpt_18(n);

	}

}
