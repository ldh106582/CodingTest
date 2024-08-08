package practice;

public class codingTest_33 
{
	public static String[] gpt_33(int n, int[] arr1, int[] arr2) 
	{
		String[] answer = {};
		String ar1 = null;
		String ar2 = null;
		for(int i = 0; i < n; i++) 
		{
			ar1 = Integer.toBinaryString(arr1[i]);
			ar2 = Integer.toBinaryString(arr2[i]);
			
			if(ar1.equals("1") || ar2.equals("1")) 
			{
				ar1 = "#";
				ar2 = "#";
				System.out.println("ar1 : " + ar1 + " ar2 : " + ar2);
			}
			else
			{
				
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
