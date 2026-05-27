class Solution {
    public int maxProfit(int[] prices) {
        long n = prices.length;
        int maxprofit = 0;
        int profit =0;
        int lowestprice =prices[0];
        for(int i = 0; i< n; i++){
            profit = prices[i]- lowestprice;
            maxprofit = Math.max(maxprofit,profit);
            lowestprice = Math.min(lowestprice,prices[i]);
        }
      return maxprofit;  
    }
}