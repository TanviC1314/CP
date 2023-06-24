import java.util.*;
class Staircase
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int inc = 0; inc<n; inc++ ){ 
            for(int j=0;j<n-(inc+1);j++){
                // System.out.print(" ");
                System.out.print(" ");
            }
            for(int j=0;j<inc;j++) System.out.print("#");
            // System.out.println("#");
            System.out.println();
		}
	}
}