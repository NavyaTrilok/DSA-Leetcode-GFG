class Solution {
    static boolean[][] vis;
    public boolean exist(char[][] board, String word) {
        vis = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == word.charAt(0)){                                                                  boolean isFound = dfs(board,i,j,word,0);    
					if(isFound)
                            return true; 
                }
            }
        }
        
        return false;
    }
    
     private boolean dfs(char[][]board, int i, int j, String word, int index){
        int n=board.length;
        int m=board[0].length;
         
              if((i<0 || i>=board.length) || (j<0 || j>=board[0].length) || board[i][j]!=word.charAt(index)){
            return false;
        }
         
         
        if(index == word.length()-1){
            return true;
        }
        
   
        
        vis[i][j] = true;
         
        int[][] dirs={{0,1},{1,0},{0,-1},{-1,0}};
        
        for(int[] dir:dirs){
            int x=i+dir[0];
            int y=j+dir[1];
            
            if(x>=0 && y>=0 && x<n && y<m && !vis[x][y])
            {
                if(dfs(board,x,y,word,index+1))
                    return true;
            }
        }
        
        vis[i][j] = false;
        return false;
    }
    
}