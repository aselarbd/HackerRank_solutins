import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
        public static int sumChar(String s){
        int sum =0;
            
            for(int j = 0; j < s.length(); j++) {
                int d = (int) (s.charAt(j) - 'A')+1;
                //System.out.println("char sum  : "+d);
                sum = sum + d;
            }
       // System.out.println("final sum  : "+sum);
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        String[] n = new String[t];
        
        for(int i=0;i<t;i++)
            n[i] = sc.next();
        
        Arrays.sort(n);
        
        int q = sc.nextInt();
        
        String[] nq = new String[q];
        
        for(int i=0;i<q;i++)
            nq[i] = sc.next();
        
        for(int i=0;i<q;i++){
            //System.out.println(Arrays.asList(n).indexOf(nq[i])+1);
            System.out.println(sumChar(nq[i])*(Arrays.asList(n).indexOf(nq[i])+1));
        }
            


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}