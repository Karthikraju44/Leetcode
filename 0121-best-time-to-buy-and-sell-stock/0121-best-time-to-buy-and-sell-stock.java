class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int n=prices.length;
        int maxprofit=0;
        for(int i=1;i<n;i++){
            if(prices[i]<min) min=prices[i];
            int profit=prices[i]-min;
            if(profit>maxprofit) maxprofit=profit;
             
        }
        return maxprofit;
    }
}