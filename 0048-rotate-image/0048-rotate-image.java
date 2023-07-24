class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
    }
    
    public void transpose(int[][] matrix){
        int n = matrix.length;
        for(int diag = 1; diag <= n; diag++){
            int row = 0, col = diag;
            while(col<n){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
                
                
                row++;
                col++;
            }
            //row++;
        }
        
        reverserow(matrix);
    }
    
    public void reverserow(int[][] matrix){
        int n = matrix.length;
        for(int row = 0 ; row < n ; row++){
            int i = 0;
            int j = n-1;
            while(i<=j){
                int temp = matrix[row][i];
                matrix[row][i] = matrix[row][j];
                matrix[row][j] = temp;
                
                
                i++;
                j--;
            }
            
            
                
        }
    }
}