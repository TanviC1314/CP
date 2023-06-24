import java.util.*;
import java.lang.*;
import java.io.*;

class C_Vacation {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count=0;
        for (int i = 0; i < n-1; i++) {
            int a=arr[i+1][0]+Math.max(arr[i][1],arr[i][2]);
            int b=arr[i+1][1]+Math.max(arr[i][0],arr[i][2]);
            //int c=arr[i+1][2]+Math.max(arr[i][a],arr[i][1]);
            count=Math.max(1,Math.max(a, b));
        }
        System.out.println(count);


        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.println(arr[i][j]);
        //     }
        //     System.out.println();
        // }
    }
}
