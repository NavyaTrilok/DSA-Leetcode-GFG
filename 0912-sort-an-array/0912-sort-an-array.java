class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        for(int i = 0; i< nums.length ; i++){
            pq.add(nums[i]);
        }
        
        //System.out.println(pq.size());
        int i = 0;
        //int[] ans = new int[nums.length];
        while(pq.size()>0){
            nums[i] = pq.remove();
            i++;
        }
        
        return nums;
    }
}