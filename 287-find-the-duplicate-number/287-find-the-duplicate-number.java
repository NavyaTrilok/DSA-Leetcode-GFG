class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        /*for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j])
                    return nums[i];
            }
        }*/
     
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(!set.add(nums[i]))
                return nums[i];
        }
        
        return 0;
    }
}