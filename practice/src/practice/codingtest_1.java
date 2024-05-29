package practice;
import java.util.Arrays;
import practice.practice.*;

public class codingtest_1 
{


	public static void main(String[] args) 
	{
		TreeNode tree = new TreeNode(); 
		/*
		 *  배열 조작
			문제: 정수 배열이 주어지면, 배열의 각 요소를 두 배로 만든 새로운 배열을 반환하세요.
			예시 입력: [1, 2, 3, 4, 5]
			예시 출력: [2, 4, 6, 8, 10]
		 * 
		 */
		
		// 도현_1차적으로 내가 푼 문제
		int[] test = new int[] {1,2,3,4,5};
		
		for(int i = 0; i < test.length; i++) 
		{
			System.out.print( test[i] * 2);
		}
		
		// 도현_gpt가 아렬준 답
		
		int[] arr = new int[] {1,2,3,4,5};
		int[] result = new int[test.length];
		
		for(int i = 0; i < arr.length; i++) 
		{
			result[i] = arr[i] * 2;
		}
		for(int i : result) 
		{
			   System.out.print(i + " ");
		}
		
		System.out.println("1번 끝 ======================================");

		/*
		 * gpt 1번 문제
		 * 정수로 이루어진 배열과 정수 target이 주어집니다.
		 * 배열 안에서 두 수를 더하여 target이 되는 두 수의 인덱스를 찾아 해당 인덱스를 반환하는 함수를 작성하세요. 
		 * 단, 같은 요소는 두 번 사용할 수 없습니다.
		 */
		
		// 도현_ 첫 번째 답
		String test_2 = "racecar";


		if(test_2 == "racecar") 
		{
			System.out.println("일치합니다 " + "True");
		}
		else
		{
			System.out.println("불일치 : " + false);
		}
		
		// 도현_ gpt 답
		
		System.out.println("2번 끝 ======================================");
		
		/*
		 * 문제: 이진 트리(Binary Tree)에서 주어진 값의 모든 노드를 찾는 함수를 구현하세요.
		 */
		
		// 도현_객체 생성 후 변수의 값을 계속 바꿔주기
		TreeNode tn = new TreeNode(5);
		tn.left = new TreeNode(3);
		tn.right = new TreeNode(7);
		tn.left.left = new TreeNode(1);
		tn.left.right = new TreeNode(3);
		tn.right.left = new TreeNode(6);
		tn.right.right = new TreeNode(8);
		
		// 도현_주어진 값과 일치하는 노드 찾기
		int target = 3;
		TreeNode[] result_1 = tn.findNodes(tn, target);
		
		// 도현_결과출력
		System.out.println("여기서 확인하기 : " + result_1);
		for(TreeNode root : result_1) 
		{
			System.out.println(root.val + " ");
		}
		
		/*
		 * 두 개의 정렬된 배열이 주어졌을 때, 이 두 배열을 하나의 정렬된 배열로 합치는 함수를 작성하세요
		 * */
		
		// 도현_변수 선언
		int[] arr_1 = {1, 3, 5};
		int[] arr_2 = {2, 4, 6};
		int[] r_arr = tn.Gptproblem_2(arr_1, arr_2);
		System.out.println("r_arr 값 : " + Arrays.toString(r_arr));
		
		//3번째 문제 
		/*
		  문제: 두 배열의 교집합 II
			주어진 두 배열 nums1과 nums2의 교집합을 구하는 함수를 작성하세요.
			각 교집합 원소는 두 배열에 나타나는 횟수만큼 포함되어야 합니다.
			교집합을 구한 결과는 어떤 순서로 출력되어도 상관없습니다.
		 */

			
			int[] num1 = {1,2,2,1};
			int[] num2 = {2,2};
			int[] result_3 = tree.Gpt_3(num1, num2);
			System.out.println(Arrays.toString(result_3));
			
			int[] num3 = {4,9,5};
			int[] num4 = {9,4,9,8,4};
			int[] result_3_1 = tree.Gpt_3(num3, num4);
			System.out.println(Arrays.toString(result_3_1));		
		
	}
	
	// 4번쨔 문제
	

}
