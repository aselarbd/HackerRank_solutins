import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        
        
Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int a[] = new int[t];
        
        for(int i=0;i<t;i++){
            a[i] = sc.nextInt();
        }
        
        boolean f = true;
        while(f){
            Arrays.sort(a);
            
            int  m = a[0];
            int count=0;
            
            for(int i=0;i<t;i++){
             if(a[i]!=5000){
               a[i] =a[i]-m;
                 count++;
             }
                 
             if(a[i]==0)
                    a[i]=5000;
            }
            
               System.out.println(count);
            
            
            
            
            int fc=0;
            for(int i=0;i<t;i++){
                if(a[i]==5000)fc++;
            }
            if(fc==t)f= false;
                
        }
        







         

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}