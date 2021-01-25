public class LongestContinuousIncreasingSubsequence {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/solution/zui-chang-lian-xu-di-zeng-xu-lie-by-leet-dmb8/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    /*public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] <= nums[i - 1]){
                start = i;
            }
            result = Math.max(result,i - start + 1);
        }
        return result;
    }*/

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 1) return 1;
        int reslut = 0;
        int memory = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]){
                memory++;
                if (i == nums.length - 1){
                    reslut = Math.max(reslut,memory);
                }
            }else {
                reslut = Math.max(reslut,memory);
                memory = 1;
            }
        }
        return reslut;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        LongestContinuousIncreasingSubsequence longestContinuousIncreasingSubsequence = new LongestContinuousIncreasingSubsequence();
        int lengthOfLCIS = longestContinuousIncreasingSubsequence.findLengthOfLCIS(nums);
        System.out.println(lengthOfLCIS);
    }
}
