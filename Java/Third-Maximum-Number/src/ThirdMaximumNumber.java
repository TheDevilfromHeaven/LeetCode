import java.util.TreeSet;

public class ThirdMaximumNumber {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/third-maximum-number/solution/di-san-da-de-shu-by-leetcode-solution-h3sp/
      来源：力扣（LeetCode）
    * 官方解法二：有序集合
    * */
    public int thirdMax(int[] nums) {
        TreeSet<Integer> integers = new TreeSet<>();
        for (int num : nums) {
            integers.add(num);
            if (integers.size() > 3){
                integers.remove(integers.first());
            }
        }
        return integers.size() == 3 ? integers.first() : integers.last();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int i = new ThirdMaximumNumber().thirdMax(nums);
        System.out.println(i);
    }
}
