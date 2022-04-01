class Solution {
    public int minMoves(int[] nums) {
          if(nums.length == 0)
            return 0;
        
        int mn = nums[0];
        
        for(int i = 0 ; i < nums.length ; i++) {
            mn = Math.min(mn , nums[i]);
        }
        
        int moves = 0;
        
        for(int i = 0 ; i < nums.length ; i++) {
            moves += nums[i] - mn;
        }
        
        return moves;
    }
}