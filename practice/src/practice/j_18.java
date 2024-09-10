package practice;

public class j_18 
{
	
	static void change(char arr[]) 
	{
		for(int i = 0; i < arr.length; i++) 
		{
			if(arr[i] == 'b') arr[i] = 'c';
			else if(i == arr.length - 1) {
				arr[i] = arr[i - 1];
				System.out.println("dh : " + (arr.length - 1) );
			}
			else arr[i] = arr[i+1];
		}
	}
	
	static void prtarr(char arr[]) 
	{
		for(int i = 0; i <arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) 
	{
		char a[] = {'a','b','c','b','c','d','a'};
		change(a);
		prtarr(a);

	}

}
