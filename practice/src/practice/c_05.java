package practice;

public class c_05 
{
    public void sf(int[] a, int x, int y) 
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) 
    {
        int a[] = {5, 3, 8, 1, 2, 7};
        c_05 sf = new c_05();
        
        for(int i = 0; i < 5; i++) 
        {
            int least = i;
            for(int j = i + 1; j < 6; j++) 
            {
                if(a[j] < a[least]) least = j;
            }
            sf.sf(a, i, least); // 배열과 인덱스를 전달
        }
        
        for(int k = 0; k < 6; k++) 
        {
            System.out.println(a[k]);
        }
    }
}
