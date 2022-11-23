import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    scan.nextLine();//if you want , you can mention this line
    for (int i=0 ; i<t;i++)
    {
        String s = scan.nextLine();
        char[] chararray = s.toCharArray();
        for( int j =0 ; j<s.length();j++)
        {
            if (j%2==0)
            {
                System.out.print(chararray[j]);
            } 
        }
        System.out.print(" ");
        for(int j = 0 ; j <chararray.length;j++)
        {
            if(j%2!=0)
            {
                System.out.print(chararray[j]);
            }
            
        }
        System.out.println();   
    }
    }
    
}    

