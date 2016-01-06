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
            
            long a=0;
            long b=0;
            
            for(int j=1;j<=n;j++){
                b+=j;
                a+=(j*j);
            }
             System.out.println((b*b)-a);   
            
            
        }


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}