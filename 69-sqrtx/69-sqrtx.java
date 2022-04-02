class Solution {
    public int mySqrt(int x) {
              if(x<=1)return x;
        int l=1; //low or start value = 1
        int h=x-1; //high or end value = x-1
        
        while(l<=h){
            int mid=l+(h-l)/2;
           
            if(mid==x/mid){
                return mid;
            }else if(mid<x/mid){
                l = mid+1;
            }else{
                h=mid-1;
            }
        }
        return h;
    }
}