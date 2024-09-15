package practice;

import java.util.*;

public class test01 
{

	public static void main(String[] args) 
	{
		String[] a = new String[]{"도현", "승희", "철수"};
		String[] b = new String[]{"철수", "도현", "승희"};
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}
		
		Arrays.sort(b, (before, After) -> {
			return Integer.compare(map.get(before), map.get(After));
		});
		
	     System.out.println("재배치된 배열: " + Arrays.toString(b));
	}
}
