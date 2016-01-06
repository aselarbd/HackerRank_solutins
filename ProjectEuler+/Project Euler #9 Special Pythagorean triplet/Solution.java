import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean py(double a,double b,double c){
        if((a*a + b*b )==(c*c))return true;
        if((c*c + b*b )==(a*a))return true;
        if((a*a + c*c )==(b*b))return true;
        return false;
    }
    
    public static long specPyth(int num)
    {
        double a;
        long k=-1;
        for (int b = 1; b < num/2; b++)
        {
            a=(num*num/2-num*b)/(num-b);

           if (a== (int)a &&(py(a,(double)b,(double)(num-a-b))))
              {if(k<(long) (a*b*(num-a-b)))
                k = (long) (a*b*(num-a-b));
           }
            
              //  if (a== (int)a)
                //return (long) (a*b*(num-a-b));
        }   

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
         System.out.println(specPyth(n));
        }
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}