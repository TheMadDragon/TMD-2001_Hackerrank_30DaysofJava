
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
     Scanner scan = new Scanner(System.in);
     int N = scan.nextInt();
     int sum = 0;
     int max = 0;
     while(N>0)
     {
         if (N%2==1){
             sum++;
             if(sum>max)
             {
                max=sum;
             }
         }
         else
         {
             sum=0;
         }
             N=N/2;
     }
    System.out.println(max);
    }
}