import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static boolean isPrime(long num) {
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
    
     public static ArrayList<Integer> prim = new ArrayList<Integer>();
    
        public static boolean exist(int a){        
            if(prim.size()>a) return true;
            return false;
        }
    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);        
        int t = sc.nextInt();                
        long [] inp = new long[t];        
        for(int i=0;i<t;i++){
            inp[i]=sc.nextLong();
        }
        
        long max = inp[0];
        for(int i=1;i<t;i++){
            if(inp[i]>max) max=inp[i];
        }
       
        //  System.out.println("max :"+max);
        prim.add(0,2);
        prim.add(1,3);
        int j=2;
        for(int i=5;i<=(int)max/2 ;i+=2){
            if(isPrime(i))prim.add(j++,i);      }
        
                 //  for (Integer item : prim) {   
                 // System.out.println( "** "+item);
          //}
        
        
         for(int i=0;i<t;i++){
            int div=1;
            
            if(isPrime(inp[i]))
                System.out.println(inp[i]);
            else if(inp[i]==2){
                 System.out.println(inp[i]);
                
            }
               
            else{   
                
                    for (Integer item : prim) {   
                       if(inp[i]%item==0)div=item; 
                        // System.out.println("prim div "+div);
                    }
                        
                        
                   // for (int j=3;j<=(int)inp[i]/2;j=j+2)
                      //  if(isPrime(j))
                       //  if(inp[i]%j==0)div=j;
                        
                         System.out.println(div);
                   }
           
           
         }

        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}