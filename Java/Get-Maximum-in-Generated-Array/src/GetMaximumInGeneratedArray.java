public class GetMaximumInGeneratedArray {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/get-maximum-in-generated-array/solution/huo-qu-sheng-cheng-shu-zu-zhong-de-zui-d-0z2l/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
//    public int getMaximumGenerated(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        int[] nums = new int[n + 1];
//        nums[1] = 1;
//        for (int i = 2; i <= n; ++i) {
//            nums[i] = nums[i / 2] + i % 2 * nums[i / 2 + 1];
//        }
//        return Arrays.stream(nums).max().getAsInt();
//    }

    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        int[] ints = new int[n + 1];
        ints[1] = 1;
        int max = 1;
        for (int i = 2; i < n + 1; i++) {
            if (i % 2 == 0){
                ints[i] = ints[i / 2];
            }else {
                ints[i] = ints[i / 2] + ints[(i / 2) + 1];
            }
            max = Math.max(max,ints[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int maximumGenerated = new GetMaximumInGeneratedArray().getMaximumGenerated(7);
        System.out.println(maximumGenerated);
    }
}
