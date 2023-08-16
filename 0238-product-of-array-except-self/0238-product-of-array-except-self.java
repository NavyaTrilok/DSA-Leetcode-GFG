class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixproduct = new int[nums.length];
        prefixproduct[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
             prefixproduct[i] = prefixproduct[i-1] * nums[i];
        }
        
        int suffix = 1;
        
        for(int i = nums.length - 1; i > 0 ; i--){
            prefixproduct[i] = prefixproduct[i-1] * suffix;
            suffix = suffix * nums[i];
        }
        
        prefixproduct[0] = suffix;
        
        return prefixproduct;
    }
}