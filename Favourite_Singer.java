import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
  
    int partition(long arr[], int low, int high)
    {
        long pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        long temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort(long[] arr, int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(long[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            
    }
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n1=br.readLine();
        int n = Integer.parseInt(n1); 
        String[] arr1=br.readLine().split(" ");             
        long[] arr=new long[n];
        TestClass ob = new TestClass();
        ob.sort(arr, 0, n-1);
 
        printArray(arr);
        for(int i=0;i<n;i++){
            arr[i]=Long.parseLong(arr1[i]);
        }
        long temp=0;
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(arr[j-1] > arr[j]){  
                            //swap elements  
                            temp = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = temp;  
                    }  
                     
            } 
        } 

        


        int count=0,prev=0,fav=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1] ) {
                count++;
                
                }
            else{
                if(prev==count){ 
                    prev=count;
                }
                else if(count>prev) {
                    fav=1;
                    prev=count;
                }
                
                count=0;   
            }
            if(prev==count){ 
                    fav+=1;
                }
        }
        System.out.println(fav);
    }
}
