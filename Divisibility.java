import java.util.*;
import java.lang.*;
import java.io.*;


class Divisibility
{
	public static void main (String[] args) 
	{
	    
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[n-1]%10==0?"Yes":"No");
	}
}

