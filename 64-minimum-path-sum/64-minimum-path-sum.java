class Solution {
    
    public int rec(int i,int j,int n,int m,int[][] grid){
        if(i==n-1 && j==m-1){
            return grid[i][j];
        }
        
        int ans=(int)(1e8);
        
        if(i+1<n)
           ans=Math.min(ans,rec(i+1,j,n,m,grid));
                             
        if(j+1<m)
           ans=Math.min(ans,rec(i,j+1,n,m,grid));
                         
        return ans+grid[i][j];
                             
    }
    
    public int rec_memo(int i,int j,int n,int m,int[][] grid,int memo[][]){
        if(i==n-1 && j==m-1){
           return memo[i][j] = grid[i][j];
            //continue;
        }
        
        if(memo[i][j]!=0) return memo[i][j];
        
        int ans=(int)(1e8);
        
        if(i+1<n)
           ans=Math.min(ans,rec_memo(i+1,j,n,m,grid,memo));
                             
        if(j+1<m)
           ans=Math.min(ans,rec_memo(i,j+1,n,m,grid,memo));
                         
        return memo[i][j]=ans+grid[i][j];
                             
    }
    
    public int tab(int n,int m,int[][] grid){
        
        int[][] dp = new int[n][m];
        //int i,j;
        
           for (int i = n - 1; i >= 0; i--) {           //3
      for (int j = m - 1; j >= 0; j--) {       //4
        if (i == n - 1 && j == m - 1) {      //5
          dp[i][j] = grid[i][j];
        }
        else if (i == n - 1) {          //6
          dp[i][j] = grid[i][j] + dp[i][j + 1];
        }
        else if (j == m - 1) {               //7
          dp[i][j] = grid[i][j] + dp[i + 1][j];
        }
        else {                               //8
          int min = Math.min(dp[i + 1][j], dp[i][j + 1]);
          dp[i][j] = grid[i][j] + min;
        }
      }
    }
        
        return dp[0][0];
                             
    }
    
    
    public int minPathSum(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        int i=0,j=0;
        
        int[][] memo = new int[n][m];
        
        //return rec(i,j,n,m,grid);
        
       // return rec_memo(i,j,n,m,grid,memo);
        
        return tab(n,m,grid);
        
    }
}