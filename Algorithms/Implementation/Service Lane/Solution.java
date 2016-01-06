import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        
Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];

        
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
        for(int i=0;i<t;i++){
                 int s = sc.nextInt();
                 int e = sc.nextInt();
                int k=4;
                for(int j=s;j<=e;j++)
                    if(a[j]<k)k=a[j];
                    
                      System.out.println(k);
        } 







          

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}