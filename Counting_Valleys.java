import java.util.*;
class Counting_Valleys
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String str=sc.next();
        int count=0,prev=0,flag=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='U') flag+=1;
            else flag-=1;
            if(flag==-1&&prev==0) count++;
            prev=flag;
        }
        System.out.println(count);
	}
}