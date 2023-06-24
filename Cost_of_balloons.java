import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Cost_of_balloons {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
           while(t>0){
            // int green = Integer.parseInt(br.readLine());
            // int purple = Integer.parseInt(br.readLine());
            String[] colors = br.readLine().split(" ");
            int green=Integer.parseInt(colors[0]);
            int purple=Integer.parseInt(colors[1]);
            int gCount=0,pCount=0;
            int n = Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++){
                String[] arr=br.readLine().split(" ");
                int first=Integer.parseInt(arr[0]);
                int second=Integer.parseInt(arr[1]);
                if(first==1) gCount++;
                if(second==1) pCount++;
                //System.out.println((gCount)+" "+(pCount));
            }
            
            System.out.println(gCount<pCount?((Math.max(green, purple)*gCount)+(Math.min(green, purple)*pCount)):((Math.min(green, purple)*gCount)+(Math.max(green, purple)*pCount)));
            t--;
           }         
    }
}
