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


public class solution{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int d[][] = new int[6][6];
        int i , j , sum;
        int maxSum = Integer.MIN_VALUE;
        for(i=0 ; i < 6 ;i++){
            for(j=0;j<6;j++){
                d[i][j]=scan.nextInt();
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                sum = d[i][j]+d[i][j+1]+d[i][j+2]+d[i+1][j+1]+d[i+2][j]+d[i+2][j+1]+d[i+2][j+2];
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}

