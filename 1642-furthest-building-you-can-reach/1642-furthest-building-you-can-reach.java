class Solution {
    
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        int n = heights.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int bricksUsed = 0;
        
        
        for(int i = 1; i< heights.length; i++){
            
            int diff = heights[i] - heights[i-1];
            
            if(diff>0){
                
                pq.add(diff);
                if(pq.size()>ladders){
                    bricksUsed += pq.remove();
                }
                if(bricksUsed>bricks){
                    return i-1;
                }
                
            }
        }
        
        
        return n-1;
    }
}