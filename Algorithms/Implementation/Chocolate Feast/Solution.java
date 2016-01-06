import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        
       long cho = N/C;
        
       int wap = N/C;
        
        while (wap>=M){
            cho = cho + (wap/M);
            wap = (wap/M)+(wap%M);
        }
         //Write code to solve each of the test over here
        return cho;
    }
    
    
}
