package practice;

public class codingTest_26 
{
	
	public static boolean gpt_26(int x) 
	{
		boolean answer = true;
		
		int b = x / 100;
		System.out.println("b : " + b);
		int c = x / 1000;
		System.out.println("c : " + c);
		int d = x / 10000;
		System.out.println("d : " + d);
		
		int a = x % 10;
		System.out.println("a : " + a);
	
		int sum = a + b + c + d;
		System.out.println("sum : " + sum);
		
		if(sum != 0) answer = false;
		
		System.out.println("answer : " + answer);
		return answer;
	}

	public static void main(String[] args) 
	{
		int x = 25;
		
		gpt_26(x);

	}

}
