public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        /*
        * 作者：LeetCode-Solution
          链接：https://leetcode-cn.com/problems/non-decreasing-array/solution/fei-di-jian-shu-lie-by-leetcode-solution-zdsm/
          来源：力扣（LeetCode）
        * 官方解法一。
        * */
        int n = nums.length, cnt = 0;
        for (int i = 0; i < n - 1; ++i) {
            int x = nums[i], y = nums[i + 1];
            if (x > y) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums= {-1,4,2,3};
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
        boolean b = nonDecreasingArray.checkPossibility(nums);
        System.out.println(b);
    }
}
