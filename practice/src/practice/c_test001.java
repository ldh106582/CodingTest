package practice;

public class c_test001 
{

	public static void main(String[] args) 
	{
		String a = "ehgus";
		String b = "ehgus";
		String[] c = new String[] {"ehgus"};
		String[] d = new String[] {"ehgus"};
		String e = new String("ehgus");
		String f = new String("ehgus");
		
		if(a == b) { System.out.println("Yes"); };
		if(a.equals(c)) { System.out.println("Yes"); } else { System.out.println("no");	};
		// if(a == d) { System.out.println("Yes"); }else { System.out.println("no");	} //no;		
		if(a.equals(b)) { System.out.println("Yes"); };
		if(c.equals(d)) { System.out.println("Yes"); } else { System.out.println("no");	};
		if(c == d) { System.out.println("Yes"); } else { System.out.println("no");	};
		if(e.equals(f)) { System.out.println("Yes"); } else { System.out.println("no");	};
		if(e == f) { System.out.println("Yes"); } else { System.out.println("no");	};
		System.out.println(e);
		System.out.println(f);
		

	}

}
