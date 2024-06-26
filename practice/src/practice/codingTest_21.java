package practice;
import java.util.*;

public class codingTest_21 
{
	public static int[] gpt_21(int[] arr) 
	{
		
		if(arr.length == 1) 
		{
			int[] answer = {-1};
			return answer;
		}
	
		int[] answer = {};
		answer = new int[arr.length-1];
		
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) 
		{
			min = Math.min(min, arr[i]);
		}
		
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) 
		{
			if(arr[i] == min) 
			{
				continue;
			}
			
			answer[index++] = arr[i];
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) 
		{
			System.out.println("숫자를 입력하세요");
			arr[i] = sc.nextInt();
		}
		gpt_21(arr);
	}

}
