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
    
    public static boolean exist(int a){
        if(prim.size()>a) return true;
        
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int [] tst = new int[t];
        
        for(int i=0;i<t;i++){
            tst[i] = sc.nextInt();
            
        }
      
        
         for(int i=0;i<t;i++){
            
             if (exist(tst[i]-1))
                 System.out.println(prim.get(tst[i]-1));
             else{
                 
                  int b = 0;
                 if(prim.size()>0){
                     b=prim.size();// System.out.println("b : "+b);
                 }
                    int a = 1 ;
                     if(prim.size()>0){
                         a = prim.get(prim.size()-1); //System.out.println("a : "+a);
                     } 

                 
                    while(b<tst[i]){ 
                         a++;  
                        if(isPrime(a)){                          
                           prim.add(b,a);
                             //System.out.println( "*************** "+b); 
                            b++;
                        }
                          
                    } 
                 System.out.println(prim.get(tst[i]-1));
             }
            
          //   for (Integer item : prim) {   
               //     System.out.println( "** "+item);
           // }
            
         }   
        

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}