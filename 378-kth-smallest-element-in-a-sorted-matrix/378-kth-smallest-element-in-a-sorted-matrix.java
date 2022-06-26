class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        // n = size of matrix
    int i, j, n = matrix.length;
 
    // using built-in priority queue which acts as max
    // Heap i.e. largest element will be on top
    // Kth smallest element can also be seen as largest
    // element in a priority queue of size k By this
    // logic we pop elements from priority queue when
    // its size becomes greater than k thus top of
    // priority queue is kth smallest element in matrix
 
    PriorityQueue<Integer> maxH = new PriorityQueue<>(
      Collections.reverseOrder());
    if (k == 1)
      return matrix[0][0];
 
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        maxH.add(matrix[i][j]);
        if (maxH.size() > k)
          maxH.poll();
      }
    }
 
    return maxH.peek();
        
    }
}