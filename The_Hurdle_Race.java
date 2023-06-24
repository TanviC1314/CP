import java.util.*;
class The_Hurdle_Race
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int height=sc.nextInt();
        int arr[]=new int[n];
		for (int i = 0; i<n; i++ ){ 
            arr[i]=sc.nextInt();
		}
        Arrays.sort(arr);
        System.out.println(height<arr[n-1]?(arr[n-1]-height):0);
	}
}