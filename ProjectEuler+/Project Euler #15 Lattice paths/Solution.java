import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
         public static String factorial(int n) {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
   }
    
    public static BigInteger laticepath(int n,int m){
        
        BigInteger bn = new BigInteger(factorial(n));
        BigInteger bm = new BigInteger(factorial(m));
        BigInteger bnpm = new BigInteger(factorial(n+m));
        
        BigInteger mul = bn.multiply(bm);
        BigInteger l = bnpm.divide(mul); 
        return l;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            BigInteger path = laticepath(n,m);
            BigInteger val = new BigInteger("1000000007");

            System.out.println(path.mod(val));
        }
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}