package practice;
import java.util.*;

public class codingTest_6 
{
	// 자체공부_2024.06.07
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 배열의 값을 입력하세요");
        
        int nums = sc.nextInt();
        System.out.println("두 번째 배열의 값을 입력하세요");
        int num = sc.nextInt();
        System.out.println("입력하신 숫자는 " + nums + " 입니다!");
        int[][] input = new int[nums][num];
        
        for(int i = 0; i < nums; i++) 
        {
            System.out.println((i+1) + "번째 값을 입력하세요 (" + num + "개의 정수를 입력하세요)");
            for(int j = 0; j < num; j++)
            {
                input[i][j] = sc.nextInt();
            }
            System.out.println(Arrays.deepToString(input));
        }
    }
}