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
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    if (num>1 && num<=100){
        if (num%2!=0){
        System.out.println("Weird");
    }   
    else {
        if(num>2 && num<5){
            System.out.println("Not Weird");
            }
        else if(num>6 && num<=20){
            System.out.println("Weird");
        }    
        else if(num>20){
            System.out.println("Not Weird");
        }
    }
        
    }
    }
}
