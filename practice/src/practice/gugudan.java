package practice;

public class gugudan 
{
	public static void main(String[] args) 
	{
		//  문제 : 구구단 만들기
		for(int i = 0; i <= 9; i++ ) 
		{
			for(int j = 0; j <= 9; j++) 
			{
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
}
