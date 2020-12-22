public class MinCostClimbingStairs {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/min-cost-climbing-stairs/solution/shi-yong-zui-xiao-hua-fei-pa-lou-ti-by-l-ncf8/
      来源：力扣（LeetCode）
    * 官方解法一
    * */
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = 0, curr = 0;
        for (int i = 2; i <= n; i++){
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        int[] cost = {10,15,20};
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int i = minCostClimbingStairs.minCostClimbingStairs(cost);
        System.out.println(i);
    }
}
