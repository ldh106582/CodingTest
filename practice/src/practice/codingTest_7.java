package practice;
import java.util.*;

public class codingTest_7 
{
	public static boolean codingTest_7(String a) 
	{
		// true false를 반환하기 위한 변수 설정
		boolean answer = true;
		
		System.out.println("함수의 값 : "+ a);
		
		// 파라미터의 변수의 모든 문자를 소문자화 진행하며 split 함수로 한개씩 나눔
		String[] array = a.toLowerCase().split("");
		int x = 0;
		int y = 0;
		
		// 문자열의 길이만큼 반복
		for(int i =0; i < a.length(); i++) 
		{
			// p 문자열일시 x++
			if("p".equals(array[i]))
			{
				x++;
				System.out.println("x 변수의 갯수 : " + x);
			}
			// y 문자열일시 y++
			else if("y".equals(array[i])) 
			{
				y++;
				System.out.println("y 변수의 갯수 : " + y);
			}
		}
		
		// x의 개수와 y의 개수가 다를 시 false 반환
		if(x != y) 
		{
			answer = false;
		}
		
		return answer;
	}
	
	// 프로그래머스 '문자열 내 p와 y의 개수' 문제
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요");
		String a = sc.nextLine();
		System.out.println(a + " : 를 입력하셨습니다.");
		// 함수호출
		System.out.println("정답은 : " + codingTest_7(a));

	}

}
