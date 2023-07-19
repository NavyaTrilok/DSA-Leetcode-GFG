class Solution {
    public int[] runningSum(int[] nums) {
        int[] newarr = new int[nums.length];
        newarr[0] = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            newarr[i] = nums[i] + newarr[i-1];
        }
        
        return newarr;
    }
}