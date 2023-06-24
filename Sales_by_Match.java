import java.util.*;
class Sales_by_Match
{
	public static void main (String[] args) 
	{    
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
        int arr[]=new int[n];	
		for (int inc = 0; inc<n; inc++ ){ 
		    arr[inc]=sc.nextInt();
		}
        Arrays.sort(arr);
        int count=1,pair=0;
        for (int i = 0; i<n-1; i++ ){ 
            if(arr[i]!=arr[i+1]){
                pair+=count/2;
                count=1;
            }  
            else if(i+1==n-1){
                count++;
                pair+=count/2;
            }
            else count++;
		}
        System.out.println(pair);
	}
}


// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

// class Result {

//     /*
//      * Complete the 'sockMerchant' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts following parameters:
//      *  1. INTEGER n
//      *  2. INTEGER_ARRAY ar
//      */

//     public static int sockMerchant(int n, List<Integer> ar) {
//     // Write your code here
//     Collections.sort(ar)
//         int count=1,pair=0;
//         for (int i = 0; i<n-1; i++ ){ 
//             if(arr[i]!=arr[i+1]||i+1==n-1){
//                 pair+=count/2;
//                 count=1;
//             }  
//             else{
//                 count++;
//             } 
//         }
//         return pair;
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//         int n = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//             .map(Integer::parseInt)
//             .collect(toList());

//         int result = Result.sockMerchant(n, ar);

//         bufferedWriter.write(String.valueOf(result));
//         bufferedWriter.newLine();

//         bufferedReader.close();
//         bufferedWriter.close();
//     }
// }
