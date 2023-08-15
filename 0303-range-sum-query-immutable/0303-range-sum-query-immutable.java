class NumArray {

   int[] prefixsum;
    public NumArray(int[] nums) {
        prefixsum = new int[nums.length];
        prefixsum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefixsum[i] = prefixsum[i-1] + nums[i];
        }
        
    }
    
    public int sumRange(int left, int right) {
        int res = 0;
        for(int i = left; i <= right; i++){
            if(left > 0)
                res = prefixsum[right] - prefixsum[left-1];
            else
                res = prefixsum[right];
        }
        
        return res;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */