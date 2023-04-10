class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        int usedbricks = 0;
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int diff = 0;
        for(int i = 1; i< heights.length ; i++){
            diff = heights[i] - heights[i-1];
            
            if(diff>0){
                pq.add(diff);
                if(pq.size() > ladders){
                    usedbricks += pq.remove();
                }
                if(usedbricks > bricks){
                    return i-1;
                }
            }
           
        }
        
        return n-1;
    }
}