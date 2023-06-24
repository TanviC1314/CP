import java.util.*;
import java.lang.*;
import java.io.*;


class Seven_Segment_Display
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		
		for (int inc = 0; inc<testcase; inc++ ){ 
		    int n=sc.nextInt();
            int arr[]={6,2,5,5,4,5,6,3,7,6};
            //System.out.println();
            if(n==1) System.out.println("1");
            else{
                for(int i=0;i<arr[n]/2;i++){
                    System.out.print("1");
                }
            }
            
		}
        System.out.println();
	}
}

