class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ngr = nextGreaterRight(nums);
        int[] ans = new int[n-k+1];
        
        int j=0;
        for(int i=0;i<=nums.length-k;i++){
            if(j<i){
                j=i;
            }
            while(ngr[j]<i+k){
                j=ngr[j];
            }
            
            ans[i] = nums[j];
        }
        
        return ans;
    }
    
    public static int[] nextGreaterRight(int[] arr){
        int n= arr.length;
        int[] ngr = new int[n];
        Stack<Integer> st = new Stack<>();
        ngr[n-1] = n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()!=0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ngr[i]=n;
            }
            else{
                ngr[i]=st.peek();
            }
            st.push(i);
        }
        return ngr;
    }
}