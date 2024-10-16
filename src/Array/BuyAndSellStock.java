package Array;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int [] prices = {2,4,1};
        System.out.println(maxProfit(prices));

    }
    public static int maxProfit(int[] prices) {
       int mini = prices[0];
       int maxpProfit  = 0;
       for(int i = 1 ; i < prices.length ; i++){
           int cost = prices[i] - mini;
           maxpProfit = Math.max(maxpProfit , cost);
           mini = Math.min(mini,prices[i]);
       }

       return maxpProfit;
    }
}
