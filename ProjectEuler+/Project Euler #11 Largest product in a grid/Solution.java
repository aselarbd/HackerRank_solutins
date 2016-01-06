import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        ArrayList<Integer> ary = new ArrayList<Integer>();
        
       Scanner sc = new Scanner(System.in);
        int[][] grid = new int[26][26];
        
          for(int i=3;i<23;i++)
            for(int j=3;j<23;j++)
                grid[i][j]= 0;
        
        for(int i=3;i<23;i++)
            for(int j=3;j<23;j++)
                grid[i][j]= sc.nextInt();
      
            for(int i=0;i<26;i++)
            for(int j=0;j<26;j++){
                if(j<23){
                    ary.add(grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3]);
                }
                 if(i<23){
                    ary.add(grid[j][i]*grid[j][i+1]*grid[j][i+2]*grid[j][i+3]);
                }                
                if(i<23 && j<23){
                    ary.add(grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3]);
                }
                  if(i>5&& j<23){
                    ary.add(grid[i][j]*grid[i-1][j+1]*grid[i-2][j+2]*grid[i-3][j+3]);
                }
                
            }
               
        
        System.out.println(Collections.max(ary));
            
            
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}