import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static ArrayList<Integer> prim = new ArrayList<Integer>();
    
           public static boolean isPrime(int num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
}
    
    public static int max(int[] inp){
              int max =inp[0];
        for(int i=1;i<inp.length;i++){
            if(inp[i]>max)
                max=inp[i];
        }
        return max;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int [] inp = new int[t];
        for(int i=0;i<t;i++){
            inp[i] = sc.nextInt();
        }
         
        int max = max(inp);
         
        for(int i=2;i<=max;i++){
            if(isPrime(i))prim.add(i);
        }
           
        for(int i=0;i<t;i++){
             long tot=0;
             int j=0;
            while(prim.get(j)<=inp[i]){
                tot+=prim.get(j);
                j++;
                if(j == prim.size())break;
            }
                 System.out.println(tot);
        }
            
           
            
        

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}