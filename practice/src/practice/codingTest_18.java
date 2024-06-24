package practice;
import java.util.*;

public class codingTest_18 
{
	public static int[] gpt_18(long n) 
	{
		// valueOf : String 객체로 변환하는 함수
		// n = 1234
		String a = String.valueOf(n);
		StringBuilder sb = new StringBuilder(a);

		// 숫자를 반대로 뒤집어서 4321
		sb = sb.reverse();
		// n = "4", "3", "2", "1"
		String[] ss = sb.toString().split("");
		
		// 배열 형태로 변환
		int[] answer = new int[ss.length];
		
		for(int i = 0; i < ss.length; i++) 
		{
			// answer[0] = 4
			answer[i] = Integer.parseInt(ss[i]);
		}
		// 주소값이 나와 배열 형태에서 안에 있는 데이터를 보도록 함.
		System.out.println(Arrays.toString(answer));
		
		return answer;
	}

	public static void main(String[] args) 
	{
		int n = 1234;
		
		gpt_18(n);

	}

}
