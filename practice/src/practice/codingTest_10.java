package practice;

public class codingTest_10 
{
	public static String CT_10(String[] seoul) 
	{
		String answer = "";
		
		// 반복문으로 글자의 길이만큼 반복시킴
		for(int i = 0; i < seoul.length; i++) 
		{
			// 조건문 equals 값과 비교함
			if("kim".equals(seoul[i])) 
			{
				answer = "김서방은 " + i + "에 있다.";
			}
		}
		return answer;
	}

	public static void main(String[] args) 
	{
		String[] seoul = new String [] {"Jane", "kim"};
		// 함수호출
		System.out.println(CT_10(seoul));

	}
}
