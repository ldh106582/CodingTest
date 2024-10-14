package practice;

public class Test20240213 
{

	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
        int[] parr1 = arr[1]; // arr[1]에 해당하는 배열
        int[] parr2 = arr[2]; // arr[2]에 해당하는 배열
        
        // C 코드의 계산식과 동일하게 계산
        int result = parr2[1] + parr2[2] + parr1[0];
        
        System.out.println(result);
        System.out.println(parr2[1] );
        System.out.println(parr2[2] );
        System.out.println(parr2[0] );
	}

}
