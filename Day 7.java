import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] Arr = new int[N];
        for(int i=0;i<N;i++){
            Arr[i]=scan.nextInt();
        }
        for(int i=0;i<N;i++){
            int indx = N - i - 1;
            System.out.print(Arr[indx]+" ");
        }
    }
}
