package practice;

public class codingTest_27 
{
	public static String gpt_27(String phone_number) 
	{
		String answer = "";
		System.out.println(phone_number);
		
		for(int i = 0; i < phone_number.length(); i++) 
		{
			if(i < phone_number.length() - 4) answer += '*';
			else answer += phone_number.charAt(i);
		}
		System.out.println(answer);
		return answer;
	}
	
	
	public static void main(String[] args) 
	{
		String phone_number = "01093341065";
		
		gpt_27(phone_number);
	}

}
