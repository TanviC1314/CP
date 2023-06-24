import java.util.*;
class Angry_Professor
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int inc = 0; inc<testcase; inc++ ){ 
            int n=sc.nextInt(),k=sc.nextInt();
            int count=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<=0) count++;
            }
            System.out.println(count>=k?"NO":"YES");
		}
	}
}