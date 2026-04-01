class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ;
        int min_price = Integer.MAX_VALUE;
        for(int i = 0 ;i<prices.length;i++){
            min_price = Math.min(min_price,prices[i]);
            profit = Math.max(profit,prices[i] - min_price);
        }
        return profit;
    }
}