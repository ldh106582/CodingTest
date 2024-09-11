package practice;

class point
{
	int x;
	int y;
}

public class j_03 
{

	public static void main(String[] args) 
	{
		point m = new point();
		m.x= 1000;
		calc(m);
		getValue(m);
		System.out.printf("%d",m.y);
	}
	
	static void calc(point s) 
	{
		s.x /= 10;
	}
	
	static void getValue(point p) 
	{
		p.y = p.x;
	}

}
