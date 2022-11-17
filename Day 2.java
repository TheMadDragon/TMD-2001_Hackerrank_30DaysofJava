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
        double meal_cost = scan.nextDouble();
        int tip_cent = scan.nextInt();
        int tax_cent = scan.nextInt();
        double tip_cost = (meal_cost*tip_cent)/100;
        double tax_cost = (meal_cost*tax_cent)/100;
        int total_cost = 0;
        total_cost = (int) Math.round(meal_cost+tip_cost+tax_cost);
        System.out.println(total_cost);
        
        
        
    }
}
