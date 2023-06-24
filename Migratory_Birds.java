import java.util.*;
class Migratory_Birds
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        HashMap<Integer,Integer> birds=new HashMap<>();
        int max=0;
		for (int i = 0; i<n; i++ ){
            
            int key=sc.nextInt(); 
            if(birds.containsKey(key)){
                birds.put(key, (birds.get(key))+1);
            }
            else birds.put(key, 1);
		}
        int prevKey=0,prevValue=0;
        for(Map.Entry<Integer,Integer> i: birds.entrySet()){
            if(prevValue<i.getValue()){
                prevKey=i.getKey();
                prevValue=i.getValue();
            }
        }
        System.out.println(prevKey);
	}
}