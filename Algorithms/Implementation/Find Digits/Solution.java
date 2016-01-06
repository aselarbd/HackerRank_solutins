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

            int a=n;
            int c=0;
            
            while(a>0){
                if(a%10 ==0)c=c;
                else if(n%(a%10)==0)c++;
                //System.out.print(" *** "+a%10+"  E");
                a=a/10;
                
            }





            System.out.println(c);
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}