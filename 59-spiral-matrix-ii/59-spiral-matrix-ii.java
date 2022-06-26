class Solution {
    public int[][] generateMatrix(int n) {
        int rmin = 0;
        int rmax = n-1;
        int cmin = 0;
        int cmax = n-1;
        int count=0;
        int status=0;
        int[][] matrix = new int[n][n];
        
        while(rmin<=rmax&&cmin<=cmax){

            for(int i=cmin;i<=cmax;i++){
                count++;
                matrix[rmin][i]=count;
            
            }
            rmin++;
    
            for(int j=rmin;j<=rmax;j++){
                count++;
                matrix[j][cmax]=count;
            
            }
            cmax--;
            
            for(int i=cmax;i>=cmin;i--){
                count++;
                matrix[rmax][i]=count;
            
            }
            rmax--;
            
            for(int j=rmax;j>=rmin;j--){
                count++;
                matrix[j][cmin]=count;
            
            }
            cmin++;
        }
        
        return matrix;
    }
}