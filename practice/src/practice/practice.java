package practice;
import java.util.Scanner;

public class practice {

	
	public static void main(String[] args) {
		
		int computer = (int) (Math.random() + 1 * 3);
		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보 중 숫자를 작성하시요");
		int user = sc.nextInt();
		
		if(user == 1) 
		{
			if(computer == 2) 
			{
				System.out.println("패배");
			}
			else if(computer == 3) 
			{
				System.out.println("승리");
			}
			else 
			{
				System.out.println("무승부");
			}
		}

		
		if(user == 2)
		{
			if(computer == 1) 
			{
				System.out.println("승리");
			}
			else if(computer == 3) 
			{
				System.out.println("패배");
			}
			else 
			{
				System.out.println("무승부");
			}
		}

		
		if(user == 3) 
		{
			if(computer == 1)
			{
				System.out.println("승리");
			}
			else if(computer == 2) 
			{
				System.out.println("패배");
			}
			else 
			{
				System.out.println("무승부");
			}
			
		}

	}
}
