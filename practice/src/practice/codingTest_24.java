package practice;
import java.util.*;

public class codingTest_24 
{
	public static int gpt_24(long num) 
	{
		int answer = 0;
		
		while(num != 1) 
		{
			if(num % 2 == 0) 
			{
				num/=2;
			}
			else
			{
				num = num * 3 + 1;		
				answer ++;
			}
			
			if(answer >= 500) answer = -1;
			break;
		}
			
		System.out.println("answer : " + answer);
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		long num = sc.nextInt();

		gpt_24(num);
	}

}
