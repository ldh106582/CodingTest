package practice;
import java.util.*;

public class codingTest_5 
{

	public static void main(String[] args) 
	{
		// 스캐너 객체생성 _ 2024.06.06
		Scanner sc = new Scanner(System.in);
		System.out.println("대여할 회의실 번호를 입력해주세요");
		int t = sc.nextInt();
		int[][] arr = new int[t][2];
		
		for(int i = 0; i < t; i++) 
		{
			// 시작시간
			System.out.println("시작하는 시간을 입력해주세요");
			arr[i][0] = sc.nextInt();
			// 끝내는 시간
			System.out.println("끝나는 시간을 입력해주세요");
			arr[i][1] = sc.nextInt();
			System.out.println("시작시간 개수 : " + arr[i][0]);
			System.out.println("시작시간 개수 : " + arr[i][1]);
		}
		
		System.out.println("회의실 개수 : " + t);

	}

}
