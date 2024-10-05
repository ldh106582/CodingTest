package practice;

public class Test20240217 
{

	public static void main(String[] args) 
	{
	   String str = "abacabcd";
	   boolean[] seen = new boolean[256];
//	   System.out.print(calculFn(str, str.length()-1, seen));
	   
	}
    public static String calculFn(String str, int index, boolean[] seen) {
        if(index < 0) return "";
        char c = str.charAt(index);
        System.out.println(c);
        String result = calculFn(str, index-1, seen);
        System.out.println(result);
        if(!seen[c]) {
            seen[c] = true;
            return c + result;
        }
        return result;
    }

}
