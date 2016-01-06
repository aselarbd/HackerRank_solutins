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
            int k = sc.nextInt();

            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            int tot=0;
            for(int j=0;j<n;j++){
                if(a[j]<=0)tot++;
            }
            
            if(tot>=k) System.out.println("NO");
            else   System.out.println("YES");


        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}