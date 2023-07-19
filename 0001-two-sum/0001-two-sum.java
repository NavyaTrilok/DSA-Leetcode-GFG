class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       int[] result = new int[2];
       Map<Integer,Integer> mp = new HashMap<Integer, Integer>();
       for(int i = 0; i < nums.length; i++){
           if(mp.containsKey(target-nums[i])){
               result[0] = i;
               result[1] = mp.get(target - nums[i]);
           }
           
           mp.put(nums[i],i);
       }
       
        return result;
    }
}