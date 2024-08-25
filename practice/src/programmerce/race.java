package programmerce;

import java.util.Arrays;

public class race 
{
	public static String race(String[] participant, String[] completion) 
	{
		
		// 오류발생
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
//		at Solution.solution(Unknown Source)
//		at SolutionTest.lambda$main$0(Unknown Source)
//		at SolutionTest$SolutionRunner.run(Unknown Source)
//		at SolutionTest.main(Unknown Source)
		
		String answer = null;
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < completion.length; i++)
		{
			if(!participant.equals(completion))
			{
				answer = completion[i];
				break;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) 
	{

		String[] participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = new String[] {"josipa", "filipa", "marina", "nikola"};
		String answer = null;
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i = 0;
		for(i = 0; i < completion.length; i++ ) 
		{
			if(!participant[i].equals(completion[i])) 
			{
                participant[i];
			}
		}
		
	}

}
