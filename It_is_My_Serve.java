import java.util.*;
class It_is_My_Serve
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int inc = 0; inc<testcase; inc++ ){ 
            System.out.println();
            int a=sc.nextInt(),b=sc.nextInt();
            int flag=1,count=0,i=0;
            for(i=0;i<(a+b);i+=4){
                count++;
            }
            System.out.println(i);
		}
	}
}