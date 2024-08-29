package programmerce;

import java.util.*;

public class k_number 
{
	public static int[] kth_number(int[] array, int[][] commands)
	{
		int[] answer = {};
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(commands));
		
		return answer;
	}

	public static void main(String[] args) 
	{
		int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		kth_number(array , commands);
	}

}
