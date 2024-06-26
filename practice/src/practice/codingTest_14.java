package practice;

public class codingTest_14 
{
	
	public static String gpt_14(String s, int n) 
	{
		String answer = "";
		char ch = 0;
		System.out.println("s값 확인 : " + s);
		
		for(int i = 0; i < s.length(); i++) 
		{
			ch = s.charAt(i);
			System.out.println("ch 값 확인 : " + ch);
			// 소문자를 확인하여 실행하는 조건문
			if(Character.isLowerCase(ch)) 
			{
				// ch = b 라고 하면 b(98) - a(97) = 1
				//  1 + n(2) = 3
				// 3 % 26 = 3
				// 3 + 97 = 100 이되어 100번은 'd'이기에 'd'가 됨
				ch = (char) ((ch - 'a' + n)%26 + 'a');
			}
			// 대문자를 확인하여 실행하는 조건문
			else if(Character.isUpperCase(ch)) 
			{
				ch = (char) ((ch - 'A' + n)%26 + 'A');
			}
			answer += ch;
			System.out.println("answer : " + answer);
		}
		
		return answer;
	}

	public static void main(String[] args) 
	{
		String s = "AB";
		int n = 1;
		
		System.out.println(gpt_14(s,n));
	}

}
