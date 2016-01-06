import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static String sum(int a,int l,int n){
       int t= n*(a+l);
        
        return Integer.toString((int)t/2);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int nr=sc.nextInt();
            
            
            nr--;
    int x3 = nr/3;
    int x5 = nr/5;
    int x15 = nr/15;

    long sum1 = x3*((x3*3)+3); 
    long sum2 = x5*((x5*5)+5);
    long sum3 = x15*((x15*15)+15);
            
            sum1 = (sum1 >> 1);
            sum2 = (sum2 >> 1);
            sum3 = (sum3 >> 1);

    long sum = (long) (sum1+sum2-sum3);
    System.out.println(sum);
            
            /* 
            int temp=0;
            
            for (int j = 3; j < n; j++) {
                if (j % 3 == 0 || j % 5 ==0) {
                    temp += j;
                }
            }
            
           
            int a = n-1;
            
            int p = a- (a%3);
            int q = a- (a%5);
            int r = a- (a%15);
            
            BigInteger bp = new BigInteger(sum(3,p,p/3));
            BigInteger bq = new BigInteger(sum(5,q,q/5));
            BigInteger br = new BigInteger(sum(15,r,r/15));
            
            BigInteger bb = bp.add(bq);
            bb = bb.subtract(br);
            
           //long ans = sum(3,p,p/3) + sum(5,q,q/5)- sum(15,r,r/15);
          */  
           // System.out.println(temp);
            
        }
        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}