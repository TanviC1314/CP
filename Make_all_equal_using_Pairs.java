import java.util.*;
import java.lang.*;
import java.io.*;


class Make_all_equal_using_Pairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		
		for (int inc = 0; inc<testcase; inc++ ){ 
		    int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            int count=1,prev=1;
            for(int i=0;i<n-1;i++){
                if(arr.get(i)==arr.get(i+1)){
                    count+=1;
                }
                else{
                    if(count>prev) prev=count; 
                    count=1; 
                }
            }
            System.out.println(arr.size()-Math.max(prev,count));

            
		}
	}
}

