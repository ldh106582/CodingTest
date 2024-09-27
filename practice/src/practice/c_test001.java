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
		
		for (int i = 0; i < 100; i++)
		{
			if(a == b) { System.out.println(i + "번 : " +"Yes"); };
			i++;
			if(a.equals(c)) { System.out.println(i + "번 : " +"Yes"); } else { System.out.println(i + "번 : " +"no");	};
			i++;
			// if(a == d) { System.out.println("Yes"); }else { System.out.println("no");	} //no;		
			
			if(a.equals(b)) { System.out.println(i + "번 : " +"Yes"); };
			i++;
			if(c.equals(d)) { System.out.println(i + "번 : " +"Yes"); } else { System.out.println(i + "번 : " +"no");	};
			i++;
			if(c == d) { System.out.println(i + "번 : " +"Yes"); } else { System.out.println(i + "번 : " +"no");	};
			i++;
			if(e.equals(f)) { System.out.println(i + "번 : " +"Yes"); } else { System.out.println(i + "번 : " +"no");	};
			i++;
			if(e == f) { System.out.println(i + "번 : " +"Yes"); } else { System.out.println(i + "번 : " +"no");	};
			i++;
			if(a.equals(f)) { System.out.println(i + "번 : " +"Yes"); } else { System.out.println(i + "번 : " +"no");	};
			i++;
			if(a == f) { System.out.println(i + "번 : " +"Yes"); } else { System.out.println(i + "번 : " +"no");	};
			i++;
			break;
		}

		

	}

}
