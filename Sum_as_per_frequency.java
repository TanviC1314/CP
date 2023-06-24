import java.util.*;
import java.lang.*;
import java.io.*;


class Sum_as_per_frequency
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       
		HashMap<Integer, Integer> data=new HashMap<>();
		
		for (int inc = 0; inc<n; inc++ ){ 
            int val=1;
		    int key=sc.nextInt();
            if(data.containsKey(key)==true) {
                val=data.get(key);
                val+=1;
            }
            data.put(key,val);
		}
        
        int query = sc.nextInt();
        int count=0;
        int[] arr=new int[query*2];
        for(int j=0;j<(query*2);j++){
            arr[j]=sc.nextInt();
           } 
        for(int j=0;j<query*2;j++){
            if(j%2==0){
                for(Map.Entry<Integer, Integer> i: data.entrySet()){
                    if(i.getValue()>=arr[j]&& i.getValue() <=arr[j+1]) count+=(i.getKey()*i.getValue());
                }
                System.out.println(count);
                count=0;
            }
            
            }
	}
}


