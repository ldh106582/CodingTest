package practice;
import java.util.*;

public class Test_20240206 
{
	
	public int practice(int b) 
	{
		int a = 3;
		return a;
	}

	public static void main(String[] args) 
	{
		int[] a = new int[] {1,2,3,4,5};
		Test_20240206 c = new Test_20240206();
		
		int sum = Arrays.stream(a).reduce(0, (acc, cur) -> acc + cur);
		System.out.println("c = : " + sum);		
		System.out.println("a = : " + c.practice(sum));
	}

}
