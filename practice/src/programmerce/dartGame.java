package programmerce;


public class dartGame 
{
	public static int dart_Game(String dartResult) 
	{
		int answer = 0;
		
		String[] dart = dartResult.split("");
		int[] score = new int[3];
		
		int index = -1; // 스코어 인덱스번호
		// 2024.08.14 문제 풀이
		for(int i = 0; i < dart.length; i++) 
		{
			if(dart[i].matches("[0-9]")) 
			{
				index++;
				score[index] = Integer.parseInt(dart[i]);
				
				if(dart[i+1].matches("[0-9]")) 
				{
					score[index] *= 10;
					i++;
				}
			}
			// 2024.08.15 문제풀이
			switch(dart[i]) 
			{
			case "D" :
				score[index]= (int)Math.pow(score[index], 2);
				break;
			case "T" :
				score[index]= (int)Math.pow(score[index], 3);
				break;
			case "*" :
				score[index] *= 2;
				// 2024.08.16 문제 풀이
				if(index - 1 >= 0) score[index-1] *= 2;
				break;
			case "#":
				score[index] *= -1;
			}
		}
		// 2024.08.20 풀이
		for(int s : score) 
		{
			answer += s;
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
