package practice;
import java.util.*;

public class codingTest_9 
{
	public static boolean codingTest_9(String s) 
	{
		boolean answer = true;
		
		//  길이가 4 혹은 6일 경우를 반환
		if(s.length() == 4 || s.length() == 6)
		{
			// 반복문
			for(int i = 0; i < s.length(); i++) 
			{
				// 문자열열인지 안에 들어오도록 함.
				// 아스키 코드가 숫자가 48부터 이며 문자열은 57까지
				if(s.charAt(i) < 48 || s.charAt(i) > 57) 
				{
					answer = false;
					return answer;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		String s = sc.nextLine();
		System.out.println("입력하신 값은 : " + s);
		System.out.println("=======================================");
		
		/*
		 * for(int i = 0; i < s.length(); i++) { char c = s.charAt(i); int asci = (int)
		 * c; System.out.println("문자열 번호 : " + asci); }
		 */
		
		System.out.println("=======================================");
		System.out.println("정답 : " + codingTest_9(s));
		
	}

}
