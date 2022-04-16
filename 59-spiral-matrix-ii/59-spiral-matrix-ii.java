class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;
        int status = 0;
        while (top <= bottom && left <= right) {
            if (status % 4 == 0) {
                for (int j = left; j <= right; j++) {
                    matrix[top][j] = num++;
                }
                top++;
            } else if (status % 4 == 1) {
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = num++;
                }
                right--;
            } else if (status % 4 == 2) {
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = num++;
                }
                bottom--;
            } else if (status % 4 == 3) {

                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
            status++;
        }
        return matrix;
        
    }
}