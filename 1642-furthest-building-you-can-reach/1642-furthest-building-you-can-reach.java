class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int i = 1;
        int diff = 0;
        int usedBricks = 0;
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        while( i < heights.length){
            
            diff = heights[i] - heights[i-1];
            
                if(diff>0){
                    pq.add(diff);
                    if(pq.size() > ladders){
                        usedBricks += pq.remove();
                        
                    }
                    if(usedBricks>bricks){
                        
                        return i-1;
                    }
                    
            }
            
            i++;
            
        }
        
        return n-1;
        
    }
}