package practice;
import java.util.*;

public class codingTest_12 
{
	public static String gpt_12(int n) 
	{
		System.out.println("gpt_12 함수 : " + n);
		
		String answer = "";
		
		for(int i = 0; i < n; i++ ) 
		{
			answer += i%2 != 0 ? "박" : "수";
		}
		
		return answer;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("수박수박 회수 입력 : ");
		int n = sc.nextInt();
		System.out.println(gpt_12(n));
		
	}

}