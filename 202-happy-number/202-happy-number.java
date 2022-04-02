class Solution {
    public boolean isHappy(int n) {
      /*  int ans=0;
        int flag=0;
        while(n!=0){
            ans=(n % 10) * (n % 10);
            n=n/10;
            //ans=ans+temp*temp;
        }
        
        if(ans==1) return true;
        else return false;
        
    }*/
    
    
    HashSet<Integer> st = new HashSet<>();
    
    while(true)
    {
        n = numSquareSum(n);
        if (n == 1)
            return true;
        if (st.contains(n))
            return false;
        st.add(n);
    }
    
   
}
     static int numSquareSum(int n)
    {
        int squareSum = 0;
        while (n!= 0)
        {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }
}