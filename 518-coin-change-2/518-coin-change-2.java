class Solution {
    
     public static int rec_memo(int idx,int[] arr,int tar,int[][] memo){
        if(tar==0){
            return memo[idx][tar]=1;
        }
        if(idx==arr.length){
            return memo[idx][tar]=0;
        }

         
        if(memo[idx][tar]!=0) return memo[idx][tar];
        int ans=0;
        for(int j=idx;j<arr.length;j++){
            if(tar-arr[j]>=0){
                ans+=rec_memo(j,arr,tar-arr[j],memo);
            }
        }

        return memo[idx][tar]=ans;
    }
    
    public static int tab_1D(int[] coins,int amount){
        int[] dp=new int[amount+1];
        
        dp[0]=1;
        
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                dp[i]+=dp[i-coin];
            }
        }
        
        return dp[amount];
    }
    
    public int change(int amount, int[] coins) {
        
        int n = coins.length;
        int[][] memo = new int[n+1][amount+1];
        //return rec_memo(0,coins,amount,memo);
        return tab_1D(coins,amount);
        
    }
}