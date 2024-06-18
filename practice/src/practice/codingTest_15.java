package practice;
import java.util.*;

public class codingTest_15 
{
	public static int gpt_15(int n) 
	{
		int answer = 0;
		 // 1부터 시작하고 반복할 횟수를 설정
		for(int i = 1; i <= n; i++) 
		{
			// 나머지가 0이면 n이 나누어지는 약수
			if(n % i == 0) 
			{
				System.out.println("i 값 출력 : " + i);
				// += 값을 누적으로 더해줌
				answer += i;
				System.out.println("answer 누적값 출력 : " + answer);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int n = sc.nextInt();
		gpt_15(n);
	}

}
