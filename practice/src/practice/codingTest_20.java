package practice;
import java.util.*;

public class codingTest_20 
{
	public static Long gpt_20(Long n) 
	{
		long answer = 0;

		while(answer * answer < n) 
		{
			answer++;
		}
		
		if(answer * answer == n)
		{
			answer++;
			answer *= answer;
		}
		else 
		{
			answer = -1;
		}
		System.out.println("answer : " +  answer);
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		long n = sc.nextLong();
		
		gpt_20(n);
	}

}
