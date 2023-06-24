import java.util.*;
import java.lang.*;
import java.io.*;


class Peaceful_Party
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		
		for (int inc = 0; inc<testcase; inc++ ){ 
		    int Pa=sc.nextInt(), Pb=sc.nextInt(), Pc=sc.nextInt();
            
            System.out.println(Math.max(Pb, (Pa+Pc)));
		}
	}
}

