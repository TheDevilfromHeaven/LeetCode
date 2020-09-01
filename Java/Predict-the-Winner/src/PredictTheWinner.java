import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PredictTheWinner {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/predict-the-winner/solution/yu-ce-ying-jia-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 还需要积累经验，下面为官方解法。
    * 以下为方法一：递归
    * 还有方法二：动态规划，感兴趣可以自行到官方下查看。
    * */
    public boolean PredictTheWinner(int[] nums) {
        return total(nums, 0, nums.length - 1, 1) >= 0;
    }

    public int total(int[] nums, int start, int end, int turn) {
        if (start == end) {
            return nums[start] * turn;
        }
        int scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn);
        int scoreEnd = nums[end] * turn + total(nums, start, end - 1, -turn);
        return Math.max(scoreStart * turn, scoreEnd * turn) * turn;
    }

    public static void main(String[] args) {
        int[] arg = {1,5,233,7};
        PredictTheWinner predictTheWinner = new PredictTheWinner();
        boolean b = predictTheWinner.PredictTheWinner(arg);
        System.out.println(b);
    }
}
