package practice;

public class codingTest_33 
{
	public static String[] gpt_33(int n, int[] arr1, int[] arr2) 
	{
		String[] answer = {};
		String binary = null;
		
		for(int i = 0; i < arr1.length; i++) 
		{
			binary = Integer.toBinaryString(arr1[i]);
			if(binary == "1") 
			{
				binary = "#";
			}
		}
		return answer;
	}

	public static void main(String[] args) 
	{
		int n = 5;
		int[] arr1 = new int[] {9,20,28,18,11};
		int[] arr2 = new int[] {30,1,21,17,28};
		
		gpt_33(n, arr1, arr2);
	}

}
