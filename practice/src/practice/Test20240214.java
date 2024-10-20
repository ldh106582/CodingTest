package practice;

public class Test20240214 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ODDNumber OE = new ODDNumber();
        System.out.print(OE.sum(a, true) + ", " + OE.sum(a, false));
    }

    interface Number {
    	int sum(int[] a, boolean odd);
        
    }

    static class ODDNumber implements Number { // static으로 변경
        public int sum(int[] a, boolean odd) {
            int result = 0;
            for(int i = 0; i < a.length; i++) {
                if((odd && a[i] % 2 != 0) || (!odd && a[i] % 2 == 0))
               {
                	System.out.print(a[i]);
                    result += a[i];
               }
            }
            System.out.println(result);
            return result;
        } 
    }
}
