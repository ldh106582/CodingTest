package programmerce;


public class dartGame 
{
	public static int dart_Game(String dartResult) 
	{
		int answer = 0;
		
		String[] dart = dartResult.split("");
		int[] srcore = new int[3];
		
		int index = -1; // 스코어 인덱스번호
		// 2024.08.14 문제 풀이
		for(int i = 0; i < dart.length; i++) 
		{
			index++;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		// 2024.08.13 1차 문제 풀이
		String dartResult = "1S2D*3T";
		dart_Game(dartResult);
	}

}
