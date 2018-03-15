 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
       int j=0,i=0,sum=0,count=0,c=1;
        for(j=0;j<n-m+1;j++){
            sum=0;
            //System.out.printf("<---------------------------------------->\n");
            for(i=0;i<m;i++){
                sum=sum+s[i+j];
               // System.out.printf("sum postion %d with prev sum %d\n",i+j,sum);
                if(i==m-1){
                    if(sum==d){
                        count++;
                        sum=0;
                    }
                }
            
            }  
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
