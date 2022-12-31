                                                                                             
class Solution {
    public int findJudge(int n, int[][] trust) {
        
       /* int ans=0;
        int[][] grid = new int[trust.length][2];
        
        for(int i=0;i<trust.length;i++){
            for(int j=0;j<trust[0].length;j++){
                grid[i][j]=0;
            }
        }
        
        for(int i = 0; i < trust.length -1 ; i++){

            grid[0][trust[i][0]] += 1;
            grid[1][trust[i][1]] += 1;
        }
        
        for(int i=0; i < grid.length - 1 ; i++){
            
            if(grid[0][i] == 0 && grid[1][i] == n-1) 
                return i;
            
        }
             
        return -1; */
        
        int[] count = new int[n+1];
        for (int[] t: trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        for (int i = 1; i <= n; ++i) {
            if (count[i] == n - 1) return i;
        }
        return -1;
    }
}