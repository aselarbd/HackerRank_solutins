import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            
           BigInteger e = new BigInteger("2");
            
            BigInteger b = e.pow(n);
            
            String s = b.toString();
            int sum =0;
            
            for(int j = 0; j < s.length(); j++) {
                int d = (int) (s.charAt(j) - '0');
                sum = sum + d;
            }

            System.out.println(sum);

        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}