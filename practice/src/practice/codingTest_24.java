package practice;
import java.util.*;

public class codingTest_24 
{
	public static int gpt_24(long num) 
	{
		int answer = 0;
		// 1이 아닐 경우 반복
		while(num != 1) 
		{
			// 나머지가 0이 면
			if(num % 2 == 0) 
			{
				// 2로 나눔 num에 덮어씌움
				num/=2;
			}
			else
			{
				// 나머지가 0이 아닐 경우 num * 3 + 1 값
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
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		long num = sc.nextInt();

		gpt_24(num);
	}

}
