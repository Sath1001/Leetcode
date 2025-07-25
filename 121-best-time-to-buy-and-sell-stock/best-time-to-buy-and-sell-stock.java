import java.lang.Math;
class Solution {
    public int maxProfit(int[] prices) {
        int mx_profit =0;
        int min_cost=prices[0];
        for(int i=1;i<prices.length;i++){
            mx_profit = Math.max(mx_profit,prices[i]-min_cost);
            min_cost = Math.min(min_cost,prices[i]);
        }
        return mx_profit;
    }
}