class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int[] ans = new int[nums1.length];
        int i = 0;
        for(int num : nums2){
            while(st.size()!=0 && num > st.peek()){
                map.put(st.pop(),num);
            } 
            st.push(num);
        }
        
        for(int num : nums1){
            ans[i] = map.getOrDefault(num, -1);
            i++;
        }
        
        return ans;
    }
}