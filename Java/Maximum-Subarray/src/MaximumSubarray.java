import java.util.Arrays;

public class MaximumSubarray {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/maximum-subarray/solution/zui-da-zi-xu-he-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int result = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            result = Math.max(result, pre);
        }
        return result;

    }

    /*
    * 官方视频方法2。
    * */
//    public int maxSubArray(int[] nums) {
//       for (int i = 1; i < nums.length; i++) {
//            if (nums[i - 1] > 0){
//                nums[i] += nums[i-1];
//            }
//        }
//        return Arrays.stream(nums).max().getAsInt();
//    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = new MaximumSubarray().maxSubArray(nums);
        System.out.println(i);
    }
}
