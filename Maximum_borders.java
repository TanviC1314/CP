import java.util.*;
import java.lang.*;
import java.io.*;


class Maximum_borders
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		
		for (int inc = 0; inc<testcase; inc++ ){ 
            //String[] rowcol=sc.nextLine().split(" ");
            int row=sc.nextInt();
            int column=sc.nextInt();
            sc.nextLine();
            //int column=Integer.parseInt(rowcol[1]);
            int count=0,prev=0;
            for(int i=0;i<row;i++){
                String str=sc.nextLine();
                
                for(int j=0;j<column;j++){
                    if(str.charAt(j)=='#'){
                        count++;
                    }
                }
                if(count>prev) prev=count;   
                count=0;
            }
            System.out.println(prev);
		}
	}
}

