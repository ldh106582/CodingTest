package programmerce;
import java.util.*;

public class failpercetage 
{
	public int[] solution(int n, int[] strage) {
		int[] result = {};
		
		System.out.println(n);
		System.out.println(Arrays.toString(strage));
		
		int[] present = new int[n + 1];
		int[] clear = new int[n + 1];
		
		for(int i = 0; i < strage.length; i++) {
			for (int j = 0; j < strage[i]; j++) {
				clear[j] += i ;
			}
			present[strage[i] - 1] += 1;
		}
		
		
		
		return result;
	}

	public static void main(String[] args) 
	{
		int n = 5;
		int[] stage = new int[] {2,1,2,6,2,4,3,3};
		failpercetage s = new failpercetage();
		s.solution(n, stage);
		
	}

}
