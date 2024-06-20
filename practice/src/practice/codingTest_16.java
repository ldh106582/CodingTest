package practice;

public class codingTest_16 
{

	public static String gpt_16(String s) 
	{
		String answer = "";
		String[] arr = s.split("");
		int index = 0;
		
		for(String s_answer : arr) 
		{	
			if(s_answer.contains(" ")) 
			{
				index = 0;
			}
			else 
			{
				index ++;
			}
			
			if(index % 2 == 0) 
			{
				answer += s_answer.toLowerCase();
			}
			else 
			{
				answer += s_answer.toUpperCase();
			}
			System.out.println("answer : " + answer);
		}
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		String s = "try hello world";
		gpt_16(s);
	}

}
