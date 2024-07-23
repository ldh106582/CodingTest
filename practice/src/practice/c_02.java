package practice;

public class c_02 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		System.out.println("A : " + a.length);
		int i = a.length - 1;
		System.out.println("i : " + i);
		int result = 0;
		while(i >= 0) {
			result += a[i];
			System.out.println("result+= : " + i);
			i--;
			System.out.println("i-- : " + i);
		}
		System.out.println(result);
	}

}
