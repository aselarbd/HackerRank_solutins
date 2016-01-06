import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
           public static boolean isPrime(int num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
}
    
    public static boolean div(long a,long n){
        for(int i=1;i<=n;i++){
            if(a%i!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            long n = sc.nextLong();
            
            if(n==1)System.out.println(1);
             
            else{
                long mul = 1;
            for(int j=2;j<=n;j++)
                if(isPrime(j)){
                mul*=j;
                // System.out.println("if : "+mul);  
                }
                 else{
                     if(mul%j!=0)
                      mul*=(mul%j);
                       // System.out.println("else : "+mul);
                 }
                  
                
            for(int j=0;j<=40;j++){
                long a = mul/2;
                
                 if(div(a,n))
                    mul=a;
           
                else
                    break;
            }
                 System.out.println(mul);  
            }
        }
           
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}