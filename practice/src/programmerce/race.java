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
		
		for(int i = 0; i < participant.length; i++)
		{
			if(i < completion.length && participant[i] != null && completion[i] != null)
			{

				answer = participant[i];
				break;
			}
		}
		System.out.println(answer);
		return answer;
	}
	
	
	public static void main(String[] args) 
	{
		String[] participant = new String[] {"leo", "kiki", "eden"};
		String[] completion = new String[] {"kiki", "eden"};
		race(participant, completion);
	}

}
