package practice;

public class codingTest_28 
{
	public static int[][] gpt_28(int[][] arr1, int[][] arr2)
	{
		int [][] answer = new int[arr1.length][arr2.length];
		
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; i < arr2.length; i++)
			{
					
			answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
	
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		gpt_28(arr1, arr2);
	}

}
