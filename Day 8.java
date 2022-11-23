import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Map<String,Integer> Mymap = new HashMap<String,Integer>();
        for(int i = 0; i < N; i++){
            String Name = scan.next();
            int Phone = scan.nextInt();
            Mymap.put(Name, Phone);
        }
        while(scan.hasNext()){
            
            String s = scan.next();
            if (Mymap.get(s)!= null)
                System.out.println(s + "="+Mymap.get(s));
            else
                System.out.println("Not found");
            }
        scan.close();
    }
}
