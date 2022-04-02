class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        int j;
        HashSet<Integer> st = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
          
        }
        
        int n=nums.length;
        for(j=0;j<n+1;j++){
            if(st.contains(j)){
                
            }else{
                ans = j;
                
            }               
                
        }
        
        return ans;
    }
    
}