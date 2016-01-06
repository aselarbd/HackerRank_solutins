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

            int h=1;
            
            for(int j=0;j<n;j++){
                if(j%2==0)h*=2;
                else h++;
            }
            System.out.println(h);
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}