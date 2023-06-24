import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Zoos {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();                // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        int Ocount=0,Zcount=0;
        if(str.length()<=20){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='o'){
                    Ocount++;
                }
                else Zcount++;
            }
            System.out.println(2*Zcount==Ocount?"Yes":"No");
        }
        else System.out.println("No");
        
    
    }
}
