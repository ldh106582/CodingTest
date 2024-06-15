package practice;

public class codingTest_11 
{
	public static boolean gpt_10(int n) 
	{
        if (n <= 1) {
            return false;
        }
        
        // 2부터 sqrt(num)까지 나눠서 나머지가 0인지 검사
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }
        
        return true; // 나누어 떨어지지 않으면 소수
	}

	public static void main(String[] args) 
	{
		int n = 10;
		
		boolean isPrime = gpt_10(n);
	}

}
