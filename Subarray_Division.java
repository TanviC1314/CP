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
        int count=0,segment=0;
        for(int j=0;j<n-(m-1);j++){
            for(int i=j;i<(m+j);i++){
                count+=arr[i];
            }
            if(count==d) segment++;
            count=0;
        }
        System.out.println(segment);
	}
}