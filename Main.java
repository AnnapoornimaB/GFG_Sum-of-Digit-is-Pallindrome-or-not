//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends

class Solution
{
    int isDigitSumPalindrome(int n)
    {
        int u = 0,f=0;
        while(n!=0)
        {
            u = n%10;
            f += u;
            n/=10;
        }
        int og = f;
        int r =0;
        while(f>0)
        {
            r = r * 10 + f % 10;
            f/=10;
        }
        if(og != r)
        {
            return 0;
        }
    return 1;
    }
}
