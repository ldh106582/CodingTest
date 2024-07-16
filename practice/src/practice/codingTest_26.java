package practice;

public class codingTest_26 
{
	
	public static boolean gpt_26(int x) 
	{
		boolean answer = true;
		
		int a = x / 10000;
        int b = (x / 1000) % 10;
		int c = (x / 100) % 10;
		int d = (x / 10) % 10;
	    int e = x % 10;
        
		int sum = a + b + c + d + e;
		System.out.println("sum : " + sum);
		
		if(x % sum != 0) answer = false;
		
		System.out.println("answer : " + answer);
		return answer;
	}

	public static void main(String[] args) 
	{
		int x = 12;
		
		gpt_26(x);

	}

}
