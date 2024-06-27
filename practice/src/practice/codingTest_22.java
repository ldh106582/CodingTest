package practice;
import java.util.*;

public class codingTest_22 
{
	
	public static String gpt22(int num) 
	{
		String answer = "";
		
		/*if(num % 2 == 0) 
		{
			answer = "Even";
		}
		else 
		{
			answer = "Odd";			
		}*/
		
		answer = (num % 2 == 0) ? "Even" : "Odd";
		
		System.out.println("정답 : " + answer);
		
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		int num = sc.nextInt();
		
		gpt22(num);
	}

}
