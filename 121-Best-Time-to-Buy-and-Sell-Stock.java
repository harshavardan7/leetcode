class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyAt = prices[0];
        int profit = 0;
        for(int i=1; i<n; i++){
            if(prices[i] < buyAt){
                buyAt = prices[i];
            }
            profit = Math.max(profit, prices[i] - buyAt);
        }
        return profit;
    }
}