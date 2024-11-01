package programmerce;
import java.util.*;

public class failpercetage 
{
	public int[] solution(int n, int[] strage) {
		int[] result = {};
		
		int[] present = new int[n + 1];
		int[] clear = new int[n + 1];
		
		for(int i = 0; i < strage.length; i++) {
			for (int j = 0; j < strage[i]; j++) {
				clear[j] += i ;
			}
			present[strage[i] - 1] += 1;
		}
		
		Map<Integer, Double> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			if(present[i] == 0 || clear[i] == 0) {
				map.put(i + 1, 0.0);
			} 
			else 
			{
				map.put(i+ 1, (double) present[i] / (double) clear[i]);
			}
		}
		
		List<Integer> list = new ArrayList<>(map.keySet());
		list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
		result = list.stream().mapToInt(i -> i).toArray();
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
