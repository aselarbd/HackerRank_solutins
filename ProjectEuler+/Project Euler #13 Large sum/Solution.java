import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        BigInteger[] b = new BigInteger[t];
        
        BigInteger tot = new BigInteger("0");
        
        for(int i=0;i<t;i++){
           b[i] = sc.nextBigInteger();
          tot =tot.add(b[i]);     
        }

        String s = tot.toString();
        
        System.out.println(s.substring(0,10));
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}