package practice;
import java.util.*;


public class Test20240220 
{

	public static void main(String[] args) 
	{
		String str = "ITISTESTSTRING";
		String[] result = str.split("T");
		System.out.println(result[3]);
		System.out.println(result);
		System.out.println(Arrays.toString(result));
		
		for(int i = 0; i < result.length; i++) 
		{
			System.out.println(result[i]);
		}
	}

}
