import java.util.*;
class Circular_Array_Rotation
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),k=sc.nextInt(),q=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> queries=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<q;i++){
            queries.add(sc.nextInt());
        }
        Collections.rotate(arr, k);
        for(int i=0;i<q;i++){
            System.out.println(arr.get(queries.get(i)));
        }
	}
}