package practice;

import java.util.*;

public class gpt_1 
{
	public class algorithum_1
	{
		public static int[] algorithum(int[] arr1, int[] arr2) 
		{
			// m 변수 길이 4개
			int m = arr1.length;
			// n 변수 길이 4개
			int n = arr2.length;
			// m + n으로 값을 하나의 변수로 만듦
			int[] result = new int[m+n];
			// 변수의 index를 위한 변수 선언
			int i = 0;
			int j = 0;
			int k = 0;
			
			// i와 j 가 m변수와 n 변수보다 작을 경우까지만 반복함.
			while(i < m && j < n)
			{
				// j가 작을 경우 최대 출력 되는 값 : if 참일경우 : [1, 2, 3, 4, 5, 6, 7, 0]7
				if(arr1[i] <= arr2[j])
				{
					result[k++] = arr1[i++];
					System.out.println("if 참일경우 : " + Arrays.toString(result) + "" + k);
				}
				// if조건 이외 값 else 최대 else 일경우 : [1, 2, 3, 4, 5, 6, 0, 0]6
				else 
				{
					result[k++] = arr2[j++];
					System.out.println("else 일경우 : " +  Arrays.toString(result) + "" + k);
				}
			}
			// 8이 나와야 하는데 현재 0부터 돌아 7번까지 나온다는 문제가 발생함.
			
			
			System.out.println("n : " + n);
			System.out.println("j : " + j);
			System.out.println("마지막02번 while j : " + Arrays.toString(arr2) + k);
			
			// j의 index 길이 3이 나옴
			while(j < n) 
			{
				System.out.println("n1 : " + n);
				System.out.println("j1 : " + j);
				System.out.println("마지막02번 while : " + Arrays.toString(result) + k);
				System.out.println("마지막02번 while j : " + Arrays.toString(arr2) + j);
				result[k++] = arr2[j++];
				System.out.println("마지막2번 while j : " + Arrays.toString(arr2) + j);
				System.out.println("마지막2번 while : " + Arrays.toString(result) + k);
			}

			
			return result;
		}
		
	}

	public static void main(String[] args) 
	{
		// 전달되는 값
		int[] arr1 = new int[] {1,3,5,7};
		int[] arr2 = new int[] {2,4,6,8};
		// 스태틱  함수 호출
		int[] result = algorithum_1.algorithum(arr1, arr2);
		System.out.println("결과 : " + Arrays.toString(result));
	}

}
