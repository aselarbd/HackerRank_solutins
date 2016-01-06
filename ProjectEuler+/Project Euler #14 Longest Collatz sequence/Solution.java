import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    
   public  static int colt(int n) {
    if (n <= 1) return 1;
    if (n % 2 == 0) return 1+colt(n/2);
    return 1+colt(3*n+1);
}

    public static int max(int[] ary){
        int max = ary[0];
        
        for(int i=1;i<ary.length;i++){
            if(ary[i]>max)max=ary[i];
        }
        return max;
    }
        public static int maxi(int[] ary){
        int max = ary[0];
        int idx =0;
        
        for(int i=1;i<ary.length;i++){
            if(ary[i]>=max){
                max=ary[i];
                idx=i;
            }
        }
        return idx;
    }
    
        public static void print(int[] ary){
       
        for(int i=0;i<ary.length;i++){
            System.out.print(" "+ ary[i]);
        }
         System.out.println();
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int[] inp = new int[t];
        
        for(int i=0;i<t;i++){
           inp[i] = sc.nextInt();
        }

        int max = max(inp);
        
         // System.out.println("max : "+ max);
        
        int[] data = new int[max];
        for(int i=1;i<=max;i++){
            data[i-1]=colt(i);
        }
        
       // print(data);
        
        for(int i=0;i<t;i++){
            int[] nary = Arrays.copyOfRange(data, 0, inp[i]);
      // print(nary);
             System.out.println( maxi(nary)+1);
        }


           
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}