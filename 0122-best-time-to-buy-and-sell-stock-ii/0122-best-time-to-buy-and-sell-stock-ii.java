class Solution {
    public int maxProfit(int[] prices) {
          int net_profit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i-1]<prices[i]){
                net_profit = net_profit + (prices[i]-prices[i-1]);
            }
            
        }
        
        return net_profit;
    }
}