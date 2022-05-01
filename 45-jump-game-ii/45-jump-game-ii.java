class Solution {
    
     public static int rec(int n,int idx,int[] arr){
        if(idx==n-1){
            return 0;
        }

        int jumps_allowed=arr[idx];

        int ans=(int)(1e8);

        for(int j=1;j<=jumps_allowed;j++){
            if(idx+j<=n-1){
                ans=Math.min(ans,rec(n,idx+j,arr));
            }
        }

        return ans+1;
    }
    
    public static int rec_memo(int n,int idx,int[] arr,int[] memo){
        if(idx==n-1){
           return memo[idx]=0;
            //continue;
        }

        if(memo[idx]!=-1) return memo[idx];
        
        int jumps_allowed=arr[idx];

        int ans=(int)(1e8);

        for(int j=1;j<=jumps_allowed;j++){
            if(idx+j<=n-1){
                ans=Math.min(ans,rec_memo(n,idx+j,arr,memo));
            }
        }

        return memo[idx]=ans+1;
    }
    
    public static int tab(int n,int[] arr){
        
        
        int[] dp=new int[n];

        //if(memo[idx]!=-1) return memo[idx];
        
        for(int idx=n-1;idx>=0;idx--){
            
             if(idx==n-1){
                 dp[idx]=0;
              continue;
        }
            
             int jumps_allowed=arr[idx];

            int ans=(int)(1e8);

            for(int j=1;j<=jumps_allowed;j++){
                if(idx+j<=n-1){
                    ans=Math.min(ans,dp[idx+j]);
                }
            }
            dp[idx]=ans+1;
        }
        
        return dp[0];
    }

    
    public int jump(int[] nums) {
        int n=nums.length;
       // int[] memo=new int[n];
        
        //Arrays.fill(memo,-1);
        
        //int ans= rec(n,0,nums);
        //int ans= rec_memo(n,0,nums,memo);
        int ans= tab(n,nums);
        
        return ans;
         
    }
}