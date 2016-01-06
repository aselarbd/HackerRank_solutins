import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static long mul (int ary[],int a,int b){
        long t=1;
        for(int i=a;i<b;i++)
         t*=ary[i];
        return t;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String num = sc.next();
            
            int [] number = new int[n];
            
            for(int j=0;j<num.length();j++){
               number[j]=(int) (num.charAt(j) - '0') ;
            }
            

        //  for(int j=0;j<n;j++)
          //      System.out.print(" "+number[j]);
         //   System.out.println();
            
            
            long max=0;
            long a;
            for(int j=0;j<=n-k;j++){
                a = mul(number,j,j+k);
                //System.out.println("start : "+j+" end : "+(j+k));
               // System.out.println(" a : "+a);
                if (a>max)max = a;
            }
            
            System.out.println(max);
            
            
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}