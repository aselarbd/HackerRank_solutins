import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long t = sc.nextLong();
        long i=0;   
            
        while(i<t){
           
            long n = sc.nextLong();
            
            long a=1;
            long b=2;
           long sum =2;
            long f= a+b;
            
            while(f<n){
                if(f%2==0)sum+=f;
                
                a=b;
                b=f;
                f=a+b;
            }
           
            System.out.println(sum);
            
            i++;
            
            
        }
        
        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}