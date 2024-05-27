package practice;

import java.util.ArrayList;
import java.util.List;


// gpt 1번 문제: 
/*
 * 		 정수로 이루어진 배열과 정수 target이 주어집니다.
		  배열 안에서 두 수를 더하여 target이 되는 두 수의 인덱스를 찾아 해당 인덱스를 반환하는 함수를 작성하세요. 
		  단, 같은 요소는 두 번 사용할 수 없습니다.
 * */

public class TreeNode 
{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) 
	{
		this.val = val;
	}
	
	public static TreeNode[] findNodes(TreeNode tn, int target) 
	{
		List<TreeNode> nodeList = new ArrayList<>();
		System.out.println("1.nodeList : " + nodeList);
		f_Node(tn, target, nodeList);
		System.out.println("2.nodeList : " + nodeList);
		return nodeList.toArray(new TreeNode[0]);
	}
	
	public static void f_Node(TreeNode tn, int target, List<TreeNode> nodeList) 
	{
		if(tn == null) 
		{
			System.out.println("if 구문 ");
			return;
		}
		if(tn.val == target) 
		{
			nodeList.add(tn);
			System.out.println("2.if 구문  : " + nodeList);
		}
		f_Node(tn.left, target, nodeList);
		f_Node(tn.right, target, nodeList);
	
		
	}
	

/*
 * gpt 2번 문제 :  두 개의 정렬된 배열이 주어졌을 때, 이 두 배열을 하나의 정렬된 배열로 합치는 함수를 작성하세요
 * */
	
	public static int[] Gptproblem_2 (int[] arr_1, int[] arr_2)
	{
		// 도현_배열있는 번수를 자동으로 출력하기 위한 변수선언
		int i = 0;
		int j = 0;
		int k = 0;
		// 도현_배열 형태로 변수 선언하여 생성
		int[] arr_r = new int[] {arr_1.length, arr_2.length};
		
		// 도현_ 배열의 형태 반복문 진행 i와 j 가 크게 되면 자동으로 반복문을 멈추게 됨
		while(i < arr_1.length && j < arr_2.length) 
		{
			// 도현_만약 배열의0번째 인덱스가 가장 큰 최대 인덱스 2번째 값보다 작을 경우 arr_r변수의 k가 0부터 1씩 더해줘 arr_1[i]번째 값을 담아줌
			if(arr_1[i] < arr_2[2] )
			{
				arr_r[k++] = arr_1[i++];
				System.out.println("if구문 조건 만족 시 [i] : " + arr_r[k++]);
			}
			else
			{
				arr_r[k++] = arr_2[j++];
				System.out.println("if구문 조건 만족 시 [j] : " + arr_r[k++]);
			}
		}
		// 도현_ 남은 숫자 확인
		while(i < arr_1.length)
		{
			arr_r[k++] = arr_1[i++];
			System.out.println("남아 있는 숫자확인 [i] :" + arr_r[k++]);
		}
		
		while(i < arr_2.length) 
		{
			arr_r[k++] = arr_2[j++];
			System.out.println("남아 있는 숫자확인 [j] :" + arr_r[k++]);
		}
		
		return arr_r;
	}
	
	public int[] gpt_3(int[] num1, int[] num2) 
	{
		
		return null;
	}
}
