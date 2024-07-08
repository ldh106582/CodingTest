package practice;
import java.util.*;

public class codingTest_24 
{
	public static List gpt_24(int num) 
	{
		// List로 객체생성
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(num);
		// 1이 아닐 경우 반복
		while(num != 1) 
		{
			// 나머지가 0이 면
			if(num % 2 == 0) 
			{
				// 2로 나눔 num에 덮어씌움
				num/=2;
				answer.add(num);
			}
			else
			{
				// 나머지가 0이 아닐 경우 num * 3 + 1 값
				num = num * 3 + 1;		
				answer.add(num);
			}
			
		}
		// 왜 결과 값이 안나오지??
			
		System.out.println("answer : " + answer);
		return answer;
	}

	public static void main(String[] args) 
	{
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();

		gpt_24(num);
	}

}
