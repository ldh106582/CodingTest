package practice;
import java.util.*;

public class codingtest_2 
{
	public class gpt_2
	{
		public static int gpt_2(String s) 
		{
			// 파리미터 값의 길이를 출력함
			int n = s.length();
			// 최대 길이를 출력함
			int max = 0;
			int left = 0;
			int right = 0;
			// 문자열을 받을 수 있는 Set 객체 생성
			HashSet<Character> set = new HashSet<>();
			
			// 글자의 길이만큼 반복하기 위한 조건
			while(right < n) 
			{
				// set객체에 해당하는 문자가 있는지 출력
				if(!set.contains(s.charAt(right))) 
				{
					// 파라미터의 문자를 set 객체에 담음
					set.add(s.charAt(right));
					// 1씩 추가
					right++;
					// Math 객체의 최대 문자열 길이로 최신화
					max = Math.max(max,right - left);
				}
				else 
				{
					// 중복된 문자를 제거하는 함수
					set.remove(s.charAt(left));
					// 반복을 위한 left 변수에 1씩 추가
					left++;
				}
			}
			
			return max;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("값을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		// sc변수 값 입력
		String s = sc.nextLine();
		// 함수호출
		System.out.println(gpt_2.gpt_2(s));

	}

}
