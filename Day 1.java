import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int p = scan.nextInt();
        double q = scan.nextDouble();
        scan.nextLine();
        String r = scan.nextLine();
        
        System.out.println(p+i);
        System.out.println(q+d);
        System.out.println("HackerRank "+r);
        

        scan.close();
    }
}