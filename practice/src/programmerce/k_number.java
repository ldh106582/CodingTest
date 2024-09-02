package programmerce;

import java.util.*;
public class k_number 
{
	public static int[] kth_number(int[] array, int[][] commands)
	{
		int[] answer = new int[commands.length];
		System.out.println(Arrays.toString(answer));
		int n = 0;
		
		for(int i = 0; i < commands.length; i++) 
		{
			int k = 0;
			
			int[] list = new int[commands[i][1] - commands[i][0] + 1];
			
			for(int j = commands[i][0]; j <= commands[i][1]; j++) 
			{
				list[k++] = array[j-1];
			}
			Arrays.sort(list);
			answer[n++] = list[commands[i][2] -1];
			System.out.println(Arrays.toString(answer));
		}
		
		return answer;
	}
	
	public static int[] soultion(int[] array, int[][] commands)
	{
		return answer;
	}

	public static void main(String[] args) 
	{
		int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		kth_number(array , commands);
		soultion(array, commands);
	}

}
