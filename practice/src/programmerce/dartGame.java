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
			if(dart[i].matches("[0-9]")) 
			{
				index++;
				srcore[index] = Integer.parseInt(dart[i]);
				
				if(dart[i+1].matches("[0-9")) 
				{
					srcore[index] *= 10;
					i++;
				}
			}

			// 2024.08.15 문제풀이
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
