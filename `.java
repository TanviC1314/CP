import java.util.*;
class Subarray_Division
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int arr[]=new int[n];
		for (int i = 0; i<n; i++ ){ 
            arr[i]=sc.nextInt();
		}
        int d=sc.nextInt(),m=sc.nextInt();
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
	}
}