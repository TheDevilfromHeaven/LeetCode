import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/two-sum/solution/liang-shu-zhi-he-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 简单题比拼的是速度啊。
    * */
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; ++i) {
//            if (hashtable.containsKey(target - nums[i])) {
//                return new int[]{hashtable.get(target - nums[i]), i};
//            }
//            hashtable.put(nums[i], i);
//        }
//        return new int[0];
//    }

    public int[] twoSum(int[] nums, int target) {
        for (int star = 0;star<nums.length;star++){
            for (int end = star + 1;end<nums.length;end++){
                if (nums[star] + nums[end] == target){
                    return new int[]{star,end};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(nums, target);
        for (int x:ints){
            System.out.println(x);
        }
    }
}
