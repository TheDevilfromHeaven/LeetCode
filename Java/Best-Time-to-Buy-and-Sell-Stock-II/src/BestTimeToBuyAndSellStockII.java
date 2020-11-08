public class BestTimeToBuyAndSellStockII {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/solution/mai-mai-gu-piao-de-zui-jia-shi-ji-ii-by-leetcode-s/
      来源：力扣（LeetCode）
    * 官方的方法一：动态规划，积累一下。
    * */
//    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        int dp0 = 0, dp1 = -prices[0];
//        for (int i = 1; i < n; ++i) {
//            int newDp0 = Math.max(dp0, dp1 + prices[i]);
//            int newDp1 = Math.max(dp1, dp0 - prices[i]);
//            dp0 = newDp0;
//            dp1 = newDp1;
//        }
//        return dp0;
//    }

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0;i<prices.length-1;i++){
            if (prices[i] < prices[i+1]){
                result += prices[i+1] - prices[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
        int i = bestTimeToBuyAndSellStockII.maxProfit(prices);
        System.out.println(i);
    }
}
