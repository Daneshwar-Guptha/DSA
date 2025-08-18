class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int smallest =9999;
        for(int i=0;i<prices.length;i++){

            if(smallest>prices[i]){
                smallest = prices[i];
            }
            if(prices[i]-smallest>profit){
                profit = prices[i]-smallest;

            }

        }

        return profit;
        
    }
}