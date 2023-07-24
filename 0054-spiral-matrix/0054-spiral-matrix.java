class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int status = 0;
        int top = 0, left = 0, bottom = m-1, right = n-1;
        while(top<=bottom && left<=right){
            if(status%4==0){
                for(int i = left; i<=right; i++){
                    al.add(matrix[top][i]);
                }
                top++;
            }else if(status%4==1){
                for(int i = top; i<=bottom;i++){
                    al.add(matrix[i][right]);
                }
                right--;
            }else if(status%4==2){
                for(int i = right; i >= left; i--){
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }else if(status%4==3){
                for(int i = bottom; i >= top; i--){
                    al.add(matrix[i][left]);
                }
                left++;
            }
            status++;
        }
        return al;
    }
}