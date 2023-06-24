import java.util.*;

class Picking_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=1,prev=0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if(i!=j && Math.abs(arr[i]-arr[j])<2){
                    // System.out.println(arr[i]+" "+arr[j]+" "+Math.abs(arr[i]-arr[j]));
                    count++;
                }
                
            }
            if(count>prev) prev=count;
                count=0;
        }
        System.out.println(prev);
    }
}


//  if(i!=j){
//                     if(Math.abs(arr[j]-arr[i])<=1) count++;
//                     else break;
//                     System.out.println(Math.abs(arr[j]-arr[i]));
//                 }