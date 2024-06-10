package practice;

import java.util.Arrays;
import java.util.Collections;

public class codingTest_8 
{
	public static String codingTest_8(String s) 
	{
		System.out.println("전달 값 확인 : " + s);
		// 리턴 할 변수를 선언
		String answer = "";
		// 한글자씩 잘라서 x변수에 담음
		String[] x = s.split("");
		// Arrays.sort 함수 사용하여 반대로 변경
		Arrays.sort(x, Collections.reverseOrder());
		
		// 초기화 되지 않도록 += 사용
		for(String y : x) 
		{
			answer += y;
		}
		
		return  answer;
	}

	public static void main(String[] args) 
	{
		// 전달하는 값
		String s = "Zbcdefg";
		// 함수호출
		System.out.println("정답은 : " + codingTest_8(s));
	}

}
