// { Driver Code Starts
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
            System.out.println(ob.numberOfWays(N));
        }
    }
}// } Driver Code Ends


class Solution {
    static long mod=(long)(1e9+7);
    
    static long rec(int n){
        if(n==0) return 1;
        
        long ans=0;
        
        
        ans=rec(n-1);
        
        if(n-2>=0){
            ans+=rec(n-2);
        }
        
        return ans%mod;
    }
    
      static long rec_memo(int n,long[] memo){
        if(n==0) return 1;
        
        long ans=0;
        if(memo[n]!=0) return memo[n];
        
        ans=rec_memo(n-1,memo);
        
        if(n-2>=0){
            ans+=rec_memo(n-2,memo);
        }
        
        return memo[n]=ans%mod;
    }
    
    static Long numberOfWays(int N) {
        // code here
        long[] memo=new long[N+1];
        return rec_memo(N,memo);
    }
};