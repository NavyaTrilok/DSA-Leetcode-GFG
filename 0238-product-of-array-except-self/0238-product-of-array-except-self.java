class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int[] right = new int[nums.length];
        for(int i = nums.length-1; i >= 0 ; i--){
            prod = prod * nums[i];
            right[i] = prod;
        }
        
        prod = 1;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length-1 ; i++){
            int lp = prod;
            int rp = right[i+1];
            res[i] = lp*rp;
            prod = prod * nums[i];
            res[nums.length-1] = prod;
        }
        return res;
    }
}