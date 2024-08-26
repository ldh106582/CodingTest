package programmerce;

import java.util.Arrays;
import java.util.HashMap;

public class race 
{
	public static String race(String[] participant, String[] completion) 
	{
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i = 0;
		for(i = 0; i < completion.length; i++)
		{
			if(!participant.equals(completion))
			{
				return participant[i];
			}
		}
		return participant[i];
	}
	
	public static String race2(String[] participant, String[] completion) 
	{
		String answer = "";
		
		HashMap<String, Integer> hm = new HashMap<>();
		for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
		for(String player : completion) hm.put(player, hm.get(player) - 1);
		
		for(String key : hm.keySet()) {
			if(hm.get(key) != 0) {
				answer = key;
			}
		}
		
		return null;
	}
	
	
	public static void main(String[] args) 
	{

		String[] participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = new String[] {"josipa", "filipa", "marina", "nikola"};
		
		race(participant, completion);
	}

}
