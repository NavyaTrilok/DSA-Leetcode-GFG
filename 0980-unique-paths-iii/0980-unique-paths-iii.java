class Solution {
    
     public int dfs(int i,int j,int[][] grid, int zero){
         
         int totalpaths = 0;
         
        if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1 )
            return 0;
        if(grid[i][j] == 2){
            if(zero == -1)
                return 1;
            else 
                return 0;
        }
         
        grid[i][j] = -1;
        zero--; 
         
        int[][] dirs={{0,1},{1,0},{0,-1},{-1,0}};
            
        for(int[] dir:dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            totalpaths = totalpaths + dfs(x,y,grid,zero);
        }
         
         grid[i][j] = 0;
         zero++;
         
         return totalpaths;
        
    }
    
    
    public int uniquePathsIII(int[][] grid) {
        int zero = 0, sx = 0, sy = 0, ans = 0;
        int i = 0,j = 0;
        for(i = 0; i < grid.length ; i++){
            for(j = 0; j < grid[0].length ; j++){
                if(grid[i][j] == 0)
                    zero++;
                else if(grid[i][j] == 1){
                    sx = i;
                    sy = j;
                }   
                    
            }
        }
        
        return dfs(sx,sy,grid,zero);
         
    }
}