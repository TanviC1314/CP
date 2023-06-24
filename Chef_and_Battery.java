import java.util.*;
class Chef_and_Battery
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int inc = 0; inc<testcase; inc++ ){ 
            int val=sc.nextInt();
            int i=0;
            while(val!=50){
                if(val>50){
                    val-=3;
                    i++;
                }
                else if(val<50){
                    val+=2;
                    i++;
                }
            }
            System.out.println(i);
		}
	}
}