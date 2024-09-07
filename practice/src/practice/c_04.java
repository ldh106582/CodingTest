package practice;

public class c_04 
{	
	public void calc(int arr[]) 
	{
		for(int i = 1; i < 6; i++)
		{
			int key = arr[i];
			int j = 0;
			for(j = i - 1; j >= 0 && arr[j] > key; j--)
				arr[j + 1] = arr[j];
			System.out.println("dh : " + +arr[j + 1] + " i : " + i + " j : " + j);		
			arr[j+1] = key;
			System.out.println("ld : " + +arr[j + 1] + " i : " + i + " j : " + j);
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = {6,4,5,1,2,7};
		c_04 c = new c_04();
		c.calc(arr);
		for(int i = 0; i < 6; i++) 
		{
			System.out.print(" answer : " + arr[i]);
		}
	}
}
