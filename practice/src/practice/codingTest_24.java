package practice;
import java.util.*;

public class codingTest_24 
{
	public static int gpt_24(int num) 
	{
		int answer = 0;
		
		for() 
		{
			if(num % 2 == 0) 
			{
				answer = num/2;
			}
			if(num % 3 == 0)
			{
				answer = (num * 3) + 1;		
			}
		}
			
			
			
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();

		gpt_24(num);
	}

}
