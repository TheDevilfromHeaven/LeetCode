public class FindMajorityElementLCCI {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/find-majority-element-lcci/solution/zhu-yao-yuan-su-by-leetcode-solution-xr1p/
      来源：力扣（LeetCode）
    * 官方解法一。Boyer-Moore 投票算法
    * */
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < nums.length; i++){
            if (count == 0){
                candidate = nums[i];
            }
            if (nums[i] == candidate){
                count++;
            }else {
                count--;
            }
        }
        int x = 0;
        for (int n : nums) {
            if (n == candidate){
                x++;
            }
        }
        return 2 * x > nums.length ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9,5,9,5,5,5};
        FindMajorityElementLCCI findMajorityElementLCCI = new FindMajorityElementLCCI();
        int i = findMajorityElementLCCI.majorityElement(nums);
        System.out.println(i);
    }
}
