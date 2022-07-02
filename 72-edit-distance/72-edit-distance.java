class Solution {
    public int minDistance(String str1, String str2) {
        
        /*if(word1=="" && word2=="") 
            return 0;
        else if(word1=="") 
            return word2.length();
        else if(word2=="")
            return word1.length();
        int m=word1.length();
        int n=word2.length();
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0) dp[i][j]=j;
                else if(j==0) dp[i][j]=i;
                else if(word1.charAt(i-1)==word2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else{
                    dp[i][j]=1 + Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
                }
                    
            }
        }
        
        return dp[m-1][n-1];*/
        
        
        int m = str1.length();
          int n = str2.length();
          
          int[][] dp = new int[m+1][n+1];
          
          for(int i=0;i<=m;i++){
              for(int j=0;j<=n;j++){
                  if(i==0) dp[i][j]=j;
                  else if(j==0) dp[i][j]=i;
                  else if(str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                  else{
                      dp[i][j] = 1 + Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
                  }
                  
              }
          }
          
          return dp[m][n];
    }
}