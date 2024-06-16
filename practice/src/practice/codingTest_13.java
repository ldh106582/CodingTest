package practice;
import java.util.*;

public class codingTest_13 
{
	public static int gpt_13(String n)
	{
		int answer = 0;
		answer = Integer.parseInt(n);
		return answer;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String n = sc.nextLine();
		System.out.println(gpt_13(n));

	}

}
