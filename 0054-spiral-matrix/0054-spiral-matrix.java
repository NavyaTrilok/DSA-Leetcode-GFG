class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int status = 0;
        int top = 0, left = 0, bottom = m-1, right = n-1;
        while(top<=bottom && left<=right){
            if(status%4==0){
                for(int j = left; j<=right; j++){
                    al.add(matrix[top][j]);
                }
                top++;
            }else if(status%4==1){
                for(int i = top; i<=bottom;i++){
                    al.add(matrix[i][right]);
                }
                right--;
            }else if(status%4==2){
                for(int j = right; j >= left; j--){
                    al.add(matrix[bottom][j]);
                }
                bottom--;
            }else if(status%4==3){
                for(int j = bottom; j >= top; j--){
                    al.add(matrix[j][left]);
                }
                left++;
            }
            status++;
        }
        return al;
    }
}