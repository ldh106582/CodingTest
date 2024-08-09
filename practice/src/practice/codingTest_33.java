package practice;

public class codingTest_33 
{
	public static String[] gpt_33(int n, int[] arr1, int[] arr2) 
	{
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) 
		{
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
    		System.out.println(answer[i]);
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
